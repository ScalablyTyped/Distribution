package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto)
  */
trait Crypto extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/getRandomValues) */
  /* standard dom */
  def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/randomUUID)
    */
  /* standard dom */
  def randomUUID(): /* template literal string: ${string}-${string}-${string}-${string}-${string} */ java.lang.String
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/subtle)
    */
  /* standard dom */
  val subtle: SubtleCrypto
}
object Crypto {
  
  inline def apply(
    getRandomValues: Any => Any,
    randomUUID: () => /* template literal string: ${string}-${string}-${string}-${string}-${string} */ java.lang.String,
    subtle: SubtleCrypto
  ): Crypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), randomUUID = js.Any.fromFunction0(randomUUID), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Crypto] (val x: Self) extends AnyVal {
    
    inline def setGetRandomValues(value: Any => Any): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
    
    inline def setRandomUUID(
      value: () => /* template literal string: ${string}-${string}-${string}-${string}-${string} */ java.lang.String
    ): Self = StObject.set(x, "randomUUID", js.Any.fromFunction0(value))
    
    inline def setSubtle(value: SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}

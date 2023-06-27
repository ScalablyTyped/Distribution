package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential)
  */
trait Credential extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/id) */
  /* standard dom */
  val id: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/type) */
  /* standard dom */
  val `type`: java.lang.String
}
object Credential {
  
  inline def apply(id: java.lang.String, `type`: java.lang.String): Credential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

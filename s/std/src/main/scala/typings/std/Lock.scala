package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock)
  */
trait Lock extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/mode) */
  /* standard dom */
  val mode: LockMode
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/name) */
  /* standard dom */
  val name: java.lang.String
}
object Lock {
  
  inline def apply(mode: LockMode, name: java.lang.String): Lock = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lock] (val x: Self) extends AnyVal {
    
    inline def setMode(value: LockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

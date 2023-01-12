package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * NxMeta...
  */
trait INxMeta extends StObject {
  
  /**
    * Name.
    * >> This property is optional.
    */
  var qName: js.UndefOr[String] = js.undefined
}
object INxMeta {
  
  inline def apply(): INxMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxMeta] (val x: Self) extends AnyVal {
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQNameUndefined: Self = StObject.set(x, "qName", js.undefined)
  }
}

package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IMeasureListDef
  */
trait IMeasureListDef extends StObject {
  
  var qType: measure
}
object IMeasureListDef {
  
  inline def apply(): IMeasureListDef = {
    val __obj = js.Dynamic.literal(qType = "measure")
    __obj.asInstanceOf[IMeasureListDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMeasureListDef] (val x: Self) extends AnyVal {
    
    inline def setQType(value: measure): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

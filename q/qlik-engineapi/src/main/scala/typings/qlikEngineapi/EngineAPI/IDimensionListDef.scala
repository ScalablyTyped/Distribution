package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.dimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the lists of dimensions.
  */
trait IDimensionListDef extends StObject {
  
  /**
    * Data type JSON
    */
  var qData: Any
  
  /**
    * Type of the list
    */
  var qType: dimension
}
object IDimensionListDef {
  
  inline def apply(qData: Any): IDimensionListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = "dimension")
    __obj.asInstanceOf[IDimensionListDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDimensionListDef] (val x: Self) extends AnyVal {
    
    inline def setQData(value: Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQType(value: dimension): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

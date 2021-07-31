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
  var qData: js.Any
  
  /**
    * Type of the list
    */
  var qType: dimension
}
object IDimensionListDef {
  
  @scala.inline
  def apply(qData: js.Any): IDimensionListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = "dimension")
    __obj.asInstanceOf[IDimensionListDef]
  }
  
  @scala.inline
  implicit class IDimensionListDefMutableBuilder[Self <: IDimensionListDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: js.Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: dimension): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

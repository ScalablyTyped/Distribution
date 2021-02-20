package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.dimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the lists of dimensions.
  */
@js.native
trait IDimensionListDef extends StObject {
  
  /**
    * Data type JSON
    */
  var qData: js.Any = js.native
  
  /**
    * Type of the list
    */
  var qType: dimension = js.native
}
object IDimensionListDef {
  
  @scala.inline
  def apply(qData: js.Any, qType: dimension): IDimensionListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
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

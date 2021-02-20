package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IMeasureListDef
  */
@js.native
trait IMeasureListDef extends StObject {
  
  var qType: measure = js.native
}
object IMeasureListDef {
  
  @scala.inline
  def apply(qType: measure): IMeasureListDef = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasureListDef]
  }
  
  @scala.inline
  implicit class IMeasureListDefMutableBuilder[Self <: IMeasureListDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: measure): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

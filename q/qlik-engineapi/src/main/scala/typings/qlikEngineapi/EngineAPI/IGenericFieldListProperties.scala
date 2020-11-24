package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericFieldListProperties width extend GenericProperties
  */
@js.native
trait IGenericFieldListProperties extends IGenericProperties {
  
  /**
    * FieldListDef...
    */
  var qFieldListDef: IFieldListDef = js.native
}
object IGenericFieldListProperties {
  
  @scala.inline
  def apply(qFieldListDef: IFieldListDef, qInfo: INxInfo): IGenericFieldListProperties = {
    val __obj = js.Dynamic.literal(qFieldListDef = qFieldListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericFieldListProperties]
  }
  
  @scala.inline
  implicit class IGenericFieldListPropertiesOps[Self <: IGenericFieldListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQFieldListDef(value: IFieldListDef): Self = this.set("qFieldListDef", value.asInstanceOf[js.Any])
  }
}

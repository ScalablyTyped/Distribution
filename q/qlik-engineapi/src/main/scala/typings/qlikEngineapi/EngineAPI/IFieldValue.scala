package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldValue...
  */
@js.native
trait IFieldValue extends js.Object {
  
  /**
    * Is set to true if the value is a numeric.
    * This parameter is optional. Default is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.native
  
  /**
    * Numeric value of the field.
    * This parameter is displayed if qIsNumeric is set to true.
    * This parameter is optional.
    */
  var qNumber: js.UndefOr[Double] = js.native
  
  /**
    * Text related to the field value
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.native
}
object IFieldValue {
  
  @scala.inline
  def apply(): IFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldValue]
  }
  
  @scala.inline
  implicit class IFieldValueOps[Self <: IFieldValue] (val x: Self) extends AnyVal {
    
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
    def setQIsNumeric(value: Boolean): Self = this.set("qIsNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsNumeric: Self = this.set("qIsNumeric", js.undefined)
    
    @scala.inline
    def setQNumber(value: Double): Self = this.set("qNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQNumber: Self = this.set("qNumber", js.undefined)
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQText: Self = this.set("qText", js.undefined)
  }
}

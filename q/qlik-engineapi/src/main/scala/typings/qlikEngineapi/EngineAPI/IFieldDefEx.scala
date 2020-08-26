package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldDefEx...
  */
@js.native
trait IFieldDefEx extends js.Object {
  /**
    * Name of the field
    */
  var qName: String = js.native
  /**
    * Type of data entity
    *
    * One of:
    * - 0 for NOT_PRESENT: the field does not exist
    * - 1 for PRESENT: plain field
    * - 2 for IS_EXPR: calculated dimension
    */
  var qType: FieldDefExType = js.native
}

object IFieldDefEx {
  @scala.inline
  def apply(qName: String, qType: FieldDefExType): IFieldDefEx = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDefEx]
  }
  @scala.inline
  implicit class IFieldDefExOps[Self <: IFieldDefEx] (val x: Self) extends AnyVal {
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
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQType(value: FieldDefExType): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
  
}


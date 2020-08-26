package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataTableEx...
  */
@js.native
trait IDataTableEx extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[IDataField] = js.native
  /**
    * List of format specification items, within brackets.
    * Examples of specification items:
    *
    *    - file type
    *    - embedded labels, no labels
    *    - table is <table name>
    */
  var qFormatSpec: String = js.native
  /**
    * Name of the table.
    */
  var qName: String = js.native
}

object IDataTableEx {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String, qName: String): IDataTableEx = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTableEx]
  }
  @scala.inline
  implicit class IDataTableExOps[Self <: IDataTableEx] (val x: Self) extends AnyVal {
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
    def setQFieldsVarargs(value: IDataField*): Self = this.set("qFields", js.Array(value :_*))
    @scala.inline
    def setQFields(value: js.Array[IDataField]): Self = this.set("qFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFormatSpec(value: String): Self = this.set("qFormatSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
  }
  
}


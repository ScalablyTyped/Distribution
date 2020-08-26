package typings.reduxOrm.tableMod

import org.scalablytyped.runtime.StringDictionary
import typings.reduxOrm.fieldsMod.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOpts extends js.Object {
  val arrName: js.UndefOr[String] = js.native
  val fields: js.UndefOr[StringDictionary[Field]] = js.native
  val idAttribute: js.UndefOr[String] = js.native
  val mapName: js.UndefOr[String] = js.native
}

object TableOpts {
  @scala.inline
  def apply(): TableOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOpts]
  }
  @scala.inline
  implicit class TableOptsOps[Self <: TableOpts] (val x: Self) extends AnyVal {
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
    def setArrName(value: String): Self = this.set("arrName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrName: Self = this.set("arrName", js.undefined)
    @scala.inline
    def setFields(value: StringDictionary[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIdAttribute(value: String): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdAttribute: Self = this.set("idAttribute", js.undefined)
    @scala.inline
    def setMapName(value: String): Self = this.set("mapName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapName: Self = this.set("mapName", js.undefined)
  }
  
}


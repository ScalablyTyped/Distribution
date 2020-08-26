package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPClientTemplates.FieldSchema
import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPMgr extends js.Object {
  def NewGroup(listItem: StringDictionary[js.Any], fieldName: String): Boolean = js.native
  def RenderField(
    renderCtx: RenderContext,
    field: FieldSchema,
    listItem: StringDictionary[js.Any],
    listSchema: ListSchema
  ): String = js.native
  def RenderFieldByName(
    renderCtx: RenderContext,
    fieldName: String,
    listItem: StringDictionary[js.Any],
    listSchema: ListSchema
  ): String = js.native
  def RenderHeader(renderCtx: RenderContext, field: FieldSchema): String = js.native
}

object SPMgr {
  @scala.inline
  def apply(
    NewGroup: (StringDictionary[js.Any], String) => Boolean,
    RenderField: (RenderContext, FieldSchema, StringDictionary[js.Any], ListSchema) => String,
    RenderFieldByName: (RenderContext, String, StringDictionary[js.Any], ListSchema) => String,
    RenderHeader: (RenderContext, FieldSchema) => String
  ): SPMgr = {
    val __obj = js.Dynamic.literal(NewGroup = js.Any.fromFunction2(NewGroup), RenderField = js.Any.fromFunction4(RenderField), RenderFieldByName = js.Any.fromFunction4(RenderFieldByName), RenderHeader = js.Any.fromFunction2(RenderHeader))
    __obj.asInstanceOf[SPMgr]
  }
  @scala.inline
  implicit class SPMgrOps[Self <: SPMgr] (val x: Self) extends AnyVal {
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
    def setNewGroup(value: (StringDictionary[js.Any], String) => Boolean): Self = this.set("NewGroup", js.Any.fromFunction2(value))
    @scala.inline
    def setRenderField(value: (RenderContext, FieldSchema, StringDictionary[js.Any], ListSchema) => String): Self = this.set("RenderField", js.Any.fromFunction4(value))
    @scala.inline
    def setRenderFieldByName(value: (RenderContext, String, StringDictionary[js.Any], ListSchema) => String): Self = this.set("RenderFieldByName", js.Any.fromFunction4(value))
    @scala.inline
    def setRenderHeader(value: (RenderContext, FieldSchema) => String): Self = this.set("RenderHeader", js.Any.fromFunction2(value))
  }
  
}


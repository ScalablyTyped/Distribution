package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SPClientTemplates.FieldSchema
import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPMgr")
@js.native
class SPMgr () extends js.Object {
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

@JSGlobal("spMgr")
@js.native
object spMgr extends TopLevel[SPMgr]


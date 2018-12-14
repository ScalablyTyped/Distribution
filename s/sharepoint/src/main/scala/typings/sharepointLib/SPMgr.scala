package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPMgr")
@js.native
class SPMgr () extends js.Object {
  def NewGroup(listItem: org.scalablytyped.runtime.StringDictionary[js.Any], fieldName: java.lang.String): scala.Boolean = js.native
  def RenderField(
    renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext,
    field: sharepointLib.SPClientTemplatesNs.FieldSchema,
    listItem: org.scalablytyped.runtime.StringDictionary[js.Any],
    listSchema: sharepointLib.SPClientTemplatesNs.ListSchema
  ): java.lang.String = js.native
  def RenderFieldByName(
    renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext,
    fieldName: java.lang.String,
    listItem: org.scalablytyped.runtime.StringDictionary[js.Any],
    listSchema: sharepointLib.SPClientTemplatesNs.ListSchema
  ): java.lang.String = js.native
  def RenderHeader(
    renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext,
    field: sharepointLib.SPClientTemplatesNs.FieldSchema
  ): java.lang.String = js.native
}


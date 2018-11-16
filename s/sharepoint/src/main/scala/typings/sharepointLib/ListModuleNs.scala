package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("ListModule")
@js.native
object ListModuleNs extends js.Object {
  @JSName("Util")
  @js.native
  object UtilNs extends js.Object {
    def clearSelectedItemsDict(context: js.Any): scala.Unit = js.native
    def createItemPropertiesTitle(renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext, listItem: sharepointLib.ListItem): java.lang.String = js.native
    def createViewEditUrl(renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext, listItem: sharepointLib.ListItem): java.lang.String = js.native
    def createViewEditUrl(
      renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext,
      listItem: sharepointLib.ListItem,
      useEditFormUrl: scala.Boolean
    ): java.lang.String = js.native
    def createViewEditUrl(
      renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext,
      listItem: sharepointLib.ListItem,
      useEditFormUrl: scala.Boolean,
      appendSource: scala.Boolean
    ): java.lang.String = js.native
    def ctxInitItemState(context: js.Any): scala.Unit = js.native
    def getAttributeFromItemTable(
      itemTableParam: stdLib.HTMLElement,
      strAttributeName: java.lang.String,
      strAttributeOldName: java.lang.String
    ): java.lang.String = js.native
    def getSelectedItemsDict(context: js.Any): js.Any = js.native
    def removeOnlyPagingArgs(url: java.lang.String): java.lang.String = js.native
    def removePagingArgs(url: java.lang.String): java.lang.String = js.native
    def showAttachmentRows(): scala.Unit = js.native
  }
  
}


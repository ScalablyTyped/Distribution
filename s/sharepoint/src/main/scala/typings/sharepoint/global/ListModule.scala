package typings.sharepoint.global

import typings.sharepoint.ListItem
import typings.sharepoint.SPClientTemplates.RenderContext
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object ListModule {
  
  object Util {
    
    @JSGlobal("ListModule.Util.clearSelectedItemsDict")
    @js.native
    def clearSelectedItemsDict(context: js.Any): Unit = js.native
    
    @JSGlobal("ListModule.Util.createItemPropertiesTitle")
    @js.native
    def createItemPropertiesTitle(renderCtx: RenderContext, listItem: ListItem): String = js.native
    
    @JSGlobal("ListModule.Util.createViewEditUrl")
    @js.native
    def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem): String = js.native
    @JSGlobal("ListModule.Util.createViewEditUrl")
    @js.native
    def createViewEditUrl(
      renderCtx: RenderContext,
      listItem: ListItem,
      useEditFormUrl: js.UndefOr[scala.Nothing],
      appendSource: Boolean
    ): String = js.native
    @JSGlobal("ListModule.Util.createViewEditUrl")
    @js.native
    def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem, useEditFormUrl: Boolean): String = js.native
    @JSGlobal("ListModule.Util.createViewEditUrl")
    @js.native
    def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem, useEditFormUrl: Boolean, appendSource: Boolean): String = js.native
    
    @JSGlobal("ListModule.Util.ctxInitItemState")
    @js.native
    def ctxInitItemState(context: js.Any): Unit = js.native
    
    @JSGlobal("ListModule.Util.getAttributeFromItemTable")
    @js.native
    def getAttributeFromItemTable(itemTableParam: HTMLElement, strAttributeName: String, strAttributeOldName: String): String = js.native
    
    @JSGlobal("ListModule.Util.getSelectedItemsDict")
    @js.native
    def getSelectedItemsDict(context: js.Any): js.Any = js.native
    
    @JSGlobal("ListModule.Util.removeOnlyPagingArgs")
    @js.native
    def removeOnlyPagingArgs(url: String): String = js.native
    
    @JSGlobal("ListModule.Util.removePagingArgs")
    @js.native
    def removePagingArgs(url: String): String = js.native
    
    @JSGlobal("ListModule.Util.showAttachmentRows")
    @js.native
    def showAttachmentRows(): Unit = js.native
  }
}

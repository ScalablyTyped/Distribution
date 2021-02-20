package typings.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSGlobal("CUI.Page.CommandDispatcher")
  @js.native
  class CommandDispatcher ()
    extends typings.sharepoint.CUI.Page.CommandDispatcher
  
  @JSGlobal("CUI.Page.FocusManager")
  @js.native
  class FocusManager ()
    extends typings.sharepoint.CUI.Page.FocusManager
  
  @JSGlobal("CUI.Page.PageComponent")
  @js.native
  class PageComponent ()
    extends typings.sharepoint.CUI.Page.PageComponent
  
  @JSGlobal("CUI.Page.PageManager")
  @js.native
  class PageManager ()
    extends typings.sharepoint.CUI.Page.PageManager
  object PageManager {
    
    /* static member */
    @JSGlobal("CUI.Page.PageManager.createPageManager")
    @js.native
    def createPageManager(): typings.sharepoint.CUI.Page.PageManager = js.native
    
    /* static member */
    @JSGlobal("CUI.Page.PageManager.get_instance")
    @js.native
    def getInstance(): typings.sharepoint.CUI.Page.PageManager = js.native
    
    /* static member */
    @JSGlobal("CUI.Page.PageManager.initialize")
    @js.native
    def initialize(): scala.Unit = js.native
  }
  
  @JSGlobal("CUI.Page.UndoManager")
  @js.native
  class UndoManager ()
    extends typings.sharepoint.CUI.Page.UndoManager
}

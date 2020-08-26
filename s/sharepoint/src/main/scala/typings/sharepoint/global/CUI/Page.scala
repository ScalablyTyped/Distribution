package typings.sharepoint.global.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Page")
@js.native
object Page extends js.Object {
  @js.native
  class CommandDispatcher ()
    extends typings.sharepoint.CUI.Page.CommandDispatcher
  
  @js.native
  class FocusManager ()
    extends typings.sharepoint.CUI.Page.FocusManager
  
  @js.native
  class PageComponent ()
    extends typings.sharepoint.CUI.Page.PageComponent
  
  @js.native
  class PageManager ()
    extends typings.sharepoint.CUI.Page.PageManager
  
  @js.native
  class UndoManager ()
    extends typings.sharepoint.CUI.Page.UndoManager
  
  /* static members */
  @js.native
  object PageManager extends js.Object {
    def createPageManager(): typings.sharepoint.CUI.Page.PageManager = js.native
    def get_instance(): typings.sharepoint.CUI.Page.PageManager = js.native
    def initialize(): scala.Unit = js.native
  }
  
}


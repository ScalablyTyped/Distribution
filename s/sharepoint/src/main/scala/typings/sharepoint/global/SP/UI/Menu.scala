package typings.sharepoint.global.SP.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.Menu")
@js.native
open class Menu ()
  extends StObject
     with typings.sharepoint.SP.UI.Menu {
  
  /* CompleteClass */
  override def addMenuItem(
    text: String,
    actionScriptText: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): HTMLElement = js.native
  
  /* CompleteClass */
  override def addSeparator(): Unit = js.native
  
  /* CompleteClass */
  override def addSubMenu(
    text: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): typings.sharepoint.SP.UI.Menu = js.native
  
  /* CompleteClass */
  override def hideIcons(): Unit = js.native
  
  /* CompleteClass */
  override def show(relativeElement: HTMLElement, forceRefresh: Boolean, flipTopLevelMenu: Boolean, yOffset: Double): Unit = js.native
  
  /* CompleteClass */
  override def showFilterMenu(
    relativeElement: HTMLElement,
    forceRefresh: Boolean,
    flipTopLevelMenu: Boolean,
    yOffset: Double,
    fShowClose: Boolean,
    fShowCheckBoxes: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  override def showIcons(): Unit = js.native
}
object Menu {
  
  @JSGlobal("SP.UI.Menu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(id: String): typings.sharepoint.SP.UI.Menu = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.UI.Menu]
}

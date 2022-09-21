package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.HtmlBuilder
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.Command")
@js.native
open class Command protected ()
  extends StObject
     with typings.sharepoint.SP.UI.Command {
  def this(name: String, displayName: String) = this()
  
  /* CompleteClass */
  override def attachEvents(): Unit = js.native
  
  /* CompleteClass */
  override def get_displayName(): String = js.native
  
  /* CompleteClass */
  override def get_elementIDPrefix(): String = js.native
  
  /* CompleteClass */
  override def get_href(): String = js.native
  
  /* CompleteClass */
  override def get_isDropDownCommand(): Boolean = js.native
  
  /* CompleteClass */
  override def get_isEnabled(): Boolean = js.native
  
  /* CompleteClass */
  override def get_linkElement(): HTMLAnchorElement = js.native
  
  /* CompleteClass */
  override def get_name(): String = js.native
  
  /* CompleteClass */
  override def get_tooltip(): String = js.native
  
  /**Should override*/
  /* CompleteClass */
  override def onClick(): Unit = js.native
  
  /* CompleteClass */
  override def render(builder: HtmlBuilder): Unit = js.native
  
  /* CompleteClass */
  override def set_displayName(value: String): String = js.native
  
  /* CompleteClass */
  override def set_elementIDPrefix(value: String): String = js.native
  
  /* CompleteClass */
  override def set_isDropDownCommand(value: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def set_isEnabled(value: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def set_tooltip(value: String): String = js.native
}

package typings.reactMdUtils

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFocusableElementsMod {
  
  @JSImport("@react-md/utils/types/wia-aria/getFocusableElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFocusableElements(container: Document): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
}

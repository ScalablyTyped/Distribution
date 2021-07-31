package typings.railsUjs

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod {
  
  @JSImport("@rails/ujs/features/confirm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def confirm(message: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def confirm(message: String, element: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def handleConfirm(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleConfirm")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

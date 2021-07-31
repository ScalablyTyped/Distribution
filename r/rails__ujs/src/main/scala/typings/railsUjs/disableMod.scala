package typings.railsUjs

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableMod {
  
  @JSImport("@rails/ujs/features/disable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def disableElement(e: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def disableElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def enableElement(e: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def handleDisabledElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleDisabledElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

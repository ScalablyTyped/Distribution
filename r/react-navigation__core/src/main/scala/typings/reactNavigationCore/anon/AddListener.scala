package typings.reactNavigationCore.anon

import typings.reactNavigationCore.navigationBuilderContextMod.ChildActionListener
import typings.reactNavigationCore.navigationBuilderContextMod.FocusedNavigationListener
import typings.reactNavigationCore.reactNavigationCoreStrings.action
import typings.reactNavigationCore.reactNavigationCoreStrings.focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddListener extends StObject {
  
  @JSName("addListener")
  def addListener_action(`type`: action, listener: ChildActionListener): js.Function0[Unit] = js.native
  @JSName("addListener")
  def addListener_focus(`type`: focus, listener: FocusedNavigationListener): js.Function0[Unit] = js.native
  
  var listeners: Focus = js.native
}

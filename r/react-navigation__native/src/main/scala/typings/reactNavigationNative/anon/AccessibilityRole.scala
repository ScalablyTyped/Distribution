package typings.reactNavigationNative.anon

import typings.reactNative.mod.GestureResponderEvent
import typings.reactNavigationNative.reactNavigationNativeStrings.link
import typings.std.HTMLAnchorElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityRole extends StObject {
  
  var accessibilityRole: link = js.native
  
  var href: String = js.native
  
  def onPress(): Unit = js.native
  def onPress(e: typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]): Unit = js.native
  def onPress(e: GestureResponderEvent): Unit = js.native
}

package typings.reactNativeFirebase.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messaging extends Shortcut {
  
  @JSImport("react-native-firebase", "messaging")
  @js.native
  val ^ : MessagingModule = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "messaging.RemoteMessage")
  @js.native
  class RemoteMessage ()
    extends typings.reactNativeFirebase.mod.RNFirebase.messaging.RemoteMessage
  
  type _To = MessagingModule
  
  /* This means you don't have to write `^`, but can instead just say `messaging.foo` */
  override def _to: MessagingModule = ^
}

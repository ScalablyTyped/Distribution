package typings.reactNativeWindows

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchedBridgeMod extends Shortcut {
  
  @JSImport("react-native/Libraries/BatchedBridge/BatchedBridge", JSImport.Default)
  @js.native
  val default: MessageQueue = js.native
  
  type _To = MessageQueue
  
  /* This means you don't have to write `default`, but can instead just say `batchedBridgeMod.foo` */
  override def _to: MessageQueue = default
}

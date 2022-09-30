package typings.reactNativeReanimated.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "Keyframe")
@js.native
open class Keyframe protected () extends StObject {
  def this(definitions: Record[String, KeyframeProps]) = this()
  
  def delay(delayMs: Double): Keyframe = js.native
  
  def duration(durationMs: Double): Keyframe = js.native
  
  def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): Keyframe = js.native
}

package typings.std.global

import typings.std.DeviceMotionEventInit
import typings.std.PermissionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DeviceMotionEvent")
@js.native
class DeviceMotionEvent protected ()
  extends typings.std.DeviceMotionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceMotionEventInit) = this()
}
object DeviceMotionEvent {
  
  @JSGlobal("DeviceMotionEvent.requestPermission")
  @js.native
  def requestPermission(): js.Promise[PermissionState] = js.native
}

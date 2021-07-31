package typings.std.global

import typings.std.DeviceOrientationEventInit
import typings.std.PermissionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DeviceOrientationEvent")
@js.native
class DeviceOrientationEvent protected ()
  extends StObject
     with typings.std.DeviceOrientationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceOrientationEventInit) = this()
}
object DeviceOrientationEvent {
  
  @JSGlobal("DeviceOrientationEvent")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def requestPermission(): js.Promise[PermissionState] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")().asInstanceOf[js.Promise[PermissionState]]
}

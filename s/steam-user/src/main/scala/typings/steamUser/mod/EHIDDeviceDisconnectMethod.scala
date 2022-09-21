package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EHIDDeviceDisconnectMethod extends StObject
@JSImport("steam-user", "EHIDDeviceDisconnectMethod")
@js.native
object EHIDDeviceDisconnectMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EHIDDeviceDisconnectMethod & Double] = js.native
  
  @js.native
  sealed trait Bluetooth
    extends StObject
       with EHIDDeviceDisconnectMethod
  /* 1 */ val Bluetooth: typings.steamUser.mod.EHIDDeviceDisconnectMethod.Bluetooth & Double = js.native
  
  @js.native
  sealed trait FeatureReport
    extends StObject
       with EHIDDeviceDisconnectMethod
  /* 2 */ val FeatureReport: typings.steamUser.mod.EHIDDeviceDisconnectMethod.FeatureReport & Double = js.native
  
  @js.native
  sealed trait OutputReport
    extends StObject
       with EHIDDeviceDisconnectMethod
  /* 3 */ val OutputReport: typings.steamUser.mod.EHIDDeviceDisconnectMethod.OutputReport & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EHIDDeviceDisconnectMethod
  /* 0 */ val Unknown: typings.steamUser.mod.EHIDDeviceDisconnectMethod.Unknown & Double = js.native
}

package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EHIDDeviceLocation extends StObject
@JSImport("steam-user", "EHIDDeviceLocation")
@js.native
object EHIDDeviceLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EHIDDeviceLocation & Double] = js.native
  
  @js.native
  sealed trait Any
    extends StObject
       with EHIDDeviceLocation
  /* 3 */ val Any: typings.steamUser.mod.EHIDDeviceLocation.Any & Double = js.native
  
  @js.native
  sealed trait Local
    extends StObject
       with EHIDDeviceLocation
  /* 0 */ val Local: typings.steamUser.mod.EHIDDeviceLocation.Local & Double = js.native
  
  @js.native
  sealed trait Remote
    extends StObject
       with EHIDDeviceLocation
  /* 2 */ val Remote: typings.steamUser.mod.EHIDDeviceLocation.Remote & Double = js.native
}

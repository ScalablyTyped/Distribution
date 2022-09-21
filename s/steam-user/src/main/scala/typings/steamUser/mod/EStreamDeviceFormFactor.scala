package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamDeviceFormFactor extends StObject
@JSImport("steam-user", "EStreamDeviceFormFactor")
@js.native
object EStreamDeviceFormFactor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamDeviceFormFactor & Double] = js.native
  
  @js.native
  sealed trait Computer
    extends StObject
       with EStreamDeviceFormFactor
  /* 3 */ val Computer: typings.steamUser.mod.EStreamDeviceFormFactor.Computer & Double = js.native
  
  @js.native
  sealed trait Phone
    extends StObject
       with EStreamDeviceFormFactor
  /* 1 */ val Phone: typings.steamUser.mod.EStreamDeviceFormFactor.Phone & Double = js.native
  
  @js.native
  sealed trait TV
    extends StObject
       with EStreamDeviceFormFactor
  /* 4 */ val TV: typings.steamUser.mod.EStreamDeviceFormFactor.TV & Double = js.native
  
  @js.native
  sealed trait Tablet
    extends StObject
       with EStreamDeviceFormFactor
  /* 2 */ val Tablet: typings.steamUser.mod.EStreamDeviceFormFactor.Tablet & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EStreamDeviceFormFactor
  /* 0 */ val Unknown: typings.steamUser.mod.EStreamDeviceFormFactor.Unknown & Double = js.native
}

package typings.rifatMiio

import typings.rifatMiio.deviceMod.MiioDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoveryMod {
  
  @JSImport("@rifat/miio/discovery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def browse(options: TimedDiscoveryOptions): TimedDiscovery = ^.asInstanceOf[js.Dynamic].applyDynamic("browse")(options.asInstanceOf[js.Any]).asInstanceOf[TimedDiscovery]
  
  inline def devices(options: BasicDiscoveryOptions): BasicDiscovery = ^.asInstanceOf[js.Dynamic].applyDynamic("devices")(options.asInstanceOf[js.Any]).asInstanceOf[BasicDiscovery]
  
  type AbstractDiscovery = Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any
  - Dropped any */ trait BasicDiscovery extends StObject
  
  trait BasicDiscoveryOptions
    extends StObject
       with TimedDiscoveryOptions {
    
    var filter: js.UndefOr[js.Function1[/* reg */ MiioSubDeviceOptions, Boolean]] = js.undefined
    
    var skipSubDevices: js.UndefOr[Boolean] = js.undefined
  }
  object BasicDiscoveryOptions {
    
    inline def apply(): BasicDiscoveryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicDiscoveryOptions]
    }
    
    extension [Self <: BasicDiscoveryOptions](x: Self) {
      
      inline def setFilter(value: /* reg */ MiioSubDeviceOptions => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setSkipSubDevices(value: Boolean): Self = StObject.set(x, "skipSubDevices", value.asInstanceOf[js.Any])
      
      inline def setSkipSubDevicesUndefined: Self = StObject.set(x, "skipSubDevices", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait ExpiringDiscovery
    extends StObject
       with BasicDiscovery
  
  trait MiioSubDeviceOptions extends StObject {
    
    var device: MiioDevice
    
    var id: String
    
    var model: String
    
    var parent: MiioDevice
    
    var `type`: String
  }
  object MiioSubDeviceOptions {
    
    inline def apply(device: MiioDevice, id: String, model: String, parent: MiioDevice, `type`: String): MiioSubDeviceOptions = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiioSubDeviceOptions]
    }
    
    extension [Self <: MiioSubDeviceOptions](x: Self) {
      
      inline def setDevice(value: MiioDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setParent(value: MiioDevice): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait TimedDiscovery
    extends StObject
       with ExpiringDiscovery
  
  trait TimedDiscoveryOptions extends StObject {
    
    var cacheTime: js.UndefOr[Double] = js.undefined
    
    var tokens: js.UndefOr[js.Object] = js.undefined
    
    var useTokenStorage: js.UndefOr[Boolean] = js.undefined
  }
  object TimedDiscoveryOptions {
    
    inline def apply(): TimedDiscoveryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimedDiscoveryOptions]
    }
    
    extension [Self <: TimedDiscoveryOptions](x: Self) {
      
      inline def setCacheTime(value: Double): Self = StObject.set(x, "cacheTime", value.asInstanceOf[js.Any])
      
      inline def setCacheTimeUndefined: Self = StObject.set(x, "cacheTime", js.undefined)
      
      inline def setTokens(value: js.Object): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setUseTokenStorage(value: Boolean): Self = StObject.set(x, "useTokenStorage", value.asInstanceOf[js.Any])
      
      inline def setUseTokenStorageUndefined: Self = StObject.set(x, "useTokenStorage", js.undefined)
    }
  }
}

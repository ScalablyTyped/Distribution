package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.reactNativeCommunityCliPlatformIosStrings.catalyst
import typings.reactNativeCommunityCliPlatformIos.reactNativeCommunityCliPlatformIosStrings.device
import typings.reactNativeCommunityCliPlatformIos.reactNativeCommunityCliPlatformIosStrings.simulator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  trait Device extends StObject {
    
    var availability: js.UndefOr[String] = js.undefined
    
    var availabilityError: js.UndefOr[String] = js.undefined
    
    var booted: js.UndefOr[Boolean] = js.undefined
    
    var isAvailable: js.UndefOr[Boolean] = js.undefined
    
    var lastBootedAt: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var state: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[simulator | device | catalyst] = js.undefined
    
    var udid: String
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Device {
    
    inline def apply(name: String, udid: String): Device = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], udid = udid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityError(value: String): Self = StObject.set(x, "availabilityError", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityErrorUndefined: Self = StObject.set(x, "availabilityError", js.undefined)
      
      inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
      
      inline def setBooted(value: Boolean): Self = StObject.set(x, "booted", value.asInstanceOf[js.Any])
      
      inline def setBootedUndefined: Self = StObject.set(x, "booted", js.undefined)
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setIsAvailableUndefined: Self = StObject.set(x, "isAvailable", js.undefined)
      
      inline def setLastBootedAt(value: String): Self = StObject.set(x, "lastBootedAt", value.asInstanceOf[js.Any])
      
      inline def setLastBootedAtUndefined: Self = StObject.set(x, "lastBootedAt", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setType(value: simulator | device | catalyst): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IosProjectInfo extends StObject {
    
    var configurations: js.Array[String]
    
    var name: String
    
    var schemes: js.Array[String]
    
    var targets: js.Array[String]
  }
  object IosProjectInfo {
    
    inline def apply(
      configurations: js.Array[String],
      name: String,
      schemes: js.Array[String],
      targets: js.Array[String]
    ): IosProjectInfo = {
      val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[IosProjectInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IosProjectInfo] (val x: Self) extends AnyVal {
      
      inline def setConfigurations(value: js.Array[String]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
      
      inline def setConfigurationsVarargs(value: String*): Self = StObject.set(x, "configurations", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
      
      inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
}

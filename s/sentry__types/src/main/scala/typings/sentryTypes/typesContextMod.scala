package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.sentryTypesStrings.landscape
import typings.sentryTypes.sentryTypesStrings.portrait
import typings.sentryTypes.typesMiscMod.Primitive
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContextMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait AppContext extends StObject {
    
    var app_identifier: js.UndefOr[String] = js.undefined
    
    var app_memory: js.UndefOr[Double] = js.undefined
    
    var app_name: js.UndefOr[String] = js.undefined
    
    var app_start_time: js.UndefOr[String] = js.undefined
    
    var app_version: js.UndefOr[String] = js.undefined
    
    var build_type: js.UndefOr[String] = js.undefined
  }
  object AppContext {
    
    inline def apply(): AppContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppContext] (val x: Self) extends AnyVal {
      
      inline def setApp_identifier(value: String): Self = StObject.set(x, "app_identifier", value.asInstanceOf[js.Any])
      
      inline def setApp_identifierUndefined: Self = StObject.set(x, "app_identifier", js.undefined)
      
      inline def setApp_memory(value: Double): Self = StObject.set(x, "app_memory", value.asInstanceOf[js.Any])
      
      inline def setApp_memoryUndefined: Self = StObject.set(x, "app_memory", js.undefined)
      
      inline def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
      
      inline def setApp_nameUndefined: Self = StObject.set(x, "app_name", js.undefined)
      
      inline def setApp_start_time(value: String): Self = StObject.set(x, "app_start_time", value.asInstanceOf[js.Any])
      
      inline def setApp_start_timeUndefined: Self = StObject.set(x, "app_start_time", js.undefined)
      
      inline def setApp_version(value: String): Self = StObject.set(x, "app_version", value.asInstanceOf[js.Any])
      
      inline def setApp_versionUndefined: Self = StObject.set(x, "app_version", js.undefined)
      
      inline def setBuild_type(value: String): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
      
      inline def setBuild_typeUndefined: Self = StObject.set(x, "build_type", js.undefined)
    }
  }
  
  type Context = Record[String, Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: @sentry/types.@sentry/types/types/context.Context | undefined} */ trait Contexts extends StObject {
    
    var app: js.UndefOr[AppContext] = js.undefined
    
    var culture: js.UndefOr[CultureContext] = js.undefined
    
    var device: js.UndefOr[DeviceContext] = js.undefined
    
    var os: js.UndefOr[OsContext] = js.undefined
    
    var response: js.UndefOr[ResponseContext] = js.undefined
  }
  object Contexts {
    
    inline def apply(): Contexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Contexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contexts] (val x: Self) extends AnyVal {
      
      inline def setApp(value: AppContext): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setCulture(value: CultureContext): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      inline def setDevice(value: DeviceContext): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setOs(value: OsContext): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setResponse(value: ResponseContext): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait CultureContext extends StObject {
    
    var calendar: js.UndefOr[String] = js.undefined
    
    var display_name: js.UndefOr[String] = js.undefined
    
    var is_24_hour_format: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
  }
  object CultureContext {
    
    inline def apply(): CultureContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CultureContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CultureContext] (val x: Self) extends AnyVal {
      
      inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      inline def setIs_24_hour_format(value: Boolean): Self = StObject.set(x, "is_24_hour_format", value.asInstanceOf[js.Any])
      
      inline def setIs_24_hour_formatUndefined: Self = StObject.set(x, "is_24_hour_format", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait DeviceContext extends StObject {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var battery_level: js.UndefOr[Double] = js.undefined
    
    var battery_status: js.UndefOr[String] = js.undefined
    
    var boot_time: js.UndefOr[String] = js.undefined
    
    var brand: js.UndefOr[String] = js.undefined
    
    var charging: js.UndefOr[Boolean] = js.undefined
    
    var cpu_description: js.UndefOr[String] = js.undefined
    
    var device_type: js.UndefOr[String] = js.undefined
    
    var device_unique_identifier: js.UndefOr[String] = js.undefined
    
    var external_free_storage: js.UndefOr[Double] = js.undefined
    
    var external_storage_size: js.UndefOr[Double] = js.undefined
    
    var family: js.UndefOr[String] = js.undefined
    
    var free_memory: js.UndefOr[Double] = js.undefined
    
    var free_storage: js.UndefOr[Double] = js.undefined
    
    var low_memory: js.UndefOr[Boolean] = js.undefined
    
    var manufacturer: js.UndefOr[String] = js.undefined
    
    var memory_size: js.UndefOr[Double] = js.undefined
    
    var model: js.UndefOr[String] = js.undefined
    
    var model_id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var online: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
    
    var processor_count: js.UndefOr[Double] = js.undefined
    
    var processor_frequency: js.UndefOr[Double] = js.undefined
    
    var screen_density: js.UndefOr[Double] = js.undefined
    
    var screen_dpi: js.UndefOr[Double] = js.undefined
    
    var screen_height_pixels: js.UndefOr[Double] = js.undefined
    
    var screen_resolution: js.UndefOr[String] = js.undefined
    
    var screen_width_pixels: js.UndefOr[Double] = js.undefined
    
    var simulator: js.UndefOr[Boolean] = js.undefined
    
    var storage_size: js.UndefOr[Double] = js.undefined
    
    var supports_accelerometer: js.UndefOr[Boolean] = js.undefined
    
    var supports_audio: js.UndefOr[Boolean] = js.undefined
    
    var supports_gyroscope: js.UndefOr[Boolean] = js.undefined
    
    var supports_location_service: js.UndefOr[Boolean] = js.undefined
    
    var supports_vibration: js.UndefOr[Boolean] = js.undefined
    
    var usable_memory: js.UndefOr[Double] = js.undefined
  }
  object DeviceContext {
    
    inline def apply(): DeviceContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceContext] (val x: Self) extends AnyVal {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setBattery_level(value: Double): Self = StObject.set(x, "battery_level", value.asInstanceOf[js.Any])
      
      inline def setBattery_levelUndefined: Self = StObject.set(x, "battery_level", js.undefined)
      
      inline def setBattery_status(value: String): Self = StObject.set(x, "battery_status", value.asInstanceOf[js.Any])
      
      inline def setBattery_statusUndefined: Self = StObject.set(x, "battery_status", js.undefined)
      
      inline def setBoot_time(value: String): Self = StObject.set(x, "boot_time", value.asInstanceOf[js.Any])
      
      inline def setBoot_timeUndefined: Self = StObject.set(x, "boot_time", js.undefined)
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setCharging(value: Boolean): Self = StObject.set(x, "charging", value.asInstanceOf[js.Any])
      
      inline def setChargingUndefined: Self = StObject.set(x, "charging", js.undefined)
      
      inline def setCpu_description(value: String): Self = StObject.set(x, "cpu_description", value.asInstanceOf[js.Any])
      
      inline def setCpu_descriptionUndefined: Self = StObject.set(x, "cpu_description", js.undefined)
      
      inline def setDevice_type(value: String): Self = StObject.set(x, "device_type", value.asInstanceOf[js.Any])
      
      inline def setDevice_typeUndefined: Self = StObject.set(x, "device_type", js.undefined)
      
      inline def setDevice_unique_identifier(value: String): Self = StObject.set(x, "device_unique_identifier", value.asInstanceOf[js.Any])
      
      inline def setDevice_unique_identifierUndefined: Self = StObject.set(x, "device_unique_identifier", js.undefined)
      
      inline def setExternal_free_storage(value: Double): Self = StObject.set(x, "external_free_storage", value.asInstanceOf[js.Any])
      
      inline def setExternal_free_storageUndefined: Self = StObject.set(x, "external_free_storage", js.undefined)
      
      inline def setExternal_storage_size(value: Double): Self = StObject.set(x, "external_storage_size", value.asInstanceOf[js.Any])
      
      inline def setExternal_storage_sizeUndefined: Self = StObject.set(x, "external_storage_size", js.undefined)
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setFree_memory(value: Double): Self = StObject.set(x, "free_memory", value.asInstanceOf[js.Any])
      
      inline def setFree_memoryUndefined: Self = StObject.set(x, "free_memory", js.undefined)
      
      inline def setFree_storage(value: Double): Self = StObject.set(x, "free_storage", value.asInstanceOf[js.Any])
      
      inline def setFree_storageUndefined: Self = StObject.set(x, "free_storage", js.undefined)
      
      inline def setLow_memory(value: Boolean): Self = StObject.set(x, "low_memory", value.asInstanceOf[js.Any])
      
      inline def setLow_memoryUndefined: Self = StObject.set(x, "low_memory", js.undefined)
      
      inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
      
      inline def setMemory_size(value: Double): Self = StObject.set(x, "memory_size", value.asInstanceOf[js.Any])
      
      inline def setMemory_sizeUndefined: Self = StObject.set(x, "memory_size", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
      
      inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
      
      inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setProcessor_count(value: Double): Self = StObject.set(x, "processor_count", value.asInstanceOf[js.Any])
      
      inline def setProcessor_countUndefined: Self = StObject.set(x, "processor_count", js.undefined)
      
      inline def setProcessor_frequency(value: Double): Self = StObject.set(x, "processor_frequency", value.asInstanceOf[js.Any])
      
      inline def setProcessor_frequencyUndefined: Self = StObject.set(x, "processor_frequency", js.undefined)
      
      inline def setScreen_density(value: Double): Self = StObject.set(x, "screen_density", value.asInstanceOf[js.Any])
      
      inline def setScreen_densityUndefined: Self = StObject.set(x, "screen_density", js.undefined)
      
      inline def setScreen_dpi(value: Double): Self = StObject.set(x, "screen_dpi", value.asInstanceOf[js.Any])
      
      inline def setScreen_dpiUndefined: Self = StObject.set(x, "screen_dpi", js.undefined)
      
      inline def setScreen_height_pixels(value: Double): Self = StObject.set(x, "screen_height_pixels", value.asInstanceOf[js.Any])
      
      inline def setScreen_height_pixelsUndefined: Self = StObject.set(x, "screen_height_pixels", js.undefined)
      
      inline def setScreen_resolution(value: String): Self = StObject.set(x, "screen_resolution", value.asInstanceOf[js.Any])
      
      inline def setScreen_resolutionUndefined: Self = StObject.set(x, "screen_resolution", js.undefined)
      
      inline def setScreen_width_pixels(value: Double): Self = StObject.set(x, "screen_width_pixels", value.asInstanceOf[js.Any])
      
      inline def setScreen_width_pixelsUndefined: Self = StObject.set(x, "screen_width_pixels", js.undefined)
      
      inline def setSimulator(value: Boolean): Self = StObject.set(x, "simulator", value.asInstanceOf[js.Any])
      
      inline def setSimulatorUndefined: Self = StObject.set(x, "simulator", js.undefined)
      
      inline def setStorage_size(value: Double): Self = StObject.set(x, "storage_size", value.asInstanceOf[js.Any])
      
      inline def setStorage_sizeUndefined: Self = StObject.set(x, "storage_size", js.undefined)
      
      inline def setSupports_accelerometer(value: Boolean): Self = StObject.set(x, "supports_accelerometer", value.asInstanceOf[js.Any])
      
      inline def setSupports_accelerometerUndefined: Self = StObject.set(x, "supports_accelerometer", js.undefined)
      
      inline def setSupports_audio(value: Boolean): Self = StObject.set(x, "supports_audio", value.asInstanceOf[js.Any])
      
      inline def setSupports_audioUndefined: Self = StObject.set(x, "supports_audio", js.undefined)
      
      inline def setSupports_gyroscope(value: Boolean): Self = StObject.set(x, "supports_gyroscope", value.asInstanceOf[js.Any])
      
      inline def setSupports_gyroscopeUndefined: Self = StObject.set(x, "supports_gyroscope", js.undefined)
      
      inline def setSupports_location_service(value: Boolean): Self = StObject.set(x, "supports_location_service", value.asInstanceOf[js.Any])
      
      inline def setSupports_location_serviceUndefined: Self = StObject.set(x, "supports_location_service", js.undefined)
      
      inline def setSupports_vibration(value: Boolean): Self = StObject.set(x, "supports_vibration", value.asInstanceOf[js.Any])
      
      inline def setSupports_vibrationUndefined: Self = StObject.set(x, "supports_vibration", js.undefined)
      
      inline def setUsable_memory(value: Double): Self = StObject.set(x, "usable_memory", value.asInstanceOf[js.Any])
      
      inline def setUsable_memoryUndefined: Self = StObject.set(x, "usable_memory", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait OsContext extends StObject {
    
    var build: js.UndefOr[String] = js.undefined
    
    var kernel_version: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object OsContext {
    
    inline def apply(): OsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OsContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OsContext] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      inline def setKernel_version(value: String): Self = StObject.set(x, "kernel_version", value.asInstanceOf[js.Any])
      
      inline def setKernel_versionUndefined: Self = StObject.set(x, "kernel_version", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait ResponseContext extends StObject {
    
    var body_size: js.UndefOr[Double] = js.undefined
    
    var cookies: js.UndefOr[js.Array[js.Array[String]] | (Record[String, String])] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var status_code: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResponseContext {
    
    inline def apply(): ResponseContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseContext] (val x: Self) extends AnyVal {
      
      inline def setBody_size(value: Double): Self = StObject.set(x, "body_size", value.asInstanceOf[js.Any])
      
      inline def setBody_sizeUndefined: Self = StObject.set(x, "body_size", js.undefined)
      
      inline def setCookies(value: js.Array[js.Array[String]] | (Record[String, String])): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCookiesVarargs(value: js.Array[String]*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
      
      inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait TraceContext extends StObject {
    
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var op: js.UndefOr[String] = js.undefined
    
    var parent_span_id: js.UndefOr[String] = js.undefined
    
    var span_id: String
    
    var status: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[Primitive]] = js.undefined
    
    var trace_id: String
  }
  object TraceContext {
    
    inline def apply(span_id: String, trace_id: String): TraceContext = {
      val __obj = js.Dynamic.literal(span_id = span_id.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraceContext] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setParent_span_id(value: String): Self = StObject.set(x, "parent_span_id", value.asInstanceOf[js.Any])
      
      inline def setParent_span_idUndefined: Self = StObject.set(x, "parent_span_id", js.undefined)
      
      inline def setSpan_id(value: String): Self = StObject.set(x, "span_id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTags(value: StringDictionary[Primitive]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
    }
  }
}

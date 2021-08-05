package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.mediaCapabilitiesMod.AudioMediaConfiguration
import typings.reactAdaptiveHooks.mediaCapabilitiesMod.VideoMediaConfiguration
import typings.reactAdaptiveHooks.reactAdaptiveHooksBooleans.`false`
import typings.reactAdaptiveHooks.reactAdaptiveHooksBooleans.`true`
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`media-source`
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.file
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.record
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.transmission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject {
    
    var audio: AudioMediaConfiguration
  }
  object Audio {
    
    inline def apply(audio: AudioMediaConfiguration): Audio = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    extension [Self <: Audio](x: Self) {
      
      inline def setAudio(value: AudioMediaConfiguration): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    }
  }
  
  trait EffectiveConnectionType extends StObject {
    
    var effectiveConnectionType: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType | Null
    
    var unsupported: Boolean
  }
  object EffectiveConnectionType {
    
    inline def apply(unsupported: Boolean): EffectiveConnectionType = {
      val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any], effectiveConnectionType = null)
      __obj.asInstanceOf[EffectiveConnectionType]
    }
    
    extension [Self <: EffectiveConnectionType](x: Self) {
      
      inline def setEffectiveConnectionType(value: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType): Self = StObject.set(x, "effectiveConnectionType", value.asInstanceOf[js.Any])
      
      inline def setEffectiveConnectionTypeNull: Self = StObject.set(x, "effectiveConnectionType", null)
      
      inline def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasMediaConfig extends StObject {
    
    var hasMediaConfig: Boolean
    
    var supported: Boolean
  }
  object HasMediaConfig {
    
    inline def apply(hasMediaConfig: Boolean, supported: Boolean): HasMediaConfig = {
      val __obj = js.Dynamic.literal(hasMediaConfig = hasMediaConfig.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasMediaConfig]
    }
    
    extension [Self <: HasMediaConfig](x: Self) {
      
      inline def setHasMediaConfig(value: Boolean): Self = StObject.set(x, "hasMediaConfig", value.asInstanceOf[js.Any])
      
      inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaCapabilities[T] extends StObject {
    
    var mediaCapabilities: (HasMediaConfig & T) | hasMediaConfigundefinedMe
  }
  object MediaCapabilities {
    
    inline def apply[T](mediaCapabilities: (HasMediaConfig & T) | hasMediaConfigundefinedMe): MediaCapabilities[T] = {
      val __obj = js.Dynamic.literal(mediaCapabilities = mediaCapabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaCapabilities[T]]
    }
    
    extension [Self <: MediaCapabilities[?], T](x: Self & MediaCapabilities[T]) {
      
      inline def setMediaCapabilities(value: (HasMediaConfig & T) | hasMediaConfigundefinedMe): Self = StObject.set(x, "mediaCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberOfLogicalProcessors extends StObject {
    
    var numberOfLogicalProcessors: js.UndefOr[Double] = js.undefined
    
    var unsupported: Boolean
  }
  object NumberOfLogicalProcessors {
    
    inline def apply(unsupported: Boolean): NumberOfLogicalProcessors = {
      val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberOfLogicalProcessors]
    }
    
    extension [Self <: NumberOfLogicalProcessors](x: Self) {
      
      inline def setNumberOfLogicalProcessors(value: Double): Self = StObject.set(x, "numberOfLogicalProcessors", value.asInstanceOf[js.Any])
      
      inline def setNumberOfLogicalProcessorsUndefined: Self = StObject.set(x, "numberOfLogicalProcessors", js.undefined)
      
      inline def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/media-capabilities.MediaConfigurationInfo> */
  trait PartialMediaConfiguration extends StObject {
    
    var powerEfficient: js.UndefOr[Boolean] = js.undefined
    
    var smooth: js.UndefOr[Boolean] = js.undefined
    
    var supported: js.UndefOr[Boolean] = js.undefined
  }
  object PartialMediaConfiguration {
    
    inline def apply(): PartialMediaConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMediaConfiguration]
    }
    
    extension [Self <: PartialMediaConfiguration](x: Self) {
      
      inline def setPowerEfficient(value: Boolean): Self = StObject.set(x, "powerEfficient", value.asInstanceOf[js.Any])
      
      inline def setPowerEfficientUndefined: Self = StObject.set(x, "powerEfficient", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
      
      inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/memory.MemoryStatus> */
  trait PartialMemoryStatus extends StObject {
    
    var deviceMemory: js.UndefOr[Double] = js.undefined
    
    var jsHeapSizeLimit: js.UndefOr[Double | Null] = js.undefined
    
    var totalJSHeapSize: js.UndefOr[Double | Null] = js.undefined
    
    var usedJSHeapSize: js.UndefOr[Double | Null] = js.undefined
  }
  object PartialMemoryStatus {
    
    inline def apply(): PartialMemoryStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMemoryStatus]
    }
    
    extension [Self <: PartialMemoryStatus](x: Self) {
      
      inline def setDeviceMemory(value: Double): Self = StObject.set(x, "deviceMemory", value.asInstanceOf[js.Any])
      
      inline def setDeviceMemoryUndefined: Self = StObject.set(x, "deviceMemory", js.undefined)
      
      inline def setJsHeapSizeLimit(value: Double): Self = StObject.set(x, "jsHeapSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setJsHeapSizeLimitNull: Self = StObject.set(x, "jsHeapSizeLimit", null)
      
      inline def setJsHeapSizeLimitUndefined: Self = StObject.set(x, "jsHeapSizeLimit", js.undefined)
      
      inline def setTotalJSHeapSize(value: Double): Self = StObject.set(x, "totalJSHeapSize", value.asInstanceOf[js.Any])
      
      inline def setTotalJSHeapSizeNull: Self = StObject.set(x, "totalJSHeapSize", null)
      
      inline def setTotalJSHeapSizeUndefined: Self = StObject.set(x, "totalJSHeapSize", js.undefined)
      
      inline def setUsedJSHeapSize(value: Double): Self = StObject.set(x, "usedJSHeapSize", value.asInstanceOf[js.Any])
      
      inline def setUsedJSHeapSizeNull: Self = StObject.set(x, "usedJSHeapSize", null)
      
      inline def setUsedJSHeapSizeUndefined: Self = StObject.set(x, "usedJSHeapSize", js.undefined)
    }
  }
  
  trait SaveData extends StObject {
    
    var saveData: Boolean | Null
    
    var unsupported: Boolean
  }
  object SaveData {
    
    inline def apply(unsupported: Boolean): SaveData = {
      val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any], saveData = null)
      __obj.asInstanceOf[SaveData]
    }
    
    extension [Self <: SaveData](x: Self) {
      
      inline def setSaveData(value: Boolean): Self = StObject.set(x, "saveData", value.asInstanceOf[js.Any])
      
      inline def setSaveDataNull: Self = StObject.set(x, "saveData", null)
      
      inline def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: file | record | transmission | `media-source`
  }
  object Type {
    
    inline def apply(`type`: file | record | transmission | `media-source`): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: file | record | transmission | `media-source`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unsupported extends StObject {
    
    var unsupported: `true`
  }
  object Unsupported {
    
    inline def apply(): Unsupported = {
      val __obj = js.Dynamic.literal(unsupported = true)
      __obj.asInstanceOf[Unsupported]
    }
    
    extension [Self <: Unsupported](x: Self) {
      
      inline def setUnsupported(value: `true`): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    }
  }
  
  trait Video extends StObject {
    
    var video: VideoMediaConfiguration
  }
  object Video {
    
    inline def apply(video: VideoMediaConfiguration): Video = {
      val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[Video]
    }
    
    extension [Self <: Video](x: Self) {
      
      inline def setVideo(value: VideoMediaConfiguration): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  hasMediaConfig :undefined} & react-adaptive-hooks.react-adaptive-hooks/media-capabilities.MediaConfigurationInfo */
  trait hasMediaConfigundefinedMe extends StObject {
    
    var hasMediaConfig: Unit
    
    var powerEfficient: Boolean
    
    var smooth: Boolean
    
    var supported: Boolean
  }
  object hasMediaConfigundefinedMe {
    
    inline def apply(hasMediaConfig: Unit, powerEfficient: Boolean, smooth: Boolean, supported: Boolean): hasMediaConfigundefinedMe = {
      val __obj = js.Dynamic.literal(hasMediaConfig = hasMediaConfig.asInstanceOf[js.Any], powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
      __obj.asInstanceOf[hasMediaConfigundefinedMe]
    }
    
    extension [Self <: hasMediaConfigundefinedMe](x: Self) {
      
      inline def setHasMediaConfig(value: Unit): Self = StObject.set(x, "hasMediaConfig", value.asInstanceOf[js.Any])
      
      inline def setPowerEfficient(value: Boolean): Self = StObject.set(x, "powerEfficient", value.asInstanceOf[js.Any])
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  unsupported :false} & react-adaptive-hooks.react-adaptive-hooks/memory.MemoryStatus */
  trait unsupportedfalseMemorySta extends StObject {
    
    var deviceMemory: Double
    
    var jsHeapSizeLimit: Double | Null
    
    var totalJSHeapSize: Double | Null
    
    var unsupported: `false`
    
    var usedJSHeapSize: Double | Null
  }
  object unsupportedfalseMemorySta {
    
    inline def apply(deviceMemory: Double): unsupportedfalseMemorySta = {
      val __obj = js.Dynamic.literal(deviceMemory = deviceMemory.asInstanceOf[js.Any], unsupported = false, jsHeapSizeLimit = null, totalJSHeapSize = null, usedJSHeapSize = null)
      __obj.asInstanceOf[unsupportedfalseMemorySta]
    }
    
    extension [Self <: unsupportedfalseMemorySta](x: Self) {
      
      inline def setDeviceMemory(value: Double): Self = StObject.set(x, "deviceMemory", value.asInstanceOf[js.Any])
      
      inline def setJsHeapSizeLimit(value: Double): Self = StObject.set(x, "jsHeapSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setJsHeapSizeLimitNull: Self = StObject.set(x, "jsHeapSizeLimit", null)
      
      inline def setTotalJSHeapSize(value: Double): Self = StObject.set(x, "totalJSHeapSize", value.asInstanceOf[js.Any])
      
      inline def setTotalJSHeapSizeNull: Self = StObject.set(x, "totalJSHeapSize", null)
      
      inline def setUnsupported(value: `false`): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
      
      inline def setUsedJSHeapSize(value: Double): Self = StObject.set(x, "usedJSHeapSize", value.asInstanceOf[js.Any])
      
      inline def setUsedJSHeapSizeNull: Self = StObject.set(x, "usedJSHeapSize", null)
    }
  }
}

package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.anon.EffectiveConnectionType
import typings.reactAdaptiveHooks.anon.MediaCapabilities
import typings.reactAdaptiveHooks.anon.NumberOfLogicalProcessors
import typings.reactAdaptiveHooks.anon.SaveData
import typings.reactAdaptiveHooks.anon.Unsupported
import typings.reactAdaptiveHooks.anon.unsupportedfalseMemorySta
import typings.reactAdaptiveHooks.mediaCapabilitiesMod.MediaConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-adaptive-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useHardwareConcurrency(): NumberOfLogicalProcessors = ^.asInstanceOf[js.Dynamic].applyDynamic("useHardwareConcurrency")().asInstanceOf[NumberOfLogicalProcessors]
  
  @scala.inline
  def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): MediaCapabilities[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaCapabilities")(mediaConfig.asInstanceOf[js.Any], initialMediaCapabilities.asInstanceOf[js.Any])).asInstanceOf[MediaCapabilities[T]]
  
  @scala.inline
  def useMemoryStatus[T](): (Unsupported & T) | unsupportedfalseMemorySta = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoryStatus")().asInstanceOf[(Unsupported & T) | unsupportedfalseMemorySta]
  @scala.inline
  def useMemoryStatus[T](initialMemoryStatus: T): (Unsupported & T) | unsupportedfalseMemorySta = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoryStatus")(initialMemoryStatus.asInstanceOf[js.Any]).asInstanceOf[(Unsupported & T) | unsupportedfalseMemorySta]
  
  @scala.inline
  def useNetworkStatus(): EffectiveConnectionType = ^.asInstanceOf[js.Dynamic].applyDynamic("useNetworkStatus")().asInstanceOf[EffectiveConnectionType]
  @scala.inline
  def useNetworkStatus(initialEffectiveConnectionType: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType): EffectiveConnectionType = ^.asInstanceOf[js.Dynamic].applyDynamic("useNetworkStatus")(initialEffectiveConnectionType.asInstanceOf[js.Any]).asInstanceOf[EffectiveConnectionType]
  
  @scala.inline
  def useSaveData(): SaveData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSaveData")().asInstanceOf[SaveData]
  @scala.inline
  def useSaveData(initialSaveDataStatus: Boolean): SaveData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSaveData")(initialSaveDataStatus.asInstanceOf[js.Any]).asInstanceOf[SaveData]
}

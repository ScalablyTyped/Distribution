package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.anon.EffectiveConnectionType
import typings.reactAdaptiveHooks.anon.MediaCapabilities
import typings.reactAdaptiveHooks.anon.NumberOfLogicalProcessors
import typings.reactAdaptiveHooks.anon.SaveData
import typings.reactAdaptiveHooks.anon.Unsupported
import typings.reactAdaptiveHooks.anon.unsupportedfalseMemorySta
import typings.reactAdaptiveHooks.mediaCapabilitiesMod.MediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adaptive-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def useHardwareConcurrency(): NumberOfLogicalProcessors = js.native
  def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): MediaCapabilities[T] = js.native
  def useMemoryStatus[T](): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  def useMemoryStatus[T](initialMemoryStatus: T): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  def useNetworkStatus(): EffectiveConnectionType = js.native
  def useNetworkStatus(initialEffectiveConnectionType: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType): EffectiveConnectionType = js.native
  def useSaveData(): SaveData = js.native
  def useSaveData(initialSaveDataStatus: Boolean): SaveData = js.native
}


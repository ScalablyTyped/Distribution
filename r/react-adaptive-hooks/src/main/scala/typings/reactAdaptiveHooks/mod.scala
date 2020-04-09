package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.mediaCapabilitiesMod.MediaConfiguration
import typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adaptive-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def useHardwareConcurrency(): AnonNumberOfLogicalProcessors = js.native
  def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): AnonMediaCapabilities[T] = js.native
  def useMemoryStatus[T](): (AnonUnsupported with T) | unsupportedfalseMemorySta = js.native
  def useMemoryStatus[T](initialMemoryStatus: T): (AnonUnsupported with T) | unsupportedfalseMemorySta = js.native
  def useNetworkStatus(): AnonEffectiveConnectionType = js.native
  def useNetworkStatus(initialEffectiveConnectionType: EffectiveConnectionType): AnonEffectiveConnectionType = js.native
  def useSaveData(): AnonSaveData = js.native
  def useSaveData(initialSaveDataStatus: Boolean): AnonSaveData = js.native
}


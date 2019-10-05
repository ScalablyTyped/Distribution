package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationField
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationHandle
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderField
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getStorageKey")
@js.native
object getStorageKey extends js.Object {
  def apply(field: NormalizationField, variables: Variables): String = js.native
  def apply(field: NormalizationHandle, variables: Variables): String = js.native
  def apply(field: ReaderField, variables: Variables): String = js.native
}


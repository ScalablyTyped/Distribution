package typings.relayRuntime.mod

import typings.relayRuntime.normalizationNodeMod.NormalizationField
import typings.relayRuntime.normalizationNodeMod.NormalizationHandle
import typings.relayRuntime.readerNodeMod.ReaderField
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime", "getStorageKey")
@js.native
object getStorageKey extends js.Object {
  
  def apply(field: NormalizationField, variables: Variables): String = js.native
  def apply(field: NormalizationHandle, variables: Variables): String = js.native
  def apply(field: ReaderField, variables: Variables): String = js.native
}

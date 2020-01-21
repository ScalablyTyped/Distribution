package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.normalizationNodeMod.NormalizationArgument
import typings.relayRuntime.normalizationNodeMod.NormalizationField
import typings.relayRuntime.normalizationNodeMod.NormalizationHandle
import typings.relayRuntime.readerNodeMod.ReaderArgument
import typings.relayRuntime.readerNodeMod.ReaderField
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayStoreUtils", JSImport.Namespace)
@js.native
object relayStoreUtilsMod extends js.Object {
  val FRAGMENTS_KEY: String = js.native
  val FRAGMENT_OWNER_KEY: String = js.native
  val FRAGMENT_PROP_NAME_KEY: String = js.native
  val ID_KEY: String = js.native
  val MODULE_COMPONENT_KEY: String = js.native
  val REFS_KEY: String = js.native
  val REF_KEY: String = js.native
  val ROOT_ID: String = js.native
  val ROOT_TYPE: String = js.native
  val TYPENAME_KEY: String = js.native
  def formatStorageKey(name: String, argValues: Arguments): String = js.native
  def getArgumentValues(args: js.Array[NormalizationArgument | ReaderArgument], variables: Variables): Arguments = js.native
  def getHandleStorageKey(handleField: NormalizationHandle, variables: Variables): String = js.native
  def getModuleComponentKey(documentName: String): String = js.native
  def getModuleOperationKey(documentName: String): String = js.native
  def getStableStorageKey(name: String, args: Arguments): String = js.native
  def getStableVariableValue(name: String, variables: Variables): js.Any = js.native
  def getStorageKey(field: NormalizationField, variables: Variables): String = js.native
  def getStorageKey(field: NormalizationHandle, variables: Variables): String = js.native
  def getStorageKey(field: ReaderField, variables: Variables): String = js.native
  type Arguments = StringDictionary[js.Any]
}


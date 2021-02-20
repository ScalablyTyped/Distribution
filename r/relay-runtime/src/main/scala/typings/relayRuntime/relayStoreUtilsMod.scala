package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.normalizationNodeMod.NormalizationArgument
import typings.relayRuntime.normalizationNodeMod.NormalizationField
import typings.relayRuntime.normalizationNodeMod.NormalizationHandle
import typings.relayRuntime.readerNodeMod.ReaderArgument
import typings.relayRuntime.readerNodeMod.ReaderField
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayStoreUtilsMod {
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "FRAGMENTS_KEY")
  @js.native
  val FRAGMENTS_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "FRAGMENT_OWNER_KEY")
  @js.native
  val FRAGMENT_OWNER_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "FRAGMENT_PROP_NAME_KEY")
  @js.native
  val FRAGMENT_PROP_NAME_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "ID_KEY")
  @js.native
  val ID_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "MODULE_COMPONENT_KEY")
  @js.native
  val MODULE_COMPONENT_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "REFS_KEY")
  @js.native
  val REFS_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "REF_KEY")
  @js.native
  val REF_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "ROOT_ID")
  @js.native
  val ROOT_ID: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "ROOT_TYPE")
  @js.native
  val ROOT_TYPE: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "TYPENAME_KEY")
  @js.native
  val TYPENAME_KEY: String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "formatStorageKey")
  @js.native
  def formatStorageKey(name: String, argValues: Arguments): String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getArgumentValues")
  @js.native
  def getArgumentValues(args: js.Array[NormalizationArgument | ReaderArgument], variables: Variables): Arguments = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getHandleStorageKey")
  @js.native
  def getHandleStorageKey(handleField: NormalizationHandle, variables: Variables): String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getModuleComponentKey")
  @js.native
  def getModuleComponentKey(documentName: String): String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getModuleOperationKey")
  @js.native
  def getModuleOperationKey(documentName: String): String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getStableStorageKey")
  @js.native
  def getStableStorageKey(name: String, args: Arguments): String = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getStableVariableValue")
  @js.native
  def getStableVariableValue(name: String, variables: Variables): js.Any = js.native
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getStorageKey")
  @js.native
  def getStorageKey(field: NormalizationField, variables: Variables): String = js.native
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getStorageKey")
  @js.native
  def getStorageKey(field: NormalizationHandle, variables: Variables): String = js.native
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", "getStorageKey")
  @js.native
  def getStorageKey(field: ReaderField, variables: Variables): String = js.native
  
  type Arguments = StringDictionary[js.Any]
}

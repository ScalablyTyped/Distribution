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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayStoreUtilsMod {
  
  @JSImport("relay-runtime/lib/store/RelayStoreUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def formatStorageKey(name: String, argValues: Arguments): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatStorageKey")(name.asInstanceOf[js.Any], argValues.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getArgumentValues(args: js.Array[NormalizationArgument | ReaderArgument], variables: Variables): Arguments = (^.asInstanceOf[js.Dynamic].applyDynamic("getArgumentValues")(args.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Arguments]
  
  inline def getHandleStorageKey(handleField: NormalizationHandle, variables: Variables): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHandleStorageKey")(handleField.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getModuleComponentKey(documentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleComponentKey")(documentName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getModuleOperationKey(documentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleOperationKey")(documentName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStableStorageKey(name: String, args: Arguments): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStableStorageKey")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStableVariableValue(name: String, variables: Variables): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStableVariableValue")(name.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getStorageKey(field: NormalizationField, variables: Variables): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorageKey")(field.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStorageKey(field: NormalizationHandle, variables: Variables): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorageKey")(field.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStorageKey(field: ReaderField, variables: Variables): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorageKey")(field.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Arguments = StringDictionary[js.Any]
}

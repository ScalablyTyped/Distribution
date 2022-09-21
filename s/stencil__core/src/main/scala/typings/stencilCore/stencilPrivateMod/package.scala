package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.BooleanConstructor
import typings.std.CSSStyleSheet
import typings.std.Document
import typings.std.Element
import typings.std.Map
import typings.std.NumberConstructor
import typings.std.Record
import typings.std.Set
import typings.std.StringConstructor
import typings.std.WeakMap
import typings.std.Window
import typings.stencilCore.anon.BundleIds
import typings.stencilCore.anon.Internal
import typings.stencilCore.stencilPublicCompilerMod.CompilerBuildStart
import typings.stencilCore.stencilPublicRuntimeMod.ListenOptions
import typings.stencilCore.stencilPublicRuntimeMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivelyProcessingCmpMap = Set[Element]

type AddEventListener = js.Function4[
/* elm */ Element | Document | Window, 
/* eventName */ String, 
/* cb */ EventListenerCallback, 
/* opts */ js.UndefOr[ListenOptions], 
js.Function]

type AppRegistryComponents = StringDictionary[BundleIds]

type AppliedStyleMap = Set[String]

type BuildSourceGraph = StringDictionary[js.Array[String]]

type BuildTask = Any

type BundleEntryInputs = StringDictionary[String]

type ChildType = VNode | Double | String

type CollectionComponentEntryPath = String

type CompilerModeStyles = StringDictionary[js.Array[String]]

type ComponentCompilerTypeReferences = Record[String, ComponentCompilerTypeReference]

type ComponentConstructorProperties = StringDictionary[ComponentConstructorProperty]

/* Rewritten from type alias, can be one of: 
  - typings.std.StringConstructor
  - typings.std.BooleanConstructor
  - typings.std.NumberConstructor
  - typings.stencilCore.stencilCoreStrings.string_
  - typings.stencilCore.stencilCoreStrings.boolean_
  - typings.stencilCore.stencilCoreStrings.number_
*/
type ComponentConstructorPropertyType = _ComponentConstructorPropertyType | StringConstructor | BooleanConstructor | NumberConstructor

type ComponentConstructorWatchers = StringDictionary[js.Array[String]]

type ComponentRuntimeHostListener = js.Tuple3[
/**
  * event flags
  */
Double, 
/**
  * event name,
  */
String, 
/**
  * event method,
  */
String]

type ComponentRuntimeMember = js.Tuple2[
/**
  * flags data
  */
Double, 
js.UndefOr[/**
  * attribute name to observe
  */
String]]

type ComponentRuntimeMembers = StringDictionary[ComponentRuntimeMember]

type ComponentRuntimeMetaCompact = js.Tuple4[
/** flags */
Double, 
/** tagname */
String, 
js.UndefOr[StringDictionary[ComponentRuntimeMember]], 
js.UndefOr[js.Array[/** listeners */
ComponentRuntimeHostListener]]]

type DevServerSendMessage = js.Function1[/* msg */ DevServerMessage, Unit]

type EventListenerCallback = js.Function1[/* ev */ js.UndefOr[Any], Unit]

type HydrateElement = StringDictionary[js.UndefOr[String]]

type InitServerProcess = js.Function1[
/* sendMsg */ js.Function1[/* msg */ DevServerMessage, Unit], 
js.Function1[/* msg */ DevServerMessage, Unit]]

type LazyBundleRuntimeData = js.Tuple2[/** bundleIds */
String, js.Array[ComponentRuntimeMetaCompact]]

type LazyBundlesRuntimeData = js.Array[LazyBundleRuntimeData]

type ModeBundleId = ModeBundleIds | String

type ModeBundleIds = StringDictionary[String]

type ModuleBundles = StringDictionary[String]

type ModuleMap = Map[String, Module]

type NodeMap = WeakMap[Any, ComponentCompilerMeta]

type OnCallback = js.Function1[/* buildStart */ CompilerBuildStart, Unit]

type PropsType = VNodeProdData | Double | String | Null

type RefMap = WeakMap[Any, HostRef]

type RemoveCallback = js.Function0[Boolean]

type RootAppliedStyleMap = WeakMap[Element, Set[String]]

type RuntimeRef = HostElement | js.Object

type StyleMap = Map[String, CSSStyleSheet | String]

type StylesData = StringDictionary[StyleData]

type TypeInfo = js.Array[Internal]

type TypesImportData = StringDictionary[js.Array[TypesMemberNameData]]

type WorkerMsgHandler = js.Function1[/* msgToWorker */ MsgToWorker, js.Promise[Any]]

type WorkerRunner = js.Function2[/* methodName */ String, /* args */ js.Array[Any], js.Promise[Any]]

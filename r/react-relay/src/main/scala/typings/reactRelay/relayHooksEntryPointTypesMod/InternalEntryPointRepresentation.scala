package typings.reactRelay.relayHooksEntryPointTypesMod

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Interface of the EntryPoints .entrypoint files
  *
  * Every .entrypoint file it's an object that must have two required fields:
  * - getPreloadProps(...)  function that will return the description of preloaded
  *   queries and preloaded (nested) entry points for the current entry point
  * - root - JSResource of the module that will render those preloaded queries
  *
  * TEntryPointParams - object that contains all necessary information to execute
  * the preloaders (routeParams, query variables)
  *
  * TPreloadedQueries -  queries, defined in the root components
  *
  * TNestedEntryPoints - nested entry points, defined in the root components
  *
  * TRuntimeProps - the type of additional props that you may pass to the
  * component (like `onClick` handler, etc) during runtime. Values for them
  * defined during component runtime
  *
  * TExtraProps - a bag of extra props that you may define in `entrypoint` file
  * and they will be passed to the EntryPointComponent as `extraProps`
  */
/* Inlined parent std.Readonly<{  root :react-relay.react-relay/relay-hooks/EntryPointTypes.JSResourceReference<react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps>>, getPreloadProps (entryPointParams : TEntryPointParams): react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadProps<TEntryPointParams, TPreloadedQueries, TNestedEntryPoints, TExtraProps>}> */
trait InternalEntryPointRepresentation[/**
  * object that contains all necessary information to execute the preloaders (routeParams, query variables)
  */
TEntryPointParams /* <: js.Object */, /**
  * queries, defined in the root components
  */
TPreloadedQueries /* <: Record[String, OperationType] */, /**
  * nested entry points, defined in the root components
  */
TNestedEntryPoints /* <: js.Object */, /**
  * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
  * Values for them defined during component runtime
  */
TRuntimeProps /* <: js.Object */, /**
  * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
  * as `extraProps`
  */
TExtraProps /* <: js.Object | Null */] extends StObject {
  
  val getPreloadProps: js.Function1[
    /* entryPointParams */ TEntryPointParams, 
    PreloadProps[TEntryPointParams, TPreloadedQueries, TNestedEntryPoints, TExtraProps]
  ]
  
  val root: JSResourceReference[
    EntryPointComponent[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps]
  ]
}
object InternalEntryPointRepresentation {
  
  inline def apply[/**
    * object that contains all necessary information to execute the preloaders (routeParams, query variables)
    */
  TEntryPointParams /* <: js.Object */, /**
    * queries, defined in the root components
    */
  TPreloadedQueries /* <: Record[String, OperationType] */, /**
    * nested entry points, defined in the root components
    */
  TNestedEntryPoints /* <: js.Object */, /**
    * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
    * Values for them defined during component runtime
    */
  TRuntimeProps /* <: js.Object */, /**
    * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
    * as `extraProps`
    */
  TExtraProps /* <: js.Object | Null */](
    getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TNestedEntryPoints, TExtraProps],
    root: JSResourceReference[
      EntryPointComponent[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps]
    ]
  ): InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalEntryPointRepresentation[?, ?, ?, ?, ?], /**
    * object that contains all necessary information to execute the preloaders (routeParams, query variables)
    */
  TEntryPointParams /* <: js.Object */, /**
    * queries, defined in the root components
    */
  TPreloadedQueries /* <: Record[String, OperationType] */, /**
    * nested entry points, defined in the root components
    */
  TNestedEntryPoints /* <: js.Object */, /**
    * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
    * Values for them defined during component runtime
    */
  TRuntimeProps /* <: js.Object */, /**
    * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
    * as `extraProps`
    */
  TExtraProps /* <: js.Object | Null */] (val x: Self & (InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
    
    inline def setGetPreloadProps(
      value: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TNestedEntryPoints, TExtraProps]
    ): Self = StObject.set(x, "getPreloadProps", js.Any.fromFunction1(value))
    
    inline def setRoot(
      value: JSResourceReference[
          EntryPointComponent[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps]
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}

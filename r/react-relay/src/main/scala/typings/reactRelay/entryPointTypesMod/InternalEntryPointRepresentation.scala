package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  * TPreloadedEntryPoints - nested entry points, defined in the root components
  *
  * TRuntimeProps - the type of additional props that you may pass to the
  * component (like `onClick` handler, etc) during runtime. Values for them
  * defined during component runtime
  *
  * TExtraProps - a bag of extra props that you may define in `entrypoint` file
  * and they will be passed to the EntryPointComponent as `extraProps`
  */
/* Inlined parent std.Readonly<{  root :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.JSResourceReference<react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPointComponent<TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps>>, getPreloadProps (entryPointParams : TEntryPointParams): react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadProps<TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps>}> */
@js.native
trait InternalEntryPointRepresentation[/**
  * object that contains all necessary information to execute the preloaders (routeParams, query variables)
  */
TEntryPointParams /* <: js.Object */, /**
  * queries, defined in the root components
  */
TPreloadedQueries /* <: Record[String, OperationType] */, /**
  * nested entry points, defined in the root components
  */
TPreloadedEntryPoints /* <: js.Object */, /**
  * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
  * Values for them defined during component runtime
  */
TRuntimeProps /* <: js.Object */, /**
  * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
  * as `extraProps`
  */
TExtraProps] extends js.Object {
  
  val getPreloadProps: js.Function1[
    /* entryPointParams */ TEntryPointParams, 
    PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
  ] = js.native
  
  val root: JSResourceReference[
    EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ] = js.native
}
object InternalEntryPointRepresentation {
  
  @scala.inline
  def apply[/**
    * object that contains all necessary information to execute the preloaders (routeParams, query variables)
    */
  TEntryPointParams /* <: js.Object */, /**
    * queries, defined in the root components
    */
  TPreloadedQueries /* <: Record[String, OperationType] */, /**
    * nested entry points, defined in the root components
    */
  TPreloadedEntryPoints /* <: js.Object */, /**
    * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
    * Values for them defined during component runtime
    */
  TRuntimeProps /* <: js.Object */, /**
    * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
    * as `extraProps`
    */
  TExtraProps](
    getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps],
    root: JSResourceReference[
      EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
    ]
  ): InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  
  @scala.inline
  implicit class InternalEntryPointRepresentationOps[Self <: InternalEntryPointRepresentation[_, _, _, _, _], /**
    * object that contains all necessary information to execute the preloaders (routeParams, query variables)
    */
  TEntryPointParams /* <: js.Object */, /**
    * queries, defined in the root components
    */
  TPreloadedQueries /* <: Record[String, OperationType] */, /**
    * nested entry points, defined in the root components
    */
  TPreloadedEntryPoints /* <: js.Object */, /**
    * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
    * Values for them defined during component runtime
    */
  TRuntimeProps /* <: js.Object */, /**
    * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
    * as `extraProps`
    */
  TExtraProps] (val x: Self with (InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetPreloadProps(
      value: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
    ): Self = this.set("getPreloadProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoot(
      value: JSResourceReference[
          EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
        ]
    ): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}

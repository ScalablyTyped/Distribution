package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRelayDashExperimentalEntryPointTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.Component
  import typings.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typings.reactDashRelay.Anon_EntryPoint
  import typings.reactDashRelay.Anon_EntryPointParams
  import typings.reactDashRelay.Anon_EntryPoints
  import typings.reactDashRelay.Anon_EntryPointsExtraProps
  import typings.reactDashRelay.Anon_EntryPointsExtraPropsGetComponent
  import typings.reactDashRelay.Anon_EnvironmentProviderOptions
  import typings.reactDashRelay.reactDashRelayStrings.entryPoints
  import typings.reactDashRelay.reactDashRelayStrings.extraProps
  import typings.reactDashRelay.reactDashRelayStrings.props
  import typings.reactDashRelay.reactDashRelayStrings.queries
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType

  type EntryPoint[TEntryPointParams, TEntryPointComponent] = InternalEntryPointRepresentation[
    TEntryPointParams, 
    LibraryManagedAttributes[TEntryPointComponent, queries], 
    LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
    LibraryManagedAttributes[TEntryPointComponent, props], 
    LibraryManagedAttributes[TEntryPointComponent, extraProps]
  ]
  type EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = Component[
    EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps], 
    js.Object, 
    js.Any
  ]
  type EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = Anon_EntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries]
  type EnvironmentProviderOptions = StringDictionary[js.Any]
  type ExtractEntryPointTypeHelper[TEntryPointParams] = js.Function1[
    /* entryPoint */ js.UndefOr[PreloadedEntryPoint[js.Any] | Null], 
    js.UndefOr[
      (ThinNestedEntryPointParams[TEntryPointParams, EntryPoint[TEntryPointParams, js.Any]]) | Null
    ]
  ]
  type ExtractQueryTypeHelper[TEnvironmentProviderOptions] = js.Function1[
    /* query */ PreloadedQuery[OperationType, EnvironmentProviderOptions], 
    ThinQueryParams[OperationType, TEnvironmentProviderOptions]
  ]
  type InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = Anon_EntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
  type PreloadProps[TPreloadParams, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions] = Anon_EntryPointsExtraProps[
    TPreloadedEntryPoints, 
    TPreloadParams, 
    TExtraProps, 
    TPreloadedQueries, 
    TEnvironmentProviderOptions
  ]
  type PreloadableConcreteRequest[TQuery /* <: OperationType */] = js.Object
  type PreloadedEntryPoint[TEntryPointComponent] = Anon_EntryPointsExtraPropsGetComponent[TEntryPointComponent]
  type ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] = Anon_EntryPoint[TEntryPoint, TEntryPointParams]
  type ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions] = Anon_EnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery]
}

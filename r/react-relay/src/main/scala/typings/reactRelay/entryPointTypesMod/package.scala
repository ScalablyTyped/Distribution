package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object entryPointTypesMod {
  type EntryPoint[TEntryPointParams, TEntryPointComponent] = typings.reactRelay.entryPointTypesMod.InternalEntryPointRepresentation[
    TEntryPointParams, 
    typings.react.mod._Global_.JSX.LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.queries], 
    typings.react.mod._Global_.JSX.LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.entryPoints], 
    typings.react.mod._Global_.JSX.LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.props], 
    typings.react.mod._Global_.JSX.LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.extraProps]
  ]
  type EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = typings.react.mod.Component[
    typings.reactRelay.entryPointTypesMod.EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps], 
    js.Object, 
    js.Any
  ]
  type EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = typings.reactRelay.AnonEntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries]
  type EnvironmentProviderOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ExtractEntryPointTypeHelper[TEntryPointParams] = js.Function1[
    /* entryPoint */ js.UndefOr[typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint[js.Any] | scala.Null], 
    js.UndefOr[
      (typings.reactRelay.entryPointTypesMod.ThinNestedEntryPointParams[
        TEntryPointParams, 
        typings.reactRelay.entryPointTypesMod.EntryPoint[TEntryPointParams, js.Any]
      ]) | scala.Null
    ]
  ]
  type ExtractQueryTypeHelper[TEnvironmentProviderOptions] = js.Function1[
    /* query */ typings.reactRelay.entryPointTypesMod.PreloadedQuery[
      typings.relayRuntime.relayRuntimeTypesMod.OperationType, 
      typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
    ], 
    typings.reactRelay.entryPointTypesMod.ThinQueryParams[
      typings.relayRuntime.relayRuntimeTypesMod.OperationType, 
      TEnvironmentProviderOptions
    ]
  ]
  type InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = typings.reactRelay.AnonEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
  type PreloadProps[TPreloadParams, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions] = typings.reactRelay.AnonEntryPointsExtraProps[
    TPreloadedEntryPoints, 
    TPreloadParams, 
    TExtraProps, 
    TPreloadedQueries, 
    TEnvironmentProviderOptions
  ]
  type PreloadableConcreteRequest[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */] = js.Object
  type PreloadedEntryPoint[TEntryPointComponent] = typings.reactRelay.AnonEntryPointsExtraPropsGetComponent[TEntryPointComponent]
  type ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] = typings.reactRelay.AnonEntryPoint[TEntryPoint, TEntryPointParams]
  type ThinQueryParams[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TEnvironmentProviderOptions] = typings.reactRelay.AnonEnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery]
}

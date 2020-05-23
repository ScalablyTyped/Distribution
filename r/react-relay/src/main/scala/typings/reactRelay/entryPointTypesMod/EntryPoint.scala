package typings.reactRelay.entryPointTypesMod

import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRelay.reactRelayStrings.entryPoints
import typings.reactRelay.reactRelayStrings.extraProps
import typings.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-relay.react-relay/lib/relay-experimental/EntryPointTypes.InternalEntryPointRepresentation<TEntryPointParams, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'props'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>> */
trait EntryPoint[TEntryPointParams, TEntryPointComponent] extends js.Object {
  val getPreloadProps: js.Function1[
    /* entryPointParams */ TEntryPointParams, 
    PreloadProps[
      TEntryPointParams, 
      LibraryManagedAttributes[TEntryPointComponent, queries], 
      LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
      LibraryManagedAttributes[TEntryPointComponent, extraProps], 
      EnvironmentProviderOptions
    ]
  ]
  val root: js.Any
}

object EntryPoint {
  @scala.inline
  def apply[TEntryPointParams, TEntryPointComponent](
    getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[
      TEntryPointParams, 
      LibraryManagedAttributes[TEntryPointComponent, queries], 
      LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
      LibraryManagedAttributes[TEntryPointComponent, extraProps], 
      EnvironmentProviderOptions
    ],
    root: js.Any
  ): EntryPoint[TEntryPointParams, TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPoint[TEntryPointParams, TEntryPointComponent]]
  }
}


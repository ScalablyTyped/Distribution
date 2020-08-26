package typings.reactRelay.entryPointTypesMod

import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRelay.reactRelayStrings.entryPoints
import typings.reactRelay.reactRelayStrings.extraProps
import typings.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-relay.react-relay/lib/relay-experimental/EntryPointTypes.InternalEntryPointRepresentation<TEntryPointParams, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'props'>, react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>> */
@js.native
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
  ] = js.native
  val root: js.Any = js.native
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
  @scala.inline
  implicit class EntryPointOps[Self <: EntryPoint[_, _], TEntryPointParams, TEntryPointComponent] (val x: Self with (EntryPoint[TEntryPointParams, TEntryPointComponent])) extends AnyVal {
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
      value: /* entryPointParams */ TEntryPointParams => PreloadProps[
          TEntryPointParams, 
          LibraryManagedAttributes[TEntryPointComponent, queries], 
          LibraryManagedAttributes[TEntryPointComponent, entryPoints], 
          LibraryManagedAttributes[TEntryPointComponent, extraProps], 
          EnvironmentProviderOptions
        ]
    ): Self = this.set("getPreloadProps", js.Any.fromFunction1(value))
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}


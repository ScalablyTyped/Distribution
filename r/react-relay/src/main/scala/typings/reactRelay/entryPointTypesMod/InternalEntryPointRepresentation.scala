package typings.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{getPreloadProps (entryPointParams : TEntryPointParams): react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadProps<TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps, react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions>,   root :unknown}> */
@js.native
trait InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val getPreloadProps: js.Function1[
    /* entryPointParams */ TEntryPointParams, 
    PreloadProps[
      TEntryPointParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      EnvironmentProviderOptions
    ]
  ] = js.native
  val root: js.Any = js.native
}

object InternalEntryPointRepresentation {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[
      TEntryPointParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      EnvironmentProviderOptions
    ],
    root: js.Any
  ): InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  @scala.inline
  implicit class InternalEntryPointRepresentationOps[Self <: InternalEntryPointRepresentation[_, _, _, _, _], TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self with (InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
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
          TPreloadedQueries, 
          TPreloadedEntryPoints, 
          TExtraProps, 
          EnvironmentProviderOptions
        ]
    ): Self = this.set("getPreloadProps", js.Any.fromFunction1(value))
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}


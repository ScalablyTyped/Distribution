package typings.reactRelay.anon

import typings.reactRelay.entryPointTypesMod.EntryPointComponent
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryPointReference[TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */, TRuntimeProps /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TExtraProps] extends js.Object {
  var entryPointReference: PreloadedEntryPoint[TEntryPointComponent] = js.native
  var props: TRuntimeProps = js.native
}

object EntryPointReference {
  @scala.inline
  def apply[/* <: typings.reactRelay.entryPointTypesMod.EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */ TEntryPointComponent, /* <: js.Object */ TRuntimeProps, /* <: js.Object */ TPreloadedQueries, /* <: js.Object */ TPreloadedNestedEntryPoints, TExtraProps](entryPointReference: PreloadedEntryPoint[TEntryPointComponent], props: TRuntimeProps): EntryPointReference[
    TEntryPointComponent, 
    TRuntimeProps, 
    TPreloadedQueries, 
    TPreloadedNestedEntryPoints, 
    TExtraProps
  ] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointReference[
      TEntryPointComponent, 
      TRuntimeProps, 
      TPreloadedQueries, 
      TPreloadedNestedEntryPoints, 
      TExtraProps
    ]]
  }
  @scala.inline
  implicit class EntryPointReferenceOps[Self <: EntryPointReference[_, _, _, _, _], /* <: typings.reactRelay.entryPointTypesMod.EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */ TEntryPointComponent, /* <: js.Object */ TRuntimeProps, /* <: js.Object */ TPreloadedQueries, /* <: js.Object */ TPreloadedNestedEntryPoints, TExtraProps] (val x: Self with (EntryPointReference[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ])) extends AnyVal {
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
    def setEntryPointReference(value: PreloadedEntryPoint[TEntryPointComponent]): Self = this.set("entryPointReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: TRuntimeProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.EntryPointComponent
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPointReference[TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */, TRuntimeProps /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TExtraProps] extends js.Object {
  var entryPointReference: PreloadedEntryPoint[TEntryPointComponent]
  var props: TRuntimeProps
}

object AnonEntryPointReference {
  @scala.inline
  def apply[TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */, TRuntimeProps /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TExtraProps](entryPointReference: PreloadedEntryPoint[TEntryPointComponent], props: TRuntimeProps): AnonEntryPointReference[
    TEntryPointComponent, 
    TRuntimeProps, 
    TPreloadedQueries, 
    TPreloadedNestedEntryPoints, 
    TExtraProps
  ] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntryPointReference[
      TEntryPointComponent, 
      TRuntimeProps, 
      TPreloadedQueries, 
      TPreloadedNestedEntryPoints, 
      TExtraProps
    ]]
  }
}


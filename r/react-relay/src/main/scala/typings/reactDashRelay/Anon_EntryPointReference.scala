package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointComponent
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPointReference[TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */, TRuntimeProps /* <: js.Object */] extends js.Object {
  var entryPointReference: PreloadedEntryPoint[TEntryPointComponent]
  var props: TRuntimeProps
}

object Anon_EntryPointReference {
  @scala.inline
  def apply[TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */, TRuntimeProps /* <: js.Object */](entryPointReference: PreloadedEntryPoint[TEntryPointComponent], props: TRuntimeProps): Anon_EntryPointReference[TEntryPointComponent, TRuntimeProps] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference, props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EntryPointReference[TEntryPointComponent, TRuntimeProps]]
  }
}


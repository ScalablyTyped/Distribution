package typings.reactRelay

import typings.react.mod.ClassicElement
import typings.react.mod.ElementType
import typings.reactRelay.entryPointTypesMod.EntryPointComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/EntryPointContainer", JSImport.Namespace)
@js.native
object entryPointContainerMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */](
    hasEntryPointReferenceProps: AnonEntryPointReference[
      TEntryPointComponent, 
      TRuntimeProps, 
      TPreloadedQueries, 
      TPreloadedNestedEntryPoints, 
      TExtraProps
    ]
  ): ClassicElement[ElementType[_]] = js.native
}


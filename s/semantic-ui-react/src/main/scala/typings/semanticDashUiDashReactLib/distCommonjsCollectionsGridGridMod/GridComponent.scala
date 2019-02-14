package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsGridGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridComponent
  extends reactLib.reactMod.ReactNs.FunctionComponent[GridProps] {
  @JSName("Column")
  var Column_Original: reactLib.reactMod.ReactNs.StatelessComponent[
    semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridColumnProps
  ] = js.native
  @JSName("Row")
  var Row_Original: reactLib.reactMod.ReactNs.StatelessComponent[semanticDashUiDashReactLib.distCommonjsCollectionsGridGridRowMod.GridRowProps] = js.native
  def Column(
    props: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridColumnProps with reactLib.Anon_Children
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def Column(
    props: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridColumnProps with reactLib.Anon_Children,
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def Row(
    props: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridRowMod.GridRowProps with reactLib.Anon_Children
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def Row(
    props: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridRowMod.GridRowProps with reactLib.Anon_Children,
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
}


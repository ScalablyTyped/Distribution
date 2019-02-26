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
    props: reactLib.reactMod.ReactNs.PropsWithChildren[
      semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridColumnProps
    ]
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Column(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[
      semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridColumnProps
    ],
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Row(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[semanticDashUiDashReactLib.distCommonjsCollectionsGridGridRowMod.GridRowProps]
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Row(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[semanticDashUiDashReactLib.distCommonjsCollectionsGridGridRowMod.GridRowProps],
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
}


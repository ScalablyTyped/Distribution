package typings.semanticUiReact.statisticStatisticMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.statisticGroupMod.StatisticGroupProps
import typings.semanticUiReact.statisticLabelMod.StatisticLabelProps
import typings.semanticUiReact.statisticValueMod.StatisticValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticComponent extends FunctionComponent[StatisticProps] {
  var Group: StatelessComponent[StatisticGroupProps] = js.native
  var Label: StatelessComponent[StatisticLabelProps] = js.native
  var Value: StatelessComponent[StatisticValueProps] = js.native
}


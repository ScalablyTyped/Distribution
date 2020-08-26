package typings.slickgrid.Slick.Data

import typings.slickgrid.Slick.Data.Aggregators.Aggregator
import typings.slickgrid.Slick.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupingOptions[T] extends js.Object {
  var aggregateChildGroups: js.UndefOr[Boolean] = js.native
  var aggregateCollapsed: js.UndefOr[Boolean] = js.native
  var aggregateEmpty: js.UndefOr[Boolean] = js.native
      // todo
  var aggregators: js.UndefOr[js.Array[Aggregator[T]]] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var comparer: js.UndefOr[js.Function2[/* a */ Group[T], /* b */ Group[T], Double]] = js.native
  var displayTotalsRow: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], String]] = js.native
  var getter: js.UndefOr[(js.Function1[/* item */ js.UndefOr[T], _]) | String] = js.native
  var predefinedValues: js.UndefOr[js.Array[_]] = js.native
}

object GroupingOptions {
  @scala.inline
  def apply[T](): GroupingOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupingOptions[T]]
  }
  @scala.inline
  implicit class GroupingOptionsOps[Self <: GroupingOptions[_], T] (val x: Self with GroupingOptions[T]) extends AnyVal {
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
    def setAggregateChildGroups(value: Boolean): Self = this.set("aggregateChildGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateChildGroups: Self = this.set("aggregateChildGroups", js.undefined)
    @scala.inline
    def setAggregateCollapsed(value: Boolean): Self = this.set("aggregateCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateCollapsed: Self = this.set("aggregateCollapsed", js.undefined)
    @scala.inline
    def setAggregateEmpty(value: Boolean): Self = this.set("aggregateEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateEmpty: Self = this.set("aggregateEmpty", js.undefined)
    @scala.inline
    def setAggregatorsVarargs(value: Aggregator[T]*): Self = this.set("aggregators", js.Array(value :_*))
    @scala.inline
    def setAggregators(value: js.Array[Aggregator[T]]): Self = this.set("aggregators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregators: Self = this.set("aggregators", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setComparer(value: (/* a */ Group[T], /* b */ Group[T]) => Double): Self = this.set("comparer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComparer: Self = this.set("comparer", js.undefined)
    @scala.inline
    def setDisplayTotalsRow(value: Boolean): Self = this.set("displayTotalsRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayTotalsRow: Self = this.set("displayTotalsRow", js.undefined)
    @scala.inline
    def setFormatter(value: /* item */ js.UndefOr[T] => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setGetterFunction1(value: /* item */ js.UndefOr[T] => _): Self = this.set("getter", js.Any.fromFunction1(value))
    @scala.inline
    def setGetter(value: (js.Function1[/* item */ js.UndefOr[T], _]) | String): Self = this.set("getter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetter: Self = this.set("getter", js.undefined)
    @scala.inline
    def setPredefinedValuesVarargs(value: js.Any*): Self = this.set("predefinedValues", js.Array(value :_*))
    @scala.inline
    def setPredefinedValues(value: js.Array[_]): Self = this.set("predefinedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedValues: Self = this.set("predefinedValues", js.undefined)
  }
  
}


package typings.rcDashPagination.rcDashPaginationMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof rc-pagination.rc-pagination.PaginationData ]:? rc-pagination.rc-pagination.PaginationData[P]} */ trait PaginationProps extends js.Object {
  var itemRender: js.UndefOr[
    js.Function3[/* page */ Double, /* type */ String, /* element */ ReactNode, ReactNode]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.undefined
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.undefined
  var showTotal: js.UndefOr[
    js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactNode]
  ] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    itemRender: (/* page */ Double, /* type */ String, /* element */ ReactNode) => ReactNode = null,
    onChange: (/* page */ Double, /* pageSize */ Double) => Unit = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Unit = null,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactNode = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    __obj.asInstanceOf[PaginationProps]
  }
}


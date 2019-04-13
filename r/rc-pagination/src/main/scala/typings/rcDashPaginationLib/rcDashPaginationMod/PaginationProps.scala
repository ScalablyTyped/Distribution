package typings
package rcDashPaginationLib.rcDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof rc-pagination.rc-pagination.PaginationData ]:? rc-pagination.rc-pagination.PaginationData[P]} */ trait PaginationProps extends js.Object {
  var itemRender: js.UndefOr[
    js.Function3[
      /* page */ scala.Double, 
      /* type */ java.lang.String, 
      /* element */ reactLib.reactMod.ReactNode, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* page */ scala.Double, /* pageSize */ scala.Double, scala.Unit]] = js.undefined
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ scala.Double, /* size */ scala.Double, scala.Unit]] = js.undefined
  var showTotal: js.UndefOr[
    js.Function2[
      /* total */ scala.Double, 
      /* range */ js.Tuple2[scala.Double, scala.Double], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    itemRender: (/* page */ scala.Double, /* type */ java.lang.String, /* element */ reactLib.reactMod.ReactNode) => reactLib.reactMod.ReactNode = null,
    onChange: (/* page */ scala.Double, /* pageSize */ scala.Double) => scala.Unit = null,
    onShowSizeChange: (/* current */ scala.Double, /* size */ scala.Double) => scala.Unit = null,
    showTotal: (/* total */ scala.Double, /* range */ js.Tuple2[scala.Double, scala.Double]) => reactLib.reactMod.ReactNode = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    __obj.asInstanceOf[PaginationProps]
  }
}


package typings.rmcDashCalendar.libDateDataTypesMod.Models

import typings.react.reactMod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraData extends js.Object {
  /** (web only) 附加cell样式 className */
  var cellCls: js.UndefOr[js.Any] = js.undefined
  var cellRender: js.UndefOr[js.Function1[/* date */ Date, ReactNode]] = js.undefined
  /** 是否禁止选择 */
  var disable: js.UndefOr[Boolean] = js.undefined
  /** 扩展信息 */
  var info: js.UndefOr[String] = js.undefined
}

object ExtraData {
  @scala.inline
  def apply(
    cellCls: js.Any = null,
    cellRender: /* date */ Date => ReactNode = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    info: String = null
  ): ExtraData = {
    val __obj = js.Dynamic.literal()
    if (cellCls != null) __obj.updateDynamic("cellCls")(cellCls.asInstanceOf[js.Any])
    if (cellRender != null) __obj.updateDynamic("cellRender")(js.Any.fromFunction1(cellRender))
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraData]
  }
}


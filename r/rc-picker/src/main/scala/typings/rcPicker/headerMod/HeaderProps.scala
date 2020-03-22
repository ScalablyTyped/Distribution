package typings.rcPicker.headerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var nextIcon: js.UndefOr[ReactNode] = js.undefined
  /** Next one step */
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Last one step */
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Next multiple steps */
  var onSuperNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Last multiple steps */
  var onSuperPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: String
  var prevIcon: js.UndefOr[ReactNode] = js.undefined
  var superNextIcon: js.UndefOr[ReactNode] = js.undefined
  var superPrevIcon: js.UndefOr[ReactNode] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    prefixCls: String,
    children: ReactNode = null,
    nextIcon: ReactNode = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    onSuperNext: () => Unit = null,
    onSuperPrev: () => Unit = null,
    prevIcon: ReactNode = null,
    superNextIcon: ReactNode = null,
    superPrevIcon: ReactNode = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (onSuperNext != null) __obj.updateDynamic("onSuperNext")(js.Any.fromFunction0(onSuperNext))
    if (onSuperPrev != null) __obj.updateDynamic("onSuperPrev")(js.Any.fromFunction0(onSuperPrev))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}


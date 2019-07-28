package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHTMLAttributes[T] extends HTMLAttributes[T] {
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
}

object TableHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    summary: String = null
  ): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
}


package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHTMLAttributes[T] extends HTMLAttributes[T] {
  var cellPadding: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cellSpacing: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
}

object TableHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    cellPadding: scala.Double | java.lang.String = null,
    cellSpacing: scala.Double | java.lang.String = null,
    summary: java.lang.String = null
  ): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
}


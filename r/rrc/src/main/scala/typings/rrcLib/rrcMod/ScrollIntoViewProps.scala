package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollIntoViewProps extends js.Object {
  var alignToTop: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
}

object ScrollIntoViewProps {
  @scala.inline
  def apply(id: java.lang.String, alignToTop: js.UndefOr[scala.Boolean] = js.undefined): ScrollIntoViewProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop)
    __obj.asInstanceOf[ScrollIntoViewProps]
  }
}


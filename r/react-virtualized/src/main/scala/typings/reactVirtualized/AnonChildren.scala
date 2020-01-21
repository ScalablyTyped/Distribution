package typings.reactVirtualized

import typings.react.mod.ReactNode
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esColumnSizerMod.SizedColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]]
  var columnCount: Validator[Double]
  var columnMaxWidth: Requireable[Double]
  var columnMinWidth: Requireable[Double]
  var width: Validator[Double]
}

object AnonChildren {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]],
    columnCount: Validator[Double],
    columnMaxWidth: Requireable[Double],
    columnMinWidth: Requireable[Double],
    width: Validator[Double]
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnMaxWidth = columnMaxWidth.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}


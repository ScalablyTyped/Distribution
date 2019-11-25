package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.react.reactMod.Requireable
import typings.react.reactMod.Validator
import typings.reactDashVirtualized.distEsColumnSizerMod.SizedColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]]
  var columnCount: Validator[Double]
  var columnMaxWidth: Requireable[Double]
  var columnMinWidth: Requireable[Double]
  var width: Validator[Double]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]],
    columnCount: Validator[Double],
    columnMaxWidth: Requireable[Double],
    columnMinWidth: Requireable[Double],
    width: Validator[Double]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnMaxWidth = columnMaxWidth.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}


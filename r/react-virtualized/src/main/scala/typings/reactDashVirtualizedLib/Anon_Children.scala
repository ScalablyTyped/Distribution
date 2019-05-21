package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: reactLib.reactMod.Validator[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsColumnSizerMod.SizedColumnProps, 
      reactLib.reactMod.ReactNode
    ]
  ]
  var columnCount: reactLib.reactMod.Validator[scala.Double]
  var columnMaxWidth: reactLib.reactMod.Requireable[scala.Double]
  var columnMinWidth: reactLib.reactMod.Requireable[scala.Double]
  var width: reactLib.reactMod.Validator[scala.Double]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Validator[
      js.Function1[
        /* props */ reactDashVirtualizedLib.distEsColumnSizerMod.SizedColumnProps, 
        reactLib.reactMod.ReactNode
      ]
    ],
    columnCount: reactLib.reactMod.Validator[scala.Double],
    columnMaxWidth: reactLib.reactMod.Requireable[scala.Double],
    columnMinWidth: reactLib.reactMod.Requireable[scala.Double],
    width: reactLib.reactMod.Validator[scala.Double]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, columnCount = columnCount, columnMaxWidth = columnMaxWidth, columnMinWidth = columnMinWidth, width = width)
  
    __obj.asInstanceOf[Anon_Children]
  }
}


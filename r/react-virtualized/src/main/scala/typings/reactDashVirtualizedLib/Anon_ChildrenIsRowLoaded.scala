package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenIsRowLoaded extends js.Object {
  var children: reactLib.reactMod.Validator[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsInfiniteLoaderMod.InfiniteLoaderChildProps, 
      reactLib.reactMod.ReactNode
    ]
  ]
  var isRowLoaded: reactLib.reactMod.Validator[
    js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Boolean]
  ]
  var loadMoreRows: reactLib.reactMod.Validator[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange, 
      js.Promise[_]
    ]
  ]
  var minimumBatchSize: reactLib.reactMod.Validator[scala.Double]
  var rowCount: reactLib.reactMod.Validator[scala.Double]
  var threshold: reactLib.reactMod.Validator[scala.Double]
}

object Anon_ChildrenIsRowLoaded {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Validator[
      js.Function1[
        /* props */ reactDashVirtualizedLib.distEsInfiniteLoaderMod.InfiniteLoaderChildProps, 
        reactLib.reactMod.ReactNode
      ]
    ],
    isRowLoaded: reactLib.reactMod.Validator[
      js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Boolean]
    ],
    loadMoreRows: reactLib.reactMod.Validator[
      js.Function1[
        /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange, 
        js.Promise[_]
      ]
    ],
    minimumBatchSize: reactLib.reactMod.Validator[scala.Double],
    rowCount: reactLib.reactMod.Validator[scala.Double],
    threshold: reactLib.reactMod.Validator[scala.Double]
  ): Anon_ChildrenIsRowLoaded = {
    val __obj = js.Dynamic.literal(children = children, isRowLoaded = isRowLoaded, loadMoreRows = loadMoreRows, minimumBatchSize = minimumBatchSize, rowCount = rowCount, threshold = threshold)
  
    __obj.asInstanceOf[Anon_ChildrenIsRowLoaded]
  }
}


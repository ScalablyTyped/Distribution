package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ChildrenPropsIsRowLoaded extends js.Object {
  var children: reactLib.reactMod.ReactNs.Validator[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsInfiniteLoaderMod.InfiniteLoaderChildProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ]
  var isRowLoaded: reactLib.reactMod.ReactNs.Validator[
    js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Boolean]
  ]
  var loadMoreRows: reactLib.reactMod.ReactNs.Validator[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange, 
      stdLib.Promise[_]
    ]
  ]
  var minimumBatchSize: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var rowCount: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var threshold: reactLib.reactMod.ReactNs.Validator[scala.Double]
}


package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsCollectionMod {
  type CollectionCellGroupRenderer = js.Function1[
    /* params */ CollectionCellGroupRendererParams, 
    js.Array[reactLib.reactMod.ReactNs.ReactNode]
  ]
  type CollectionCellRenderer = js.Function1[/* params */ CollectionCellRendererParams, reactLib.reactMod.ReactNs.ReactNode]
  type CollectionCellSizeAndPositionGetter = js.Function1[
    /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
    CollectionCellSizeAndPosition
  ]
}

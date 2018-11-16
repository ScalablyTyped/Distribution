package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariableSizeListProps extends ListProps {
  /**
       * Estimated size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
       *
       * This value is used to calculated the estimated total size of a list before its items have all been measured. The total size impacts user scrolling behavior.
       * It is updated whenever new items are measured.
       */
  var estimatedItemSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Returns the size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
       */
  def itemSize(index: scala.Double): scala.Double
}


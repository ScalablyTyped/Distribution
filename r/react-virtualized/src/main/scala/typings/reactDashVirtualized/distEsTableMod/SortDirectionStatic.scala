package typings.reactDashVirtualized.distEsTableMod

import typings.reactDashVirtualized.reactDashVirtualizedStrings.ASC
import typings.reactDashVirtualized.reactDashVirtualizedStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortDirectionStatic extends js.Object {
  /**
    * Sort items in ascending order.
    * This means arranging from the lowest value to the highest (e.g. a-z, 0-9).
    */
  var ASC: typings.reactDashVirtualized.reactDashVirtualizedStrings.ASC
  /**
    * Sort items in descending order.
    * This means arranging from the highest value to the lowest (e.g. z-a, 9-0).
    */
  var DESC: typings.reactDashVirtualized.reactDashVirtualizedStrings.DESC
}

object SortDirectionStatic {
  @scala.inline
  def apply(ASC: ASC, DESC: DESC): SortDirectionStatic = {
    val __obj = js.Dynamic.literal(ASC = ASC, DESC = DESC)
  
    __obj.asInstanceOf[SortDirectionStatic]
  }
}


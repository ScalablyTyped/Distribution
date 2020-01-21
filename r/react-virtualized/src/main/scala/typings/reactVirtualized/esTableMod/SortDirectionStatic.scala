package typings.reactVirtualized.esTableMod

import typings.reactVirtualized.reactVirtualizedStrings.ASC
import typings.reactVirtualized.reactVirtualizedStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortDirectionStatic extends js.Object {
  /**
    * Sort items in ascending order.
    * This means arranging from the lowest value to the highest (e.g. a-z, 0-9).
    */
  var ASC: typings.reactVirtualized.reactVirtualizedStrings.ASC
  /**
    * Sort items in descending order.
    * This means arranging from the highest value to the lowest (e.g. z-a, 9-0).
    */
  var DESC: typings.reactVirtualized.reactVirtualizedStrings.DESC
}

object SortDirectionStatic {
  @scala.inline
  def apply(ASC: ASC, DESC: DESC): SortDirectionStatic = {
    val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortDirectionStatic]
  }
}


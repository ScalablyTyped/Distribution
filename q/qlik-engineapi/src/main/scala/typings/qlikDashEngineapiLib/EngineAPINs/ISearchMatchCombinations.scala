package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchMatchCombinations...
  */
trait ISearchMatchCombinations extends js.Object {
  /**
    * Array of search combinations.
    */
  var qSearchMatchCombinations: js.Array[ISerachMatchCombination]
}

object ISearchMatchCombinations {
  @scala.inline
  def apply(qSearchMatchCombinations: js.Array[ISerachMatchCombination]): ISearchMatchCombinations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qSearchMatchCombinations")(qSearchMatchCombinations)
    __obj.asInstanceOf[ISearchMatchCombinations]
  }
}


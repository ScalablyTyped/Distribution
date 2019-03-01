package typings
package selectizeLib.SelectizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchResult extends js.Object {
  var id: java.lang.String
  var score: scala.Double
}

object ISearchResult {
  @scala.inline
  def apply(id: java.lang.String, score: scala.Double): ISearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[ISearchResult]
  }
}


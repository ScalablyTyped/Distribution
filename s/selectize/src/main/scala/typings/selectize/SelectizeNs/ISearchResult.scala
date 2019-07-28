package typings.selectize.SelectizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchResult extends js.Object {
  var id: String
  var score: Double
}

object ISearchResult {
  @scala.inline
  def apply(id: String, score: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(id = id, score = score)
  
    __obj.asInstanceOf[ISearchResult]
  }
}


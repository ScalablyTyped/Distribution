package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryState extends js.Object {
  var e: Double
  var k: String
  var r: js.Array[RefinementCategory]
}

object QueryState {
  @scala.inline
  def apply(e: Double, k: String, r: js.Array[RefinementCategory]): QueryState = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryState]
  }
}


package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinerStructure extends js.Object {
  /** Keyword */
  var k: String
  var l: Double
  var r: js.Array[RefinementCategory]
}

object RefinerStructure {
  @scala.inline
  def apply(k: String, l: Double, r: js.Array[RefinementCategory]): RefinerStructure = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RefinerStructure]
  }
}


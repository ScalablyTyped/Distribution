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
    val __obj = js.Dynamic.literal(k = k, l = l, r = r)
  
    __obj.asInstanceOf[RefinerStructure]
  }
}


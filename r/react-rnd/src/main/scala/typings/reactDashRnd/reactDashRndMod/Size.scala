package typings.reactDashRnd.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: String | Double
  var width: String | Double
}

object Size {
  @scala.inline
  def apply(height: String | Double, width: String | Double): Size = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Size]
  }
}


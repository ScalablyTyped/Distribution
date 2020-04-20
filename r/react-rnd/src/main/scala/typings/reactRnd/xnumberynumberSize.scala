package typings.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  x  :number,   y  :number} & react-rnd.react-rnd.Size */
trait xnumberynumberSize extends js.Object {
  var height: String | Double
  var width: String | Double
  var x: Double
  var y: Double
}

object xnumberynumberSize {
  @scala.inline
  def apply(height: String | Double, width: String | Double, x: Double, y: Double): xnumberynumberSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[xnumberynumberSize]
  }
}


package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Box {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Box = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Box]
  }
}


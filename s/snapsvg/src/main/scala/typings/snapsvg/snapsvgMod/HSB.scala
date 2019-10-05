package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSB extends js.Object {
  var b: Double
  var h: Double
  var s: Double
}

object HSB {
  @scala.inline
  def apply(b: Double, h: Double, s: Double): HSB = {
    val __obj = js.Dynamic.literal(b = b, h = h, s = s)
  
    __obj.asInstanceOf[HSB]
  }
}

@JSImport("snapsvg", "hsb")
@js.native
object hsb extends js.Object {
  def apply(h: Double, s: Double, b: Double): HSB = js.native
}


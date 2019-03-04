package typings
package reactDashAliceDashCarouselLib.reactDashAliceDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var item: scala.Double
  var slide: scala.Double
}

object EventObject {
  @scala.inline
  def apply(item: scala.Double, slide: scala.Double): EventObject = {
    val __obj = js.Dynamic.literal(item = item, slide = slide)
  
    __obj.asInstanceOf[EventObject]
  }
}


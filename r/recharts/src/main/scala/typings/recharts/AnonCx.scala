package typings.recharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCx extends js.Object {
  var cx: Double
  var cy: Double
}

object AnonCx {
  @scala.inline
  def apply(cx: Double, cy: Double): AnonCx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCx]
  }
}


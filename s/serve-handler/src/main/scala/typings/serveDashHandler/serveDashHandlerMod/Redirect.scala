package typings.serveDashHandler.serveDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends Rewrite {
  var `type`: Double
}

object Redirect {
  @scala.inline
  def apply(destination: String, source: String, `type`: Double): Redirect = {
    val __obj = js.Dynamic.literal(destination = destination, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Redirect]
  }
}


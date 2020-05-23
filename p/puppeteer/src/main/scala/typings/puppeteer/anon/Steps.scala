package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Steps extends js.Object {
  var steps: Double
}

object Steps {
  @scala.inline
  def apply(steps: Double): Steps = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps]
  }
}


package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stage extends js.Object {
  var stage: String
}

object Stage {
  @scala.inline
  def apply(stage: String): Stage = {
    val __obj = js.Dynamic.literal(stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
}


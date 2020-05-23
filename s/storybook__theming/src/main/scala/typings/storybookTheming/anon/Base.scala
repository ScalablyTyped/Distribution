package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: String
  var mono: String
}

object Base {
  @scala.inline
  def apply(base: String, mono: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], mono = mono.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}


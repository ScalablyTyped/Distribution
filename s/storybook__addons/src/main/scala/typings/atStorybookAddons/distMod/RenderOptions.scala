package typings.atStorybookAddons.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var active: Boolean
  var key: String
}

object RenderOptions {
  @scala.inline
  def apply(active: Boolean, key: String): RenderOptions = {
    val __obj = js.Dynamic.literal(active = active, key = key)
  
    __obj.asInstanceOf[RenderOptions]
  }
}


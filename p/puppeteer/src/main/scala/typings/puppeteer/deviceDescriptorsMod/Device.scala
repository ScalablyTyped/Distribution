package typings.puppeteer.deviceDescriptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var name: String
  var userAgent: String
  var viewport: Viewport
}

object Device {
  @scala.inline
  def apply(name: String, userAgent: String, viewport: Viewport): Device = {
    val __obj = js.Dynamic.literal(name = name, userAgent = userAgent, viewport = viewport)
  
    __obj.asInstanceOf[Device]
  }
}


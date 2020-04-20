package typings.storybookChannelPostmessage.mod

import typings.storybookChannelPostmessage.storybookChannelPostmessageStrings.manager
import typings.storybookChannelPostmessage.storybookChannelPostmessageStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var page: manager | preview
}

object Config {
  @scala.inline
  def apply(page: manager | preview): Config = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}


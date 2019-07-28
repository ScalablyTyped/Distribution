package typings.slackDashNode

import typings.slackDashNode.slackDashNodeStrings.icon_emoji
import typings.slackDashNode.slackDashNodeStrings.icon_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iconemoji extends js.Object {
  var key: icon_url | icon_emoji
  var `val`: String
}

object Anon_Iconemoji {
  @scala.inline
  def apply(key: icon_url | icon_emoji, `val`: String): Anon_Iconemoji = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_Iconemoji]
  }
}


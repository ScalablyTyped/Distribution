package typings
package slackDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iconemoji extends js.Object {
  var key: slackDashNodeLib.slackDashNodeLibStrings.icon_url | slackDashNodeLib.slackDashNodeLibStrings.icon_emoji
  var `val`: java.lang.String
}

object Anon_Iconemoji {
  @scala.inline
  def apply(
    key: slackDashNodeLib.slackDashNodeLibStrings.icon_url | slackDashNodeLib.slackDashNodeLibStrings.icon_emoji,
    `val`: java.lang.String
  ): Anon_Iconemoji = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_Iconemoji]
  }
}


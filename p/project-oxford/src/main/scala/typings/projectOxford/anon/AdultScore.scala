package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdultScore extends js.Object {
  var adultScore: Double
  var isAdultContent: Boolean
  var isRacyContent: Boolean
  var racyScore: Double
}

object AdultScore {
  @scala.inline
  def apply(adultScore: Double, isAdultContent: Boolean, isRacyContent: Boolean, racyScore: Double): AdultScore = {
    val __obj = js.Dynamic.literal(adultScore = adultScore.asInstanceOf[js.Any], isAdultContent = isAdultContent.asInstanceOf[js.Any], isRacyContent = isRacyContent.asInstanceOf[js.Any], racyScore = racyScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdultScore]
  }
}


package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdultScore extends js.Object {
  var adultScore: Double
  var isAdultContent: Boolean
  var isRacyContent: Boolean
  var racyScore: Double
}

object AnonAdultScore {
  @scala.inline
  def apply(adultScore: Double, isAdultContent: Boolean, isRacyContent: Boolean, racyScore: Double): AnonAdultScore = {
    val __obj = js.Dynamic.literal(adultScore = adultScore.asInstanceOf[js.Any], isAdultContent = isAdultContent.asInstanceOf[js.Any], isRacyContent = isRacyContent.asInstanceOf[js.Any], racyScore = racyScore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdultScore]
  }
}


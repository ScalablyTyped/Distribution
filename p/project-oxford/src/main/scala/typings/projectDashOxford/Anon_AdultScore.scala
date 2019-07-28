package typings.projectDashOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdultScore extends js.Object {
  var adultScore: Double
  var isAdultContent: Boolean
  var isRacyContent: Boolean
  var racyScore: Double
}

object Anon_AdultScore {
  @scala.inline
  def apply(adultScore: Double, isAdultContent: Boolean, isRacyContent: Boolean, racyScore: Double): Anon_AdultScore = {
    val __obj = js.Dynamic.literal(adultScore = adultScore, isAdultContent = isAdultContent, isRacyContent = isRacyContent, racyScore = racyScore)
  
    __obj.asInstanceOf[Anon_AdultScore]
  }
}


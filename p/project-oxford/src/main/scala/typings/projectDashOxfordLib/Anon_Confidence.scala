package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confidence extends js.Object {
  var confidence: scala.Double
  var personId: java.lang.String
}

object Anon_Confidence {
  @scala.inline
  def apply(confidence: scala.Double, personId: java.lang.String): Anon_Confidence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("confidence")(confidence)
    __obj.updateDynamic("personId")(personId)
    __obj.asInstanceOf[Anon_Confidence]
  }
}


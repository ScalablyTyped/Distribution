package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleMedia extends js.Object {
  val `type`: java.lang.String
  def matchMedium(mediaquery: java.lang.String): scala.Boolean
}

object StyleMedia {
  @scala.inline
  def apply(matchMedium: java.lang.String => scala.Boolean, `type`: java.lang.String): StyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleMedia]
  }
}


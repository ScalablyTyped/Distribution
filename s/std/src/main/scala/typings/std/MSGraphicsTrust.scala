package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The msGraphicsTrust() constructor returns an object that provides properties for info on protected video playback. */
trait MSGraphicsTrust extends js.Object {
  val constrictionActive: scala.Boolean
  val status: java.lang.String
}

object MSGraphicsTrust {
  @scala.inline
  def apply(constrictionActive: scala.Boolean, status: java.lang.String): MSGraphicsTrust = {
    val __obj = js.Dynamic.literal(constrictionActive = constrictionActive.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGraphicsTrust]
  }
}


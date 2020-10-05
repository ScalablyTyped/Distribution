package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The msGraphicsTrust() constructor returns an object that provides properties for info on protected video playback. */
@js.native
trait MSGraphicsTrust extends js.Object {
  val constrictionActive: scala.Boolean = js.native
  val status: java.lang.String = js.native
}

object MSGraphicsTrust {
  @scala.inline
  def apply(constrictionActive: scala.Boolean, status: java.lang.String): MSGraphicsTrust = {
    val __obj = js.Dynamic.literal(constrictionActive = constrictionActive.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGraphicsTrust]
  }
  @scala.inline
  implicit class MSGraphicsTrustOps[Self <: MSGraphicsTrust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConstrictionActive(value: scala.Boolean): Self = this.set("constrictionActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: java.lang.String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}


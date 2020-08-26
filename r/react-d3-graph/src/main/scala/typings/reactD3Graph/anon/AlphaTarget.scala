package typings.reactD3Graph.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlphaTarget extends js.Object {
  var alphaTarget: Double = js.native
  var disableLinkForce: Boolean = js.native
  var gravity: Double = js.native
  var linkLength: Double = js.native
  var linkStrength: Double = js.native
}

object AlphaTarget {
  @scala.inline
  def apply(
    alphaTarget: Double,
    disableLinkForce: Boolean,
    gravity: Double,
    linkLength: Double,
    linkStrength: Double
  ): AlphaTarget = {
    val __obj = js.Dynamic.literal(alphaTarget = alphaTarget.asInstanceOf[js.Any], disableLinkForce = disableLinkForce.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], linkLength = linkLength.asInstanceOf[js.Any], linkStrength = linkStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaTarget]
  }
  @scala.inline
  implicit class AlphaTargetOps[Self <: AlphaTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlphaTarget(value: Double): Self = this.set("alphaTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableLinkForce(value: Boolean): Self = this.set("disableLinkForce", value.asInstanceOf[js.Any])
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkLength(value: Double): Self = this.set("linkLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkStrength(value: Double): Self = this.set("linkStrength", value.asInstanceOf[js.Any])
  }
  
}


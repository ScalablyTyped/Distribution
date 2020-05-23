package typings.reactD3Graph.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaTarget extends js.Object {
  var alphaTarget: Double
  var disableLinkForce: Boolean
  var gravity: Double
  var linkLength: Double
  var linkStrength: Double
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
}


package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelPath extends RaphaelElement {
  def getPointAtLength(length: Double): AnonAlpha = js.native
  def getSubpath(from: Double, to: Double): String = js.native
  def getTotalLength(): Double = js.native
}


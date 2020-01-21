package typings.seen.mod

import typings.seen.AnonProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Camera")
@js.native
class Camera () extends Transformable {
  def this(transform: Matrix) = this()
  var defaults: AnonProjection = js.native
  var projection: Matrix = js.native
}


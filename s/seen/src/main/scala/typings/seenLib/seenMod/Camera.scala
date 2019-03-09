package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Camera")
@js.native
class Camera () extends Transformable {
  def this(transform: Matrix) = this()
  var defaults: seenLib.Anon_Projection = js.native
  var projection: Matrix = js.native
}


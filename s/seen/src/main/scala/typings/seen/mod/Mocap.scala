package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Mocap")
@js.native
class Mocap () extends js.Object {
  def this(bvh: js.Any) = this()
  var bvh: js.Any = js.native
  def createMocapModel(): MocapModel = js.native
  def createMocapModel(shapeFactory: js.Function0[Shape]): MocapModel = js.native
}

/* static members */
@JSImport("seen", "Mocap")
@js.native
object Mocap extends js.Object {
  def DEFAULT_SHAPE_FACTORY(): Shape = js.native
  def DEFAULT_SHAPE_FACTORY(joint: js.Any): Shape = js.native
  def DEFAULT_SHAPE_FACTORY(joint: js.Any, endpoint: Point): Shape = js.native
  def parse(source: String): Mocap = js.native
}


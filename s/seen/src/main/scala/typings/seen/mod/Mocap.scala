package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Mocap")
@js.native
class Mocap () extends StObject {
  def this(bvh: js.Any) = this()
  
  var bvh: js.Any = js.native
  
  def createMocapModel(): MocapModel = js.native
  def createMocapModel(shapeFactory: js.Function0[Shape]): MocapModel = js.native
}
/* static members */
object Mocap {
  
  @JSImport("seen", "Mocap.DEFAULT_SHAPE_FACTORY")
  @js.native
  def DEFAULT_SHAPE_FACTORY(): Shape = js.native
  @JSImport("seen", "Mocap.DEFAULT_SHAPE_FACTORY")
  @js.native
  def DEFAULT_SHAPE_FACTORY(joint: js.UndefOr[scala.Nothing], endpoint: Point): Shape = js.native
  @JSImport("seen", "Mocap.DEFAULT_SHAPE_FACTORY")
  @js.native
  def DEFAULT_SHAPE_FACTORY(joint: js.Any): Shape = js.native
  @JSImport("seen", "Mocap.DEFAULT_SHAPE_FACTORY")
  @js.native
  def DEFAULT_SHAPE_FACTORY(joint: js.Any, endpoint: Point): Shape = js.native
  
  @JSImport("seen", "Mocap.parse")
  @js.native
  def parse(source: String): Mocap = js.native
}

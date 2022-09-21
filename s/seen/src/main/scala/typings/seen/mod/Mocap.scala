package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Mocap")
@js.native
open class Mocap () extends StObject {
  def this(bvh: Any) = this()
  
  var bvh: Any = js.native
  
  def createMocapModel(): MocapModel = js.native
  def createMocapModel(shapeFactory: js.Function0[Shape]): MocapModel = js.native
}
/* static members */
object Mocap {
  
  @JSImport("seen", "Mocap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEFAULT_SHAPE_FACTORY(): Shape = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_SHAPE_FACTORY")().asInstanceOf[Shape]
  inline def DEFAULT_SHAPE_FACTORY(joint: Any): Shape = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_SHAPE_FACTORY")(joint.asInstanceOf[js.Any]).asInstanceOf[Shape]
  inline def DEFAULT_SHAPE_FACTORY(joint: Any, endpoint: Point): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_SHAPE_FACTORY")(joint.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[Shape]
  inline def DEFAULT_SHAPE_FACTORY(joint: Unit, endpoint: Point): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_SHAPE_FACTORY")(joint.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[Shape]
  
  inline def parse(source: String): Mocap = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[Mocap]
}

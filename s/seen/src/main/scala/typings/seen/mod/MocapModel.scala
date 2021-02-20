package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "MocapModel")
@js.native
class MocapModel protected () extends StObject {
  def this(model: Model, frames: js.Array[_]) = this()
  def this(model: Model, frames: js.Array[_], frameDelay: Double) = this()
  
  def applyFrameTransforms(frameIndex: Double): Double = js.native
}

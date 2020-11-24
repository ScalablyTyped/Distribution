package typings.rotJs.fovFovMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FOV extends js.Object {
  
  /**
    * Return all neighbors in a concentric ring
    * @param {int} cx center-x
    * @param {int} cy center-y
    * @param {int} r range
    */
  def _getCircle(cx: Double, cy: Double, r: Double): js.Array[js.Array[Double]] = js.native
  
  def _lightPasses(x: Double, y: Double): Boolean = js.native
  @JSName("_lightPasses")
  var _lightPasses_Original: LightPassesCallback = js.native
  
  var _options: Options = js.native
  
  /**
    * Compute visibility for a 360-degree circle
    * @param {int} x
    * @param {int} y
    * @param {int} R Maximum visibility radius
    * @param {function} callback
    */
  def compute(x: Double, y: Double, R: Double, callback: VisibilityCallback): Unit = js.native
}

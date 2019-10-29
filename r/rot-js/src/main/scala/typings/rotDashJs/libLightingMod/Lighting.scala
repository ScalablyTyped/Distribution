package typings.rotDashJs.libLightingMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lighting extends js.Object {
  /**
    * Prepare a list of emitters for next pass
    */
  var _computeEmitters: js.Any = js.native
  /**
    * Compute one iteration from all emitting cells
    * @param emittingCells These emit light
    * @param litCells Add projected light to these
    * @param doneCells These already emitted, forbid them from further calculations
    */
  var _emitLight: js.Any = js.native
  /**
    * Compute one iteration from one cell
    */
  var _emitLightFromCell: js.Any = js.native
  var _fov: js.Any = js.native
  var _fovCache: js.Any = js.native
  var _lights: js.Any = js.native
  var _options: js.Any = js.native
  var _reflectivityCache: js.Any = js.native
  var _reflectivityCallback: js.Any = js.native
  /**
    * Compute FOV ("form factor") for a potential light source at [x,y]
    */
  var _updateFOV: js.Any = js.native
  /**
    * Remove all light sources
    */
  def clearLights(): Unit = js.native
  /**
    * Compute the lighting
    */
  def compute(lightingCallback: LightingCallback): this.type = js.native
  /**
    * Reset the pre-computed topology values. Call whenever the underlying map changes its light-passability.
    */
  def reset(): this.type = js.native
  /**
    * Set the used Field-Of-View algo
    */
  def setFOV(fov: typings.rotDashJs.libFovFovMod.default): this.type = js.native
  /**
    * Set (or remove) a light source
    */
  def setLight(x: Double, y: Double): this.type = js.native
  def setLight(x: Double, y: Double, color: String): this.type = js.native
  def setLight(x: Double, y: Double, color: LightColor): this.type = js.native
  /**
    * Adjust options at runtime
    */
  def setOptions(options: Partial[Options]): this.type = js.native
}


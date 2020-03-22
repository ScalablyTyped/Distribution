package typings.rotJs.fovFovMod

import typings.rotJs.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/fov/fov", JSImport.Default)
@js.native
abstract class default protected () extends FOV {
  /**
    * @class Abstract FOV algorithm
    * @param {function} lightPassesCallback Does the light pass through x,y?
    * @param {object} [options]
    * @param {int} [options.topology=8] 4/6/8
    */
  def this(lightPassesCallback: LightPassesCallback) = this()
  def this(lightPassesCallback: LightPassesCallback, options: PartialOptions) = this()
}


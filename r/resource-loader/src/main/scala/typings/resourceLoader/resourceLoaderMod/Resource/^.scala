package typings.resourceLoader.resourceLoaderMod.Resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resource-loader", "Resource")
@js.native
object ^ extends js.Object {
  /**
    * Sets the load type to be used for a specific extension.
    *
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {Resource.LOAD_TYPE} loadType - The load type to set it to.
    */
  def setExtensionLoadType(extname: String, loadType: LOAD_TYPE): Unit = js.native
  /**
    * Sets the load type to be used for a specific extension.
    *
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {Resource.XHR_RESPONSE_TYPE} xhrType - The xhr type to set it to.
    */
  def setExtensionXhrType(extname: String, xhrType: XHR_RESPONSE_TYPE): Unit = js.native
}


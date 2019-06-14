package typings
package reactDashNativeDashSignatureDashCaptureLib.reactDashNativeDashSignatureDashCaptureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveEventParams extends js.Object {
  /**
    * The base64 encoded png
    */
  var encoded: java.lang.String
  /**
    * The file path name
    */
  var pathName: java.lang.String
}

object SaveEventParams {
  @scala.inline
  def apply(encoded: java.lang.String, pathName: java.lang.String): SaveEventParams = {
    val __obj = js.Dynamic.literal(encoded = encoded, pathName = pathName)
  
    __obj.asInstanceOf[SaveEventParams]
  }
}


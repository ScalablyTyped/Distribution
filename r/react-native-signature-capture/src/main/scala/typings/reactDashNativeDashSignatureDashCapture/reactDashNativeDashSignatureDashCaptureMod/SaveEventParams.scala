package typings.reactDashNativeDashSignatureDashCapture.reactDashNativeDashSignatureDashCaptureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveEventParams extends js.Object {
  /**
    * The base64 encoded png
    */
  var encoded: String
  /**
    * The file path name
    */
  var pathName: String
}

object SaveEventParams {
  @scala.inline
  def apply(encoded: String, pathName: String): SaveEventParams = {
    val __obj = js.Dynamic.literal(encoded = encoded, pathName = pathName)
  
    __obj.asInstanceOf[SaveEventParams]
  }
}


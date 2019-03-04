package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRemoteResourceOptions extends js.Object {
  var contentType: java.lang.String
  var format: java.lang.String
  var parameters: js.Object
  var path: java.lang.String
}

object AddRemoteResourceOptions {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    format: java.lang.String,
    parameters: js.Object,
    path: java.lang.String
  ): AddRemoteResourceOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType, format = format, parameters = parameters, path = path)
  
    __obj.asInstanceOf[AddRemoteResourceOptions]
  }
}


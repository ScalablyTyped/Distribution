package typings.solrDashClient.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRemoteResourceOptions extends js.Object {
  var contentType: String
  var format: String
  var parameters: js.Object
  var path: String
}

object AddRemoteResourceOptions {
  @scala.inline
  def apply(contentType: String, format: String, parameters: js.Object, path: String): AddRemoteResourceOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType, format = format, parameters = parameters, path = path)
  
    __obj.asInstanceOf[AddRemoteResourceOptions]
  }
}


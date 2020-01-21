package typings.solrClient.mod

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
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddRemoteResourceOptions]
  }
}


package typings.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionRedirect extends js.Object {
  var host: String = js.native
  var path: String = js.native
  /**
    * The port of the listener. Required if `arn` is not set.
    */
  var port: String = js.native
  var protocol: String = js.native
  var query: String = js.native
  var statusCode: String = js.native
}

object GetListenerDefaultActionRedirect {
  @scala.inline
  def apply(host: String, path: String, port: String, protocol: String, query: String, statusCode: String): GetListenerDefaultActionRedirect = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetListenerDefaultActionRedirect]
  }
}


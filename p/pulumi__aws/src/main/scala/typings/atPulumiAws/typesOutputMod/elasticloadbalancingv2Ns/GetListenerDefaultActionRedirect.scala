package typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerDefaultActionRedirect extends js.Object {
  var host: String
  var path: String
  /**
    * The port of the listener. Required if `arn` is not set.
    */
  var port: String
  var protocol: String
  var query: String
  var statusCode: String
}

object GetListenerDefaultActionRedirect {
  @scala.inline
  def apply(host: String, path: String, port: String, protocol: String, query: String, statusCode: String): GetListenerDefaultActionRedirect = {
    val __obj = js.Dynamic.literal(host = host, path = path, port = port, protocol = protocol, query = query, statusCode = statusCode)
  
    __obj.asInstanceOf[GetListenerDefaultActionRedirect]
  }
}


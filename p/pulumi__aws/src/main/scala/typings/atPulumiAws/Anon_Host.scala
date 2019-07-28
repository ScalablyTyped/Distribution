package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var path: String
  var port: String
  var protocol: String
  var query: String
  var statusCode: String
}

object Anon_Host {
  @scala.inline
  def apply(host: String, path: String, port: String, protocol: String, query: String, statusCode: String): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, path = path, port = port, protocol = protocol, query = query, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_Host]
  }
}


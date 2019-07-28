package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleUrl extends js.Object {
  var consoleUrl: String
  var endpoints: js.Array[String]
  var ipAddress: String
}

object Anon_ConsoleUrl {
  @scala.inline
  def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): Anon_ConsoleUrl = {
    val __obj = js.Dynamic.literal(consoleUrl = consoleUrl, endpoints = endpoints, ipAddress = ipAddress)
  
    __obj.asInstanceOf[Anon_ConsoleUrl]
  }
}


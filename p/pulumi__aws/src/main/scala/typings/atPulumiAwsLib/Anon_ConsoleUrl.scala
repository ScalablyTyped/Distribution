package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleUrl extends js.Object {
  var consoleUrl: java.lang.String
  var endpoints: js.Array[java.lang.String]
  var ipAddress: java.lang.String
}

object Anon_ConsoleUrl {
  @scala.inline
  def apply(consoleUrl: java.lang.String, endpoints: js.Array[java.lang.String], ipAddress: java.lang.String): Anon_ConsoleUrl = {
    val __obj = js.Dynamic.literal(consoleUrl = consoleUrl, endpoints = endpoints, ipAddress = ipAddress)
  
    __obj.asInstanceOf[Anon_ConsoleUrl]
  }
}


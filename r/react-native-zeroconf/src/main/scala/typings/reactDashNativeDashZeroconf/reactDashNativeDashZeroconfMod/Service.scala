package typings.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var addresses: js.Array[String]
  var fullName: String
  var host: String
  var name: String
  var port: Double
  var txt: StringDictionary[js.Any]
}

object Service {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    fullName: String,
    host: String,
    name: String,
    port: Double,
    txt: StringDictionary[js.Any]
  ): Service = {
    val __obj = js.Dynamic.literal(addresses = addresses, fullName = fullName, host = host, name = name, port = port, txt = txt)
  
    __obj.asInstanceOf[Service]
  }
}


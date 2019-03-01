package typings
package reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var addresses: js.Array[java.lang.String]
  var fullName: java.lang.String
  var host: java.lang.String
  var name: java.lang.String
  var port: scala.Double
  var txt: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object Service {
  @scala.inline
  def apply(
    addresses: js.Array[java.lang.String],
    fullName: java.lang.String,
    host: java.lang.String,
    name: java.lang.String,
    port: scala.Double,
    txt: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Service = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addresses")(addresses)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("txt")(txt)
    __obj.asInstanceOf[Service]
  }
}


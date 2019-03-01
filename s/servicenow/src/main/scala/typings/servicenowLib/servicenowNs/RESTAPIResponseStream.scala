package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIResponseStream extends js.Object {
  def writeStream(stream: js.Object): scala.Unit
  def writeString(data: java.lang.String): scala.Unit
}

object RESTAPIResponseStream {
  @scala.inline
  def apply(
    writeStream: js.Function1[js.Object, scala.Unit],
    writeString: js.Function1[java.lang.String, scala.Unit]
  ): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("writeStream")(writeStream)
    __obj.updateDynamic("writeString")(writeString)
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
}


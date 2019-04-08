package typings
package servicenowDashLondonLib.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIResponseStream extends js.Object {
  def writeStream(stream: js.Object): scala.Unit
  def writeString(data: java.lang.String): scala.Unit
}

object RESTAPIResponseStream {
  @scala.inline
  def apply(writeStream: js.Object => scala.Unit, writeString: java.lang.String => scala.Unit): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1(writeStream), writeString = js.Any.fromFunction1(writeString))
  
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
}


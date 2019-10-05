package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIResponseStream extends js.Object {
  def writeStream(stream: js.Object): Unit
  def writeString(data: String): Unit
}

object RESTAPIResponseStream {
  @scala.inline
  def apply(writeStream: js.Object => Unit, writeString: String => Unit): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1(writeStream), writeString = js.Any.fromFunction1(writeString))
  
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
}


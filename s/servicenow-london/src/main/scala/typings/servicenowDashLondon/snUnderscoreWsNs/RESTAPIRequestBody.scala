package typings.servicenowDashLondon.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequestBody extends js.Object {
  val data: js.Any
  val dataStream: js.Object
  val dataString: String
  def hasNext(): Boolean
  def nextEntry(): js.Any
}

object RESTAPIRequestBody {
  @scala.inline
  def apply(
    data: js.Any,
    dataStream: js.Object,
    dataString: String,
    hasNext: () => Boolean,
    nextEntry: () => js.Any
  ): RESTAPIRequestBody = {
    val __obj = js.Dynamic.literal(data = data, dataStream = dataStream, dataString = dataString, hasNext = js.Any.fromFunction0(hasNext), nextEntry = js.Any.fromFunction0(nextEntry))
  
    __obj.asInstanceOf[RESTAPIRequestBody]
  }
}


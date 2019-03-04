package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequestBody[T] extends js.Object {
  val data: T
  val dataStream: js.Object
  val dataString: java.lang.String
  def hasNext(): scala.Boolean
  def nextEntry(): js.Any
}

object RESTAPIRequestBody {
  @scala.inline
  def apply[T](
    data: T,
    dataStream: js.Object,
    dataString: java.lang.String,
    hasNext: js.Function0[scala.Boolean],
    nextEntry: js.Function0[js.Any]
  ): RESTAPIRequestBody[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream, dataString = dataString, hasNext = hasNext, nextEntry = nextEntry)
  
    __obj.asInstanceOf[RESTAPIRequestBody[T]]
  }
}


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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("dataStream")(dataStream)
    __obj.updateDynamic("dataString")(dataString)
    __obj.updateDynamic("hasNext")(hasNext)
    __obj.updateDynamic("nextEntry")(nextEntry)
    __obj.asInstanceOf[RESTAPIRequestBody[T]]
  }
}


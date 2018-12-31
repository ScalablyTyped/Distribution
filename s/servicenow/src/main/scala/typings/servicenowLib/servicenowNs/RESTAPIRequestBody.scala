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


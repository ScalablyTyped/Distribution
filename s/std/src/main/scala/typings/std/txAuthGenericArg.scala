package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait txAuthGenericArg extends js.Object {
  var content: ArrayBuffer
  var contentType: java.lang.String
}

object txAuthGenericArg {
  @scala.inline
  def apply(content: ArrayBuffer, contentType: java.lang.String): txAuthGenericArg = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType)
  
    __obj.asInstanceOf[txAuthGenericArg]
  }
}


package typings.stacktraceDashJs.StackTrace

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: StringDictionary[String]
}

object RequestOptions {
  @scala.inline
  def apply(headers: StringDictionary[String]): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[RequestOptions]
  }
}


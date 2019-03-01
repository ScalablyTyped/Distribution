package typings
package stacktraceDashJsLib.StackTraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object RequestOptions {
  @scala.inline
  def apply(headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RequestOptions]
  }
}


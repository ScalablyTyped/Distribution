package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOneOf extends js.Object {
  /** Oneof field names */
  var oneof: js.Array[java.lang.String]
  /** Oneof options */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object IOneOf {
  @scala.inline
  def apply(
    oneof: js.Array[java.lang.String],
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IOneOf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oneof")(oneof)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[IOneOf]
  }
}


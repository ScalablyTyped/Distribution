package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnum extends js.Object {
  /** Enum options */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** Enum values */
  var values: org.scalablytyped.runtime.StringDictionary[scala.Double]
}

object IEnum {
  @scala.inline
  def apply(
    values: org.scalablytyped.runtime.StringDictionary[scala.Double],
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IEnum = {
    val __obj = js.Dynamic.literal(values = values)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[IEnum]
  }
}


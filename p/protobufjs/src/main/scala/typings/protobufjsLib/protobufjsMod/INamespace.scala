package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamespace extends js.Object {
  /** Nested object descriptors */
  var nested: js.UndefOr[org.scalablytyped.runtime.StringDictionary[protobufjsLib.AnyNestedObject]] = js.undefined
  /** Namespace options */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object INamespace {
  @scala.inline
  def apply(
    nested: org.scalablytyped.runtime.StringDictionary[protobufjsLib.AnyNestedObject] = null,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): INamespace = {
    val __obj = js.Dynamic.literal()
    if (nested != null) __obj.updateDynamic("nested")(nested)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[INamespace]
  }
}


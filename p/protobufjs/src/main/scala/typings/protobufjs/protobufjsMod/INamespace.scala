package typings.protobufjs.protobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamespace extends AnyNestedObject {
  /** Nested object descriptors */
  var nested: js.UndefOr[StringDictionary[AnyNestedObject]] = js.undefined
  /** Namespace options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object INamespace {
  @scala.inline
  def apply(nested: StringDictionary[AnyNestedObject] = null, options: StringDictionary[js.Any] = null): INamespace = {
    val __obj = js.Dynamic.literal()
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamespace]
  }
}


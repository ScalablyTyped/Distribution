package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropOptions[T] extends js.Object {
  var attribute: js.UndefOr[PropOptionsAttribute] = js.undefined
  var coerce: js.UndefOr[js.Function1[/* value */ js.Any, Maybe[T]]] = js.undefined
  var default: js.UndefOr[T] = js.undefined
  var deserialize: js.UndefOr[js.Function1[/* value */ java.lang.String | scala.Null, Maybe[T]]] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* value */ Maybe[T], java.lang.String | scala.Null]] = js.undefined
}

object PropOptions {
  @scala.inline
  def apply[T](
    attribute: PropOptionsAttribute = null,
    coerce: js.Function1[/* value */ js.Any, Maybe[T]] = null,
    default: T = null,
    deserialize: js.Function1[/* value */ java.lang.String | scala.Null, Maybe[T]] = null,
    serialize: js.Function1[/* value */ Maybe[T], java.lang.String | scala.Null] = null
  ): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (coerce != null) __obj.updateDynamic("coerce")(coerce)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(deserialize)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    __obj.asInstanceOf[PropOptions[T]]
  }
}


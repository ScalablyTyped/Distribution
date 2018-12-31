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


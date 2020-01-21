package typings.rdfjsSerializerJsonld.mod

import typings.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.`object`
import typings.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerOptions extends js.Object {
  var encoding: js.UndefOr[string | `object`] = js.undefined
}

object SerializerOptions {
  @scala.inline
  def apply(encoding: string | `object` = null): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializerOptions]
  }
}


package typings
package serializeDashJavascriptLib.serializeDashJavascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeJSOptions extends js.Object {
  /**
    * This option is a signal to serialize() that the object being serialized does not contain any function or regexps values.
    * This enables a hot-path that allows serialization to be over 3x faster.
    * If you're serializing a lot of data, and know its pure JSON, then you can enable this option for a speed-up.
    */
  var isJSON: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This option is the same as the space argument that can be passed to JSON.stringify.
    * It can be used to add whitespace and indentation to the serialized output to make it more readable.
    */
  var space: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * This option is to signal serialize() that we want to do a straight conversion, without the XSS protection.
    * This options needs to be explicitly set to true. HTML characters and JavaScript line terminators will not be escaped.
    * You will have to roll your own.
    */
  var unsafe: js.UndefOr[scala.Boolean] = js.undefined
}

object SerializeJSOptions {
  @scala.inline
  def apply(
    isJSON: js.UndefOr[scala.Boolean] = js.undefined,
    space: java.lang.String | scala.Double = null,
    unsafe: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializeJSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isJSON)) __obj.updateDynamic("isJSON")(isJSON)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe)
    __obj.asInstanceOf[SerializeJSOptions]
  }
}


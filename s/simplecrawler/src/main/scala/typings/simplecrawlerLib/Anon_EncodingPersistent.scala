package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingPersistent extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EncodingPersistent {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EncodingPersistent = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[Anon_EncodingPersistent]
  }
}


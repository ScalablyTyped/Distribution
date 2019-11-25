package typings.sha1.sha1Mod

import typings.sha1.sha1Numbers.`false`
import typings.sha1.sha1Numbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha1AsBytesOptions extends Sha1Options {
  var asBytes: `true`
  var asString: js.UndefOr[`false`] = js.undefined
}

object Sha1AsBytesOptions {
  @scala.inline
  def apply(asBytes: `true`, asString: `false` = null): Sha1AsBytesOptions = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    if (asString != null) __obj.updateDynamic("asString")(asString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1AsBytesOptions]
  }
}


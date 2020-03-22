package typings.sindresorhusFnv1a.mod

import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`1024`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`128`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`256`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`32`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`512`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The bit size of the hash.
  		@default 32
  		*/
  var size: js.UndefOr[`32` | `64` | `128` | `256` | `512` | `1024`] = js.undefined
}

object Options {
  @scala.inline
  def apply(size: `32` | `64` | `128` | `256` | `512` | `1024` = null): Options = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


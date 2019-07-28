package typings.sha.shaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaOptions extends js.Object {
  /** defaults to `sha1` and can be any of the algorithms supported by `crypto.createHash` */
  var algorithm: js.UndefOr[String] = js.undefined
}

object ShaOptions {
  @scala.inline
  def apply(algorithm: String = null): ShaOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    __obj.asInstanceOf[ShaOptions]
  }
}


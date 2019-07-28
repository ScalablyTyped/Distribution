package typings.speakeasy.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestOptions extends SharedOptions {
  var counter: Double
  /**
    * @deprecated use secret
    */
  var key: js.UndefOr[String] = js.undefined
  var secret: String
}

object DigestOptions {
  @scala.inline
  def apply(
    counter: Double,
    secret: String,
    algorithm: Algorithm = null,
    encoding: Encoding = null,
    key: String = null
  ): DigestOptions = {
    val __obj = js.Dynamic.literal(counter = counter, secret = secret)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[DigestOptions]
  }
}


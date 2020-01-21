package typings.speakeasy.mod

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
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestOptions]
  }
}


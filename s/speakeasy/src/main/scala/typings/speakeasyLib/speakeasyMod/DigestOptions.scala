package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestOptions extends SharedOptions {
  var counter: scala.Double
  /**
    * @deprecated use secret
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  var secret: java.lang.String
}

object DigestOptions {
  @scala.inline
  def apply(
    counter: scala.Double,
    secret: java.lang.String,
    algorithm: Algorithm = null,
    encoding: Encoding = null,
    key: java.lang.String = null
  ): DigestOptions = {
    val __obj = js.Dynamic.literal(counter = counter, secret = secret)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[DigestOptions]
  }
}


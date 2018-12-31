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


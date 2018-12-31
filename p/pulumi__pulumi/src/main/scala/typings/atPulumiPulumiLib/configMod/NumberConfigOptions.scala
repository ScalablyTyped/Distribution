package typings
package atPulumiPulumiLib.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NumberConfigOptions may be used to constrain the set of legal values a number config value may contain.
  */
trait NumberConfigOptions extends js.Object {
  /**
    * The maximum number value, inclusive. If the number is greater than this, a ConfigRangeError is thrown.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number value, inclusive. If the number is less than this, a ConfigRangeError is thrown.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
}


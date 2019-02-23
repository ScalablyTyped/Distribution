package typings
package atPulumiAwsLib.wafGeoMatchSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMatchSetState extends js.Object {
  /**
    * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
    */
  val geoMatchConstraints: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeValueInputString]]
    ]
  ] = js.undefined
  /**
    * The name or description of the GeoMatchSet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}


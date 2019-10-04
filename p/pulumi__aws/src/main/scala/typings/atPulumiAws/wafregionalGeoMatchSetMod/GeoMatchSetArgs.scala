package typings.atPulumiAws.wafregionalGeoMatchSetMod

import typings.atPulumiAws.typesInputMod.wafregionalNs.GeoMatchSetGeoMatchConstraint
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMatchSetArgs extends js.Object {
  /**
    * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
    */
  val geoMatchConstraints: js.UndefOr[Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]]] = js.undefined
  /**
    * The name or description of the Geo Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object GeoMatchSetArgs {
  @scala.inline
  def apply(
    geoMatchConstraints: Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]] = null,
    name: Input[String] = null
  ): GeoMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    if (geoMatchConstraints != null) __obj.updateDynamic("geoMatchConstraints")(geoMatchConstraints.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetArgs]
  }
}


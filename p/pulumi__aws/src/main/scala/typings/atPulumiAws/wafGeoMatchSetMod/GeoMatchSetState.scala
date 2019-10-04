package typings.atPulumiAws.wafGeoMatchSetMod

import typings.atPulumiAws.typesInputMod.wafNs.GeoMatchSetGeoMatchConstraint
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMatchSetState extends js.Object {
  /**
    * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
    */
  val geoMatchConstraints: js.UndefOr[Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]]] = js.undefined
  /**
    * The name or description of the GeoMatchSet.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object GeoMatchSetState {
  @scala.inline
  def apply(
    geoMatchConstraints: Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]] = null,
    name: Input[String] = null
  ): GeoMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (geoMatchConstraints != null) __obj.updateDynamic("geoMatchConstraints")(geoMatchConstraints.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetState]
  }
}


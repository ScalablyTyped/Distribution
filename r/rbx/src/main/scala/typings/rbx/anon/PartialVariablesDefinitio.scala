package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rbx.rbx/base/helpers/variables.VariablesDefinitions> */
trait PartialVariablesDefinitio extends js.Object {
  var badgeSizes: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var breakpoints: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var breakpointsLimited: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var colors: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var displays: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var floatPulledAlignments: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var shades: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var textAlignments: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var textSizes: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var textTransforms: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var textWeights: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
  var tooltipPositions: js.UndefOr[ReadonlyArraystringnumber] = js.undefined
}

object PartialVariablesDefinitio {
  @scala.inline
  def apply(
    badgeSizes: ReadonlyArraystringnumber = null,
    breakpoints: ReadonlyArraystringnumber = null,
    breakpointsLimited: ReadonlyArraystringnumber = null,
    colors: ReadonlyArraystringnumber = null,
    displays: ReadonlyArraystringnumber = null,
    floatPulledAlignments: ReadonlyArraystringnumber = null,
    shades: ReadonlyArraystringnumber = null,
    textAlignments: ReadonlyArraystringnumber = null,
    textSizes: ReadonlyArraystringnumber = null,
    textTransforms: ReadonlyArraystringnumber = null,
    textWeights: ReadonlyArraystringnumber = null,
    tooltipPositions: ReadonlyArraystringnumber = null
  ): PartialVariablesDefinitio = {
    val __obj = js.Dynamic.literal()
    if (badgeSizes != null) __obj.updateDynamic("badgeSizes")(badgeSizes.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (breakpointsLimited != null) __obj.updateDynamic("breakpointsLimited")(breakpointsLimited.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (displays != null) __obj.updateDynamic("displays")(displays.asInstanceOf[js.Any])
    if (floatPulledAlignments != null) __obj.updateDynamic("floatPulledAlignments")(floatPulledAlignments.asInstanceOf[js.Any])
    if (shades != null) __obj.updateDynamic("shades")(shades.asInstanceOf[js.Any])
    if (textAlignments != null) __obj.updateDynamic("textAlignments")(textAlignments.asInstanceOf[js.Any])
    if (textSizes != null) __obj.updateDynamic("textSizes")(textSizes.asInstanceOf[js.Any])
    if (textTransforms != null) __obj.updateDynamic("textTransforms")(textTransforms.asInstanceOf[js.Any])
    if (textWeights != null) __obj.updateDynamic("textWeights")(textWeights.asInstanceOf[js.Any])
    if (tooltipPositions != null) __obj.updateDynamic("tooltipPositions")(tooltipPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialVariablesDefinitio]
  }
}


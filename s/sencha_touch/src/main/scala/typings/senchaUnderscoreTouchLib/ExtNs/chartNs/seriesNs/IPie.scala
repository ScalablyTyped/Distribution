package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPie extends IPolar {
  /** [Config Option] (Number) */
  var Allows: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of donut
  		* @returns Boolean/Number
  		*/
  var getDonut: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the pie slice for a given angle
  		* @param angle Number The angle to search for the slice
  		* @returns Object An object containing the reocord, sprite, scope etc.
  		*/
  var getItemForAngle: js.UndefOr[js.Function1[/* angle */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Object
  		* @param y Object
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  @JSName("getItemForPoint")
  var getItemForPoint_IPie: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of labelField
  		* @returns String
  		*/
  @JSName("getLabelField")
  var getLabelField_IPie: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of totalAngle
  		* @returns Number
  		*/
  var getTotalAngle: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IPie: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  @JSName("labelField")
  var labelField_IPie: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Provide legend information to target array
  		* @param target Object
  		*/
  @JSName("provideLegendInfo")
  var provideLegendInfo_IPie: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of donut
  		* @param donut Boolean/Number The new value.
  		*/
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Array The new value.
  		*/
  @JSName("setHidden")
  var setHidden_IPie: js.UndefOr[
    js.Function1[/* hidden */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of labelField
  		* @param labelField String The new value.
  		*/
  @JSName("setLabelField")
  var setLabelField_IPie: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of totalAngle
  		* @param totalAngle Number The new value.
  		*/
  var setTotalAngle: js.UndefOr[js.Function1[/* totalAngle */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var totalAngle: js.UndefOr[scala.Double] = js.undefined
}

object IPie {
  @scala.inline
  def apply(
    Allows: scala.Int | scala.Double = null,
    IPolar: IPolar = null,
    donut: js.Any = null,
    field: java.lang.String = null,
    getDonut: js.Function0[_] = null,
    getItemForAngle: js.Function1[/* angle */ js.UndefOr[scala.Double], _] = null,
    getItemForPoint: js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _] = null,
    getLabelField: js.Function0[java.lang.String] = null,
    getRotation: js.Function0[scala.Double] = null,
    getSprites: js.Function0[scala.Unit] = null,
    getStyle: js.Function0[_] = null,
    getTotalAngle: js.Function0[scala.Double] = null,
    hidden: senchaUnderscoreTouchLib.ExtNs.Array = null,
    labelField: java.lang.String = null,
    provideLegendInfo: js.Function1[/* target */ js.UndefOr[js.Any], scala.Unit] = null,
    rotation: scala.Int | scala.Double = null,
    seriesType: java.lang.String = null,
    setDonut: js.Function1[/* donut */ js.UndefOr[js.Any], scala.Unit] = null,
    setHidden: js.Function1[/* hidden */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setLabelField: js.Function1[/* labelField */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRotation: js.Function1[/* rotation */ js.UndefOr[scala.Double], scala.Unit] = null,
    setStyle: js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit] = null,
    setTotalAngle: js.Function1[/* totalAngle */ js.UndefOr[scala.Double], scala.Unit] = null,
    style: js.Any = null,
    totalAngle: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): IPie = {
    val __obj = js.Dynamic.literal()
    if (Allows != null) __obj.updateDynamic("Allows")(Allows.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, IPolar)
    if (donut != null) __obj.updateDynamic("donut")(donut)
    if (field != null) __obj.updateDynamic("field")(field)
    if (getDonut != null) __obj.updateDynamic("getDonut")(getDonut)
    if (getItemForAngle != null) __obj.updateDynamic("getItemForAngle")(getItemForAngle)
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(getItemForPoint)
    if (getLabelField != null) __obj.updateDynamic("getLabelField")(getLabelField)
    if (getRotation != null) __obj.updateDynamic("getRotation")(getRotation)
    if (getSprites != null) __obj.updateDynamic("getSprites")(getSprites)
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle)
    if (getTotalAngle != null) __obj.updateDynamic("getTotalAngle")(getTotalAngle)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (labelField != null) __obj.updateDynamic("labelField")(labelField)
    if (provideLegendInfo != null) __obj.updateDynamic("provideLegendInfo")(provideLegendInfo)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (setDonut != null) __obj.updateDynamic("setDonut")(setDonut)
    if (setHidden != null) __obj.updateDynamic("setHidden")(setHidden)
    if (setLabelField != null) __obj.updateDynamic("setLabelField")(setLabelField)
    if (setRotation != null) __obj.updateDynamic("setRotation")(setRotation)
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle)
    if (setTotalAngle != null) __obj.updateDynamic("setTotalAngle")(setTotalAngle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (totalAngle != null) __obj.updateDynamic("totalAngle")(totalAngle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPie]
  }
}


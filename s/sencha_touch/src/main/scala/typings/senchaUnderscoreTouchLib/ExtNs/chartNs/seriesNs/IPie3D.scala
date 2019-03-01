package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPie3D extends IPolar {
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of distortion
  		* @returns Number
  		*/
  var getDistortion: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of donut
  		* @returns Boolean/Number
  		*/
  var getDonut: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of field
  		* @returns String
  		*/
  var getField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of region
  		* @returns Array
  		*/
  var getRegion: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of thickness
  		* @returns Number
  		*/
  var getThickness: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Sets the value of distortion
  		* @param distortion Number The new value.
  		*/
  var setDistortion: js.UndefOr[js.Function1[/* distortion */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of donut
  		* @param donut Boolean/Number The new value.
  		*/
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of field
  		* @param field String The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of region
  		* @param region Array The new value.
  		*/
  var setRegion: js.UndefOr[
    js.Function1[/* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of thickness
  		* @param thickness Number The new value.
  		*/
  var setThickness: js.UndefOr[js.Function1[/* thickness */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object IPie3D {
  @scala.inline
  def apply(
    IPolar: IPolar = null,
    donut: js.Any = null,
    field: java.lang.String = null,
    getDistortion: js.Function0[scala.Double] = null,
    getDonut: js.Function0[_] = null,
    getField: js.Function0[java.lang.String] = null,
    getRegion: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getRotation: js.Function0[scala.Double] = null,
    getSprites: js.Function0[scala.Unit] = null,
    getThickness: js.Function0[scala.Double] = null,
    rotation: scala.Int | scala.Double = null,
    seriesType: java.lang.String = null,
    setDistortion: js.Function1[/* distortion */ js.UndefOr[scala.Double], scala.Unit] = null,
    setDonut: js.Function1[/* donut */ js.UndefOr[js.Any], scala.Unit] = null,
    setField: js.Function1[/* field */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRegion: js.Function1[/* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setRotation: js.Function1[/* rotation */ js.UndefOr[scala.Double], scala.Unit] = null,
    setThickness: js.Function1[/* thickness */ js.UndefOr[scala.Double], scala.Unit] = null,
    `type`: java.lang.String = null
  ): IPie3D = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPolar)
    if (donut != null) __obj.updateDynamic("donut")(donut)
    if (field != null) __obj.updateDynamic("field")(field)
    if (getDistortion != null) __obj.updateDynamic("getDistortion")(getDistortion)
    if (getDonut != null) __obj.updateDynamic("getDonut")(getDonut)
    if (getField != null) __obj.updateDynamic("getField")(getField)
    if (getRegion != null) __obj.updateDynamic("getRegion")(getRegion)
    if (getRotation != null) __obj.updateDynamic("getRotation")(getRotation)
    if (getSprites != null) __obj.updateDynamic("getSprites")(getSprites)
    if (getThickness != null) __obj.updateDynamic("getThickness")(getThickness)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (setDistortion != null) __obj.updateDynamic("setDistortion")(setDistortion)
    if (setDonut != null) __obj.updateDynamic("setDonut")(setDonut)
    if (setField != null) __obj.updateDynamic("setField")(setField)
    if (setRegion != null) __obj.updateDynamic("setRegion")(setRegion)
    if (setRotation != null) __obj.updateDynamic("setRotation")(setRotation)
    if (setThickness != null) __obj.updateDynamic("setThickness")(setThickness)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPie3D]
  }
}


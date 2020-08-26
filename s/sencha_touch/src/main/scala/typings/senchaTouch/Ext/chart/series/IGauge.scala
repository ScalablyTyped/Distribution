package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGauge extends ISeries {
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var donut: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  /** [Method] Returns the value of angleField
    * @returns String
    */
  var getAngleField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of center
    * @returns Array
    */
  var getCenter: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of donut
    * @returns Number
    */
  var getDonut: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of field
    * @returns String
    */
  var getField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of maximum
    * @returns Number
    */
  var getMaximum: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minimum
    * @returns Number
    */
  var getMinimum: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of needle
    * @returns Boolean
    */
  var getNeedle: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of needleLength
    * @returns Number
    */
  var getNeedleLength: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of needleLengthRatio
    * @returns Number
    */
  var getNeedleLengthRatio: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of needleWidth
    * @returns Number
    */
  var getNeedleWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of radius
    * @returns Number
    */
  var getRadius: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of region
    * @returns Array
    */
  var getRegion: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of rotation
    * @returns Number
    */
  var getRotation: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of sectors
    * @returns Array
    */
  var getSectors: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of totalAngle
    * @returns Object
    */
  var getTotalAngle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of value
    * @returns Number
    */
  var getValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of wholeDisk
    * @returns Boolean
    */
  var getWholeDisk: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var needle: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var needleLength: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var needleLengthRatio: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var needleWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Array) */
  var sectors: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of angleField
    * @param angleField String The new value.
    */
  var setAngleField: js.UndefOr[js.Function1[/* angleField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of center
    * @param center Array The new value.
    */
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of donut
    * @param donut Number The new value.
    */
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of field
    * @param field String The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of maximum
    * @param maximum Number The new value.
    */
  var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minimum
    * @param minimum Number The new value.
    */
  var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of needle
    * @param needle Boolean The new value.
    */
  var setNeedle: js.UndefOr[js.Function1[/* needle */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of needleLength
    * @param needleLength Number The new value.
    */
  var setNeedleLength: js.UndefOr[js.Function1[/* needleLength */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of needleLengthRatio
    * @param needleLengthRatio Number The new value.
    */
  var setNeedleLengthRatio: js.UndefOr[js.Function1[/* needleLengthRatio */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of needleWidth
    * @param needleWidth Number The new value.
    */
  var setNeedleWidth: js.UndefOr[js.Function1[/* needleWidth */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of radius
    * @param radius Number The new value.
    */
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of region
    * @param region Array The new value.
    */
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of rotation
    * @param rotation Number The new value.
    */
  var setRotation: js.UndefOr[js.Function1[/* rotation */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of sectors
    * @param sectors Array The new value.
    */
  var setSectors: js.UndefOr[js.Function1[/* sectors */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of totalAngle
    * @param totalAngle Object The new value.
    */
  var setTotalAngle: js.UndefOr[js.Function1[/* totalAngle */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of value
    * @param value Number The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of wholeDisk
    * @param wholeDisk Boolean The new value.
    */
  var setWholeDisk: js.UndefOr[js.Function1[/* wholeDisk */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var wholeDisk: js.UndefOr[Boolean] = js.native
}

object IGauge {
  @scala.inline
  def apply(): IGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGauge]
  }
  @scala.inline
  implicit class IGaugeOps[Self <: IGauge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngleField(value: String): Self = this.set("angleField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleField: Self = this.set("angleField", js.undefined)
    @scala.inline
    def setDonut(value: Double): Self = this.set("donut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDonut: Self = this.set("donut", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setGetAngleField(value: () => String): Self = this.set("getAngleField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAngleField: Self = this.set("getAngleField", js.undefined)
    @scala.inline
    def setGetCenter(value: () => Array): Self = this.set("getCenter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCenter: Self = this.set("getCenter", js.undefined)
    @scala.inline
    def setGetDonut(value: () => Double): Self = this.set("getDonut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDonut: Self = this.set("getDonut", js.undefined)
    @scala.inline
    def setGetField(value: () => String): Self = this.set("getField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetField: Self = this.set("getField", js.undefined)
    @scala.inline
    def setGetMaximum(value: () => Double): Self = this.set("getMaximum", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaximum: Self = this.set("getMaximum", js.undefined)
    @scala.inline
    def setGetMinimum(value: () => Double): Self = this.set("getMinimum", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinimum: Self = this.set("getMinimum", js.undefined)
    @scala.inline
    def setGetNeedle(value: () => Boolean): Self = this.set("getNeedle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNeedle: Self = this.set("getNeedle", js.undefined)
    @scala.inline
    def setGetNeedleLength(value: () => Double): Self = this.set("getNeedleLength", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNeedleLength: Self = this.set("getNeedleLength", js.undefined)
    @scala.inline
    def setGetNeedleLengthRatio(value: () => Double): Self = this.set("getNeedleLengthRatio", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNeedleLengthRatio: Self = this.set("getNeedleLengthRatio", js.undefined)
    @scala.inline
    def setGetNeedleWidth(value: () => Double): Self = this.set("getNeedleWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNeedleWidth: Self = this.set("getNeedleWidth", js.undefined)
    @scala.inline
    def setGetRadius(value: () => Double): Self = this.set("getRadius", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRadius: Self = this.set("getRadius", js.undefined)
    @scala.inline
    def setGetRegion(value: () => Array): Self = this.set("getRegion", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRegion: Self = this.set("getRegion", js.undefined)
    @scala.inline
    def setGetRotation(value: () => Double): Self = this.set("getRotation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRotation: Self = this.set("getRotation", js.undefined)
    @scala.inline
    def setGetSectors(value: () => Array): Self = this.set("getSectors", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSectors: Self = this.set("getSectors", js.undefined)
    @scala.inline
    def setGetTotalAngle(value: () => _): Self = this.set("getTotalAngle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTotalAngle: Self = this.set("getTotalAngle", js.undefined)
    @scala.inline
    def setGetValue(value: () => Double): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setGetWholeDisk(value: () => Boolean): Self = this.set("getWholeDisk", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWholeDisk: Self = this.set("getWholeDisk", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setNeedle(value: Boolean): Self = this.set("needle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedle: Self = this.set("needle", js.undefined)
    @scala.inline
    def setNeedleLength(value: Double): Self = this.set("needleLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleLength: Self = this.set("needleLength", js.undefined)
    @scala.inline
    def setNeedleLengthRatio(value: Double): Self = this.set("needleLengthRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleLengthRatio: Self = this.set("needleLengthRatio", js.undefined)
    @scala.inline
    def setNeedleWidth(value: Double): Self = this.set("needleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleWidth: Self = this.set("needleWidth", js.undefined)
    @scala.inline
    def setSectors(value: Array): Self = this.set("sectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectors: Self = this.set("sectors", js.undefined)
    @scala.inline
    def setSetAngleField(value: /* angleField */ js.UndefOr[String] => Unit): Self = this.set("setAngleField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAngleField: Self = this.set("setAngleField", js.undefined)
    @scala.inline
    def setSetCenter(value: /* center */ js.UndefOr[Array] => Unit): Self = this.set("setCenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCenter: Self = this.set("setCenter", js.undefined)
    @scala.inline
    def setSetDonut(value: /* donut */ js.UndefOr[Double] => Unit): Self = this.set("setDonut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDonut: Self = this.set("setDonut", js.undefined)
    @scala.inline
    def setSetField(value: /* field */ js.UndefOr[String] => Unit): Self = this.set("setField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetField: Self = this.set("setField", js.undefined)
    @scala.inline
    def setSetMaximum(value: /* maximum */ js.UndefOr[Double] => Unit): Self = this.set("setMaximum", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaximum: Self = this.set("setMaximum", js.undefined)
    @scala.inline
    def setSetMinimum(value: /* minimum */ js.UndefOr[Double] => Unit): Self = this.set("setMinimum", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinimum: Self = this.set("setMinimum", js.undefined)
    @scala.inline
    def setSetNeedle(value: /* needle */ js.UndefOr[Boolean] => Unit): Self = this.set("setNeedle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNeedle: Self = this.set("setNeedle", js.undefined)
    @scala.inline
    def setSetNeedleLength(value: /* needleLength */ js.UndefOr[Double] => Unit): Self = this.set("setNeedleLength", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNeedleLength: Self = this.set("setNeedleLength", js.undefined)
    @scala.inline
    def setSetNeedleLengthRatio(value: /* needleLengthRatio */ js.UndefOr[Double] => Unit): Self = this.set("setNeedleLengthRatio", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNeedleLengthRatio: Self = this.set("setNeedleLengthRatio", js.undefined)
    @scala.inline
    def setSetNeedleWidth(value: /* needleWidth */ js.UndefOr[Double] => Unit): Self = this.set("setNeedleWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNeedleWidth: Self = this.set("setNeedleWidth", js.undefined)
    @scala.inline
    def setSetRadius(value: /* radius */ js.UndefOr[Double] => Unit): Self = this.set("setRadius", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRadius: Self = this.set("setRadius", js.undefined)
    @scala.inline
    def setSetRegion(value: /* region */ js.UndefOr[Array] => Unit): Self = this.set("setRegion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRegion: Self = this.set("setRegion", js.undefined)
    @scala.inline
    def setSetRotation(value: /* rotation */ js.UndefOr[Double] => Unit): Self = this.set("setRotation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRotation: Self = this.set("setRotation", js.undefined)
    @scala.inline
    def setSetSectors(value: /* sectors */ js.UndefOr[Array] => Unit): Self = this.set("setSectors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSectors: Self = this.set("setSectors", js.undefined)
    @scala.inline
    def setSetTotalAngle(value: /* totalAngle */ js.UndefOr[js.Any] => Unit): Self = this.set("setTotalAngle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTotalAngle: Self = this.set("setTotalAngle", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[Double] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setSetWholeDisk(value: /* wholeDisk */ js.UndefOr[Boolean] => Unit): Self = this.set("setWholeDisk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWholeDisk: Self = this.set("setWholeDisk", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWholeDisk(value: Boolean): Self = this.set("wholeDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWholeDisk: Self = this.set("wholeDisk", js.undefined)
  }
  
}


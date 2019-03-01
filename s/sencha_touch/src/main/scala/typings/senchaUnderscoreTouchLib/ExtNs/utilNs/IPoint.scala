package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoint
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Copy a new instance of this point
  		* @returns Ext.util.Point The new point.
  		*/
  @JSName("clone")
  var clone_FIPoint: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Clones this Point
  		* @returns Ext.util.Point The new point.
  		*/
  var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Copy the x and y values of another point  object to this point itself
  		* @param point Ext.util.Point/Object .
  		* @returns Ext.util.Point This point.
  		*/
  var copyFrom: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Compare this point and another point
  		* @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
  		* @returns Boolean Returns whether they are equivalent.
  		*/
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Whether the given point is not away from this point within the given threshold amount
  		* @param point Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with x and y properties.
  		* @param threshold Object/Number Can be either an object with x and y properties or a number.
  		* @returns Boolean
  		*/
  var isCloseTo: js.UndefOr[
    js.Function2[/* point */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Returns true if this point is close to another one
  		* @returns Boolean
  		*/
  var isWithin: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
  		* @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
  		* @returns Boolean
  		*/
  var roundedEquals: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
  		* @returns String For example Point[12,8].
  		*/
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Translate this point by the given amounts
  		* @param x Number Amount to translate in the x-axis.
  		* @param y Number Amount to translate in the y-axis.
  		* @returns Boolean
  		*/
  var translate: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Boolean]
  ] = js.undefined
}

object IPoint {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clone: js.Function0[IPoint] = null,
    config: js.Any = null,
    copy: js.Function0[IPoint] = null,
    copyFrom: js.Function1[/* point */ js.UndefOr[js.Any], IPoint] = null,
    destroy: js.Function0[scala.Unit] = null,
    equals: js.Function1[/* point */ js.UndefOr[js.Any], scala.Boolean] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isCloseTo: js.Function2[/* point */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], scala.Boolean] = null,
    isWithin: js.Function0[scala.Boolean] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    roundedEquals: js.Function1[/* point */ js.UndefOr[js.Any], scala.Boolean] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    toString: js.Function0[java.lang.String] = null,
    translate: js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Boolean] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IPoint = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (config != null) __obj.updateDynamic("config")(config)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (copyFrom != null) __obj.updateDynamic("copyFrom")(copyFrom)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isCloseTo != null) __obj.updateDynamic("isCloseTo")(isCloseTo)
    if (isWithin != null) __obj.updateDynamic("isWithin")(isWithin)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (roundedEquals != null) __obj.updateDynamic("roundedEquals")(roundedEquals)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(toString)
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPoint]
  }
}


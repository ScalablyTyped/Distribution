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


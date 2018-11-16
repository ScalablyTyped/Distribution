package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICartesianChart extends IAbstractChart {
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of flipXY
  		* @returns Boolean
  		*/
  var getFlipXY: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of innerRegion
  		* @returns Array
  		*/
  var getInnerRegion: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of flipXY
  		* @param flipXY Boolean The new value.
  		*/
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of innerRegion
  		* @param innerRegion Array The new value.
  		*/
  var setInnerRegion: js.UndefOr[
    js.Function1[/* innerRegion */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}


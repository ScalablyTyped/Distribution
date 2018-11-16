package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IComponent
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var fitSurface: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of autoSize
  		* @returns Boolean
  		*/
  var getAutoSize: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IComponent: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of fitSurface
  		* @returns Boolean
  		*/
  var getFitSurface: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of gradients
  		* @returns Object[]
  		*/
  var getGradients: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of resizeHandler
  		* @returns Function
  		*/
  var getResizeHandler: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sprites
  		* @returns Object
  		*/
  var getSprites: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Get a surface by the given id or create one if it doesn t exist
  		* @param id String
  		* @returns Ext.draw.Surface
  		*/
  var getSurface: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], ISurface]] = js.undefined
  /** [Method] Returns the value of viewBox
  		* @returns Boolean
  		*/
  var getViewBox: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Place water mark after resize  */
  var onPlaceWatermark: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Render all the surfaces in the component  */
  var renderFrame: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var resizeHandler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of autoSize
  		* @param autoSize Boolean The new value.
  		*/
  var setAutoSize: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IComponent: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fitSurface
  		* @param fitSurface Boolean The new value.
  		*/
  var setFitSurface: js.UndefOr[js.Function1[/* fitSurface */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of gradients
  		* @param gradients Object[] The new value.
  		*/
  var setGradients: js.UndefOr[
    js.Function1[/* gradients */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of resizeHandler
  		* @param resizeHandler Function The new value.
  		*/
  var setResizeHandler: js.UndefOr[js.Function1[/* resizeHandler */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sprites
  		* @param sprites Object The new value.
  		*/
  var setSprites: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of viewBox
  		* @param viewBox Boolean The new value.
  		*/
  var setViewBox: js.UndefOr[js.Function1[/* viewBox */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[scala.Boolean] = js.undefined
}


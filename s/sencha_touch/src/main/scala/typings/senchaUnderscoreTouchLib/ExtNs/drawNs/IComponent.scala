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

object IComponent {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    cls: js.Any = null,
    defaultType: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    fitSurface: js.UndefOr[scala.Boolean] = js.undefined,
    getAutoSize: js.Function0[scala.Boolean] = null,
    getBackground: js.Function0[_] = null,
    getCls: js.Function0[java.lang.String] = null,
    getFitSurface: js.Function0[scala.Boolean] = null,
    getGradients: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getResizeHandler: js.Function0[_] = null,
    getSprites: js.Function0[_] = null,
    getSurface: js.Function1[/* id */ js.UndefOr[java.lang.String], ISurface] = null,
    getViewBox: js.Function0[scala.Boolean] = null,
    gradients: senchaUnderscoreTouchLib.ExtNs.Array = null,
    initialize: js.Function0[scala.Unit] = null,
    onPlaceWatermark: js.Function0[scala.Unit] = null,
    renderFrame: js.Function0[scala.Unit] = null,
    resizeHandler: js.Any = null,
    setAutoSize: js.Function1[/* autoSize */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBackground: js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFitSurface: js.Function1[/* fitSurface */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setGradients: js.Function1[/* gradients */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setResizeHandler: js.Function1[/* resizeHandler */ js.UndefOr[js.Any], scala.Unit] = null,
    setSprites: js.Function1[/* sprites */ js.UndefOr[js.Any], scala.Unit] = null,
    setViewBox: js.Function1[/* viewBox */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    viewBox: js.UndefOr[scala.Boolean] = js.undefined
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(fitSurface)) __obj.updateDynamic("fitSurface")(fitSurface)
    if (getAutoSize != null) __obj.updateDynamic("getAutoSize")(getAutoSize)
    if (getBackground != null) __obj.updateDynamic("getBackground")(getBackground)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getFitSurface != null) __obj.updateDynamic("getFitSurface")(getFitSurface)
    if (getGradients != null) __obj.updateDynamic("getGradients")(getGradients)
    if (getResizeHandler != null) __obj.updateDynamic("getResizeHandler")(getResizeHandler)
    if (getSprites != null) __obj.updateDynamic("getSprites")(getSprites)
    if (getSurface != null) __obj.updateDynamic("getSurface")(getSurface)
    if (getViewBox != null) __obj.updateDynamic("getViewBox")(getViewBox)
    if (gradients != null) __obj.updateDynamic("gradients")(gradients)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (onPlaceWatermark != null) __obj.updateDynamic("onPlaceWatermark")(onPlaceWatermark)
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(renderFrame)
    if (resizeHandler != null) __obj.updateDynamic("resizeHandler")(resizeHandler)
    if (setAutoSize != null) __obj.updateDynamic("setAutoSize")(setAutoSize)
    if (setBackground != null) __obj.updateDynamic("setBackground")(setBackground)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setFitSurface != null) __obj.updateDynamic("setFitSurface")(setFitSurface)
    if (setGradients != null) __obj.updateDynamic("setGradients")(setGradients)
    if (setResizeHandler != null) __obj.updateDynamic("setResizeHandler")(setResizeHandler)
    if (setSprites != null) __obj.updateDynamic("setSprites")(setSprites)
    if (setViewBox != null) __obj.updateDynamic("setViewBox")(setViewBox)
    if (!js.isUndefined(viewBox)) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[IComponent]
  }
}


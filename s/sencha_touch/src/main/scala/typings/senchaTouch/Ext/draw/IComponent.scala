package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent extends IContainer {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var fitSurface: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of autoSize
  		* @returns Boolean
  		*/
  var getAutoSize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IComponent: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of fitSurface
  		* @returns Boolean
  		*/
  var getFitSurface: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of gradients
  		* @returns Object[]
  		*/
  var getGradients: js.UndefOr[js.Function0[Array]] = js.undefined
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
  var getSurface: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], ISurface]] = js.undefined
  /** [Method] Returns the value of viewBox
  		* @returns Boolean
  		*/
  var getViewBox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[Array] = js.undefined
  /** [Method] Place water mark after resize  */
  var onPlaceWatermark: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Render all the surfaces in the component  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var resizeHandler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of autoSize
  		* @param autoSize Boolean The new value.
  		*/
  var setAutoSize: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IComponent: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of fitSurface
  		* @param fitSurface Boolean The new value.
  		*/
  var setFitSurface: js.UndefOr[js.Function1[/* fitSurface */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of gradients
  		* @param gradients Object[] The new value.
  		*/
  var setGradients: js.UndefOr[js.Function1[/* gradients */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of resizeHandler
  		* @param resizeHandler Function The new value.
  		*/
  var setResizeHandler: js.UndefOr[js.Function1[/* resizeHandler */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sprites
  		* @param sprites Object The new value.
  		*/
  var setSprites: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of viewBox
  		* @param viewBox Boolean The new value.
  		*/
  var setViewBox: js.UndefOr[js.Function1[/* viewBox */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    autoSize: js.UndefOr[Boolean] = js.undefined,
    fitSurface: js.UndefOr[Boolean] = js.undefined,
    getAutoSize: () => Boolean = null,
    getBackground: () => _ = null,
    getCls: () => String = null,
    getFitSurface: () => Boolean = null,
    getGradients: () => Array = null,
    getResizeHandler: () => _ = null,
    getSprites: () => _ = null,
    getSurface: /* id */ js.UndefOr[String] => ISurface = null,
    getViewBox: () => Boolean = null,
    gradients: Array = null,
    onPlaceWatermark: () => Unit = null,
    renderFrame: () => Unit = null,
    resizeHandler: js.Any = null,
    setAutoSize: /* autoSize */ js.UndefOr[Boolean] => Unit = null,
    setBackground: /* background */ js.UndefOr[js.Any] => Unit = null,
    setCls: /* cls */ js.UndefOr[String] => Unit = null,
    setFitSurface: /* fitSurface */ js.UndefOr[Boolean] => Unit = null,
    setGradients: /* gradients */ js.UndefOr[Array] => Unit = null,
    setResizeHandler: /* resizeHandler */ js.UndefOr[js.Any] => Unit = null,
    setSprites: /* sprites */ js.UndefOr[js.Any] => Unit = null,
    setViewBox: /* viewBox */ js.UndefOr[Boolean] => Unit = null,
    viewBox: js.UndefOr[Boolean] = js.undefined
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fitSurface)) __obj.updateDynamic("fitSurface")(fitSurface.asInstanceOf[js.Any])
    if (getAutoSize != null) __obj.updateDynamic("getAutoSize")(js.Any.fromFunction0(getAutoSize))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getFitSurface != null) __obj.updateDynamic("getFitSurface")(js.Any.fromFunction0(getFitSurface))
    if (getGradients != null) __obj.updateDynamic("getGradients")(js.Any.fromFunction0(getGradients))
    if (getResizeHandler != null) __obj.updateDynamic("getResizeHandler")(js.Any.fromFunction0(getResizeHandler))
    if (getSprites != null) __obj.updateDynamic("getSprites")(js.Any.fromFunction0(getSprites))
    if (getSurface != null) __obj.updateDynamic("getSurface")(js.Any.fromFunction1(getSurface))
    if (getViewBox != null) __obj.updateDynamic("getViewBox")(js.Any.fromFunction0(getViewBox))
    if (gradients != null) __obj.updateDynamic("gradients")(gradients.asInstanceOf[js.Any])
    if (onPlaceWatermark != null) __obj.updateDynamic("onPlaceWatermark")(js.Any.fromFunction0(onPlaceWatermark))
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(js.Any.fromFunction0(renderFrame))
    if (resizeHandler != null) __obj.updateDynamic("resizeHandler")(resizeHandler.asInstanceOf[js.Any])
    if (setAutoSize != null) __obj.updateDynamic("setAutoSize")(js.Any.fromFunction1(setAutoSize))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setFitSurface != null) __obj.updateDynamic("setFitSurface")(js.Any.fromFunction1(setFitSurface))
    if (setGradients != null) __obj.updateDynamic("setGradients")(js.Any.fromFunction1(setGradients))
    if (setResizeHandler != null) __obj.updateDynamic("setResizeHandler")(js.Any.fromFunction1(setResizeHandler))
    if (setSprites != null) __obj.updateDynamic("setSprites")(js.Any.fromFunction1(setSprites))
    if (setViewBox != null) __obj.updateDynamic("setViewBox")(js.Any.fromFunction1(setViewBox))
    if (!js.isUndefined(viewBox)) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent]
  }
}


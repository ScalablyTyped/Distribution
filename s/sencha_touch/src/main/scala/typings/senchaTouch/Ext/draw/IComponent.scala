package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent extends IContainer {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var fitSurface: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoSize
    * @returns Boolean
    */
  var getAutoSize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of background
    * @returns Object
    */
  var getBackground: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IComponent: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of fitSurface
    * @returns Boolean
    */
  var getFitSurface: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of gradients
    * @returns Object[]
    */
  var getGradients: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of resizeHandler
    * @returns Function
    */
  var getResizeHandler: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sprites
    * @returns Object
    */
  var getSprites: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Get a surface by the given id or create one if it doesn t exist
    * @param id String
    * @returns Ext.draw.Surface
    */
  var getSurface: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], ISurface]] = js.native
  /** [Method] Returns the value of viewBox
    * @returns Boolean
    */
  var getViewBox: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[Array] = js.native
  /** [Method] Place water mark after resize  */
  var onPlaceWatermark: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Render all the surfaces in the component  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var resizeHandler: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of autoSize
    * @param autoSize Boolean The new value.
    */
  var setAutoSize: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of background
    * @param background Object The new value.
    */
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IComponent: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of fitSurface
    * @param fitSurface Boolean The new value.
    */
  var setFitSurface: js.UndefOr[js.Function1[/* fitSurface */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of gradients
    * @param gradients Object[] The new value.
    */
  var setGradients: js.UndefOr[js.Function1[/* gradients */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of resizeHandler
    * @param resizeHandler Function The new value.
    */
  var setResizeHandler: js.UndefOr[js.Function1[/* resizeHandler */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of sprites
    * @param sprites Object The new value.
    */
  var setSprites: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of viewBox
    * @param viewBox Boolean The new value.
    */
  var setViewBox: js.UndefOr[js.Function1[/* viewBox */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.native
}

object IComponent {
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
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
    def setAutoSize(value: Boolean): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    @scala.inline
    def setFitSurface(value: Boolean): Self = this.set("fitSurface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitSurface: Self = this.set("fitSurface", js.undefined)
    @scala.inline
    def setGetAutoSize(value: () => Boolean): Self = this.set("getAutoSize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoSize: Self = this.set("getAutoSize", js.undefined)
    @scala.inline
    def setGetBackground(value: () => _): Self = this.set("getBackground", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBackground: Self = this.set("getBackground", js.undefined)
    @scala.inline
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    @scala.inline
    def setGetFitSurface(value: () => Boolean): Self = this.set("getFitSurface", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFitSurface: Self = this.set("getFitSurface", js.undefined)
    @scala.inline
    def setGetGradients(value: () => Array): Self = this.set("getGradients", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGradients: Self = this.set("getGradients", js.undefined)
    @scala.inline
    def setGetResizeHandler(value: () => _): Self = this.set("getResizeHandler", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetResizeHandler: Self = this.set("getResizeHandler", js.undefined)
    @scala.inline
    def setGetSprites(value: () => _): Self = this.set("getSprites", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSprites: Self = this.set("getSprites", js.undefined)
    @scala.inline
    def setGetSurface(value: /* id */ js.UndefOr[String] => ISurface): Self = this.set("getSurface", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSurface: Self = this.set("getSurface", js.undefined)
    @scala.inline
    def setGetViewBox(value: () => Boolean): Self = this.set("getViewBox", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetViewBox: Self = this.set("getViewBox", js.undefined)
    @scala.inline
    def setGradients(value: Array): Self = this.set("gradients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradients: Self = this.set("gradients", js.undefined)
    @scala.inline
    def setOnPlaceWatermark(value: () => Unit): Self = this.set("onPlaceWatermark", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPlaceWatermark: Self = this.set("onPlaceWatermark", js.undefined)
    @scala.inline
    def setRenderFrame(value: () => Unit): Self = this.set("renderFrame", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderFrame: Self = this.set("renderFrame", js.undefined)
    @scala.inline
    def setResizeHandler(value: js.Any): Self = this.set("resizeHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandler: Self = this.set("resizeHandler", js.undefined)
    @scala.inline
    def setSetAutoSize(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoSize: Self = this.set("setAutoSize", js.undefined)
    @scala.inline
    def setSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = this.set("setBackground", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBackground: Self = this.set("setBackground", js.undefined)
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    @scala.inline
    def setSetFitSurface(value: /* fitSurface */ js.UndefOr[Boolean] => Unit): Self = this.set("setFitSurface", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFitSurface: Self = this.set("setFitSurface", js.undefined)
    @scala.inline
    def setSetGradients(value: /* gradients */ js.UndefOr[Array] => Unit): Self = this.set("setGradients", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGradients: Self = this.set("setGradients", js.undefined)
    @scala.inline
    def setSetResizeHandler(value: /* resizeHandler */ js.UndefOr[js.Any] => Unit): Self = this.set("setResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetResizeHandler: Self = this.set("setResizeHandler", js.undefined)
    @scala.inline
    def setSetSprites(value: /* sprites */ js.UndefOr[js.Any] => Unit): Self = this.set("setSprites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSprites: Self = this.set("setSprites", js.undefined)
    @scala.inline
    def setSetViewBox(value: /* viewBox */ js.UndefOr[Boolean] => Unit): Self = this.set("setViewBox", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetViewBox: Self = this.set("setViewBox", js.undefined)
    @scala.inline
    def setViewBox(value: Boolean): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
  }
  
}


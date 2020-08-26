package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImg extends IComponent {
  /** [Config Option] (String) */
  var backgroundCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of backgroundCls
    * @returns String
    */
  var getBackgroundCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of imageCls
    * @returns String
    */
  var getImageCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of mode
    * @returns String
    */
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of src
    * @returns String
    */
  var getSrc: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Hides this Component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("hide")
  var hide_IImg: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (String) */
  var imageCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of backgroundCls
    * @param backgroundCls String The new value.
    */
  var setBackgroundCls: js.UndefOr[js.Function1[/* backgroundCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of imageCls
    * @param imageCls String The new value.
    */
  var setImageCls: js.UndefOr[js.Function1[/* imageCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of mode
    * @param mode String The new value.
    */
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of src
    * @param src String The new value.
    */
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Shows this component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("show")
  var show_IImg: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.native
}

object IImg {
  @scala.inline
  def apply(): IImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImg]
  }
  @scala.inline
  implicit class IImgOps[Self <: IImg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundCls(value: java.lang.String): Self = this.set("backgroundCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundCls: Self = this.set("backgroundCls", js.undefined)
    @scala.inline
    def setGetBackgroundCls(value: () => java.lang.String): Self = this.set("getBackgroundCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBackgroundCls: Self = this.set("getBackgroundCls", js.undefined)
    @scala.inline
    def setGetImageCls(value: () => java.lang.String): Self = this.set("getImageCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetImageCls: Self = this.set("getImageCls", js.undefined)
    @scala.inline
    def setGetMode(value: () => java.lang.String): Self = this.set("getMode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMode: Self = this.set("getMode", js.undefined)
    @scala.inline
    def setGetSrc(value: () => java.lang.String): Self = this.set("getSrc", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSrc: Self = this.set("getSrc", js.undefined)
    @scala.inline
    def setHide(value: () => IComponent): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setImageCls(value: java.lang.String): Self = this.set("imageCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageCls: Self = this.set("imageCls", js.undefined)
    @scala.inline
    def setMode(value: java.lang.String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSetBackgroundCls(value: /* backgroundCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setBackgroundCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBackgroundCls: Self = this.set("setBackgroundCls", js.undefined)
    @scala.inline
    def setSetImageCls(value: /* imageCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setImageCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetImageCls: Self = this.set("setImageCls", js.undefined)
    @scala.inline
    def setSetMode(value: /* mode */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMode: Self = this.set("setMode", js.undefined)
    @scala.inline
    def setSetSrc(value: /* src */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setSrc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSrc: Self = this.set("setSrc", js.undefined)
    @scala.inline
    def setShow(value: () => IComponent): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSrc(value: java.lang.String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}


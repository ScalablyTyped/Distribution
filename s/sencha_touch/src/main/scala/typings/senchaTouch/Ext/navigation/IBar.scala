package typings.senchaTouch.Ext.navigation

import typings.senchaTouch.Ext.ITitleBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBar extends ITitleBar {
  /** [Config Option] (Boolean) */
  var androidAnimation: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IBar: js.UndefOr[String] = js.native
  /** [Method] Returns the value of androidAnimation
    * @returns Boolean
    */
  var getAndroidAnimation: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of androidAnimation
    * @param androidAnimation Boolean The new value.
    */
  var setAndroidAnimation: js.UndefOr[js.Function1[/* androidAnimation */ js.UndefOr[Boolean], Unit]] = js.native
}

object IBar {
  @scala.inline
  def apply(): IBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBar]
  }
  @scala.inline
  implicit class IBarOps[Self <: IBar] (val x: Self) extends AnyVal {
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
    def setAndroidAnimation(value: Boolean): Self = this.set("androidAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidAnimation: Self = this.set("androidAnimation", js.undefined)
    @scala.inline
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    @scala.inline
    def setGetAndroidAnimation(value: () => Boolean): Self = this.set("getAndroidAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAndroidAnimation: Self = this.set("getAndroidAnimation", js.undefined)
    @scala.inline
    def setSetAndroidAnimation(value: /* androidAnimation */ js.UndefOr[Boolean] => Unit): Self = this.set("setAndroidAnimation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAndroidAnimation: Self = this.set("setAndroidAnimation", js.undefined)
  }
  
}


package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouter extends IBase {
  /** [Method] Connects a url based route to a controller action pair plus additional params
    * @param url String The url to recognize.
    * @param params Object Additional parameters.
    */
  var connect: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.native
  /** [Method] Convenience method which just calls the supplied function with the Router instance
    * @param fn Function The fn to call
    */
  var draw: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  var getDefaults: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of routes
    * @returns Array
    */
  var getRoutes: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Recognizes a url string connected to the Router return the controller action pair plus any additional config associa
    * @param url String The url to recognize.
    * @returns Object/undefined If the url was recognized, the controller and action to call, else undefined.
    */
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], _]] = js.native
  /** [Config Option] (Array) */
  var routes: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of defaults
    * @param defaults Object The new value.
    */
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of routes
    * @param routes Array The new value.
    */
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[Array], Unit]] = js.native
}

object IRouter {
  @scala.inline
  def apply(): IRouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouter]
  }
  @scala.inline
  implicit class IRouterOps[Self <: IRouter] (val x: Self) extends AnyVal {
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
    def setConnect(value: (/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any]) => Unit): Self = this.set("connect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setDraw(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = this.set("draw", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDraw: Self = this.set("draw", js.undefined)
    @scala.inline
    def setGetDefaults(value: () => _): Self = this.set("getDefaults", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaults: Self = this.set("getDefaults", js.undefined)
    @scala.inline
    def setGetRoutes(value: () => Array): Self = this.set("getRoutes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRoutes: Self = this.set("getRoutes", js.undefined)
    @scala.inline
    def setRecognize(value: /* url */ js.UndefOr[String] => _): Self = this.set("recognize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRecognize: Self = this.set("recognize", js.undefined)
    @scala.inline
    def setRoutes(value: Array): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = this.set("setDefaults", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDefaults: Self = this.set("setDefaults", js.undefined)
    @scala.inline
    def setSetRoutes(value: /* routes */ js.UndefOr[Array] => Unit): Self = this.set("setRoutes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRoutes: Self = this.set("setRoutes", js.undefined)
  }
  
}


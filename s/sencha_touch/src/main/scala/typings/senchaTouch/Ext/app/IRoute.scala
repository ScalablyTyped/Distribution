package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoute extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var conditions: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var controller: js.UndefOr[String] = js.native
  /** [Method] Returns the value of action
    * @returns String
    */
  var getAction: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of conditions
    * @returns Object
    */
  var getConditions: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of controller
    * @returns String
    */
  var getController: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Property] (Object) */
  var paramsInMatchString: js.UndefOr[js.Any] = js.native
  /** [Method] Attempts to recognize a given url string and return controller action pair for it
    * @param url String The url to recognize.
    * @returns Object/Boolean The matched data, or false if no match.
    */
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], _]] = js.native
  /** [Method] Sets the value of action
    * @param action String The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of conditions
    * @param conditions Object The new value.
    */
  var setConditions: js.UndefOr[js.Function1[/* conditions */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of controller
    * @param controller String The new value.
    */
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IRoute {
  @scala.inline
  def apply(): IRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRoute]
  }
  @scala.inline
  implicit class IRouteOps[Self <: IRoute] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setConditions(value: js.Any): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setGetAction(value: () => String): Self = this.set("getAction", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAction: Self = this.set("getAction", js.undefined)
    @scala.inline
    def setGetConditions(value: () => _): Self = this.set("getConditions", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetConditions: Self = this.set("getConditions", js.undefined)
    @scala.inline
    def setGetController(value: () => String): Self = this.set("getController", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetController: Self = this.set("getController", js.undefined)
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    @scala.inline
    def setParamsInMatchString(value: js.Any): Self = this.set("paramsInMatchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamsInMatchString: Self = this.set("paramsInMatchString", js.undefined)
    @scala.inline
    def setRecognize(value: /* url */ js.UndefOr[String] => _): Self = this.set("recognize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRecognize: Self = this.set("recognize", js.undefined)
    @scala.inline
    def setSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = this.set("setAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAction: Self = this.set("setAction", js.undefined)
    @scala.inline
    def setSetConditions(value: /* conditions */ js.UndefOr[js.Any] => Unit): Self = this.set("setConditions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetConditions: Self = this.set("setConditions", js.undefined)
    @scala.inline
    def setSetController(value: /* controller */ js.UndefOr[String] => Unit): Self = this.set("setController", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetController: Self = this.set("setController", js.undefined)
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}


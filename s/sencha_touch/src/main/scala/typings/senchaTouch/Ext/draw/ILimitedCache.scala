package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILimitedCache extends IBase {
  /** [Method] Clear all the objects  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var feeder: js.UndefOr[js.Any] = js.native
  /** [Method] Get a cached object
    * @param id String
    * @param args Mixed... Arguments appended to feeder.
    * @returns Object
    */
  var get: js.UndefOr[js.Function2[/* id */ String, /* repeated */ js.Any, _]] = js.native
  /** [Method] Returns the value of feeder
    * @returns Function
    */
  var getFeeder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of limit
    * @returns Number
    */
  var getLimit: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of feeder
    * @param feeder Function The new value.
    * @returns Number
    */
  var setFeeder: js.UndefOr[js.Function1[/* feeder */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Sets the value of limit
    * @param limit Number The new value.
    */
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
}

object ILimitedCache {
  @scala.inline
  def apply(): ILimitedCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILimitedCache]
  }
  @scala.inline
  implicit class ILimitedCacheOps[Self <: ILimitedCache] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setFeeder(value: js.Any): Self = this.set("feeder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeeder: Self = this.set("feeder", js.undefined)
    @scala.inline
    def setGet(value: (/* id */ String, /* repeated */ js.Any) => _): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetFeeder(value: () => _): Self = this.set("getFeeder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFeeder: Self = this.set("getFeeder", js.undefined)
    @scala.inline
    def setGetLimit(value: () => Double): Self = this.set("getLimit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLimit: Self = this.set("getLimit", js.undefined)
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetFeeder(value: /* feeder */ js.UndefOr[js.Any] => Double): Self = this.set("setFeeder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFeeder: Self = this.set("setFeeder", js.undefined)
    @scala.inline
    def setSetLimit(value: /* limit */ js.UndefOr[Double] => Unit): Self = this.set("setLimit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLimit: Self = this.set("setLimit", js.undefined)
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
  }
  
}


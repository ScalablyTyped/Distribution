package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilter extends IBase {
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of anyMatch
    * @returns Boolean
    */
  var getAnyMatch: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of caseSensitive
    * @returns Boolean
    */
  var getCaseSensitive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of exactMatch
    * @returns Boolean
    */
  var getExactMatch: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of filterFn
    * @returns Function
    */
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of id
    * @returns String
    */
  var getId: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of property
    * @returns String
    */
  var getProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of root
    * @returns String
    */
  var getRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of value
    * @returns RegExp/Mixed
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of anyMatch
    * @param anyMatch Boolean The new value.
    */
  var setAnyMatch: js.UndefOr[js.Function1[/* anyMatch */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of caseSensitive
    * @param caseSensitive Boolean The new value.
    */
  var setCaseSensitive: js.UndefOr[js.Function1[/* caseSensitive */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of exactMatch
    * @param exactMatch Boolean The new value.
    */
  var setExactMatch: js.UndefOr[js.Function1[/* exactMatch */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of filterFn
    * @param filterFn Function The new value.
    */
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of id
    * @param id String The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of property
    * @param property String The new value.
    */
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of root
    * @param root String The new value.
    */
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of value
    * @param value RegExp/Mixed The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (RegExp/Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}

object IFilter {
  @scala.inline
  def apply(): IFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilter]
  }
  @scala.inline
  implicit class IFilterOps[Self <: IFilter] (val x: Self) extends AnyVal {
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
    def setAnyMatch(value: Boolean): Self = this.set("anyMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyMatch: Self = this.set("anyMatch", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setExactMatch(value: Boolean): Self = this.set("exactMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactMatch: Self = this.set("exactMatch", js.undefined)
    @scala.inline
    def setFilterFn(value: js.Any): Self = this.set("filterFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterFn: Self = this.set("filterFn", js.undefined)
    @scala.inline
    def setGetAnyMatch(value: () => Boolean): Self = this.set("getAnyMatch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAnyMatch: Self = this.set("getAnyMatch", js.undefined)
    @scala.inline
    def setGetCaseSensitive(value: () => Boolean): Self = this.set("getCaseSensitive", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCaseSensitive: Self = this.set("getCaseSensitive", js.undefined)
    @scala.inline
    def setGetExactMatch(value: () => Boolean): Self = this.set("getExactMatch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetExactMatch: Self = this.set("getExactMatch", js.undefined)
    @scala.inline
    def setGetFilterFn(value: () => _): Self = this.set("getFilterFn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFilterFn: Self = this.set("getFilterFn", js.undefined)
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    @scala.inline
    def setGetProperty(value: () => String): Self = this.set("getProperty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetProperty: Self = this.set("getProperty", js.undefined)
    @scala.inline
    def setGetRoot(value: () => String): Self = this.set("getRoot", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRoot: Self = this.set("getRoot", js.undefined)
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetAnyMatch(value: /* anyMatch */ js.UndefOr[Boolean] => Unit): Self = this.set("setAnyMatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAnyMatch: Self = this.set("setAnyMatch", js.undefined)
    @scala.inline
    def setSetCaseSensitive(value: /* caseSensitive */ js.UndefOr[Boolean] => Unit): Self = this.set("setCaseSensitive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCaseSensitive: Self = this.set("setCaseSensitive", js.undefined)
    @scala.inline
    def setSetExactMatch(value: /* exactMatch */ js.UndefOr[Boolean] => Unit): Self = this.set("setExactMatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetExactMatch: Self = this.set("setExactMatch", js.undefined)
    @scala.inline
    def setSetFilterFn(value: /* filterFn */ js.UndefOr[js.Any] => Unit): Self = this.set("setFilterFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilterFn: Self = this.set("setFilterFn", js.undefined)
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetId: Self = this.set("setId", js.undefined)
    @scala.inline
    def setSetProperty(value: /* property */ js.UndefOr[String] => Unit): Self = this.set("setProperty", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetProperty: Self = this.set("setProperty", js.undefined)
    @scala.inline
    def setSetRoot(value: /* root */ js.UndefOr[String] => Unit): Self = this.set("setRoot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRoot: Self = this.set("setRoot", js.undefined)
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


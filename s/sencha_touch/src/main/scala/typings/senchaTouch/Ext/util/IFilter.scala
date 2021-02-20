package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IFilterMutableBuilder[Self <: IFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyMatch(value: Boolean): Self = StObject.set(x, "anyMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyMatchUndefined: Self = StObject.set(x, "anyMatch", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    @scala.inline
    def setFilterFn(value: js.Any): Self = StObject.set(x, "filterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFnUndefined: Self = StObject.set(x, "filterFn", js.undefined)
    
    @scala.inline
    def setGetAnyMatch(value: () => Boolean): Self = StObject.set(x, "getAnyMatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnyMatchUndefined: Self = StObject.set(x, "getAnyMatch", js.undefined)
    
    @scala.inline
    def setGetCaseSensitive(value: () => Boolean): Self = StObject.set(x, "getCaseSensitive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCaseSensitiveUndefined: Self = StObject.set(x, "getCaseSensitive", js.undefined)
    
    @scala.inline
    def setGetExactMatch(value: () => Boolean): Self = StObject.set(x, "getExactMatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExactMatchUndefined: Self = StObject.set(x, "getExactMatch", js.undefined)
    
    @scala.inline
    def setGetFilterFn(value: () => _): Self = StObject.set(x, "getFilterFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterFnUndefined: Self = StObject.set(x, "getFilterFn", js.undefined)
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    @scala.inline
    def setGetProperty(value: () => String): Self = StObject.set(x, "getProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPropertyUndefined: Self = StObject.set(x, "getProperty", js.undefined)
    
    @scala.inline
    def setGetRoot(value: () => String): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootUndefined: Self = StObject.set(x, "getRoot", js.undefined)
    
    @scala.inline
    def setGetScope(value: () => _): Self = StObject.set(x, "getScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSetAnyMatch(value: /* anyMatch */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAnyMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnyMatchUndefined: Self = StObject.set(x, "setAnyMatch", js.undefined)
    
    @scala.inline
    def setSetCaseSensitive(value: /* caseSensitive */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setCaseSensitive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCaseSensitiveUndefined: Self = StObject.set(x, "setCaseSensitive", js.undefined)
    
    @scala.inline
    def setSetExactMatch(value: /* exactMatch */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setExactMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExactMatchUndefined: Self = StObject.set(x, "setExactMatch", js.undefined)
    
    @scala.inline
    def setSetFilterFn(value: /* filterFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFilterFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterFnUndefined: Self = StObject.set(x, "setFilterFn", js.undefined)
    
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    @scala.inline
    def setSetProperty(value: /* property */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertyUndefined: Self = StObject.set(x, "setProperty", js.undefined)
    
    @scala.inline
    def setSetRoot(value: /* root */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootUndefined: Self = StObject.set(x, "setRoot", js.undefined)
    
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

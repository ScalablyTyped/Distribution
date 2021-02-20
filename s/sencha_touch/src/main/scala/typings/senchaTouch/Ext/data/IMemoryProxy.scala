package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMemoryProxy extends IClient {
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
}
object IMemoryProxy {
  
  @scala.inline
  def apply(): IMemoryProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemoryProxy]
  }
  
  @scala.inline
  implicit class IMemoryProxyMutableBuilder[Self <: IMemoryProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setGetData(value: () => _): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
  }
}

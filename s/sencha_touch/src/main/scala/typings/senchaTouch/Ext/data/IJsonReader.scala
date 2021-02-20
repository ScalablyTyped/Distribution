package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonReader
  extends typings.senchaTouch.Ext.data.reader.IReader {
  
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of useSimpleAccessors
    * @returns Boolean
    */
  var getUseSimpleAccessors: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of useSimpleAccessors
    * @param useSimpleAccessors Boolean The new value.
    */
  var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.native
}
object IJsonReader {
  
  @scala.inline
  def apply(): IJsonReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonReader]
  }
  
  @scala.inline
  implicit class IJsonReaderMutableBuilder[Self <: IJsonReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRecord(value: () => String): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    @scala.inline
    def setGetUseSimpleAccessors(value: () => Boolean): Self = StObject.set(x, "getUseSimpleAccessors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseSimpleAccessorsUndefined: Self = StObject.set(x, "getUseSimpleAccessors", js.undefined)
    
    @scala.inline
    def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
    
    @scala.inline
    def setSetUseSimpleAccessors(value: /* useSimpleAccessors */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseSimpleAccessors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseSimpleAccessorsUndefined: Self = StObject.set(x, "setUseSimpleAccessors", js.undefined)
    
    @scala.inline
    def setUseSimpleAccessors(value: Boolean): Self = StObject.set(x, "useSimpleAccessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSimpleAccessorsUndefined: Self = StObject.set(x, "useSimpleAccessors", js.undefined)
  }
}

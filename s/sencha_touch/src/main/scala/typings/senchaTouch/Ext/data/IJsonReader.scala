package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonReader
  extends StObject
     with typings.senchaTouch.Ext.data.reader.IReader {
  
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of useSimpleAccessors
    * @returns Boolean
    */
  var getUseSimpleAccessors: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of useSimpleAccessors
    * @param useSimpleAccessors Boolean The new value.
    */
  var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.undefined
}
object IJsonReader {
  
  inline def apply(): IJsonReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonReader]
  }
  
  extension [Self <: IJsonReader](x: Self) {
    
    inline def setGetRecord(value: () => String): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
    
    inline def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    inline def setGetUseSimpleAccessors(value: () => Boolean): Self = StObject.set(x, "getUseSimpleAccessors", js.Any.fromFunction0(value))
    
    inline def setGetUseSimpleAccessorsUndefined: Self = StObject.set(x, "getUseSimpleAccessors", js.undefined)
    
    inline def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
    
    inline def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
    
    inline def setSetUseSimpleAccessors(value: /* useSimpleAccessors */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseSimpleAccessors", js.Any.fromFunction1(value))
    
    inline def setSetUseSimpleAccessorsUndefined: Self = StObject.set(x, "setUseSimpleAccessors", js.undefined)
    
    inline def setUseSimpleAccessors(value: Boolean): Self = StObject.set(x, "useSimpleAccessors", value.asInstanceOf[js.Any])
    
    inline def setUseSimpleAccessorsUndefined: Self = StObject.set(x, "useSimpleAccessors", js.undefined)
  }
}

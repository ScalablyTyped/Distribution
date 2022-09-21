package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWriter
  extends StObject
     with IBase {
  
  /** [Method] Returns the value of nameProperty
    * @returns String
    */
  var getNameProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Formats the data for each record before sending it to the server
    * @param record Object The record that we are writing to the server.
    * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
    */
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns the value of writeAllFields
    * @returns Boolean
    */
  var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of nameProperty
    * @param nameProperty String The new value.
    */
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of writeAllFields
    * @param writeAllFields Boolean The new value.
    */
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Prepares a Proxy s Ext data Request object
    * @param request Ext.data.Request The request object.
    * @returns Ext.data.Request The modified request object.
    */
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.undefined
}
object IWriter {
  
  inline def apply(): IWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriter]
  }
  
  extension [Self <: IWriter](x: Self) {
    
    inline def setGetNameProperty(value: () => String): Self = StObject.set(x, "getNameProperty", js.Any.fromFunction0(value))
    
    inline def setGetNamePropertyUndefined: Self = StObject.set(x, "getNameProperty", js.undefined)
    
    inline def setGetRecordData(value: /* record */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getRecordData", js.Any.fromFunction1(value))
    
    inline def setGetRecordDataUndefined: Self = StObject.set(x, "getRecordData", js.undefined)
    
    inline def setGetWriteAllFields(value: () => Boolean): Self = StObject.set(x, "getWriteAllFields", js.Any.fromFunction0(value))
    
    inline def setGetWriteAllFieldsUndefined: Self = StObject.set(x, "getWriteAllFields", js.undefined)
    
    inline def setNameProperty(value: String): Self = StObject.set(x, "nameProperty", value.asInstanceOf[js.Any])
    
    inline def setNamePropertyUndefined: Self = StObject.set(x, "nameProperty", js.undefined)
    
    inline def setSetNameProperty(value: /* nameProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setNameProperty", js.Any.fromFunction1(value))
    
    inline def setSetNamePropertyUndefined: Self = StObject.set(x, "setNameProperty", js.undefined)
    
    inline def setSetWriteAllFields(value: /* writeAllFields */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setWriteAllFields", js.Any.fromFunction1(value))
    
    inline def setSetWriteAllFieldsUndefined: Self = StObject.set(x, "setWriteAllFields", js.undefined)
    
    inline def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    inline def setWriteAllFields(value: Boolean): Self = StObject.set(x, "writeAllFields", value.asInstanceOf[js.Any])
    
    inline def setWriteAllFieldsUndefined: Self = StObject.set(x, "writeAllFields", js.undefined)
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}

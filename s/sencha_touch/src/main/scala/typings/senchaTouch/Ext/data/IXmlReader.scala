package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlReader
  extends StObject
     with typings.senchaTouch.Ext.data.reader.IReader {
  
  /** [Method] Normalizes the data object
    * @param data Object The raw data object.
    * @returns Object Returns the documentElement property of the data object if present, or the same object if not.
    */
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.undefined
}
object IXmlReader {
  
  @scala.inline
  def apply(): IXmlReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlReader]
  }
  
  @scala.inline
  implicit class IXmlReaderMutableBuilder[Self <: IXmlReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetData(value: /* data */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    @scala.inline
    def setGetRecord(value: () => String): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    @scala.inline
    def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
  }
}

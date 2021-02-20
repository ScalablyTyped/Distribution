package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlWriter
  extends typings.senchaTouch.Ext.data.writer.IWriter {
  
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of defaultDocumentRoot
    * @returns String
    */
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of documentRoot
    * @returns String
    */
  var getDocumentRoot: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of header
    * @returns String
    */
  var getHeader: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of defaultDocumentRoot
    * @param defaultDocumentRoot String The new value.
    */
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of documentRoot
    * @param documentRoot String The new value.
    */
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of header
    * @param header String The new value.
    */
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method]
    * @param request Object
    * @param data Array
    * @returns Object
    */
  var writeRecords: js.UndefOr[js.Function2[/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array], _]] = js.native
}
object IXmlWriter {
  
  @scala.inline
  def apply(): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlWriter]
  }
  
  @scala.inline
  implicit class IXmlWriterMutableBuilder[Self <: IXmlWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDocumentRoot(value: String): Self = StObject.set(x, "defaultDocumentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDocumentRootUndefined: Self = StObject.set(x, "defaultDocumentRoot", js.undefined)
    
    @scala.inline
    def setDocumentRoot(value: String): Self = StObject.set(x, "documentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentRootUndefined: Self = StObject.set(x, "documentRoot", js.undefined)
    
    @scala.inline
    def setGetDefaultDocumentRoot(value: () => String): Self = StObject.set(x, "getDefaultDocumentRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultDocumentRootUndefined: Self = StObject.set(x, "getDefaultDocumentRoot", js.undefined)
    
    @scala.inline
    def setGetDocumentRoot(value: () => String): Self = StObject.set(x, "getDocumentRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDocumentRootUndefined: Self = StObject.set(x, "getDocumentRoot", js.undefined)
    
    @scala.inline
    def setGetHeader(value: () => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
    
    @scala.inline
    def setGetRecord(value: () => String): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    @scala.inline
    def setSetDefaultDocumentRoot(value: /* defaultDocumentRoot */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultDocumentRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultDocumentRootUndefined: Self = StObject.set(x, "setDefaultDocumentRoot", js.undefined)
    
    @scala.inline
    def setSetDocumentRoot(value: /* documentRoot */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDocumentRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDocumentRootUndefined: Self = StObject.set(x, "setDocumentRoot", js.undefined)
    
    @scala.inline
    def setSetHeader(value: /* header */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
    
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
    
    @scala.inline
    def setWriteRecords(value: (/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array]) => _): Self = StObject.set(x, "writeRecords", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteRecordsUndefined: Self = StObject.set(x, "writeRecords", js.undefined)
  }
}

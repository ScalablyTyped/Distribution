package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writer {
  
  @js.native
  trait IJson
    extends typings.senchaTouch.Ext.data.writer.IWriter {
    
    /** [Config Option] (Boolean) */
    var allowSingle: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var encode: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the value of allowSingle
      * @returns Boolean
      */
    var getAllowSingle: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of encode
      * @returns Boolean
      */
    var getEncode: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of encodeRequest
      * @returns Boolean
      */
    var getEncodeRequest: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of rootProperty
      * @returns String
      */
    var getRootProperty: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Config Option] (String) */
    var root: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var rootProperty: js.UndefOr[String] = js.native
    
    /** [Method] Sets the value of allowSingle
      * @param allowSingle Boolean The new value.
      */
    var setAllowSingle: js.UndefOr[js.Function1[/* allowSingle */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of encode
      * @param encode Boolean The new value.
      */
    var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of encodeRequest
      * @param encodeRequest Boolean The new value.
      */
    var setEncodeRequest: js.UndefOr[js.Function1[/* encodeRequest */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of rootProperty
      * @param rootProperty String The new value.
      */
    var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.native
  }
  object IJson {
    
    @scala.inline
    def apply(): IJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJson]
    }
    
    @scala.inline
    implicit class IJsonMutableBuilder[Self <: IJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSingle(value: Boolean): Self = StObject.set(x, "allowSingle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSingleUndefined: Self = StObject.set(x, "allowSingle", js.undefined)
      
      @scala.inline
      def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setGetAllowSingle(value: () => Boolean): Self = StObject.set(x, "getAllowSingle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllowSingleUndefined: Self = StObject.set(x, "getAllowSingle", js.undefined)
      
      @scala.inline
      def setGetEncode(value: () => Boolean): Self = StObject.set(x, "getEncode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEncodeRequest(value: () => Boolean): Self = StObject.set(x, "getEncodeRequest", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEncodeRequestUndefined: Self = StObject.set(x, "getEncodeRequest", js.undefined)
      
      @scala.inline
      def setGetEncodeUndefined: Self = StObject.set(x, "getEncode", js.undefined)
      
      @scala.inline
      def setGetRootProperty(value: () => String): Self = StObject.set(x, "getRootProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootPropertyUndefined: Self = StObject.set(x, "getRootProperty", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootProperty(value: String): Self = StObject.set(x, "rootProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPropertyUndefined: Self = StObject.set(x, "rootProperty", js.undefined)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSetAllowSingle(value: /* allowSingle */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowSingle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAllowSingleUndefined: Self = StObject.set(x, "setAllowSingle", js.undefined)
      
      @scala.inline
      def setSetEncode(value: /* encode */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEncode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEncodeRequest(value: /* encodeRequest */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEncodeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEncodeRequestUndefined: Self = StObject.set(x, "setEncodeRequest", js.undefined)
      
      @scala.inline
      def setSetEncodeUndefined: Self = StObject.set(x, "setEncode", js.undefined)
      
      @scala.inline
      def setSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRootProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRootPropertyUndefined: Self = StObject.set(x, "setRootProperty", js.undefined)
    }
  }
  
  @js.native
  trait IWriter extends IBase {
    
    /** [Method] Returns the value of nameProperty
      * @returns String
      */
    var getNameProperty: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Formats the data for each record before sending it to the server
      * @param record Object The record that we are writing to the server.
      * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
      */
    var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Returns the value of writeAllFields
      * @returns Boolean
      */
    var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Config Option] (String) */
    var nameProperty: js.UndefOr[String] = js.native
    
    /** [Method] Sets the value of nameProperty
      * @param nameProperty String The new value.
      */
    var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of writeAllFields
      * @param writeAllFields Boolean The new value.
      */
    var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Prepares a Proxy s Ext data Request object
      * @param request Ext.data.Request The request object.
      * @returns Ext.data.Request The modified request object.
      */
    var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.native
    
    /** [Config Option] (Boolean) */
    var writeAllFields: js.UndefOr[Boolean] = js.native
  }
  object IWriter {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.data.writer.IWriter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.data.writer.IWriter]
    }
    
    @scala.inline
    implicit class IWriterMutableBuilder[Self <: typings.senchaTouch.Ext.data.writer.IWriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetNameProperty(value: () => String): Self = StObject.set(x, "getNameProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNamePropertyUndefined: Self = StObject.set(x, "getNameProperty", js.undefined)
      
      @scala.inline
      def setGetRecordData(value: /* record */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getRecordData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRecordDataUndefined: Self = StObject.set(x, "getRecordData", js.undefined)
      
      @scala.inline
      def setGetWriteAllFields(value: () => Boolean): Self = StObject.set(x, "getWriteAllFields", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWriteAllFieldsUndefined: Self = StObject.set(x, "getWriteAllFields", js.undefined)
      
      @scala.inline
      def setNameProperty(value: String): Self = StObject.set(x, "nameProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePropertyUndefined: Self = StObject.set(x, "nameProperty", js.undefined)
      
      @scala.inline
      def setSetNameProperty(value: /* nameProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setNameProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNamePropertyUndefined: Self = StObject.set(x, "setNameProperty", js.undefined)
      
      @scala.inline
      def setSetWriteAllFields(value: /* writeAllFields */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setWriteAllFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWriteAllFieldsUndefined: Self = StObject.set(x, "setWriteAllFields", js.undefined)
      
      @scala.inline
      def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteAllFields(value: Boolean): Self = StObject.set(x, "writeAllFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteAllFieldsUndefined: Self = StObject.set(x, "writeAllFields", js.undefined)
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  @js.native
  trait IXml
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
  object IXml {
    
    @scala.inline
    def apply(): IXml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXml]
    }
    
    @scala.inline
    implicit class IXmlMutableBuilder[Self <: IXml] (val x: Self) extends AnyVal {
      
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
}

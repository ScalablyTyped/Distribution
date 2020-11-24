package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataReader extends IObservable {
  
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of clientIdProperty
    * @returns String
    */
  var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of idProperty
    * @returns String
    */
  var getIdProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of implicitIncludes
    * @returns Boolean
    */
  var getImplicitIncludes: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of messageProperty
    * @returns String
    */
  var getMessageProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of model
    * @returns Object
    */
  var getModel: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Takes a raw response object as passed to this read and returns the useful data segment of it
    * @param response Object The response object
    * @returns Object The useful data from the response
    */
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of rootProperty
    * @returns String
    */
  var getRootProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of successProperty
    * @returns any
    */
  var getSuccessProperty: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of totalProperty
    * @returns any
    */
  var getTotalProperty: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[String] = js.native
  
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.native
  
  /** [Method] Reads the given response object
    * @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
    * @returns Ext.data.ResultSet The parsed ResultSet object
    */
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.native
  
  /** [Method] Abstracts common functionality used by all Reader subclasses
    * @param data Object The raw data object
    * @returns Ext.data.ResultSet A ResultSet object
    */
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IDataReader: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of clientIdProperty
    * @param clientIdProperty String The new value.
    */
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of idProperty
    * @param idProperty String The new value.
    */
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of implicitIncludes
    * @param implicitIncludes Boolean The new value.
    */
  var setImplicitIncludes: js.UndefOr[js.Function1[/* implicitIncludes */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of messageProperty
    * @param messageProperty String The new value.
    */
  var setMessageProperty: js.UndefOr[js.Function1[/* messageProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of model
    * @param model Object The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of rootProperty
    * @param rootProperty String The new value.
    */
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of successProperty
    * @param successProperty String The new value.
    */
  var setSuccessProperty: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of totalProperty
    * @param totalProperty String The new value.
    */
  var setTotalProperty: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[String] = js.native
}
object IDataReader {
  
  @scala.inline
  def apply(): IDataReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataReader]
  }
  
  @scala.inline
  implicit class IDataReaderOps[Self <: IDataReader] (val x: Self) extends AnyVal {
    
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
    def setClientIdProperty(value: String): Self = this.set("clientIdProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIdProperty: Self = this.set("clientIdProperty", js.undefined)
    
    @scala.inline
    def setGetClientIdProperty(value: () => String): Self = this.set("getClientIdProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetClientIdProperty: Self = this.set("getClientIdProperty", js.undefined)
    
    @scala.inline
    def setGetIdProperty(value: () => String): Self = this.set("getIdProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIdProperty: Self = this.set("getIdProperty", js.undefined)
    
    @scala.inline
    def setGetImplicitIncludes(value: () => Boolean): Self = this.set("getImplicitIncludes", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetImplicitIncludes: Self = this.set("getImplicitIncludes", js.undefined)
    
    @scala.inline
    def setGetMessageProperty(value: () => String): Self = this.set("getMessageProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMessageProperty: Self = this.set("getMessageProperty", js.undefined)
    
    @scala.inline
    def setGetModel(value: () => _): Self = this.set("getModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetModel: Self = this.set("getModel", js.undefined)
    
    @scala.inline
    def setGetResponseData(value: /* response */ js.UndefOr[js.Any] => _): Self = this.set("getResponseData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetResponseData: Self = this.set("getResponseData", js.undefined)
    
    @scala.inline
    def setGetRootProperty(value: () => String): Self = this.set("getRootProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRootProperty: Self = this.set("getRootProperty", js.undefined)
    
    @scala.inline
    def setGetSuccessProperty(value: () => _): Self = this.set("getSuccessProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSuccessProperty: Self = this.set("getSuccessProperty", js.undefined)
    
    @scala.inline
    def setGetTotalProperty(value: () => _): Self = this.set("getTotalProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTotalProperty: Self = this.set("getTotalProperty", js.undefined)
    
    @scala.inline
    def setIdProperty(value: String): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdProperty: Self = this.set("idProperty", js.undefined)
    
    @scala.inline
    def setImplicitIncludes(value: Boolean): Self = this.set("implicitIncludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitIncludes: Self = this.set("implicitIncludes", js.undefined)
    
    @scala.inline
    def setMessageProperty(value: String): Self = this.set("messageProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageProperty: Self = this.set("messageProperty", js.undefined)
    
    @scala.inline
    def setMetaData(value: js.Any): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    
    @scala.inline
    def setRawData(value: js.Any): Self = this.set("rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawData: Self = this.set("rawData", js.undefined)
    
    @scala.inline
    def setRead(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setReadRecords(value: /* data */ js.UndefOr[js.Any] => IResultSet): Self = this.set("readRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReadRecords: Self = this.set("readRecords", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootProperty(value: String): Self = this.set("rootProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootProperty: Self = this.set("rootProperty", js.undefined)
    
    @scala.inline
    def setSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Unit): Self = this.set("setClientIdProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetClientIdProperty: Self = this.set("setClientIdProperty", js.undefined)
    
    @scala.inline
    def setSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Unit): Self = this.set("setIdProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIdProperty: Self = this.set("setIdProperty", js.undefined)
    
    @scala.inline
    def setSetImplicitIncludes(value: /* implicitIncludes */ js.UndefOr[Boolean] => Unit): Self = this.set("setImplicitIncludes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetImplicitIncludes: Self = this.set("setImplicitIncludes", js.undefined)
    
    @scala.inline
    def setSetMessageProperty(value: /* messageProperty */ js.UndefOr[String] => Unit): Self = this.set("setMessageProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMessageProperty: Self = this.set("setMessageProperty", js.undefined)
    
    @scala.inline
    def setSetModel(value: /* model */ js.UndefOr[js.Any] => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetModel: Self = this.set("setModel", js.undefined)
    
    @scala.inline
    def setSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Unit): Self = this.set("setRootProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRootProperty: Self = this.set("setRootProperty", js.undefined)
    
    @scala.inline
    def setSetSuccessProperty(value: /* successProperty */ js.UndefOr[String] => Unit): Self = this.set("setSuccessProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSuccessProperty: Self = this.set("setSuccessProperty", js.undefined)
    
    @scala.inline
    def setSetTotalProperty(value: /* totalProperty */ js.UndefOr[String] => Unit): Self = this.set("setTotalProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTotalProperty: Self = this.set("setTotalProperty", js.undefined)
    
    @scala.inline
    def setSuccessProperty(value: String): Self = this.set("successProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessProperty: Self = this.set("successProperty", js.undefined)
    
    @scala.inline
    def setTotalProperty(value: String): Self = this.set("totalProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalProperty: Self = this.set("totalProperty", js.undefined)
  }
}

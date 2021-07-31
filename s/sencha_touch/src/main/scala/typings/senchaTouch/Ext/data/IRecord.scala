package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecord
  extends StObject
     with IObservable {
  
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[Array] = js.undefined
  
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.undefined
  
  /** [Method] Usually called by the Ext data Store which owns the model instance
    * @param silent Boolean true to skip notification of the owning store of the change.
    */
  var commit: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Creates a copy clone of this Model instance
    * @param id String A new id. If you don't specify this a new id will be generated for you. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record with a new id
    * @returns Ext.data.Model
    */
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IModel]] = js.undefined
  
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Ends an edit
    * @param silent Boolean true to not notify the store of the change.
    * @param modifiedFieldNames String[] Array of field names changed during edit.
    */
  var endEdit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.undefined
  
  /** [Method] Destroys the record using the configured proxy
    * @param options Object/Function Options to pass to the proxy. Config object for Ext.data.Operation. If you pass a function, this will automatically become the callback method. For convenience the config object may also contain success and failure methods in addition to callback - they will all be invoked with the Model and Operation as arguments.
    * @param scope Object The scope to run your callback method in. This is only used if you passed a function as the first argument.
    * @returns Ext.data.Model The Model instance.
    */
  var erase: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IModel]
  ] = js.undefined
  
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the value of the given field
    * @param fieldName String The field to fetch the value for.
    * @returns Object The value.
    */
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] Gets all of the data from this Models loaded associations
    * @returns Object The nested data set for the Model's loaded associations.
    */
  var getAssociatedData: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of associations
    * @returns Object[]
    */
  var getAssociations: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of belongsTo
    * @returns String/Object/String[]/Object[]
    */
  var getBelongsTo: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or committed
    * @returns Object
    */
  var getChanges: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of clientIdProperty
    * @returns String
    */
  var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns an object containing the data set on this record
    * @param includeAssociated Boolean true to include the associated data.
    * @returns Object The data.
    */
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], js.Any]] = js.undefined
  
  /** [Method] Returns the value of fields
    * @returns Object[]/String[]
    */
  var getFields: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of hasMany
    * @returns String/Object/String[]/Object[]
    */
  var getHasMany: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of hasOne
    * @returns String/Object/String[]/Object[]
    */
  var getHasOne: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of idProperty
    * @returns String
    */
  var getIdProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of identifier
    * @returns Object/String
    */
  var getIdentifier: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns true if the record has been erased on the server  */
  var getIsErased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of proxy
    * @returns Object/Ext.data.Proxy
    */
  var getProxy: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of useCache
    * @returns Boolean
    */
  var getUseCache: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of validations
    * @returns Object[]
    */
  var getValidations: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasOne: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object/String) */
  var identifier: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
    * @param fieldName String Ext.data.Field.name
    * @returns Boolean
    */
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Method] Checks if the model is valid
    * @returns Boolean true if the model is valid.
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] By joining this model to an instance of a class this model will automatically try to call certain template methods o
    * @param store Ext.data.Store The store to which this model has been added.
    */
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object/Ext.data.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
    * @param silent Boolean true to skip notification of the owning store of the change.
    */
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IRecord: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  
  /** [Method] Saves the model instance using the configured proxy
    * @param options Object/Function Options to pass to the proxy. Config object for Ext.data.Operation. If you pass a function, this will automatically become the callback method. For convenience the config object may also contain success and failure methods in addition to callback - they will all be invoked with the Model and Operation as arguments.
    * @param scope Object The scope to run your callback method in. This is only used if you passed a function as the first argument.
    * @returns Ext.data.Model The Model instance
    */
  var save: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IModel]
  ] = js.undefined
  
  /** [Method] Sets the given field to the given value marks the instance as dirty
    * @param fieldName String/Object The field to set, or an object containing key/value pairs.
    * @param value Object The value to set.
    */
  var set: js.UndefOr[
    js.Function2[/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Sets the value of associations
    * @param associations Object[] The new value.
    */
  var setAssociations: js.UndefOr[js.Function1[/* associations */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of belongsTo
    * @param belongsTo String/Object/String[]/Object[] The new value.
    */
  var setBelongsTo: js.UndefOr[js.Function1[/* belongsTo */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of clientIdProperty
    * @param clientIdProperty String The new value.
    */
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] This sets the data directly without converting and applying default values
    * @param data Object
    * @returns Ext.data.Model This Record.
    */
  var setConvertedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IModel]] = js.undefined
  
  /** [Method] This method is used to set the data for this Record instance
    * @param rawData Object
    * @returns Ext.data.Model This record.
    */
  var setData: js.UndefOr[js.Function1[/* rawData */ js.UndefOr[js.Any], IModel]] = js.undefined
  
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Updates the collection of Fields that all instances of this Model use
    * @param fields Array
    * @returns any
    */
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], js.Any]] = js.undefined
  
  /** [Method] Sets the value of hasMany
    * @param hasMany String/Object/String[]/Object[] The new value.
    */
  var setHasMany: js.UndefOr[js.Function1[/* hasMany */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of hasOne
    * @param hasOne String/Object/String[]/Object[] The new value.
    */
  var setHasOne: js.UndefOr[js.Function1[/* hasOne */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the model instance s id field to the given id
    * @param id Number/String The new id
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of idProperty
    * @param idProperty String The new value.
    */
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of identifier
    * @param identifier Object/String The new value.
    */
  var setIdentifier: js.UndefOr[js.Function1[/* identifier */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of proxy
    * @param proxy Object/Ext.data.Proxy The new value.
    */
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of useCache
    * @param useCache Boolean The new value.
    */
  var setUseCache: js.UndefOr[js.Function1[/* useCache */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of validations
    * @param validations Object[] The new value.
    */
  var setValidations: js.UndefOr[js.Function1[/* validations */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Property] (Array) */
  var stores: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns a url suitable string for this model instance
    * @returns String The url string for this model instance.
    */
  var toUrl: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] This un joins this record from an instance of a class
    * @param store Ext.data.Store The store from which this model has been removed.
    */
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useCache: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Validates the current data against all of its configured validations
    * @returns Ext.data.Errors The errors object.
    */
  var validate: js.UndefOr[js.Function0[IErrors]] = js.undefined
  
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[Array] = js.undefined
}
object IRecord {
  
  @scala.inline
  def apply(): IRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecord]
  }
  
  @scala.inline
  implicit class IRecordMutableBuilder[Self <: IRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: Array): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    @scala.inline
    def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
    
    @scala.inline
    def setBelongsTo(value: js.Any): Self = StObject.set(x, "belongsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBelongsToUndefined: Self = StObject.set(x, "belongsTo", js.undefined)
    
    @scala.inline
    def setCancelEdit(value: () => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
    
    @scala.inline
    def setClientIdProperty(value: String): Self = StObject.set(x, "clientIdProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdPropertyUndefined: Self = StObject.set(x, "clientIdProperty", js.undefined)
    
    @scala.inline
    def setCommit(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    @scala.inline
    def setCopy(value: /* id */ js.UndefOr[String] => IModel): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    @scala.inline
    def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    @scala.inline
    def setEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
    
    @scala.inline
    def setErase(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel): Self = StObject.set(x, "erase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEraseUndefined: Self = StObject.set(x, "erase", js.undefined)
    
    @scala.inline
    def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setGet(value: /* fieldName */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAssociatedData(value: () => js.Any): Self = StObject.set(x, "getAssociatedData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAssociatedDataUndefined: Self = StObject.set(x, "getAssociatedData", js.undefined)
    
    @scala.inline
    def setGetAssociations(value: () => Array): Self = StObject.set(x, "getAssociations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAssociationsUndefined: Self = StObject.set(x, "getAssociations", js.undefined)
    
    @scala.inline
    def setGetBelongsTo(value: () => js.Any): Self = StObject.set(x, "getBelongsTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBelongsToUndefined: Self = StObject.set(x, "getBelongsTo", js.undefined)
    
    @scala.inline
    def setGetChanges(value: () => js.Any): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChangesUndefined: Self = StObject.set(x, "getChanges", js.undefined)
    
    @scala.inline
    def setGetClientIdProperty(value: () => String): Self = StObject.set(x, "getClientIdProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientIdPropertyUndefined: Self = StObject.set(x, "getClientIdProperty", js.undefined)
    
    @scala.inline
    def setGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    @scala.inline
    def setGetFields(value: () => js.Any): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
    
    @scala.inline
    def setGetHasMany(value: () => js.Any): Self = StObject.set(x, "getHasMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHasManyUndefined: Self = StObject.set(x, "getHasMany", js.undefined)
    
    @scala.inline
    def setGetHasOne(value: () => js.Any): Self = StObject.set(x, "getHasOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHasOneUndefined: Self = StObject.set(x, "getHasOne", js.undefined)
    
    @scala.inline
    def setGetIdProperty(value: () => String): Self = StObject.set(x, "getIdProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdPropertyUndefined: Self = StObject.set(x, "getIdProperty", js.undefined)
    
    @scala.inline
    def setGetIdentifier(value: () => js.Any): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdentifierUndefined: Self = StObject.set(x, "getIdentifier", js.undefined)
    
    @scala.inline
    def setGetIsErased(value: () => Unit): Self = StObject.set(x, "getIsErased", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsErasedUndefined: Self = StObject.set(x, "getIsErased", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => js.Any): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setGetUseCache(value: () => Boolean): Self = StObject.set(x, "getUseCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseCacheUndefined: Self = StObject.set(x, "getUseCache", js.undefined)
    
    @scala.inline
    def setGetValidations(value: () => Array): Self = StObject.set(x, "getValidations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidationsUndefined: Self = StObject.set(x, "getValidations", js.undefined)
    
    @scala.inline
    def setHasMany(value: js.Any): Self = StObject.set(x, "hasMany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasManyUndefined: Self = StObject.set(x, "hasMany", js.undefined)
    
    @scala.inline
    def setHasOne(value: js.Any): Self = StObject.set(x, "hasOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOneUndefined: Self = StObject.set(x, "hasOne", js.undefined)
    
    @scala.inline
    def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Any): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    @scala.inline
    def setModified(value: js.Any): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setPhantom(value: Boolean): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReject(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setSave(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setSet(value: (/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAssociations(value: /* associations */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setAssociations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAssociationsUndefined: Self = StObject.set(x, "setAssociations", js.undefined)
    
    @scala.inline
    def setSetBelongsTo(value: /* belongsTo */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBelongsTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBelongsToUndefined: Self = StObject.set(x, "setBelongsTo", js.undefined)
    
    @scala.inline
    def setSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setClientIdProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClientIdPropertyUndefined: Self = StObject.set(x, "setClientIdProperty", js.undefined)
    
    @scala.inline
    def setSetConvertedData(value: /* data */ js.UndefOr[js.Any] => IModel): Self = StObject.set(x, "setConvertedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetConvertedDataUndefined: Self = StObject.set(x, "setConvertedData", js.undefined)
    
    @scala.inline
    def setSetData(value: /* rawData */ js.UndefOr[js.Any] => IModel): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    @scala.inline
    def setSetDirty(value: () => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDirtyUndefined: Self = StObject.set(x, "setDirty", js.undefined)
    
    @scala.inline
    def setSetFields(value: /* fields */ js.UndefOr[Array] => js.Any): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
    
    @scala.inline
    def setSetHasMany(value: /* hasMany */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHasMany", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHasManyUndefined: Self = StObject.set(x, "setHasMany", js.undefined)
    
    @scala.inline
    def setSetHasOne(value: /* hasOne */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHasOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHasOneUndefined: Self = StObject.set(x, "setHasOne", js.undefined)
    
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setIdProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdPropertyUndefined: Self = StObject.set(x, "setIdProperty", js.undefined)
    
    @scala.inline
    def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    @scala.inline
    def setSetIdentifier(value: /* identifier */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdentifierUndefined: Self = StObject.set(x, "setIdentifier", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setSetUseCache(value: /* useCache */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseCacheUndefined: Self = StObject.set(x, "setUseCache", js.undefined)
    
    @scala.inline
    def setSetValidations(value: /* validations */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setValidations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValidationsUndefined: Self = StObject.set(x, "setValidations", js.undefined)
    
    @scala.inline
    def setStores(value: Array): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
    
    @scala.inline
    def setToUrl(value: () => String): Self = StObject.set(x, "toUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToUrlUndefined: Self = StObject.set(x, "toUrl", js.undefined)
    
    @scala.inline
    def setUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "unjoin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnjoinUndefined: Self = StObject.set(x, "unjoin", js.undefined)
    
    @scala.inline
    def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    
    @scala.inline
    def setValidate(value: () => IErrors): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValidations(value: Array): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}

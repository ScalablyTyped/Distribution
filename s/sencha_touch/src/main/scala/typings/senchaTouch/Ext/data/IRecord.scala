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
  var belongsTo: js.UndefOr[Any] = js.undefined
  
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
  var erase: js.UndefOr[js.Function2[/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], IModel]] = js.undefined
  
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of the given field
    * @param fieldName String The field to fetch the value for.
    * @returns Object The value.
    */
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Any]] = js.undefined
  
  /** [Method] Gets all of the data from this Models loaded associations
    * @returns Object The nested data set for the Model's loaded associations.
    */
  var getAssociatedData: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of associations
    * @returns Object[]
    */
  var getAssociations: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of belongsTo
    * @returns String/Object/String[]/Object[]
    */
  var getBelongsTo: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or committed
    * @returns Object
    */
  var getChanges: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of clientIdProperty
    * @returns String
    */
  var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns an object containing the data set on this record
    * @param includeAssociated Boolean true to include the associated data.
    * @returns Object The data.
    */
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], Any]] = js.undefined
  
  /** [Method] Returns the value of fields
    * @returns Object[]/String[]
    */
  var getFields: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of hasMany
    * @returns String/Object/String[]/Object[]
    */
  var getHasMany: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of hasOne
    * @returns String/Object/String[]/Object[]
    */
  var getHasOne: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of idProperty
    * @returns String
    */
  var getIdProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of identifier
    * @returns Object/String
    */
  var getIdentifier: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns true if the record has been erased on the server  */
  var getIsErased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of proxy
    * @returns Object/Ext.data.Proxy
    */
  var getProxy: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of useCache
    * @returns Boolean
    */
  var getUseCache: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of validations
    * @returns Object[]
    */
  var getValidations: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasOne: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object/String) */
  var identifier: js.UndefOr[Any] = js.undefined
  
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
  var modified: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object/Ext.data.Proxy) */
  var proxy: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var raw: js.UndefOr[Any] = js.undefined
  
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
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
  ] = js.undefined
  
  /** [Method] Saves the model instance using the configured proxy
    * @param options Object/Function Options to pass to the proxy. Config object for Ext.data.Operation. If you pass a function, this will automatically become the callback method. For convenience the config object may also contain success and failure methods in addition to callback - they will all be invoked with the Model and Operation as arguments.
    * @param scope Object The scope to run your callback method in. This is only used if you passed a function as the first argument.
    * @returns Ext.data.Model The Model instance
    */
  var save: js.UndefOr[js.Function2[/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], IModel]] = js.undefined
  
  /** [Method] Sets the given field to the given value marks the instance as dirty
    * @param fieldName String/Object The field to set, or an object containing key/value pairs.
    * @param value Object The value to set.
    */
  var set: js.UndefOr[js.Function2[/* fieldName */ js.UndefOr[Any], /* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of associations
    * @param associations Object[] The new value.
    */
  var setAssociations: js.UndefOr[js.Function1[/* associations */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of belongsTo
    * @param belongsTo String/Object/String[]/Object[] The new value.
    */
  var setBelongsTo: js.UndefOr[js.Function1[/* belongsTo */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of clientIdProperty
    * @param clientIdProperty String The new value.
    */
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] This sets the data directly without converting and applying default values
    * @param data Object
    * @returns Ext.data.Model This Record.
    */
  var setConvertedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], IModel]] = js.undefined
  
  /** [Method] This method is used to set the data for this Record instance
    * @param rawData Object
    * @returns Ext.data.Model This record.
    */
  var setData: js.UndefOr[js.Function1[/* rawData */ js.UndefOr[Any], IModel]] = js.undefined
  
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Updates the collection of Fields that all instances of this Model use
    * @param fields Array
    * @returns any
    */
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Any]] = js.undefined
  
  /** [Method] Sets the value of hasMany
    * @param hasMany String/Object/String[]/Object[] The new value.
    */
  var setHasMany: js.UndefOr[js.Function1[/* hasMany */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of hasOne
    * @param hasOne String/Object/String[]/Object[] The new value.
    */
  var setHasOne: js.UndefOr[js.Function1[/* hasOne */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the model instance s id field to the given id
    * @param id Number/String The new id
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of idProperty
    * @param idProperty String The new value.
    */
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of identifier
    * @param identifier Object/String The new value.
    */
  var setIdentifier: js.UndefOr[js.Function1[/* identifier */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of proxy
    * @param proxy Object/Ext.data.Proxy The new value.
    */
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  
  inline def apply(): IRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRecord] (val x: Self) extends AnyVal {
    
    inline def setAssociations(value: Array): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
    
    inline def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
    
    inline def setBelongsTo(value: Any): Self = StObject.set(x, "belongsTo", value.asInstanceOf[js.Any])
    
    inline def setBelongsToUndefined: Self = StObject.set(x, "belongsTo", js.undefined)
    
    inline def setCancelEdit(value: () => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction0(value))
    
    inline def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
    
    inline def setClientIdProperty(value: String): Self = StObject.set(x, "clientIdProperty", value.asInstanceOf[js.Any])
    
    inline def setClientIdPropertyUndefined: Self = StObject.set(x, "clientIdProperty", js.undefined)
    
    inline def setCommit(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
    
    inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    inline def setCopy(value: /* id */ js.UndefOr[String] => IModel): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction2(value))
    
    inline def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
    
    inline def setErase(value: (/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => IModel): Self = StObject.set(x, "erase", js.Any.fromFunction2(value))
    
    inline def setEraseUndefined: Self = StObject.set(x, "erase", js.undefined)
    
    inline def setFields(value: Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setGet(value: /* fieldName */ js.UndefOr[String] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAssociatedData(value: () => Any): Self = StObject.set(x, "getAssociatedData", js.Any.fromFunction0(value))
    
    inline def setGetAssociatedDataUndefined: Self = StObject.set(x, "getAssociatedData", js.undefined)
    
    inline def setGetAssociations(value: () => Array): Self = StObject.set(x, "getAssociations", js.Any.fromFunction0(value))
    
    inline def setGetAssociationsUndefined: Self = StObject.set(x, "getAssociations", js.undefined)
    
    inline def setGetBelongsTo(value: () => Any): Self = StObject.set(x, "getBelongsTo", js.Any.fromFunction0(value))
    
    inline def setGetBelongsToUndefined: Self = StObject.set(x, "getBelongsTo", js.undefined)
    
    inline def setGetChanges(value: () => Any): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
    
    inline def setGetChangesUndefined: Self = StObject.set(x, "getChanges", js.undefined)
    
    inline def setGetClientIdProperty(value: () => String): Self = StObject.set(x, "getClientIdProperty", js.Any.fromFunction0(value))
    
    inline def setGetClientIdPropertyUndefined: Self = StObject.set(x, "getClientIdProperty", js.undefined)
    
    inline def setGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setGetFields(value: () => Any): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
    
    inline def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
    
    inline def setGetHasMany(value: () => Any): Self = StObject.set(x, "getHasMany", js.Any.fromFunction0(value))
    
    inline def setGetHasManyUndefined: Self = StObject.set(x, "getHasMany", js.undefined)
    
    inline def setGetHasOne(value: () => Any): Self = StObject.set(x, "getHasOne", js.Any.fromFunction0(value))
    
    inline def setGetHasOneUndefined: Self = StObject.set(x, "getHasOne", js.undefined)
    
    inline def setGetIdProperty(value: () => String): Self = StObject.set(x, "getIdProperty", js.Any.fromFunction0(value))
    
    inline def setGetIdPropertyUndefined: Self = StObject.set(x, "getIdProperty", js.undefined)
    
    inline def setGetIdentifier(value: () => Any): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction0(value))
    
    inline def setGetIdentifierUndefined: Self = StObject.set(x, "getIdentifier", js.undefined)
    
    inline def setGetIsErased(value: () => Unit): Self = StObject.set(x, "getIsErased", js.Any.fromFunction0(value))
    
    inline def setGetIsErasedUndefined: Self = StObject.set(x, "getIsErased", js.undefined)
    
    inline def setGetProxy(value: () => Any): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setGetUseCache(value: () => Boolean): Self = StObject.set(x, "getUseCache", js.Any.fromFunction0(value))
    
    inline def setGetUseCacheUndefined: Self = StObject.set(x, "getUseCache", js.undefined)
    
    inline def setGetValidations(value: () => Array): Self = StObject.set(x, "getValidations", js.Any.fromFunction0(value))
    
    inline def setGetValidationsUndefined: Self = StObject.set(x, "getValidations", js.undefined)
    
    inline def setHasMany(value: Any): Self = StObject.set(x, "hasMany", value.asInstanceOf[js.Any])
    
    inline def setHasManyUndefined: Self = StObject.set(x, "hasMany", js.undefined)
    
    inline def setHasOne(value: Any): Self = StObject.set(x, "hasOne", value.asInstanceOf[js.Any])
    
    inline def setHasOneUndefined: Self = StObject.set(x, "hasOne", js.undefined)
    
    inline def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
    
    inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    
    inline def setIdentifier(value: Any): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction1(value))
    
    inline def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setModified(value: Any): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setPhantom(value: Boolean): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
    
    inline def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
    
    inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReject(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setSave(value: (/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => IModel): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSet(value: (/* fieldName */ js.UndefOr[Any], /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetAssociations(value: /* associations */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setAssociations", js.Any.fromFunction1(value))
    
    inline def setSetAssociationsUndefined: Self = StObject.set(x, "setAssociations", js.undefined)
    
    inline def setSetBelongsTo(value: /* belongsTo */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBelongsTo", js.Any.fromFunction1(value))
    
    inline def setSetBelongsToUndefined: Self = StObject.set(x, "setBelongsTo", js.undefined)
    
    inline def setSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setClientIdProperty", js.Any.fromFunction1(value))
    
    inline def setSetClientIdPropertyUndefined: Self = StObject.set(x, "setClientIdProperty", js.undefined)
    
    inline def setSetConvertedData(value: /* data */ js.UndefOr[Any] => IModel): Self = StObject.set(x, "setConvertedData", js.Any.fromFunction1(value))
    
    inline def setSetConvertedDataUndefined: Self = StObject.set(x, "setConvertedData", js.undefined)
    
    inline def setSetData(value: /* rawData */ js.UndefOr[Any] => IModel): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    inline def setSetDirty(value: () => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction0(value))
    
    inline def setSetDirtyUndefined: Self = StObject.set(x, "setDirty", js.undefined)
    
    inline def setSetFields(value: /* fields */ js.UndefOr[Array] => Any): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
    
    inline def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
    
    inline def setSetHasMany(value: /* hasMany */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHasMany", js.Any.fromFunction1(value))
    
    inline def setSetHasManyUndefined: Self = StObject.set(x, "setHasMany", js.undefined)
    
    inline def setSetHasOne(value: /* hasOne */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHasOne", js.Any.fromFunction1(value))
    
    inline def setSetHasOneUndefined: Self = StObject.set(x, "setHasOne", js.undefined)
    
    inline def setSetId(value: /* id */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setIdProperty", js.Any.fromFunction1(value))
    
    inline def setSetIdPropertyUndefined: Self = StObject.set(x, "setIdProperty", js.undefined)
    
    inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    inline def setSetIdentifier(value: /* identifier */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setIdentifier", js.Any.fromFunction1(value))
    
    inline def setSetIdentifierUndefined: Self = StObject.set(x, "setIdentifier", js.undefined)
    
    inline def setSetProxy(value: /* proxy */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    inline def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setSetUseCache(value: /* useCache */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseCache", js.Any.fromFunction1(value))
    
    inline def setSetUseCacheUndefined: Self = StObject.set(x, "setUseCache", js.undefined)
    
    inline def setSetValidations(value: /* validations */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setValidations", js.Any.fromFunction1(value))
    
    inline def setSetValidationsUndefined: Self = StObject.set(x, "setValidations", js.undefined)
    
    inline def setStores(value: Array): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    
    inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
    
    inline def setToUrl(value: () => String): Self = StObject.set(x, "toUrl", js.Any.fromFunction0(value))
    
    inline def setToUrlUndefined: Self = StObject.set(x, "toUrl", js.undefined)
    
    inline def setUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "unjoin", js.Any.fromFunction1(value))
    
    inline def setUnjoinUndefined: Self = StObject.set(x, "unjoin", js.undefined)
    
    inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    
    inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    
    inline def setValidate(value: () => IErrors): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValidations(value: Array): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}

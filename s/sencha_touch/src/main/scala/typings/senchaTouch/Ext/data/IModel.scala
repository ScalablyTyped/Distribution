package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModel extends IObservable {
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[Array] = js.native
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.native
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.native
  /** [Method] Usually called by the Ext data Store which owns the model instance
    * @param silent Boolean true to skip notification of the owning store of the change.
    */
  var commit: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Creates a copy clone of this Model instance
    * @param id String A new id. If you don't specify this a new id will be generated for you. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record with a new id
    * @returns Ext.data.Model
    */
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], this.type]] = js.native
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.native
  /** [Method] Ends an edit
    * @param silent Boolean true to not notify the store of the change.
    * @param modifiedFieldNames String[] Array of field names changed during edit.
    */
  var endEdit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.native
  /** [Method] Destroys the record using the configured proxy
    * @param options Object/Function Options to pass to the proxy. Config object for Ext.data.Operation. If you pass a function, this will automatically become the callback method. For convenience the config object may also contain success and failure methods in addition to callback - they will all be invoked with the Model and Operation as arguments.
    * @param scope Object The scope to run your callback method in. This is only used if you passed a function as the first argument.
    * @returns Ext.data.Model The Model instance.
    */
  var erase: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of the given field
    * @param fieldName String The field to fetch the value for.
    * @returns Object The value.
    */
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], _]] = js.native
  /** [Method] Gets all of the data from this Models loaded associations
    * @returns Object The nested data set for the Model's loaded associations.
    */
  var getAssociatedData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of associations
    * @returns Object[]
    */
  var getAssociations: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of belongsTo
    * @returns String/Object/String[]/Object[]
    */
  var getBelongsTo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or committed
    * @returns Object
    */
  var getChanges: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of clientIdProperty
    * @returns String
    */
  var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns an object containing the data set on this record
    * @param includeAssociated Boolean true to include the associated data.
    * @returns Object The data.
    */
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Returns the value of fields
    * @returns Object[]/String[]
    */
  var getFields: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hasMany
    * @returns String/Object/String[]/Object[]
    */
  var getHasMany: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hasOne
    * @returns String/Object/String[]/Object[]
    */
  var getHasOne: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of idProperty
    * @returns String
    */
  var getIdProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of identifier
    * @returns Object/String
    */
  var getIdentifier: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns true if the record has been erased on the server  */
  var getIsErased: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of proxy
    * @returns Object/Ext.data.Proxy
    */
  var getProxy: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of useCache
    * @returns Boolean
    */
  var getUseCache: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of validations
    * @returns Object[]
    */
  var getValidations: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasOne: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  /** [Config Option] (Object/String) */
  var identifier: js.UndefOr[js.Any] = js.native
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
    * @param fieldName String Ext.data.Field.name
    * @returns Boolean
    */
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Checks if the model is valid
    * @returns Boolean true if the model is valid.
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] By joining this model to an instance of a class this model will automatically try to call certain template methods o
    * @param store Ext.data.Store The store to which this model has been added.
    */
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Ext.data.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.native
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
    * @param silent Boolean true to skip notification of the owning store of the change.
    */
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IModel: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Saves the model instance using the configured proxy
    * @param options Object/Function Options to pass to the proxy. Config object for Ext.data.Operation. If you pass a function, this will automatically become the callback method. For convenience the config object may also contain success and failure methods in addition to callback - they will all be invoked with the Model and Operation as arguments.
    * @param scope Object The scope to run your callback method in. This is only used if you passed a function as the first argument.
    * @returns Ext.data.Model The Model instance
    */
  var save: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Sets the given field to the given value marks the instance as dirty
    * @param fieldName String/Object The field to set, or an object containing key/value pairs.
    * @param value Object The value to set.
    */
  var set: js.UndefOr[
    js.Function2[/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the value of associations
    * @param associations Object[] The new value.
    */
  var setAssociations: js.UndefOr[js.Function1[/* associations */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of belongsTo
    * @param belongsTo String/Object/String[]/Object[] The new value.
    */
  var setBelongsTo: js.UndefOr[js.Function1[/* belongsTo */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of clientIdProperty
    * @param clientIdProperty String The new value.
    */
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] This sets the data directly without converting and applying default values
    * @param data Object
    * @returns Ext.data.Model This Record.
    */
  var setConvertedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] This method is used to set the data for this Record instance
    * @param rawData Object
    * @returns Ext.data.Model This record.
    */
  var setData: js.UndefOr[js.Function1[/* rawData */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the collection of Fields that all instances of this Model use
    * @param fields Array
    * @returns any
    */
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], _]] = js.native
  /** [Method] Sets the value of hasMany
    * @param hasMany String/Object/String[]/Object[] The new value.
    */
  var setHasMany: js.UndefOr[js.Function1[/* hasMany */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hasOne
    * @param hasOne String/Object/String[]/Object[] The new value.
    */
  var setHasOne: js.UndefOr[js.Function1[/* hasOne */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the model instance s id field to the given id
    * @param id Number/String The new id
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of idProperty
    * @param idProperty String The new value.
    */
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of identifier
    * @param identifier Object/String The new value.
    */
  var setIdentifier: js.UndefOr[js.Function1[/* identifier */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of proxy
    * @param proxy Object/Ext.data.Proxy The new value.
    */
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of useCache
    * @param useCache Boolean The new value.
    */
  var setUseCache: js.UndefOr[js.Function1[/* useCache */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of validations
    * @param validations Object[] The new value.
    */
  var setValidations: js.UndefOr[js.Function1[/* validations */ js.UndefOr[Array], Unit]] = js.native
  /** [Property] (Array) */
  var stores: js.UndefOr[Array] = js.native
  /** [Method] Returns a url suitable string for this model instance
    * @returns String The url string for this model instance.
    */
  var toUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] This un joins this record from an instance of a class
    * @param store Ext.data.Store The store from which this model has been removed.
    */
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useCache: js.UndefOr[Boolean] = js.native
  /** [Method] Validates the current data against all of its configured validations
    * @returns Ext.data.Errors The errors object.
    */
  var validate: js.UndefOr[js.Function0[IErrors]] = js.native
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[Array] = js.native
}

object IModel {
  @scala.inline
  def apply(): IModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
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
    def setAssociations(value: Array): Self = this.set("associations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociations: Self = this.set("associations", js.undefined)
    @scala.inline
    def setBeginEdit(value: () => Unit): Self = this.set("beginEdit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeginEdit: Self = this.set("beginEdit", js.undefined)
    @scala.inline
    def setBelongsTo(value: js.Any): Self = this.set("belongsTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBelongsTo: Self = this.set("belongsTo", js.undefined)
    @scala.inline
    def setCancelEdit(value: () => Unit): Self = this.set("cancelEdit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancelEdit: Self = this.set("cancelEdit", js.undefined)
    @scala.inline
    def setClientIdProperty(value: String): Self = this.set("clientIdProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientIdProperty: Self = this.set("clientIdProperty", js.undefined)
    @scala.inline
    def setCommit(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("commit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setCopy(value: /* id */ js.UndefOr[String] => IModel): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    @scala.inline
    def setEditing(value: Boolean): Self = this.set("editing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    @scala.inline
    def setEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = this.set("endEdit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEndEdit: Self = this.set("endEdit", js.undefined)
    @scala.inline
    def setErase(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel): Self = this.set("erase", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErase: Self = this.set("erase", js.undefined)
    @scala.inline
    def setFields(value: js.Any): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGet(value: /* fieldName */ js.UndefOr[String] => _): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetAssociatedData(value: () => _): Self = this.set("getAssociatedData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAssociatedData: Self = this.set("getAssociatedData", js.undefined)
    @scala.inline
    def setGetAssociations(value: () => Array): Self = this.set("getAssociations", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAssociations: Self = this.set("getAssociations", js.undefined)
    @scala.inline
    def setGetBelongsTo(value: () => _): Self = this.set("getBelongsTo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBelongsTo: Self = this.set("getBelongsTo", js.undefined)
    @scala.inline
    def setGetChanges(value: () => _): Self = this.set("getChanges", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetChanges: Self = this.set("getChanges", js.undefined)
    @scala.inline
    def setGetClientIdProperty(value: () => String): Self = this.set("getClientIdProperty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetClientIdProperty: Self = this.set("getClientIdProperty", js.undefined)
    @scala.inline
    def setGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => _): Self = this.set("getData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    @scala.inline
    def setGetFields(value: () => _): Self = this.set("getFields", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFields: Self = this.set("getFields", js.undefined)
    @scala.inline
    def setGetHasMany(value: () => _): Self = this.set("getHasMany", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHasMany: Self = this.set("getHasMany", js.undefined)
    @scala.inline
    def setGetHasOne(value: () => _): Self = this.set("getHasOne", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHasOne: Self = this.set("getHasOne", js.undefined)
    @scala.inline
    def setGetIdProperty(value: () => String): Self = this.set("getIdProperty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIdProperty: Self = this.set("getIdProperty", js.undefined)
    @scala.inline
    def setGetIdentifier(value: () => _): Self = this.set("getIdentifier", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIdentifier: Self = this.set("getIdentifier", js.undefined)
    @scala.inline
    def setGetIsErased(value: () => Unit): Self = this.set("getIsErased", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIsErased: Self = this.set("getIsErased", js.undefined)
    @scala.inline
    def setGetProxy(value: () => _): Self = this.set("getProxy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    @scala.inline
    def setGetUseCache(value: () => Boolean): Self = this.set("getUseCache", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseCache: Self = this.set("getUseCache", js.undefined)
    @scala.inline
    def setGetValidations(value: () => Array): Self = this.set("getValidations", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValidations: Self = this.set("getValidations", js.undefined)
    @scala.inline
    def setHasMany(value: js.Any): Self = this.set("hasMany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMany: Self = this.set("hasMany", js.undefined)
    @scala.inline
    def setHasOne(value: js.Any): Self = this.set("hasOne", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasOne: Self = this.set("hasOne", js.undefined)
    @scala.inline
    def setIdProperty(value: String): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdProperty: Self = this.set("idProperty", js.undefined)
    @scala.inline
    def setIdentifier(value: js.Any): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = this.set("isModified", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsModified: Self = this.set("isModified", js.undefined)
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("join", js.Any.fromFunction1(value))
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setModified(value: js.Any): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    @scala.inline
    def setPhantom(value: Boolean): Self = this.set("phantom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhantom: Self = this.set("phantom", js.undefined)
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setReject(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReject: Self = this.set("reject", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setSave(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel): Self = this.set("save", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setSet(value: (/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSetAssociations(value: /* associations */ js.UndefOr[Array] => Unit): Self = this.set("setAssociations", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAssociations: Self = this.set("setAssociations", js.undefined)
    @scala.inline
    def setSetBelongsTo(value: /* belongsTo */ js.UndefOr[js.Any] => Unit): Self = this.set("setBelongsTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBelongsTo: Self = this.set("setBelongsTo", js.undefined)
    @scala.inline
    def setSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Unit): Self = this.set("setClientIdProperty", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetClientIdProperty: Self = this.set("setClientIdProperty", js.undefined)
    @scala.inline
    def setSetConvertedData(value: /* data */ js.UndefOr[js.Any] => IModel): Self = this.set("setConvertedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetConvertedData: Self = this.set("setConvertedData", js.undefined)
    @scala.inline
    def setSetData(value: /* rawData */ js.UndefOr[js.Any] => IModel): Self = this.set("setData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    @scala.inline
    def setSetDirty(value: () => Unit): Self = this.set("setDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetDirty: Self = this.set("setDirty", js.undefined)
    @scala.inline
    def setSetFields(value: /* fields */ js.UndefOr[Array] => _): Self = this.set("setFields", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFields: Self = this.set("setFields", js.undefined)
    @scala.inline
    def setSetHasMany(value: /* hasMany */ js.UndefOr[js.Any] => Unit): Self = this.set("setHasMany", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHasMany: Self = this.set("setHasMany", js.undefined)
    @scala.inline
    def setSetHasOne(value: /* hasOne */ js.UndefOr[js.Any] => Unit): Self = this.set("setHasOne", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHasOne: Self = this.set("setHasOne", js.undefined)
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetId: Self = this.set("setId", js.undefined)
    @scala.inline
    def setSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Unit): Self = this.set("setIdProperty", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIdProperty: Self = this.set("setIdProperty", js.undefined)
    @scala.inline
    def setSetIdentifier(value: /* identifier */ js.UndefOr[js.Any] => Unit): Self = this.set("setIdentifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIdentifier: Self = this.set("setIdentifier", js.undefined)
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => Unit): Self = this.set("setProxy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetProxy: Self = this.set("setProxy", js.undefined)
    @scala.inline
    def setSetUseCache(value: /* useCache */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseCache", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseCache: Self = this.set("setUseCache", js.undefined)
    @scala.inline
    def setSetValidations(value: /* validations */ js.UndefOr[Array] => Unit): Self = this.set("setValidations", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValidations: Self = this.set("setValidations", js.undefined)
    @scala.inline
    def setStores(value: Array): Self = this.set("stores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStores: Self = this.set("stores", js.undefined)
    @scala.inline
    def setToUrl(value: () => String): Self = this.set("toUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToUrl: Self = this.set("toUrl", js.undefined)
    @scala.inline
    def setUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("unjoin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnjoin: Self = this.set("unjoin", js.undefined)
    @scala.inline
    def setUseCache(value: Boolean): Self = this.set("useCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCache: Self = this.set("useCache", js.undefined)
    @scala.inline
    def setValidate(value: () => IErrors): Self = this.set("validate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidations(value: Array): Self = this.set("validations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidations: Self = this.set("validations", js.undefined)
  }
  
}


package typings.senchaUnderscoreTouch.Ext.data

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRecord extends IObservable {
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[Array] = js.undefined
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Usually called by the Ext data Store which owns the model instance
  		* @param silent Boolean true to skip notification of the owning store of the change.
  		*/
  var commit: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Creates a copy clone of this Model instance
  		* @param id String A new id. If you don't specify this a new id will be generated for you. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record with a new id
  		* @returns Ext.data.Model
  		*/
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IModel]] = js.undefined
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
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets all of the data from this Models loaded associations
  		* @returns Object The nested data set for the Model's loaded associations.
  		*/
  var getAssociatedData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of associations
  		* @returns Object[]
  		*/
  var getAssociations: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of belongsTo
  		* @returns String/Object/String[]/Object[]
  		*/
  var getBelongsTo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or committed
  		* @returns Object
  		*/
  var getChanges: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of clientIdProperty
  		* @returns String
  		*/
  var getClientIdProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns an object containing the data set on this record
  		* @param includeAssociated Boolean true to include the associated data.
  		* @returns Object The data.
  		*/
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Object[]/String[]
  		*/
  var getFields: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hasMany
  		* @returns String/Object/String[]/Object[]
  		*/
  var getHasMany: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hasOne
  		* @returns String/Object/String[]/Object[]
  		*/
  var getHasOne: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of idProperty
  		* @returns String
  		*/
  var getIdProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of identifier
  		* @returns Object/String
  		*/
  var getIdentifier: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns true if the record has been erased on the server  */
  var getIsErased: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns Object/Ext.data.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[_]] = js.undefined
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
  var idProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object/String) */
  var identifier: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
  		* @param fieldName String Ext.data.Field.name
  		* @returns Boolean
  		*/
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
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
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[java.lang.String], Unit]] = js.undefined
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
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], _]] = js.undefined
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
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[java.lang.String], Unit]] = js.undefined
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
  var toUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
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
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    associations: Array = null,
    beginEdit: () => Unit = null,
    belongsTo: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    cancelEdit: () => Unit = null,
    clearListeners: () => Unit = null,
    clientIdProperty: java.lang.String = null,
    commit: /* silent */ js.UndefOr[Boolean] => Unit = null,
    config: js.Any = null,
    copy: /* id */ js.UndefOr[java.lang.String] => IModel = null,
    destroy: () => Unit = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    endEdit: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit = null,
    erase: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel = null,
    extend: java.lang.String = null,
    fields: js.Any = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    get: /* fieldName */ js.UndefOr[java.lang.String] => _ = null,
    getAssociatedData: () => _ = null,
    getAssociations: () => Array = null,
    getBelongsTo: () => _ = null,
    getBubbleEvents: () => _ = null,
    getChanges: () => _ = null,
    getClientIdProperty: () => java.lang.String = null,
    getData: /* includeAssociated */ js.UndefOr[Boolean] => _ = null,
    getFields: () => _ = null,
    getHasMany: () => _ = null,
    getHasOne: () => _ = null,
    getId: () => _ = null,
    getIdProperty: () => java.lang.String = null,
    getIdentifier: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getIsErased: () => Unit = null,
    getListeners: () => _ = null,
    getProxy: () => _ = null,
    getUseCache: () => Boolean = null,
    getValidations: () => Array = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasMany: js.Any = null,
    hasOne: js.Any = null,
    idProperty: java.lang.String = null,
    identifier: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isModified: /* fieldName */ js.UndefOr[java.lang.String] => Boolean = null,
    isValid: () => Boolean = null,
    join: /* store */ js.UndefOr[IStore] => Unit = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    modified: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    phantom: js.UndefOr[Boolean] = js.undefined,
    platformConfig: js.Any = null,
    proxy: js.Any = null,
    raw: js.Any = null,
    reject: /* silent */ js.UndefOr[Boolean] => Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    save: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel = null,
    self: IClass = null,
    set: (/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit = null,
    setAssociations: /* associations */ js.UndefOr[Array] => Unit = null,
    setBelongsTo: /* belongsTo */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setClientIdProperty: /* clientIdProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setConvertedData: /* data */ js.UndefOr[js.Any] => IModel = null,
    setData: /* rawData */ js.UndefOr[js.Any] => IModel = null,
    setDirty: () => Unit = null,
    setFields: /* fields */ js.UndefOr[Array] => _ = null,
    setHasMany: /* hasMany */ js.UndefOr[js.Any] => Unit = null,
    setHasOne: /* hasOne */ js.UndefOr[js.Any] => Unit = null,
    setId: /* id */ js.UndefOr[js.Any] => Unit = null,
    setIdProperty: /* idProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setIdentifier: /* identifier */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => Unit = null,
    setUseCache: /* useCache */ js.UndefOr[Boolean] => Unit = null,
    setValidations: /* validations */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stores: Array = null,
    suspendEvents: () => Unit = null,
    toUrl: () => java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unjoin: /* store */ js.UndefOr[IStore] => Unit = null,
    useCache: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null,
    validate: () => IErrors = null,
    validations: Array = null
  ): IRecord = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction0(beginEdit))
    if (belongsTo != null) __obj.updateDynamic("belongsTo")(belongsTo.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(js.Any.fromFunction0(cancelEdit))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1(copy))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction2(endEdit))
    if (erase != null) __obj.updateDynamic("erase")(js.Any.fromFunction2(erase))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getAssociatedData != null) __obj.updateDynamic("getAssociatedData")(js.Any.fromFunction0(getAssociatedData))
    if (getAssociations != null) __obj.updateDynamic("getAssociations")(js.Any.fromFunction0(getAssociations))
    if (getBelongsTo != null) __obj.updateDynamic("getBelongsTo")(js.Any.fromFunction0(getBelongsTo))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getChanges != null) __obj.updateDynamic("getChanges")(js.Any.fromFunction0(getChanges))
    if (getClientIdProperty != null) __obj.updateDynamic("getClientIdProperty")(js.Any.fromFunction0(getClientIdProperty))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1(getData))
    if (getFields != null) __obj.updateDynamic("getFields")(js.Any.fromFunction0(getFields))
    if (getHasMany != null) __obj.updateDynamic("getHasMany")(js.Any.fromFunction0(getHasMany))
    if (getHasOne != null) __obj.updateDynamic("getHasOne")(js.Any.fromFunction0(getHasOne))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getIdProperty != null) __obj.updateDynamic("getIdProperty")(js.Any.fromFunction0(getIdProperty))
    if (getIdentifier != null) __obj.updateDynamic("getIdentifier")(js.Any.fromFunction0(getIdentifier))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getIsErased != null) __obj.updateDynamic("getIsErased")(js.Any.fromFunction0(getIsErased))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getUseCache != null) __obj.updateDynamic("getUseCache")(js.Any.fromFunction0(getUseCache))
    if (getValidations != null) __obj.updateDynamic("getValidations")(js.Any.fromFunction0(getValidations))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasMany != null) __obj.updateDynamic("hasMany")(hasMany.asInstanceOf[js.Any])
    if (hasOne != null) __obj.updateDynamic("hasOne")(hasOne.asInstanceOf[js.Any])
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isModified != null) __obj.updateDynamic("isModified")(js.Any.fromFunction1(isModified))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (join != null) __obj.updateDynamic("join")(js.Any.fromFunction1(join))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (!js.isUndefined(phantom)) __obj.updateDynamic("phantom")(phantom.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1(reject))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction2(save))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    if (setAssociations != null) __obj.updateDynamic("setAssociations")(js.Any.fromFunction1(setAssociations))
    if (setBelongsTo != null) __obj.updateDynamic("setBelongsTo")(js.Any.fromFunction1(setBelongsTo))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setClientIdProperty != null) __obj.updateDynamic("setClientIdProperty")(js.Any.fromFunction1(setClientIdProperty))
    if (setConvertedData != null) __obj.updateDynamic("setConvertedData")(js.Any.fromFunction1(setConvertedData))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDirty != null) __obj.updateDynamic("setDirty")(js.Any.fromFunction0(setDirty))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1(setFields))
    if (setHasMany != null) __obj.updateDynamic("setHasMany")(js.Any.fromFunction1(setHasMany))
    if (setHasOne != null) __obj.updateDynamic("setHasOne")(js.Any.fromFunction1(setHasOne))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1(setId))
    if (setIdProperty != null) __obj.updateDynamic("setIdProperty")(js.Any.fromFunction1(setIdProperty))
    if (setIdentifier != null) __obj.updateDynamic("setIdentifier")(js.Any.fromFunction1(setIdentifier))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (setUseCache != null) __obj.updateDynamic("setUseCache")(js.Any.fromFunction1(setUseCache))
    if (setValidations != null) __obj.updateDynamic("setValidations")(js.Any.fromFunction1(setValidations))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (toUrl != null) __obj.updateDynamic("toUrl")(js.Any.fromFunction0(toUrl))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (unjoin != null) __obj.updateDynamic("unjoin")(js.Any.fromFunction1(unjoin))
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (validations != null) __obj.updateDynamic("validations")(validations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecord]
  }
}


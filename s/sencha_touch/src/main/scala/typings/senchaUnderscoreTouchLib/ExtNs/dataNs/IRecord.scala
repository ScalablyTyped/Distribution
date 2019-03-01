package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRecord
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Usually called by the Ext data Store which owns the model instance
  		* @param silent Boolean true to skip notification of the owning store of the change.
  		*/
  var commit: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Creates a copy clone of this Model instance
  		* @param id String A new id. If you don't specify this a new id will be generated for you. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record with a new id
  		* @returns Ext.data.Model
  		*/
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IModel]] = js.undefined
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Ends an edit
  		* @param silent Boolean true to not notify the store of the change.
  		* @param modifiedFieldNames String[] Array of field names changed during edit.
  		*/
  var endEdit: js.UndefOr[
    js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ]
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
  var getAssociations: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
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
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[scala.Boolean], _]] = js.undefined
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
  var getIsErased: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns Object/Ext.data.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of useCache
  		* @returns Boolean
  		*/
  var getUseCache: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of validations
  		* @returns Object[]
  		*/
  var getValidations: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
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
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Checks if the model is valid
  		* @returns Boolean true if the model is valid.
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] By joining this model to an instance of a class this model will automatically try to call certain template methods o
  		* @param store Ext.data.Store The store to which this model has been added.
  		*/
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object/Ext.data.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.undefined
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
  		* @param silent Boolean true to skip notification of the owning store of the change.
  		*/
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IRecord: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
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
    js.Function2[/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of associations
  		* @param associations Object[] The new value.
  		*/
  var setAssociations: js.UndefOr[
    js.Function1[/* associations */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of belongsTo
  		* @param belongsTo String/Object/String[]/Object[] The new value.
  		*/
  var setBelongsTo: js.UndefOr[js.Function1[/* belongsTo */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of clientIdProperty
  		* @param clientIdProperty String The new value.
  		*/
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
  var setDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Updates the collection of Fields that all instances of this Model use
  		* @param fields Array
  		* @returns any
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], _]] = js.undefined
  /** [Method] Sets the value of hasMany
  		* @param hasMany String/Object/String[]/Object[] The new value.
  		*/
  var setHasMany: js.UndefOr[js.Function1[/* hasMany */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hasOne
  		* @param hasOne String/Object/String[]/Object[] The new value.
  		*/
  var setHasOne: js.UndefOr[js.Function1[/* hasOne */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the model instance s id field to the given id
  		* @param id Number/String The new id
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of idProperty
  		* @param idProperty String The new value.
  		*/
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of identifier
  		* @param identifier Object/String The new value.
  		*/
  var setIdentifier: js.UndefOr[js.Function1[/* identifier */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of proxy
  		* @param proxy Object/Ext.data.Proxy The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useCache
  		* @param useCache Boolean The new value.
  		*/
  var setUseCache: js.UndefOr[js.Function1[/* useCache */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of validations
  		* @param validations Object[] The new value.
  		*/
  var setValidations: js.UndefOr[
    js.Function1[/* validations */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Property] (Array) */
  var stores: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns a url suitable string for this model instance
  		* @returns String The url string for this model instance.
  		*/
  var toUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] This un joins this record from an instance of a class
  		* @param store Ext.data.Store The store from which this model has been removed.
  		*/
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useCache: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Validates the current data against all of its configured validations
  		* @returns Ext.data.Errors The errors object.
  		*/
  var validate: js.UndefOr[js.Function0[IErrors]] = js.undefined
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
}

object IRecord {
  @scala.inline
  def apply(
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    associations: senchaUnderscoreTouchLib.ExtNs.Array = null,
    beginEdit: js.Function0[scala.Unit] = null,
    belongsTo: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    cancelEdit: js.Function0[scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clientIdProperty: java.lang.String = null,
    commit: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    config: js.Any = null,
    copy: js.Function1[/* id */ js.UndefOr[java.lang.String], IModel] = null,
    destroy: js.Function0[scala.Unit] = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    endEdit: js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    erase: js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IModel] = null,
    extend: java.lang.String = null,
    fields: js.Any = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    get: js.Function1[/* fieldName */ js.UndefOr[java.lang.String], _] = null,
    getAssociatedData: js.Function0[_] = null,
    getAssociations: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getBelongsTo: js.Function0[_] = null,
    getBubbleEvents: js.Function0[_] = null,
    getChanges: js.Function0[_] = null,
    getClientIdProperty: js.Function0[java.lang.String] = null,
    getData: js.Function1[/* includeAssociated */ js.UndefOr[scala.Boolean], _] = null,
    getFields: js.Function0[_] = null,
    getHasMany: js.Function0[_] = null,
    getHasOne: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getIdProperty: js.Function0[java.lang.String] = null,
    getIdentifier: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getIsErased: js.Function0[scala.Unit] = null,
    getListeners: js.Function0[_] = null,
    getProxy: js.Function0[_] = null,
    getUseCache: js.Function0[scala.Boolean] = null,
    getValidations: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasMany: js.Any = null,
    hasOne: js.Any = null,
    idProperty: java.lang.String = null,
    identifier: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isModified: js.Function1[/* fieldName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    isValid: js.Function0[scala.Boolean] = null,
    join: js.Function1[/* store */ js.UndefOr[IStore], scala.Unit] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    modified: js.Any = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    phantom: js.UndefOr[scala.Boolean] = js.undefined,
    platformConfig: js.Any = null,
    proxy: js.Any = null,
    raw: js.Any = null,
    reject: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    save: js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IModel] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    set: js.Function2[/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setAssociations: js.Function1[/* associations */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setBelongsTo: js.Function1[/* belongsTo */ js.UndefOr[js.Any], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setClientIdProperty: js.Function1[/* clientIdProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setConvertedData: js.Function1[/* data */ js.UndefOr[js.Any], IModel] = null,
    setData: js.Function1[/* rawData */ js.UndefOr[js.Any], IModel] = null,
    setDirty: js.Function0[scala.Unit] = null,
    setFields: js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], _] = null,
    setHasMany: js.Function1[/* hasMany */ js.UndefOr[js.Any], scala.Unit] = null,
    setHasOne: js.Function1[/* hasOne */ js.UndefOr[js.Any], scala.Unit] = null,
    setId: js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit] = null,
    setIdProperty: js.Function1[/* idProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setIdentifier: js.Function1[/* identifier */ js.UndefOr[js.Any], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setProxy: js.Function1[/* proxy */ js.UndefOr[js.Any], scala.Unit] = null,
    setUseCache: js.Function1[/* useCache */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setValidations: js.Function1[/* validations */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    stores: senchaUnderscoreTouchLib.ExtNs.Array = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    toUrl: js.Function0[java.lang.String] = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unjoin: js.Function1[/* store */ js.UndefOr[IStore], scala.Unit] = null,
    useCache: js.UndefOr[scala.Boolean] = js.undefined,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    validate: js.Function0[IErrors] = null,
    validations: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IRecord = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associations != null) __obj.updateDynamic("associations")(associations)
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(beginEdit)
    if (belongsTo != null) __obj.updateDynamic("belongsTo")(belongsTo)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(cancelEdit)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty)
    if (commit != null) __obj.updateDynamic("commit")(commit)
    if (config != null) __obj.updateDynamic("config")(config)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (endEdit != null) __obj.updateDynamic("endEdit")(endEdit)
    if (erase != null) __obj.updateDynamic("erase")(erase)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getAssociatedData != null) __obj.updateDynamic("getAssociatedData")(getAssociatedData)
    if (getAssociations != null) __obj.updateDynamic("getAssociations")(getAssociations)
    if (getBelongsTo != null) __obj.updateDynamic("getBelongsTo")(getBelongsTo)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getChanges != null) __obj.updateDynamic("getChanges")(getChanges)
    if (getClientIdProperty != null) __obj.updateDynamic("getClientIdProperty")(getClientIdProperty)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getFields != null) __obj.updateDynamic("getFields")(getFields)
    if (getHasMany != null) __obj.updateDynamic("getHasMany")(getHasMany)
    if (getHasOne != null) __obj.updateDynamic("getHasOne")(getHasOne)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getIdProperty != null) __obj.updateDynamic("getIdProperty")(getIdProperty)
    if (getIdentifier != null) __obj.updateDynamic("getIdentifier")(getIdentifier)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getIsErased != null) __obj.updateDynamic("getIsErased")(getIsErased)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (getUseCache != null) __obj.updateDynamic("getUseCache")(getUseCache)
    if (getValidations != null) __obj.updateDynamic("getValidations")(getValidations)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasMany != null) __obj.updateDynamic("hasMany")(hasMany)
    if (hasOne != null) __obj.updateDynamic("hasOne")(hasOne)
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isModified != null) __obj.updateDynamic("isModified")(isModified)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (join != null) __obj.updateDynamic("join")(join)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (modified != null) __obj.updateDynamic("modified")(modified)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (!js.isUndefined(phantom)) __obj.updateDynamic("phantom")(phantom)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (reject != null) __obj.updateDynamic("reject")(reject)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (save != null) __obj.updateDynamic("save")(save)
    if (self != null) __obj.updateDynamic("self")(self)
    if (set != null) __obj.updateDynamic("set")(set)
    if (setAssociations != null) __obj.updateDynamic("setAssociations")(setAssociations)
    if (setBelongsTo != null) __obj.updateDynamic("setBelongsTo")(setBelongsTo)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setClientIdProperty != null) __obj.updateDynamic("setClientIdProperty")(setClientIdProperty)
    if (setConvertedData != null) __obj.updateDynamic("setConvertedData")(setConvertedData)
    if (setData != null) __obj.updateDynamic("setData")(setData)
    if (setDirty != null) __obj.updateDynamic("setDirty")(setDirty)
    if (setFields != null) __obj.updateDynamic("setFields")(setFields)
    if (setHasMany != null) __obj.updateDynamic("setHasMany")(setHasMany)
    if (setHasOne != null) __obj.updateDynamic("setHasOne")(setHasOne)
    if (setId != null) __obj.updateDynamic("setId")(setId)
    if (setIdProperty != null) __obj.updateDynamic("setIdProperty")(setIdProperty)
    if (setIdentifier != null) __obj.updateDynamic("setIdentifier")(setIdentifier)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setProxy != null) __obj.updateDynamic("setProxy")(setProxy)
    if (setUseCache != null) __obj.updateDynamic("setUseCache")(setUseCache)
    if (setValidations != null) __obj.updateDynamic("setValidations")(setValidations)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (toUrl != null) __obj.updateDynamic("toUrl")(toUrl)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (unjoin != null) __obj.updateDynamic("unjoin")(unjoin)
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (validations != null) __obj.updateDynamic("validations")(validations)
    __obj.asInstanceOf[IRecord]
  }
}


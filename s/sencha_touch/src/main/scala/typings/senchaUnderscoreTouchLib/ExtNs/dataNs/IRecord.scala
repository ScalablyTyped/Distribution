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


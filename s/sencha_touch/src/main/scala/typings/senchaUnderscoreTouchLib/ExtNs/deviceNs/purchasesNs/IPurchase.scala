package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.purchasesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPurchase
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.IModel {
  /** [Method] Attempts to mark this purchase as complete
  		* @param config Object
  		*/
  var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  @JSName("getFields")
  var getFields_IPurchase: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  @JSName("setFields")
  var setFields_IPurchase: js.UndefOr[
    js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

object IPurchase {
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
    complete: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    copy: js.Function1[/* id */ js.UndefOr[java.lang.String], IPurchase] = null,
    destroy: js.Function0[scala.Unit] = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    endEdit: js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    erase: js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IPurchase] = null,
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
    getFields: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
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
    join: js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit] = null,
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
    save: js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IPurchase] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    set: js.Function2[/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setAssociations: js.Function1[/* associations */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setBelongsTo: js.Function1[/* belongsTo */ js.UndefOr[js.Any], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setClientIdProperty: js.Function1[/* clientIdProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setConvertedData: js.Function1[/* data */ js.UndefOr[js.Any], IPurchase] = null,
    setData: js.Function1[/* rawData */ js.UndefOr[js.Any], IPurchase] = null,
    setDirty: js.Function0[scala.Unit] = null,
    setFields: js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
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
    unjoin: js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit] = null,
    useCache: js.UndefOr[scala.Boolean] = js.undefined,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    validate: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IErrors] = null,
    validations: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IPurchase = {
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
    if (complete != null) __obj.updateDynamic("complete")(complete)
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
    __obj.asInstanceOf[IPurchase]
  }
}


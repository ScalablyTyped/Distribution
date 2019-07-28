package typings.senchaUnderscoreTouch.ExtNs.deviceNs.purchasesNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.dataNs.IErrors
import typings.senchaUnderscoreTouch.ExtNs.dataNs.IModel
import typings.senchaUnderscoreTouch.ExtNs.dataNs.IStore
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPurchase extends IModel {
  /** [Method] Attempts to mark this purchase as complete
  		* @param config Object
  		*/
  var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  @JSName("getFields")
  var getFields_IPurchase: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  @JSName("setFields")
  var setFields_IPurchase: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.undefined
}

object IPurchase {
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
    complete: /* config */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    copy: /* id */ js.UndefOr[java.lang.String] => IPurchase = null,
    destroy: () => Unit = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    endEdit: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit = null,
    erase: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IPurchase = null,
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
    getFields: () => Array = null,
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
    save: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IPurchase = null,
    self: IClass = null,
    set: (/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit = null,
    setAssociations: /* associations */ js.UndefOr[Array] => Unit = null,
    setBelongsTo: /* belongsTo */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setClientIdProperty: /* clientIdProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setConvertedData: /* data */ js.UndefOr[js.Any] => IPurchase = null,
    setData: /* rawData */ js.UndefOr[js.Any] => IPurchase = null,
    setDirty: () => Unit = null,
    setFields: /* fields */ js.UndefOr[Array] => Unit = null,
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
  ): IPurchase = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associations != null) __obj.updateDynamic("associations")(associations)
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction0(beginEdit))
    if (belongsTo != null) __obj.updateDynamic("belongsTo")(belongsTo)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(js.Any.fromFunction0(cancelEdit))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty)
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config)
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1(copy))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction2(endEdit))
    if (erase != null) __obj.updateDynamic("erase")(js.Any.fromFunction2(erase))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
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
    if (hasMany != null) __obj.updateDynamic("hasMany")(hasMany)
    if (hasOne != null) __obj.updateDynamic("hasOne")(hasOne)
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isModified != null) __obj.updateDynamic("isModified")(js.Any.fromFunction1(isModified))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (join != null) __obj.updateDynamic("join")(js.Any.fromFunction1(join))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (modified != null) __obj.updateDynamic("modified")(modified)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (!js.isUndefined(phantom)) __obj.updateDynamic("phantom")(phantom)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1(reject))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction2(save))
    if (self != null) __obj.updateDynamic("self")(self)
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
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (toUrl != null) __obj.updateDynamic("toUrl")(js.Any.fromFunction0(toUrl))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (unjoin != null) __obj.updateDynamic("unjoin")(js.Any.fromFunction1(unjoin))
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (validations != null) __obj.updateDynamic("validations")(validations)
    __obj.asInstanceOf[IPurchase]
  }
}


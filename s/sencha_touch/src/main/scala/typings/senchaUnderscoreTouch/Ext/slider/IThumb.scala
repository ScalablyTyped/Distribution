package typings.senchaUnderscoreTouch.Ext.slider

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.IComponent
import typings.senchaUnderscoreTouch.Ext.IContainer
import typings.senchaUnderscoreTouch.Ext.data.IModel
import typings.senchaUnderscoreTouch.Ext.dom.IElement
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumb extends IComponent {
  /** [Config Option] (Object) */
  var draggable: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of draggable
  		* @returns Object
  		*/
  var getDraggable: js.UndefOr[js.Function0[_]] = js.undefined
}

object IThumb {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addCls: (/* cls */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    baseCls: String = null,
    border: js.Any = null,
    bottom: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    clearListeners: () => Unit = null,
    cls: js.Any = null,
    componentCls: String = null,
    config: js.Any = null,
    contentEl: js.Any = null,
    data: js.Any = null,
    destroy: () => Unit = null,
    disable: () => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledCls: String = null,
    dock: String = null,
    docked: String = null,
    draggable: js.Any = null,
    enable: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    enterAnimation: js.Any = null,
    exitAnimation: js.Any = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    flex: Int | Double = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    floatingCls: String = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    getAlignmentInfo: (/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any]) => Unit = null,
    getBaseCls: () => String = null,
    getBorder: () => _ = null,
    getBottom: () => _ = null,
    getBubbleEvents: () => _ = null,
    getCentered: () => Boolean = null,
    getCls: () => _ = null,
    getContentEl: () => _ = null,
    getData: () => _ = null,
    getDisabled: () => Boolean = null,
    getDisabledCls: () => String = null,
    getDocked: () => String = null,
    getDraggable: () => _ = null,
    getEl: () => IElement = null,
    getEnterAnimation: () => _ = null,
    getExitAnimation: () => _ = null,
    getFlex: () => Double = null,
    getFloatingCls: () => String = null,
    getHeight: () => _ = null,
    getHidden: () => Boolean = null,
    getHiddenCls: () => String = null,
    getHideAnimation: () => _ = null,
    getHtml: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getItemId: () => String = null,
    getLeft: () => _ = null,
    getListeners: () => _ = null,
    getMargin: () => _ = null,
    getMaxHeight: () => _ = null,
    getMaxWidth: () => _ = null,
    getMinHeight: () => _ = null,
    getMinWidth: () => _ = null,
    getPadding: () => _ = null,
    getParent: () => IThumb = null,
    getPlugins: () => _ = null,
    getRecord: () => IModel = null,
    getRenderTo: () => typings.senchaUnderscoreTouch.Ext.IElement = null,
    getRight: () => _ = null,
    getShowAnimation: () => _ = null,
    getSize: () => _ = null,
    getStyle: () => _ = null,
    getStyleHtmlCls: () => String = null,
    getStyleHtmlContent: () => Boolean = null,
    getTop: () => _ = null,
    getTpl: () => _ = null,
    getTplWriteMode: () => String = null,
    getUi: () => String = null,
    getWidth: () => _ = null,
    getXTypes: () => String = null,
    getZIndex: () => Double = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasParent: () => Boolean = null,
    height: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hiddenCls: String = null,
    hide: /* animation */ js.UndefOr[js.Any] => IThumb = null,
    hideAnimation: js.Any = null,
    hideOnMaskTap: js.UndefOr[Boolean] = js.undefined,
    html: js.Any = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    initialize: () => Unit = null,
    isDisabled: () => Boolean = null,
    isHidden: () => Boolean = null,
    isXType: (/* xtype */ js.UndefOr[String], /* shallow */ js.UndefOr[Boolean]) => Boolean = null,
    itemId: String = null,
    layoutOnOrientationChange: js.UndefOr[Boolean] = js.undefined,
    left: js.Any = null,
    listeners: js.Any = null,
    margin: js.Any = null,
    maxHeight: js.Any = null,
    maxWidth: js.Any = null,
    minHeight: js.Any = null,
    minWidth: js.Any = null,
    mixins: js.Any = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    monitorOrientation: js.UndefOr[Boolean] = js.undefined,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    padding: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    record: IModel = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeCls: (/* cls */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    renderTo: typings.senchaUnderscoreTouch.Ext.IElement = null,
    replaceCls: (/* oldCls */ js.UndefOr[String], /* newCls */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => Unit = null,
    resetFloating: () => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    right: js.Any = null,
    scroll: js.Any = null,
    self: IClass = null,
    setBaseCls: /* baseCls */ js.UndefOr[String] => Unit = null,
    setBorder: /* border */ js.UndefOr[js.Any] => Unit = null,
    setBottom: /* bottom */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCentered: /* centered */ js.UndefOr[Boolean] => Unit = null,
    setCls: /* cls */ js.UndefOr[js.Any] => Unit = null,
    setContentEl: /* contentEl */ js.UndefOr[js.Any] => Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => Unit = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Unit = null,
    setDisabledCls: /* disabledCls */ js.UndefOr[String] => Unit = null,
    setDocked: /* docked */ js.UndefOr[String] => Unit = null,
    setDraggable: /* draggable */ js.UndefOr[js.Any] => Unit = null,
    setEnterAnimation: /* enterAnimation */ js.UndefOr[js.Any] => Unit = null,
    setExitAnimation: /* exitAnimation */ js.UndefOr[js.Any] => Unit = null,
    setFlex: /* flex */ js.UndefOr[Double] => Unit = null,
    setFloating: /* floating */ js.UndefOr[Boolean] => Unit = null,
    setFloatingCls: /* floatingCls */ js.UndefOr[String] => Unit = null,
    setHeight: /* height */ js.UndefOr[js.Any] => Unit = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Unit = null,
    setHiddenCls: /* hiddenCls */ js.UndefOr[String] => Unit = null,
    setHideAnimation: /* hideAnimation */ js.UndefOr[js.Any] => Unit = null,
    setHtml: /* html */ js.UndefOr[js.Any] => Unit = null,
    setItemId: /* itemId */ js.UndefOr[String] => Unit = null,
    setLeft: /* left */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMargin: /* margin */ js.UndefOr[js.Any] => Unit = null,
    setMaxHeight: /* maxHeight */ js.UndefOr[js.Any] => Unit = null,
    setMaxWidth: /* maxWidth */ js.UndefOr[js.Any] => Unit = null,
    setMinHeight: /* minHeight */ js.UndefOr[js.Any] => Unit = null,
    setMinWidth: /* minWidth */ js.UndefOr[js.Any] => Unit = null,
    setPadding: /* padding */ js.UndefOr[js.Any] => Unit = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => Unit = null,
    setRecord: /* record */ js.UndefOr[IModel] => Unit = null,
    setRenderTo: /* renderTo */ js.UndefOr[typings.senchaUnderscoreTouch.Ext.IElement] => Unit = null,
    setRight: /* right */ js.UndefOr[js.Any] => Unit = null,
    setScrollable: () => Unit = null,
    setShowAnimation: /* showAnimation */ js.UndefOr[js.Any] => Unit = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Unit = null,
    setStyleHtmlCls: /* styleHtmlCls */ js.UndefOr[String] => Unit = null,
    setStyleHtmlContent: /* styleHtmlContent */ js.UndefOr[Boolean] => Unit = null,
    setTop: /* top */ js.UndefOr[js.Any] => Unit = null,
    setTpl: /* tpl */ js.UndefOr[js.Any] => Unit = null,
    setTplWriteMode: /* tplWriteMode */ js.UndefOr[String] => Unit = null,
    setUi: /* ui */ js.UndefOr[String] => Unit = null,
    setWidth: /* width */ js.UndefOr[js.Any] => Unit = null,
    setZIndex: /* zIndex */ js.UndefOr[Double] => Unit = null,
    show: /* animation */ js.UndefOr[js.Any] => IThumb = null,
    showAnimation: js.Any = null,
    showBy: (/* component */ js.UndefOr[IThumb], /* alignment */ js.UndefOr[String]) => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stopMaskTapEvent: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    styleHtmlCls: String = null,
    styleHtmlContent: js.UndefOr[Boolean] = js.undefined,
    suspendEvents: () => Unit = null,
    top: js.Any = null,
    tpl: js.Any = null,
    tplWriteMode: String = null,
    ui: String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    up: /* selector */ js.UndefOr[String] => IContainer = null,
    update: () => Unit = null,
    updateStyleHtmlCls: (/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    width: js.Any = null,
    xtype: String = null,
    zIndex: Int | Double = null
  ): IThumb = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls.asInstanceOf[js.Any])
    if (dock != null) __obj.updateDynamic("dock")(dock.asInstanceOf[js.Any])
    if (docked != null) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation.asInstanceOf[js.Any])
    if (exitAnimation != null) __obj.updateDynamic("exitAnimation")(exitAnimation.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (floatingCls != null) __obj.updateDynamic("floatingCls")(floatingCls.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (getAlignmentInfo != null) __obj.updateDynamic("getAlignmentInfo")(js.Any.fromFunction2(getAlignmentInfo))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBorder != null) __obj.updateDynamic("getBorder")(js.Any.fromFunction0(getBorder))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCentered != null) __obj.updateDynamic("getCentered")(js.Any.fromFunction0(getCentered))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getContentEl != null) __obj.updateDynamic("getContentEl")(js.Any.fromFunction0(getContentEl))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(js.Any.fromFunction0(getDisabled))
    if (getDisabledCls != null) __obj.updateDynamic("getDisabledCls")(js.Any.fromFunction0(getDisabledCls))
    if (getDocked != null) __obj.updateDynamic("getDocked")(js.Any.fromFunction0(getDocked))
    if (getDraggable != null) __obj.updateDynamic("getDraggable")(js.Any.fromFunction0(getDraggable))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getEnterAnimation != null) __obj.updateDynamic("getEnterAnimation")(js.Any.fromFunction0(getEnterAnimation))
    if (getExitAnimation != null) __obj.updateDynamic("getExitAnimation")(js.Any.fromFunction0(getExitAnimation))
    if (getFlex != null) __obj.updateDynamic("getFlex")(js.Any.fromFunction0(getFlex))
    if (getFloatingCls != null) __obj.updateDynamic("getFloatingCls")(js.Any.fromFunction0(getFloatingCls))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction0(getHeight))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getHiddenCls != null) __obj.updateDynamic("getHiddenCls")(js.Any.fromFunction0(getHiddenCls))
    if (getHideAnimation != null) __obj.updateDynamic("getHideAnimation")(js.Any.fromFunction0(getHideAnimation))
    if (getHtml != null) __obj.updateDynamic("getHtml")(js.Any.fromFunction0(getHtml))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction0(getItemId))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction0(getMargin))
    if (getMaxHeight != null) __obj.updateDynamic("getMaxHeight")(js.Any.fromFunction0(getMaxHeight))
    if (getMaxWidth != null) __obj.updateDynamic("getMaxWidth")(js.Any.fromFunction0(getMaxWidth))
    if (getMinHeight != null) __obj.updateDynamic("getMinHeight")(js.Any.fromFunction0(getMinHeight))
    if (getMinWidth != null) __obj.updateDynamic("getMinWidth")(js.Any.fromFunction0(getMinWidth))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction0(getPadding))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(js.Any.fromFunction0(getPlugins))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getRenderTo != null) __obj.updateDynamic("getRenderTo")(js.Any.fromFunction0(getRenderTo))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (getShowAnimation != null) __obj.updateDynamic("getShowAnimation")(js.Any.fromFunction0(getShowAnimation))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction0(getSize))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getStyleHtmlCls != null) __obj.updateDynamic("getStyleHtmlCls")(js.Any.fromFunction0(getStyleHtmlCls))
    if (getStyleHtmlContent != null) __obj.updateDynamic("getStyleHtmlContent")(js.Any.fromFunction0(getStyleHtmlContent))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction0(getTop))
    if (getTpl != null) __obj.updateDynamic("getTpl")(js.Any.fromFunction0(getTpl))
    if (getTplWriteMode != null) __obj.updateDynamic("getTplWriteMode")(js.Any.fromFunction0(getTplWriteMode))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (getXTypes != null) __obj.updateDynamic("getXTypes")(js.Any.fromFunction0(getXTypes))
    if (getZIndex != null) __obj.updateDynamic("getZIndex")(js.Any.fromFunction0(getZIndex))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasParent != null) __obj.updateDynamic("hasParent")(js.Any.fromFunction0(hasParent))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hiddenCls != null) __obj.updateDynamic("hiddenCls")(hiddenCls.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnMaskTap)) __obj.updateDynamic("hideOnMaskTap")(hideOnMaskTap.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(js.Any.fromFunction0(isDisabled))
    if (isHidden != null) __obj.updateDynamic("isHidden")(js.Any.fromFunction0(isHidden))
    if (isXType != null) __obj.updateDynamic("isXType")(js.Any.fromFunction2(isXType))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutOnOrientationChange)) __obj.updateDynamic("layoutOnOrientationChange")(layoutOnOrientationChange.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (!js.isUndefined(monitorOrientation)) __obj.updateDynamic("monitorOrientation")(monitorOrientation.asInstanceOf[js.Any])
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3(removeCls))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo.asInstanceOf[js.Any])
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4(replaceCls))
    if (resetFloating != null) __obj.updateDynamic("resetFloating")(js.Any.fromFunction0(resetFloating))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setBorder != null) __obj.updateDynamic("setBorder")(js.Any.fromFunction1(setBorder))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCentered != null) __obj.updateDynamic("setCentered")(js.Any.fromFunction1(setCentered))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setContentEl != null) __obj.updateDynamic("setContentEl")(js.Any.fromFunction1(setContentEl))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1(setDisabled))
    if (setDisabledCls != null) __obj.updateDynamic("setDisabledCls")(js.Any.fromFunction1(setDisabledCls))
    if (setDocked != null) __obj.updateDynamic("setDocked")(js.Any.fromFunction1(setDocked))
    if (setDraggable != null) __obj.updateDynamic("setDraggable")(js.Any.fromFunction1(setDraggable))
    if (setEnterAnimation != null) __obj.updateDynamic("setEnterAnimation")(js.Any.fromFunction1(setEnterAnimation))
    if (setExitAnimation != null) __obj.updateDynamic("setExitAnimation")(js.Any.fromFunction1(setExitAnimation))
    if (setFlex != null) __obj.updateDynamic("setFlex")(js.Any.fromFunction1(setFlex))
    if (setFloating != null) __obj.updateDynamic("setFloating")(js.Any.fromFunction1(setFloating))
    if (setFloatingCls != null) __obj.updateDynamic("setFloatingCls")(js.Any.fromFunction1(setFloatingCls))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setHiddenCls != null) __obj.updateDynamic("setHiddenCls")(js.Any.fromFunction1(setHiddenCls))
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(js.Any.fromFunction1(setHideAnimation))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1(setHtml))
    if (setItemId != null) __obj.updateDynamic("setItemId")(js.Any.fromFunction1(setItemId))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMargin != null) __obj.updateDynamic("setMargin")(js.Any.fromFunction1(setMargin))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1(setMaxHeight))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1(setMaxWidth))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1(setMinWidth))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1(setPadding))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1(setPlugins))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setRenderTo != null) __obj.updateDynamic("setRenderTo")(js.Any.fromFunction1(setRenderTo))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setScrollable != null) __obj.updateDynamic("setScrollable")(js.Any.fromFunction0(setScrollable))
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(js.Any.fromFunction1(setShowAnimation))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setStyleHtmlCls != null) __obj.updateDynamic("setStyleHtmlCls")(js.Any.fromFunction1(setStyleHtmlCls))
    if (setStyleHtmlContent != null) __obj.updateDynamic("setStyleHtmlContent")(js.Any.fromFunction1(setStyleHtmlContent))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1(setTop))
    if (setTpl != null) __obj.updateDynamic("setTpl")(js.Any.fromFunction1(setTpl))
    if (setTplWriteMode != null) __obj.updateDynamic("setTplWriteMode")(js.Any.fromFunction1(setTplWriteMode))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(js.Any.fromFunction1(setZIndex))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation.asInstanceOf[js.Any])
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction2(showBy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(stopMaskTapEvent)) __obj.updateDynamic("stopMaskTapEvent")(stopMaskTapEvent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleHtmlCls != null) __obj.updateDynamic("styleHtmlCls")(styleHtmlCls.asInstanceOf[js.Any])
    if (!js.isUndefined(styleHtmlContent)) __obj.updateDynamic("styleHtmlContent")(styleHtmlContent.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (tplWriteMode != null) __obj.updateDynamic("tplWriteMode")(tplWriteMode.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1(up))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (updateStyleHtmlCls != null) __obj.updateDynamic("updateStyleHtmlCls")(js.Any.fromFunction2(updateStyleHtmlCls))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xtype != null) __obj.updateDynamic("xtype")(xtype.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumb]
  }
}


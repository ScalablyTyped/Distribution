package typings.senchaTouch.Ext.draw.sprite

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.draw.ISurface
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISprite extends IObservable {
  /** [Config Option] (Number) */
  var A: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Array) */
  var An: js.UndefOr[Array] = js.undefined
  /** [Property] (Object) */
  var attr: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var fillStyle: js.UndefOr[String] = js.undefined
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine
    * @param isWithoutTransform Boolean Whether to calculate the bounding box with the current transforms or not.
    */
  var getBBox: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Subclass can rewrite this function to gain better performance
    * @param isWithoutTransform Boolean
    * @returns Array
    */
  var getBBoxCenter: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], Array]] = js.undefined
  /** [Method] Returns the value of parent
    * @returns Object
    */
  var getParent: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var globalAlpha: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** [Method] Hide the sprite
    * @returns Ext.draw.sprite.Sprite this
    */
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var lineCap: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var lineJoin: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var miterLimit: js.UndefOr[Double] = js.undefined
  /** [Method] Called before rendering  */
  var preRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_ISprite: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Method] Render method
    * @param surface Ext.draw.Surface The surface.
    * @param ctx Object A context object compatible with CanvasRenderingContext2D.
    * @param region Array The clip region (or called dirty rect) of the current rendering. Not be confused with surface.getRegion().
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  var render: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[Array], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var rotationCenterX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var rotationCenterY: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var rotationRads: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingCenterX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingCenterY: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingY: js.UndefOr[Double] = js.undefined
  /** [Method] Set attributes of the sprite
    * @param changes Object The content of the change.
    * @param bypassNormalization Boolean true to avoid normalization of the given changes.
    * @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
    */
  var setAttributes: js.UndefOr[
    js.Function3[
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      /* avoidCopy */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Set attributes of the sprite assuming the names and values have already been normalized
    * @param changes Object The content of the change.
    * @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
    */
  var setAttributesBypassingNormalization: js.UndefOr[
    js.Function2[/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Sets the value of parent
    * @param parent Object The new value.
    */
  var setParent: js.UndefOr[js.Function1[/* parent */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var shadowColor: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /** [Method] Show the sprite
    * @returns Ext.draw.sprite.Sprite this
    */
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Number) */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var strokeStyle: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var transformFillStroke: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var translationX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var translationY: js.UndefOr[Double] = js.undefined
  /** [Method] Subclass will fill the plain object with x y width height information of the plain bounding box of this sprite
    * @param plain Object Target object.
    */
  var updatePlainBBox: js.UndefOr[js.Function1[/* plain */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
    * @param transform Object Target object.
    * @param plain Object Auxiliary object providing information of plain object.
    */
  var updateTransformedBBox: js.UndefOr[
    js.Function2[/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Applies sprite s attributes to the given context
    * @param ctx Object Context to apply sprite's attributes to.
    * @param region Array The region of the context to be affected by gradients.
    */
  var useAttributes: js.UndefOr[js.Function2[/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ISprite {
  @scala.inline
  def apply(
    A: js.UndefOr[Double] = js.undefined,
    An: Array = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    attr: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    fillStyle: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    getBBox: /* isWithoutTransform */ js.UndefOr[Boolean] => Unit = null,
    getBBoxCenter: /* isWithoutTransform */ js.UndefOr[Boolean] => Array = null,
    getBubbleEvents: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getListeners: () => _ = null,
    getParent: () => _ = null,
    globalAlpha: js.UndefOr[Double] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hide: () => ISprite = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    lineCap: String = null,
    lineJoin: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    listeners: js.Any = null,
    miterLimit: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    preRender: () => Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    render: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => _ = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    rotationCenterX: js.UndefOr[Double] = js.undefined,
    rotationCenterY: js.UndefOr[Double] = js.undefined,
    rotationRads: js.UndefOr[Double] = js.undefined,
    scalingCenterX: js.UndefOr[Double] = js.undefined,
    scalingCenterY: js.UndefOr[Double] = js.undefined,
    scalingX: js.UndefOr[Double] = js.undefined,
    scalingY: js.UndefOr[Double] = js.undefined,
    self: IClass = null,
    setAttributes: (/* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => Unit = null,
    setAttributesBypassingNormalization: (/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean]) => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setParent: /* parent */ js.UndefOr[js.Any] => Unit = null,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    show: () => ISprite = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeStyle: String = null,
    suspendEvents: () => Unit = null,
    transformFillStroke: js.UndefOr[Boolean] = js.undefined,
    translationX: js.UndefOr[Double] = js.undefined,
    translationY: js.UndefOr[Double] = js.undefined,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    updatePlainBBox: /* plain */ js.UndefOr[js.Any] => Unit = null,
    updateTransformedBBox: (/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any]) => Unit = null,
    useAttributes: (/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => Unit = null,
    uses: Array = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): ISprite = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(A)) __obj.updateDynamic("A")(A.get.asInstanceOf[js.Any])
    if (An != null) __obj.updateDynamic("An")(An.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBBox != null) __obj.updateDynamic("getBBox")(js.Any.fromFunction1(getBBox))
    if (getBBoxCenter != null) __obj.updateDynamic("getBBoxCenter")(js.Any.fromFunction1(getBBoxCenter))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (!js.isUndefined(globalAlpha)) __obj.updateDynamic("globalAlpha")(globalAlpha.get.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (!js.isUndefined(miterLimit)) __obj.updateDynamic("miterLimit")(miterLimit.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction0(preRender))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (!js.isUndefined(rotationCenterX)) __obj.updateDynamic("rotationCenterX")(rotationCenterX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationCenterY)) __obj.updateDynamic("rotationCenterY")(rotationCenterY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationRads)) __obj.updateDynamic("rotationRads")(rotationRads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingCenterX)) __obj.updateDynamic("scalingCenterX")(scalingCenterX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingCenterY)) __obj.updateDynamic("scalingCenterY")(scalingCenterY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingX)) __obj.updateDynamic("scalingX")(scalingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingY)) __obj.updateDynamic("scalingY")(scalingY.get.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(js.Any.fromFunction3(setAttributes))
    if (setAttributesBypassingNormalization != null) __obj.updateDynamic("setAttributesBypassingNormalization")(js.Any.fromFunction2(setAttributesBypassingNormalization))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setParent != null) __obj.updateDynamic("setParent")(js.Any.fromFunction1(setParent))
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (!js.isUndefined(transformFillStroke)) __obj.updateDynamic("transformFillStroke")(transformFillStroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translationX)) __obj.updateDynamic("translationX")(translationX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translationY)) __obj.updateDynamic("translationY")(translationY.get.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (updatePlainBBox != null) __obj.updateDynamic("updatePlainBBox")(js.Any.fromFunction1(updatePlainBBox))
    if (updateTransformedBBox != null) __obj.updateDynamic("updateTransformedBBox")(js.Any.fromFunction2(updateTransformedBBox))
    if (useAttributes != null) __obj.updateDynamic("useAttributes")(js.Any.fromFunction2(useAttributes))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISprite]
  }
}


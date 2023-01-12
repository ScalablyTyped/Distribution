package typings.senchaTouch.Ext.draw.sprite

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.draw.ISurface
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISprite
  extends StObject
     with IObservable {
  
  /** [Config Option] (Number) */
  var A: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Array) */
  var An: js.UndefOr[Array] = js.undefined
  
  /** [Property] (Object) */
  var attr: js.UndefOr[Any] = js.undefined
  
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
  var getParent: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
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
      /* ctx */ js.UndefOr[Any], 
      /* region */ js.UndefOr[Array], 
      Any
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
      /* changes */ js.UndefOr[Any], 
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
    js.Function2[/* changes */ js.UndefOr[Any], /* avoidCopy */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Sets the value of parent
    * @param parent Object The new value.
    */
  var setParent: js.UndefOr[js.Function1[/* parent */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var updatePlainBBox: js.UndefOr[js.Function1[/* plain */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
    * @param transform Object Target object.
    * @param plain Object Auxiliary object providing information of plain object.
    */
  var updateTransformedBBox: js.UndefOr[js.Function2[/* transform */ js.UndefOr[Any], /* plain */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Applies sprite s attributes to the given context
    * @param ctx Object Context to apply sprite's attributes to.
    * @param region Array The region of the context to be affected by gradients.
    */
  var useAttributes: js.UndefOr[js.Function2[/* ctx */ js.UndefOr[Any], /* region */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ISprite {
  
  inline def apply(): ISprite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISprite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISprite] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "A", js.undefined)
    
    inline def setAn(value: Array): Self = StObject.set(x, "An", value.asInstanceOf[js.Any])
    
    inline def setAnUndefined: Self = StObject.set(x, "An", js.undefined)
    
    inline def setAttr(value: Any): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
    
    inline def setGetBBox(value: /* isWithoutTransform */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "getBBox", js.Any.fromFunction1(value))
    
    inline def setGetBBoxCenter(value: /* isWithoutTransform */ js.UndefOr[Boolean] => Array): Self = StObject.set(x, "getBBoxCenter", js.Any.fromFunction1(value))
    
    inline def setGetBBoxCenterUndefined: Self = StObject.set(x, "getBBoxCenter", js.undefined)
    
    inline def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
    
    inline def setGetParent(value: () => Any): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    inline def setGetParentUndefined: Self = StObject.set(x, "getParent", js.undefined)
    
    inline def setGlobalAlpha(value: Double): Self = StObject.set(x, "globalAlpha", value.asInstanceOf[js.Any])
    
    inline def setGlobalAlphaUndefined: Self = StObject.set(x, "globalAlpha", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHide(value: () => ISprite): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    inline def setPreRender(value: () => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction0(value))
    
    inline def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRender(
      value: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[Any], /* region */ js.UndefOr[Array]) => Any
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRotationCenterX(value: Double): Self = StObject.set(x, "rotationCenterX", value.asInstanceOf[js.Any])
    
    inline def setRotationCenterXUndefined: Self = StObject.set(x, "rotationCenterX", js.undefined)
    
    inline def setRotationCenterY(value: Double): Self = StObject.set(x, "rotationCenterY", value.asInstanceOf[js.Any])
    
    inline def setRotationCenterYUndefined: Self = StObject.set(x, "rotationCenterY", js.undefined)
    
    inline def setRotationRads(value: Double): Self = StObject.set(x, "rotationRads", value.asInstanceOf[js.Any])
    
    inline def setRotationRadsUndefined: Self = StObject.set(x, "rotationRads", js.undefined)
    
    inline def setScalingCenterX(value: Double): Self = StObject.set(x, "scalingCenterX", value.asInstanceOf[js.Any])
    
    inline def setScalingCenterXUndefined: Self = StObject.set(x, "scalingCenterX", js.undefined)
    
    inline def setScalingCenterY(value: Double): Self = StObject.set(x, "scalingCenterY", value.asInstanceOf[js.Any])
    
    inline def setScalingCenterYUndefined: Self = StObject.set(x, "scalingCenterY", js.undefined)
    
    inline def setScalingX(value: Double): Self = StObject.set(x, "scalingX", value.asInstanceOf[js.Any])
    
    inline def setScalingXUndefined: Self = StObject.set(x, "scalingX", js.undefined)
    
    inline def setScalingY(value: Double): Self = StObject.set(x, "scalingY", value.asInstanceOf[js.Any])
    
    inline def setScalingYUndefined: Self = StObject.set(x, "scalingY", js.undefined)
    
    inline def setSetAttributes(
      value: (/* changes */ js.UndefOr[Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "setAttributes", js.Any.fromFunction3(value))
    
    inline def setSetAttributesBypassingNormalization(value: (/* changes */ js.UndefOr[Any], /* avoidCopy */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setAttributesBypassingNormalization", js.Any.fromFunction2(value))
    
    inline def setSetAttributesBypassingNormalizationUndefined: Self = StObject.set(x, "setAttributesBypassingNormalization", js.undefined)
    
    inline def setSetAttributesUndefined: Self = StObject.set(x, "setAttributes", js.undefined)
    
    inline def setSetParent(value: /* parent */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
    
    inline def setSetParentUndefined: Self = StObject.set(x, "setParent", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setShow(value: () => ISprite): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setTransformFillStroke(value: Boolean): Self = StObject.set(x, "transformFillStroke", value.asInstanceOf[js.Any])
    
    inline def setTransformFillStrokeUndefined: Self = StObject.set(x, "transformFillStroke", js.undefined)
    
    inline def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
    
    inline def setTranslationXUndefined: Self = StObject.set(x, "translationX", js.undefined)
    
    inline def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
    
    inline def setTranslationYUndefined: Self = StObject.set(x, "translationY", js.undefined)
    
    inline def setUpdatePlainBBox(value: /* plain */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "updatePlainBBox", js.Any.fromFunction1(value))
    
    inline def setUpdatePlainBBoxUndefined: Self = StObject.set(x, "updatePlainBBox", js.undefined)
    
    inline def setUpdateTransformedBBox(value: (/* transform */ js.UndefOr[Any], /* plain */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "updateTransformedBBox", js.Any.fromFunction2(value))
    
    inline def setUpdateTransformedBBoxUndefined: Self = StObject.set(x, "updateTransformedBBox", js.undefined)
    
    inline def setUseAttributes(value: (/* ctx */ js.UndefOr[Any], /* region */ js.UndefOr[Array]) => Unit): Self = StObject.set(x, "useAttributes", js.Any.fromFunction2(value))
    
    inline def setUseAttributesUndefined: Self = StObject.set(x, "useAttributes", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}

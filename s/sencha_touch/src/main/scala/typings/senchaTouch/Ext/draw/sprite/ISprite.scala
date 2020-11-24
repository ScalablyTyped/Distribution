package typings.senchaTouch.Ext.draw.sprite

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.draw.ISurface
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISprite extends IObservable {
  
  /** [Config Option] (Number) */
  var A: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Array) */
  var An: js.UndefOr[Array] = js.native
  
  /** [Property] (Object) */
  var attr: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var fillStyle: js.UndefOr[String] = js.native
  
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine
    * @param isWithoutTransform Boolean Whether to calculate the bounding box with the current transforms or not.
    */
  var getBBox: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Subclass can rewrite this function to gain better performance
    * @param isWithoutTransform Boolean
    * @returns Array
    */
  var getBBoxCenter: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], Array]] = js.native
  
  /** [Method] Returns the value of parent
    * @returns Object
    */
  var getParent: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Number) */
  var globalAlpha: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** [Method] Hide the sprite
    * @returns Ext.draw.sprite.Sprite this
    */
  var hide: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Config Option] (String) */
  var lineCap: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var lineJoin: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var miterLimit: js.UndefOr[Double] = js.native
  
  /** [Method] Called before rendering  */
  var preRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_ISprite: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (Number) */
  var rotationCenterX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var rotationCenterY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var rotationRads: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var scalingCenterX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var scalingCenterY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var scalingX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var scalingY: js.UndefOr[Double] = js.native
  
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
  ] = js.native
  
  /** [Method] Set attributes of the sprite assuming the names and values have already been normalized
    * @param changes Object The content of the change.
    * @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
    */
  var setAttributesBypassingNormalization: js.UndefOr[
    js.Function2[/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Sets the value of parent
    * @param parent Object The new value.
    */
  var setParent: js.UndefOr[js.Function1[/* parent */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var shadowColor: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  /** [Method] Show the sprite
    * @returns Ext.draw.sprite.Sprite this
    */
  var show: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Config Option] (Number) */
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var strokeStyle: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var transformFillStroke: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var translationX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var translationY: js.UndefOr[Double] = js.native
  
  /** [Method] Subclass will fill the plain object with x y width height information of the plain bounding box of this sprite
    * @param plain Object Target object.
    */
  var updatePlainBBox: js.UndefOr[js.Function1[/* plain */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
    * @param transform Object Target object.
    * @param plain Object Auxiliary object providing information of plain object.
    */
  var updateTransformedBBox: js.UndefOr[
    js.Function2[/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Applies sprite s attributes to the given context
    * @param ctx Object Context to apply sprite's attributes to.
    * @param region Array The region of the context to be affected by gradients.
    */
  var useAttributes: js.UndefOr[js.Function2[/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.native
}
object ISprite {
  
  @scala.inline
  def apply(): ISprite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISprite]
  }
  
  @scala.inline
  implicit class ISpriteOps[Self <: ISprite] (val x: Self) extends AnyVal {
    
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
    def setA(value: Double): Self = this.set("A", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("A", js.undefined)
    
    @scala.inline
    def setAn(value: Array): Self = this.set("An", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAn: Self = this.set("An", js.undefined)
    
    @scala.inline
    def setAttr(value: js.Any): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    
    @scala.inline
    def setGetBBox(value: /* isWithoutTransform */ js.UndefOr[Boolean] => Unit): Self = this.set("getBBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetBBox: Self = this.set("getBBox", js.undefined)
    
    @scala.inline
    def setGetBBoxCenter(value: /* isWithoutTransform */ js.UndefOr[Boolean] => Array): Self = this.set("getBBoxCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetBBoxCenter: Self = this.set("getBBoxCenter", js.undefined)
    
    @scala.inline
    def setGetParent(value: () => _): Self = this.set("getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParent: Self = this.set("getParent", js.undefined)
    
    @scala.inline
    def setGlobalAlpha(value: Double): Self = this.set("globalAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalAlpha: Self = this.set("globalAlpha", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHide(value: () => ISprite): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setLineCap(value: String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setLineJoin(value: String): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    
    @scala.inline
    def setPreRender(value: () => Unit): Self = this.set("preRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePreRender: Self = this.set("preRender", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => _
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRotationCenterX(value: Double): Self = this.set("rotationCenterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationCenterX: Self = this.set("rotationCenterX", js.undefined)
    
    @scala.inline
    def setRotationCenterY(value: Double): Self = this.set("rotationCenterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationCenterY: Self = this.set("rotationCenterY", js.undefined)
    
    @scala.inline
    def setRotationRads(value: Double): Self = this.set("rotationRads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationRads: Self = this.set("rotationRads", js.undefined)
    
    @scala.inline
    def setScalingCenterX(value: Double): Self = this.set("scalingCenterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingCenterX: Self = this.set("scalingCenterX", js.undefined)
    
    @scala.inline
    def setScalingCenterY(value: Double): Self = this.set("scalingCenterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingCenterY: Self = this.set("scalingCenterY", js.undefined)
    
    @scala.inline
    def setScalingX(value: Double): Self = this.set("scalingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingX: Self = this.set("scalingX", js.undefined)
    
    @scala.inline
    def setScalingY(value: Double): Self = this.set("scalingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingY: Self = this.set("scalingY", js.undefined)
    
    @scala.inline
    def setSetAttributes(
      value: (/* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("setAttributes", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetAttributes: Self = this.set("setAttributes", js.undefined)
    
    @scala.inline
    def setSetAttributesBypassingNormalization(value: (/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean]) => Unit): Self = this.set("setAttributesBypassingNormalization", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttributesBypassingNormalization: Self = this.set("setAttributesBypassingNormalization", js.undefined)
    
    @scala.inline
    def setSetParent(value: /* parent */ js.UndefOr[js.Any] => Unit): Self = this.set("setParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetParent: Self = this.set("setParent", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setShow(value: () => ISprite): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    
    @scala.inline
    def setTransformFillStroke(value: Boolean): Self = this.set("transformFillStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformFillStroke: Self = this.set("transformFillStroke", js.undefined)
    
    @scala.inline
    def setTranslationX(value: Double): Self = this.set("translationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslationX: Self = this.set("translationX", js.undefined)
    
    @scala.inline
    def setTranslationY(value: Double): Self = this.set("translationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslationY: Self = this.set("translationY", js.undefined)
    
    @scala.inline
    def setUpdatePlainBBox(value: /* plain */ js.UndefOr[js.Any] => Unit): Self = this.set("updatePlainBBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdatePlainBBox: Self = this.set("updatePlainBBox", js.undefined)
    
    @scala.inline
    def setUpdateTransformedBBox(value: (/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateTransformedBBox", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateTransformedBBox: Self = this.set("updateTransformedBBox", js.undefined)
    
    @scala.inline
    def setUseAttributes(value: (/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => Unit): Self = this.set("useAttributes", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUseAttributes: Self = this.set("useAttributes", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}

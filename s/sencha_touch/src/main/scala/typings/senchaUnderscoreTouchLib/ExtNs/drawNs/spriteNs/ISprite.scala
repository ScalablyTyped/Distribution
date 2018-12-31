package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISprite
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Number) */
  var A: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Array) */
  var An: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Property] (Object) */
  var attr: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var fillStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine
  		* @param isWithoutTransform Boolean Whether to calculate the bounding box with the current transforms or not.
  		*/
  var getBBox: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Subclass can rewrite this function to gain better performance
  		* @param isWithoutTransform Boolean
  		* @returns Array
  		*/
  var getBBoxCenter: js.UndefOr[
    js.Function1[
      /* isWithoutTransform */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns the value of parent
  		* @returns Object
  		*/
  var getParent: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var globalAlpha: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Hide the sprite
  		* @returns Ext.draw.sprite.Sprite this
  		*/
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var lineCap: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var lineJoin: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Called before rendering  */
  var preRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ISprite: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Render method
  		* @param surface Ext.draw.Surface The surface.
  		* @param ctx Object A context object compatible with CanvasRenderingContext2D.
  		* @param region Array The clip region (or called dirty rect) of the current rendering. Not be confused with surface.getRegion().
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  var render: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var rotationCenterX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var rotationCenterY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var rotationRads: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingCenterX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingCenterY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Set attributes of the sprite
  		* @param changes Object The content of the change.
  		* @param bypassNormalization Boolean true to avoid normalization of the given changes.
  		* @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
  		*/
  var setAttributes: js.UndefOr[
    js.Function3[
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[scala.Boolean], 
      /* avoidCopy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Set attributes of the sprite assuming the names and values have already been normalized
  		* @param changes Object The content of the change.
  		* @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
  		*/
  var setAttributesBypassingNormalization: js.UndefOr[
    js.Function2[
      /* changes */ js.UndefOr[js.Any], 
      /* avoidCopy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of parent
  		* @param parent Object The new value.
  		*/
  var setParent: js.UndefOr[js.Function1[/* parent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Show the sprite
  		* @returns Ext.draw.sprite.Sprite this
  		*/
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Number) */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var transformFillStroke: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var translationX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var translationY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Subclass will fill the plain object with x y width height information of the plain bounding box of this sprite
  		* @param plain Object Target object.
  		*/
  var updatePlainBBox: js.UndefOr[js.Function1[/* plain */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
  		* @param transform Object Target object.
  		* @param plain Object Auxiliary object providing information of plain object.
  		*/
  var updateTransformedBBox: js.UndefOr[
    js.Function2[/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Applies sprite s attributes to the given context
  		* @param ctx Object Context to apply sprite's attributes to.
  		* @param region Array The region of the context to be affected by gradients.
  		*/
  var useAttributes: js.UndefOr[
    js.Function2[
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}


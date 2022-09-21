package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGroup
  extends StObject
     with IObservable {
  
  /** [Method] Add sprite to group
    * @param sprite Ext.draw.sprite.Sprite
    */
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.undefined
  
  /** [Method] Add a list of sprites to group
    * @param sprites Array|Ext.draw.sprite.Sprite
    */
  var addAll: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Clear the group
    * @param destroySprite Boolean
    */
  var clear: js.UndefOr[js.Function1[/* destroySprite */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Iterate all sprites with specific function
    * @param fn Function Function to iterate.
    */
  var each: js.UndefOr[js.Function1[/* fn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Get the sprite with id or index
    * @param id String|Number
    * @returns Ext.draw.sprite.Sprite
    */
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[Any], ISprite]] = js.undefined
  
  /** [Method] Get the i th sprite of the group
    * @param index Number
    * @returns Ext.draw.sprite.Sprite
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], ISprite]] = js.undefined
  
  /** [Method] Return the minimal bounding box that contains all the sprites bounding boxes in this group
    * @param isWithTransform Object
    */
  var getBBox: js.UndefOr[js.Function1[/* isWithTransform */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Returns the value of surface
    * @returns Object
    */
  var getSurface: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Hide all sprites in the group
    * @param o Boolean Whether to re-render the frame.
    */
  var hide: js.UndefOr[js.Function1[/* o */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IGroup: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
  ] = js.undefined
  
  /** [Method] Remote sprite from group
    * @param sprite Ext.draw.sprite.Sprite
    * @param destroySprite Boolean
    */
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Set attributes to all sprites in the group
    * @param o Object Sprite attribute options just like in Ext.draw.sprite.Sprite.
    */
  var setAttributes: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Set dirty flag for all sprites in the group */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value of surface
    * @param surface Object The new value.
    */
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Display all sprites in the group
    * @param o Boolean Whether to re-render the frame.
    */
  var show: js.UndefOr[js.Function1[/* o */ js.UndefOr[Boolean], Unit]] = js.undefined
}
object IGroup {
  
  inline def apply(): IGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroup]
  }
  
  extension [Self <: IGroup](x: Self) {
    
    inline def setAdd(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddAll(value: /* sprites */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    inline def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setClear(value: /* destroySprite */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setEach(value: /* fn */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setGet(value: /* id */ js.UndefOr[Any] => ISprite): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAt(value: /* index */ js.UndefOr[Double] => ISprite): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    inline def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    inline def setGetBBox(value: /* isWithTransform */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getBBox", js.Any.fromFunction1(value))
    
    inline def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
    
    inline def setGetSurface(value: () => Any): Self = StObject.set(x, "getSurface", js.Any.fromFunction0(value))
    
    inline def setGetSurfaceUndefined: Self = StObject.set(x, "getSurface", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHide(value: /* o */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSetAttributes(value: /* o */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1(value))
    
    inline def setSetAttributesUndefined: Self = StObject.set(x, "setAttributes", js.undefined)
    
    inline def setSetDirty(value: () => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction0(value))
    
    inline def setSetDirtyUndefined: Self = StObject.set(x, "setDirty", js.undefined)
    
    inline def setSetSurface(value: /* surface */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setSurface", js.Any.fromFunction1(value))
    
    inline def setSetSurfaceUndefined: Self = StObject.set(x, "setSurface", js.undefined)
    
    inline def setShow(value: /* o */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}

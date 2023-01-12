package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.draw.sprite.ISprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurface
  extends StObject
     with typings.senchaTouch.Ext.IComponent {
  
  /** [Method] Add a Sprite to the surface  */
  var add: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var background: js.UndefOr[Any] = js.undefined
  
  /** [Method] Empty the surface content without touching the sprites */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Object) */
  var devicePixelRatio: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  /** [Method]
    * @param sprite Ext.draw.sprite.Sprite
    * @param isWithoutTransform Boolean
    * @returns Object
    */
  var getBBox: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* isWithoutTransform */ js.UndefOr[Boolean], Any]
  ] = js.undefined
  
  /** [Method] Returns the value of background
    * @returns Object
    */
  var getBackground: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns true if the surface is dirty
    * @returns Boolean 'true' if the surface is dirty
    */
  var getDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method]
    * @param id String The unique identifier of the group.
    * @returns Ext.draw.Group The group.
    */
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IGroup]] = js.undefined
  
  /** [Method] Returns the value of groups
    * @returns Array
    */
  var getGroups: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of items
    * @returns Ext.draw.Group
    */
  var getItems: js.UndefOr[js.Function0[IGroup]] = js.undefined
  
  /** [Method] Returns the value of region
    * @returns Array
    */
  var getRegion: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Config Option] (Array) */
  var groups: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Ext.draw.Group) */
  var items: js.UndefOr[IGroup] = js.undefined
  
  /** [Method] Invoked when a sprite is adding to the surface
    * @param sprite Ext.draw.sprite.Sprite The sprite to be added.
    */
  var onAdd: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.undefined
  
  /** [Config Option] (Array) */
  var region: js.UndefOr[Array] = js.undefined
  
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
    * @param sprite Ext.draw.sprite.Sprite
    * @param destroySprite Boolean
    */
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Remove all sprites from the surface optionally destroying the sprites in the process  */
  var removeAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Triggers the re rendering of the canvas  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Force the element to redraw  */
  var repaint: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Reset the matrix of the surface  */
  var resetTransform: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Round the number to align to the pixels on device
    * @param num Number The number to align.
    * @returns Number The resultant alignment.
    */
  var roundPixel: js.UndefOr[js.Function1[/* num */ js.UndefOr[Double], Double]] = js.undefined
  
  /** [Method] Sets the value of background
    * @param background Object The new value.
    */
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of groups
    * @param groups Array The new value.
    */
  var setGroups: js.UndefOr[js.Function1[/* groups */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of items
    * @param items Ext.draw.Group The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[IGroup], Unit]] = js.undefined
  
  /** [Method] Sets the value of region
    * @param region Array The new value.
    */
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Mark the surface to render after another surface is updated
    * @param surface Ext.draw.Surface The surface to wait for.
    */
  var waitFor: js.UndefOr[js.Function1[/* surface */ js.UndefOr[this.type], Unit]] = js.undefined
}
object ISurface {
  
  inline def apply(): ISurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISurface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISurface] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: () => Unit): Self = StObject.set(x, "add", js.Any.fromFunction0(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setBackground(value: Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setDevicePixelRatio(value: Any): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setGetBBox(value: (/* sprite */ js.UndefOr[ISprite], /* isWithoutTransform */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "getBBox", js.Any.fromFunction2(value))
    
    inline def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
    
    inline def setGetBackground(value: () => Any): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
    
    inline def setGetBackgroundUndefined: Self = StObject.set(x, "getBackground", js.undefined)
    
    inline def setGetDirty(value: () => Boolean): Self = StObject.set(x, "getDirty", js.Any.fromFunction0(value))
    
    inline def setGetDirtyUndefined: Self = StObject.set(x, "getDirty", js.undefined)
    
    inline def setGetGroup(value: /* id */ js.UndefOr[String] => IGroup): Self = StObject.set(x, "getGroup", js.Any.fromFunction1(value))
    
    inline def setGetGroupUndefined: Self = StObject.set(x, "getGroup", js.undefined)
    
    inline def setGetGroups(value: () => Array): Self = StObject.set(x, "getGroups", js.Any.fromFunction0(value))
    
    inline def setGetGroupsUndefined: Self = StObject.set(x, "getGroups", js.undefined)
    
    inline def setGetItems(value: () => IGroup): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
    
    inline def setGetRegion(value: () => Array): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
    
    inline def setGetRegionUndefined: Self = StObject.set(x, "getRegion", js.undefined)
    
    inline def setGroups(value: Array): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setItems(value: IGroup): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setOnAdd(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setRegion(value: Array): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveAll(value: () => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction0(value))
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRenderFrame(value: () => Unit): Self = StObject.set(x, "renderFrame", js.Any.fromFunction0(value))
    
    inline def setRenderFrameUndefined: Self = StObject.set(x, "renderFrame", js.undefined)
    
    inline def setRepaint(value: () => Unit): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
    
    inline def setRepaintUndefined: Self = StObject.set(x, "repaint", js.undefined)
    
    inline def setResetTransform(value: () => Unit): Self = StObject.set(x, "resetTransform", js.Any.fromFunction0(value))
    
    inline def setResetTransformUndefined: Self = StObject.set(x, "resetTransform", js.undefined)
    
    inline def setRoundPixel(value: /* num */ js.UndefOr[Double] => Double): Self = StObject.set(x, "roundPixel", js.Any.fromFunction1(value))
    
    inline def setRoundPixelUndefined: Self = StObject.set(x, "roundPixel", js.undefined)
    
    inline def setSetBackground(value: /* background */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBackground", js.Any.fromFunction1(value))
    
    inline def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
    
    inline def setSetGroups(value: /* groups */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setGroups", js.Any.fromFunction1(value))
    
    inline def setSetGroupsUndefined: Self = StObject.set(x, "setGroups", js.undefined)
    
    inline def setSetItems(value: /* items */ js.UndefOr[IGroup] => Unit): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
    
    inline def setSetItemsUndefined: Self = StObject.set(x, "setItems", js.undefined)
    
    inline def setSetRegion(value: /* region */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setRegion", js.Any.fromFunction1(value))
    
    inline def setSetRegionUndefined: Self = StObject.set(x, "setRegion", js.undefined)
    
    inline def setWaitFor(value: /* surface */ js.UndefOr[ISurface] => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
  }
}

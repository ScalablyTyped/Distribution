package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroup
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Add sprite to group
  		* @param sprite Ext.draw.sprite.Sprite
  		*/
  var add: js.UndefOr[
    js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Add a list of sprites to group
  		* @param sprites Array|Ext.draw.sprite.Sprite
  		*/
  var addAll: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Clear the group
  		* @param destroySprite Boolean
  		*/
  var clear: js.UndefOr[js.Function1[/* destroySprite */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Iterate all sprites with specific function
  		* @param fn Function Function to iterate.
  		*/
  var each: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Get the sprite with id or index
  		* @param id String|Number
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var get: js.UndefOr[
    js.Function1[
      /* id */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite
    ]
  ] = js.undefined
  /** [Method] Get the i th sprite of the group
  		* @param index Number
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var getAt: js.UndefOr[
    js.Function1[
      /* index */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite
    ]
  ] = js.undefined
  /** [Method] Return the minimal bounding box that contains all the sprites bounding boxes in this group
  		* @param isWithTransform Object
  		*/
  var getBBox: js.UndefOr[js.Function1[/* isWithTransform */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of surface
  		* @returns Object
  		*/
  var getSurface: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Hide all sprites in the group
  		* @param o Boolean Whether to re-render the frame.
  		*/
  var hide: js.UndefOr[js.Function1[/* o */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IGroup: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Remote sprite from group
  		* @param sprite Ext.draw.sprite.Sprite
  		* @param destroySprite Boolean
  		*/
  var remove: js.UndefOr[
    js.Function2[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      /* destroySprite */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Set attributes to all sprites in the group
  		* @param o Object Sprite attribute options just like in Ext.draw.sprite.Sprite.
  		*/
  var setAttributes: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Set dirty flag for all sprites in the group */
  var setDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of surface
  		* @param surface Object The new value.
  		*/
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Display all sprites in the group
  		* @param o Boolean Whether to re-render the frame.
  		*/
  var show: js.UndefOr[js.Function1[/* o */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}


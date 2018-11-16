package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IModifier
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of next
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getNext: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of previous
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getPrevious: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of sprite
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var getSprite: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var next: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be popped up to the top
  		* @param attributes Object The source attributes.
  		* @param changes Object The changes to be popped up.
  		*/
  var popUp: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Validate attribute set before use
  		* @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
  		*/
  var prepareAttributes: js.UndefOr[js.Function1[/* attr */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var previous: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be pushed down to the sprite
  		* @param attr Object The source attributes.
  		* @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
  		* @returns Mixed
  		*/
  var pushDown: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of next
  		* @param next Ext.draw.modifier.Modifier The new value.
  		*/
  var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Sets the value of previous
  		* @param previous Ext.draw.modifier.Modifier The new value.
  		*/
  var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sprite
  		* @param sprite Ext.draw.sprite.Sprite The new value.
  		*/
  var setSprite: js.UndefOr[
    js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Ext.draw.sprite.Sprite) */
  var sprite: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite] = js.undefined
}


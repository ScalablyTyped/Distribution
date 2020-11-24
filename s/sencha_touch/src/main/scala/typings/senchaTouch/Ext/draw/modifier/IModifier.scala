package typings.senchaTouch.Ext.draw.modifier

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModifier extends IBase {
  
  /** [Method] Returns the value of next
    * @returns Ext.draw.modifier.Modifier
    */
  var getNext: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Returns the value of previous
    * @returns Ext.draw.modifier.Modifier
    */
  var getPrevious: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Returns the value of sprite
    * @returns Ext.draw.sprite.Sprite
    */
  var getSprite: js.UndefOr[js.Function0[ISprite]] = js.native
  
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var next: js.UndefOr[IModifier] = js.native
  
  /** [Method] Invoked when changes need to be popped up to the top
    * @param attributes Object The source attributes.
    * @param changes Object The changes to be popped up.
    */
  var popUp: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Validate attribute set before use
    * @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
    */
  var prepareAttributes: js.UndefOr[js.Function1[/* attr */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var previous: js.UndefOr[IModifier] = js.native
  
  /** [Method] Invoked when changes need to be pushed down to the sprite
    * @param attr Object The source attributes.
    * @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
    * @returns Mixed
    */
  var pushDown: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Sets the value of next
    * @param next Ext.draw.modifier.Modifier The new value.
    */
  var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.native
  
  /** [Method] Sets the value of previous
    * @param previous Ext.draw.modifier.Modifier The new value.
    */
  var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.native
  
  /** [Method] Sets the value of sprite
    * @param sprite Ext.draw.sprite.Sprite The new value.
    */
  var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  
  /** [Config Option] (Ext.draw.sprite.Sprite) */
  var sprite: js.UndefOr[ISprite] = js.native
}
object IModifier {
  
  @scala.inline
  def apply(): IModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModifier]
  }
  
  @scala.inline
  implicit class IModifierOps[Self <: IModifier] (val x: Self) extends AnyVal {
    
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
    def setGetNext(value: () => IModifier): Self = this.set("getNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNext: Self = this.set("getNext", js.undefined)
    
    @scala.inline
    def setGetPrevious(value: () => IModifier): Self = this.set("getPrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPrevious: Self = this.set("getPrevious", js.undefined)
    
    @scala.inline
    def setGetSprite(value: () => ISprite): Self = this.set("getSprite", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSprite: Self = this.set("getSprite", js.undefined)
    
    @scala.inline
    def setNext(value: IModifier): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPopUp(value: (/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Unit): Self = this.set("popUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePopUp: Self = this.set("popUp", js.undefined)
    
    @scala.inline
    def setPrepareAttributes(value: /* attr */ js.UndefOr[js.Any] => Unit): Self = this.set("prepareAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrepareAttributes: Self = this.set("prepareAttributes", js.undefined)
    
    @scala.inline
    def setPrevious(value: IModifier): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setPushDown(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _): Self = this.set("pushDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePushDown: Self = this.set("pushDown", js.undefined)
    
    @scala.inline
    def setSetNext(value: /* next */ js.UndefOr[IModifier] => Unit): Self = this.set("setNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetNext: Self = this.set("setNext", js.undefined)
    
    @scala.inline
    def setSetPrevious(value: /* previous */ js.UndefOr[IModifier] => Unit): Self = this.set("setPrevious", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPrevious: Self = this.set("setPrevious", js.undefined)
    
    @scala.inline
    def setSetSprite(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = this.set("setSprite", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSprite: Self = this.set("setSprite", js.undefined)
    
    @scala.inline
    def setSprite(value: ISprite): Self = this.set("sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
  }
}

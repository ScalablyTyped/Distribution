package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroup extends IObservable {
  /** [Method] Add sprite to group
    * @param sprite Ext.draw.sprite.Sprite
    */
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  /** [Method] Add a list of sprites to group
    * @param sprites Array|Ext.draw.sprite.Sprite
    */
  var addAll: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Clear the group
    * @param destroySprite Boolean
    */
  var clear: js.UndefOr[js.Function1[/* destroySprite */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Iterate all sprites with specific function
    * @param fn Function Function to iterate.
    */
  var each: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Get the sprite with id or index
    * @param id String|Number
    * @returns Ext.draw.sprite.Sprite
    */
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], ISprite]] = js.native
  /** [Method] Get the i th sprite of the group
    * @param index Number
    * @returns Ext.draw.sprite.Sprite
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], ISprite]] = js.native
  /** [Method] Return the minimal bounding box that contains all the sprites bounding boxes in this group
    * @param isWithTransform Object
    */
  var getBBox: js.UndefOr[js.Function1[/* isWithTransform */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of surface
    * @returns Object
    */
  var getSurface: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Hide all sprites in the group
    * @param o Boolean Whether to re-render the frame.
    */
  var hide: js.UndefOr[js.Function1[/* o */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IGroup: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Remote sprite from group
    * @param sprite Ext.draw.sprite.Sprite
    * @param destroySprite Boolean
    */
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Set attributes to all sprites in the group
    * @param o Object Sprite attribute options just like in Ext.draw.sprite.Sprite.
    */
  var setAttributes: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Set dirty flag for all sprites in the group */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of surface
    * @param surface Object The new value.
    */
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Display all sprites in the group
    * @param o Boolean Whether to re-render the frame.
    */
  var show: js.UndefOr[js.Function1[/* o */ js.UndefOr[Boolean], Unit]] = js.native
}

object IGroup {
  @scala.inline
  def apply(): IGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroup]
  }
  @scala.inline
  implicit class IGroupOps[Self <: IGroup] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddAll(value: /* sprites */ js.UndefOr[js.Any] => Unit): Self = this.set("addAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddAll: Self = this.set("addAll", js.undefined)
    @scala.inline
    def setClear(value: /* destroySprite */ js.UndefOr[Boolean] => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setEach(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setGet(value: /* id */ js.UndefOr[js.Any] => ISprite): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => ISprite): Self = this.set("getAt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAt: Self = this.set("getAt", js.undefined)
    @scala.inline
    def setGetBBox(value: /* isWithTransform */ js.UndefOr[js.Any] => Unit): Self = this.set("getBBox", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetBBox: Self = this.set("getBBox", js.undefined)
    @scala.inline
    def setGetSurface(value: () => _): Self = this.set("getSurface", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSurface: Self = this.set("getSurface", js.undefined)
    @scala.inline
    def setHide(value: /* o */ js.UndefOr[Boolean] => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setSetAttributes(value: /* o */ js.UndefOr[js.Any] => Unit): Self = this.set("setAttributes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAttributes: Self = this.set("setAttributes", js.undefined)
    @scala.inline
    def setSetDirty(value: () => Unit): Self = this.set("setDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetDirty: Self = this.set("setDirty", js.undefined)
    @scala.inline
    def setSetSurface(value: /* surface */ js.UndefOr[js.Any] => Unit): Self = this.set("setSurface", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSurface: Self = this.set("setSurface", js.undefined)
    @scala.inline
    def setShow(value: /* o */ js.UndefOr[Boolean] => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}


package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurface
  extends typings.senchaTouch.Ext.IComponent {
  /** [Method] Add a Sprite to the surface  */
  var add: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Method] Empty the surface content without touching the sprites */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Object) */
  var devicePixelRatio: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.native
  /** [Method]
    * @param sprite Ext.draw.sprite.Sprite
    * @param isWithoutTransform Boolean
    * @returns Object
    */
  var getBBox: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* isWithoutTransform */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns the value of background
    * @returns Object
    */
  var getBackground: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns true if the surface is dirty
    * @returns Boolean 'true' if the surface is dirty
    */
  var getDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method]
    * @param id String The unique identifier of the group.
    * @returns Ext.draw.Group The group.
    */
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IGroup]] = js.native
  /** [Method] Returns the value of groups
    * @returns Array
    */
  var getGroups: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of items
    * @returns Ext.draw.Group
    */
  var getItems: js.UndefOr[js.Function0[IGroup]] = js.native
  /** [Method] Returns the value of region
    * @returns Array
    */
  var getRegion: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Array) */
  var groups: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.draw.Group) */
  var items: js.UndefOr[IGroup] = js.native
  /** [Method] Invoked when a sprite is adding to the surface
    * @param sprite Ext.draw.sprite.Sprite The sprite to be added.
    */
  var onAdd: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  /** [Config Option] (Array) */
  var region: js.UndefOr[Array] = js.native
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
    * @param sprite Ext.draw.sprite.Sprite
    * @param destroySprite Boolean
    */
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Remove all sprites from the surface optionally destroying the sprites in the process  */
  var removeAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Triggers the re rendering of the canvas  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Force the element to redraw  */
  var repaint: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Reset the matrix of the surface  */
  var resetTransform: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Round the number to align to the pixels on device
    * @param num Number The number to align.
    * @returns Number The resultant alignment.
    */
  var roundPixel: js.UndefOr[js.Function1[/* num */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Sets the value of background
    * @param background Object The new value.
    */
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of groups
    * @param groups Array The new value.
    */
  var setGroups: js.UndefOr[js.Function1[/* groups */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of items
    * @param items Ext.draw.Group The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[IGroup], Unit]] = js.native
  /** [Method] Sets the value of region
    * @param region Array The new value.
    */
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Mark the surface to render after another surface is updated
    * @param surface Ext.draw.Surface The surface to wait for.
    */
  var waitFor: js.UndefOr[js.Function1[/* surface */ js.UndefOr[this.type], Unit]] = js.native
}

object ISurface {
  @scala.inline
  def apply(): ISurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISurface]
  }
  @scala.inline
  implicit class ISurfaceOps[Self <: ISurface] (val x: Self) extends AnyVal {
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
    def setAdd(value: () => Unit): Self = this.set("add", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setBackground(value: js.Any): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setDevicePixelRatio(value: js.Any): Self = this.set("devicePixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePixelRatio: Self = this.set("devicePixelRatio", js.undefined)
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    @scala.inline
    def setGetBBox(value: (/* sprite */ js.UndefOr[ISprite], /* isWithoutTransform */ js.UndefOr[Boolean]) => _): Self = this.set("getBBox", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetBBox: Self = this.set("getBBox", js.undefined)
    @scala.inline
    def setGetBackground(value: () => _): Self = this.set("getBackground", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBackground: Self = this.set("getBackground", js.undefined)
    @scala.inline
    def setGetDirty(value: () => Boolean): Self = this.set("getDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDirty: Self = this.set("getDirty", js.undefined)
    @scala.inline
    def setGetGroup(value: /* id */ js.UndefOr[String] => IGroup): Self = this.set("getGroup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetGroup: Self = this.set("getGroup", js.undefined)
    @scala.inline
    def setGetGroups(value: () => Array): Self = this.set("getGroups", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGroups: Self = this.set("getGroups", js.undefined)
    @scala.inline
    def setGetItems(value: () => IGroup): Self = this.set("getItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    @scala.inline
    def setGetRegion(value: () => Array): Self = this.set("getRegion", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRegion: Self = this.set("getRegion", js.undefined)
    @scala.inline
    def setGroups(value: Array): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setItems(value: IGroup): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOnAdd(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setRegion(value: Array): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = this.set("removeAll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    @scala.inline
    def setRenderFrame(value: () => Unit): Self = this.set("renderFrame", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderFrame: Self = this.set("renderFrame", js.undefined)
    @scala.inline
    def setRepaint(value: () => Unit): Self = this.set("repaint", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRepaint: Self = this.set("repaint", js.undefined)
    @scala.inline
    def setResetTransform(value: () => Unit): Self = this.set("resetTransform", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetTransform: Self = this.set("resetTransform", js.undefined)
    @scala.inline
    def setRoundPixel(value: /* num */ js.UndefOr[Double] => Double): Self = this.set("roundPixel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRoundPixel: Self = this.set("roundPixel", js.undefined)
    @scala.inline
    def setSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = this.set("setBackground", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBackground: Self = this.set("setBackground", js.undefined)
    @scala.inline
    def setSetGroups(value: /* groups */ js.UndefOr[Array] => Unit): Self = this.set("setGroups", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGroups: Self = this.set("setGroups", js.undefined)
    @scala.inline
    def setSetItems(value: /* items */ js.UndefOr[IGroup] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetItems: Self = this.set("setItems", js.undefined)
    @scala.inline
    def setSetRegion(value: /* region */ js.UndefOr[Array] => Unit): Self = this.set("setRegion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRegion: Self = this.set("setRegion", js.undefined)
    @scala.inline
    def setWaitFor(value: /* surface */ js.UndefOr[ISurface] => Unit): Self = this.set("waitFor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWaitFor: Self = this.set("waitFor", js.undefined)
  }
  
}


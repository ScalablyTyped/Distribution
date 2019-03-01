package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurface
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Method] Add a Sprite to the surface  */
  var add: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Method] Empty the surface content without touching the sprites */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var devicePixelRatio: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var dirty: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method]
  		* @param sprite Ext.draw.sprite.Sprite
  		* @param isWithoutTransform Boolean
  		* @returns Object
  		*/
  var getBBox: js.UndefOr[
    js.Function2[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      /* isWithoutTransform */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns true if the surface is dirty
  		* @returns Boolean 'true' if the surface is dirty
  		*/
  var getDirty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method]
  		* @param id String The unique identifier of the group.
  		* @returns Ext.draw.Group The group.
  		*/
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IGroup]] = js.undefined
  /** [Method] Returns the value of groups
  		* @returns Array
  		*/
  var getGroups: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of items
  		* @returns Ext.draw.Group
  		*/
  var getItems: js.UndefOr[js.Function0[IGroup]] = js.undefined
  /** [Method] Returns the value of region
  		* @returns Array
  		*/
  var getRegion: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Array) */
  var groups: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.draw.Group) */
  var items: js.UndefOr[IGroup] = js.undefined
  /** [Method] Invoked when a sprite is adding to the surface
  		* @param sprite Ext.draw.sprite.Sprite The sprite to be added.
  		*/
  var onAdd: js.UndefOr[
    js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Array) */
  var region: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
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
  /** [Method] Remove all sprites from the surface optionally destroying the sprites in the process  */
  var removeAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Triggers the re rendering of the canvas  */
  var renderFrame: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Force the element to redraw  */
  var repaint: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Reset the matrix of the surface  */
  var resetTransform: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Round the number to align to the pixels on device
  		* @param num Number The number to align.
  		* @returns Number The resultant alignment.
  		*/
  var roundPixel: js.UndefOr[js.Function1[/* num */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of groups
  		* @param groups Array The new value.
  		*/
  var setGroups: js.UndefOr[
    js.Function1[/* groups */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of items
  		* @param items Ext.draw.Group The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[IGroup], scala.Unit]] = js.undefined
  /** [Method] Sets the value of region
  		* @param region Array The new value.
  		*/
  var setRegion: js.UndefOr[
    js.Function1[/* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Mark the surface to render after another surface is updated
  		* @param surface Ext.draw.Surface The surface to wait for.
  		*/
  var waitFor: js.UndefOr[js.Function1[/* surface */ js.UndefOr[this.type], scala.Unit]] = js.undefined
}

object ISurface {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    add: js.Function0[scala.Unit] = null,
    background: js.Any = null,
    clear: js.Function0[scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    devicePixelRatio: js.Any = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    getBBox: js.Function2[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      /* isWithoutTransform */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    getBackground: js.Function0[_] = null,
    getDirty: js.Function0[scala.Boolean] = null,
    getGroup: js.Function1[/* id */ js.UndefOr[java.lang.String], IGroup] = null,
    getGroups: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getItems: js.Function0[IGroup] = null,
    getRegion: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    groups: senchaUnderscoreTouchLib.ExtNs.Array = null,
    items: IGroup = null,
    onAdd: js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ] = null,
    region: senchaUnderscoreTouchLib.ExtNs.Array = null,
    remove: js.Function2[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      /* destroySprite */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    removeAll: js.Function0[scala.Unit] = null,
    renderFrame: js.Function0[scala.Unit] = null,
    repaint: js.Function0[scala.Unit] = null,
    resetTransform: js.Function0[scala.Unit] = null,
    roundPixel: js.Function1[/* num */ js.UndefOr[scala.Double], scala.Double] = null,
    setBackground: js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit] = null,
    setGroups: js.Function1[/* groups */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setItems: js.Function1[/* items */ js.UndefOr[IGroup], scala.Unit] = null,
    setRegion: js.Function1[/* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    waitFor: js.Function1[/* surface */ js.UndefOr[ISurface], scala.Unit] = null
  ): ISurface = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (add != null) __obj.updateDynamic("add")(add)
    if (background != null) __obj.updateDynamic("background")(background)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (devicePixelRatio != null) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (getBBox != null) __obj.updateDynamic("getBBox")(getBBox)
    if (getBackground != null) __obj.updateDynamic("getBackground")(getBackground)
    if (getDirty != null) __obj.updateDynamic("getDirty")(getDirty)
    if (getGroup != null) __obj.updateDynamic("getGroup")(getGroup)
    if (getGroups != null) __obj.updateDynamic("getGroups")(getGroups)
    if (getItems != null) __obj.updateDynamic("getItems")(getItems)
    if (getRegion != null) __obj.updateDynamic("getRegion")(getRegion)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (items != null) __obj.updateDynamic("items")(items)
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (region != null) __obj.updateDynamic("region")(region)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(renderFrame)
    if (repaint != null) __obj.updateDynamic("repaint")(repaint)
    if (resetTransform != null) __obj.updateDynamic("resetTransform")(resetTransform)
    if (roundPixel != null) __obj.updateDynamic("roundPixel")(roundPixel)
    if (setBackground != null) __obj.updateDynamic("setBackground")(setBackground)
    if (setGroups != null) __obj.updateDynamic("setGroups")(setGroups)
    if (setItems != null) __obj.updateDynamic("setItems")(setItems)
    if (setRegion != null) __obj.updateDynamic("setRegion")(setRegion)
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[ISurface]
  }
}


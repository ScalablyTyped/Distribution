package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPath extends ISprite {
  /** [Config Option] (String) */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IPath: js.UndefOr[js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Update the path
  		* @param path Ext.draw.Path An empty path to draw on using path API.
  		* @param attr Object The attribute object. Note: DO NOT use the sprite.attr instead of this if you want to work with instancing.
  		*/
  var updatePath: js.UndefOr[
    js.Function2[/* path */ js.UndefOr[this.type], /* attr */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
  		* @param transform Object
  		*/
  @JSName("updateTransformedBBox")
  var updateTransformedBBox_IPath: js.UndefOr[js.Function1[/* transform */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}


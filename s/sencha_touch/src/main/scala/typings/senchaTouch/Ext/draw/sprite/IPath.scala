package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPath
  extends StObject
     with ISprite {
  
  /** [Config Option] (String) */
  var path: js.UndefOr[String] = js.undefined
  
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IPath: js.UndefOr[
    js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Method] Update the path
    * @param path Ext.draw.Path An empty path to draw on using path API.
    * @param attr Object The attribute object. Note: DO NOT use the sprite.attr instead of this if you want to work with instancing.
    */
  var updatePath: js.UndefOr[
    js.Function2[/* path */ js.UndefOr[this.type], /* attr */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
    * @param transform Object
    */
  @JSName("updateTransformedBBox")
  var updateTransformedBBox_IPath: js.UndefOr[js.Function1[/* transform */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object IPath {
  
  @scala.inline
  def apply(): IPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPath]
  }
  
  @scala.inline
  implicit class IPathMutableBuilder[Self <: IPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRender(value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setUpdatePath(value: (/* path */ js.UndefOr[IPath], /* attr */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
    
    @scala.inline
    def setUpdateTransformedBBox(value: /* transform */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updateTransformedBBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateTransformedBBoxUndefined: Self = StObject.set(x, "updateTransformedBBox", js.undefined)
  }
}

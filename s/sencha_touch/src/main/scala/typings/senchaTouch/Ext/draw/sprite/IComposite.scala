package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComposite
  extends StObject
     with ISprite {
  
  /** [Method] Adds a sprite to the composite
    * @param sprite Object
    */
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Renders all sprites contained in the composite to the surface
    * @param surface Object
    * @param ctx Object
    * @param region Object
    */
  @JSName("render")
  var render_IComposite: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[Any], 
      /* ctx */ js.UndefOr[Any], 
      /* region */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object IComposite {
  
  inline def apply(): IComposite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComposite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IComposite] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* sprite */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRender(
      value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* region */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}

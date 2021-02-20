package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInstancing extends ISprite {
  
  /** [Method] Creates a new sprite instance
    * @param config Object The configuration of the instance.
    * @param data Object
    * @param bypassNormalization Boolean 'true' to bypass attribute normalization.
    * @param avoidCopy Boolean 'true' to avoid copying.
    * @returns Object The attributes of the instance.
    */
  var createInstance: js.UndefOr[
    js.Function4[
      /* config */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      /* avoidCopy */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  
  /** [Method] Returns the bounding box for the instance at the given index
    * @param index Number The index of the instance.
    * @param isWithoutTransform Boolean 'true' to not apply sprite transforms to the bounding box.
    * @returns Object The bounding box for the instance.
    */
  var getBBoxFor: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* isWithoutTransform */ js.UndefOr[Boolean], _]
  ] = js.native
  
  /** [Method] Not supported
    * @returns null
    */
  @JSName("getBBox")
  var getBBox_IInstancing: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of template
    * @returns Object
    */
  var getTemplate: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @param clipRegion Object
    * @param region Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IInstancing: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Sets the attributes for the instance at the given index
    * @param index Number the index of the instance
    * @param changes Object the attributes to change
    * @param bypassNormalization Boolean 'true' to avoid attribute normalization
    */
  var setAttributesFor: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the value of template
    * @param template Object The new value.
    */
  var setTemplate: js.UndefOr[js.Function1[/* template */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var template: js.UndefOr[js.Any] = js.native
}
object IInstancing {
  
  @scala.inline
  def apply(): IInstancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInstancing]
  }
  
  @scala.inline
  implicit class IInstancingMutableBuilder[Self <: IInstancing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateInstance(
      value: (/* config */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => _
    ): Self = StObject.set(x, "createInstance", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateInstanceUndefined: Self = StObject.set(x, "createInstance", js.undefined)
    
    @scala.inline
    def setGetBBox(value: () => _): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBBoxFor(value: (/* index */ js.UndefOr[Double], /* isWithoutTransform */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "getBBoxFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBBoxForUndefined: Self = StObject.set(x, "getBBoxFor", js.undefined)
    
    @scala.inline
    def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
    
    @scala.inline
    def setGetTemplate(value: () => _): Self = StObject.set(x, "getTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemplateUndefined: Self = StObject.set(x, "getTemplate", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSetAttributesFor(
      value: (/* index */ js.UndefOr[Double], /* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "setAttributesFor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributesForUndefined: Self = StObject.set(x, "setAttributesFor", js.undefined)
    
    @scala.inline
    def setSetTemplate(value: /* template */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTemplateUndefined: Self = StObject.set(x, "setTemplate", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}

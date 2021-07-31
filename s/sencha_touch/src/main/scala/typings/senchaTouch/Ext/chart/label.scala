package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.draw.modifier.IModifier
import typings.senchaTouch.Ext.draw.sprite.IText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object label {
  
  trait ICallout
    extends StObject
       with IModifier
  object ICallout {
    
    @scala.inline
    def apply(): ICallout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICallout]
    }
  }
  
  trait ILabel
    extends StObject
       with IText {
    
    /** [Config Option] (Object) */
    var fx: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of field
      * @returns Object
      */
    var getField: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of fx
      * @returns Object
      */
    var getFx: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @param clipRegion Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_ILabel: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of field
      * @param field Object The new value.
      */
    var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of fx
      * @param fx Object The new value.
      */
    var setFx: js.UndefOr[js.Function1[/* fx */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ILabel {
    
    @scala.inline
    def apply(): ILabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabel]
    }
    
    @scala.inline
    implicit class ILabelMutableBuilder[Self <: ILabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFx(value: js.Any): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setGetField(value: () => js.Any): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
      
      @scala.inline
      def setGetFx(value: () => js.Any): Self = StObject.set(x, "getFx", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFxUndefined: Self = StObject.set(x, "getFx", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSetField(value: /* field */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
      
      @scala.inline
      def setSetFx(value: /* fx */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFxUndefined: Self = StObject.set(x, "setFx", js.undefined)
    }
  }
}

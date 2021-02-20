package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.draw.engine.ISvgContext
import typings.senchaTouch.Ext.mixin.IIdentifiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradient {
  
  @js.native
  trait IGradient extends IIdentifiable {
    
    /** [Config Option] (Array/Object) */
    var Defines: js.UndefOr[js.Any] = js.native
    
    /** [Method] Generates the gradient for the given context
      * @param ctx Ext.draw.engine.SvgContext The context.
      * @param bbox Object
      * @returns Object
      */
    var generateGradient: js.UndefOr[
        js.Function2[/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any], _]
      ] = js.native
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    @JSName("getId")
    var getId_IGradient: js.UndefOr[js.Function0[String]] = js.native
  }
  object IGradient {
    
    @scala.inline
    def apply(): IGradient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGradient]
    }
    
    @scala.inline
    implicit class IGradientMutableBuilder[Self <: IGradient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefines(value: js.Any): Self = StObject.set(x, "Defines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinesUndefined: Self = StObject.set(x, "Defines", js.undefined)
      
      @scala.inline
      def setGenerateGradient(value: (/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "generateGradient", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateGradientUndefined: Self = StObject.set(x, "generateGradient", js.undefined)
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    }
  }
  
  @js.native
  trait ILinear extends IGradient {
    
    /** [Config Option] (Number) */
    var The: js.UndefOr[Double] = js.native
  }
  object ILinear {
    
    @scala.inline
    def apply(): ILinear = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinear]
    }
    
    @scala.inline
    implicit class ILinearMutableBuilder[Self <: ILinear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThe(value: Double): Self = StObject.set(x, "The", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheUndefined: Self = StObject.set(x, "The", js.undefined)
    }
  }
  
  @js.native
  trait IRadial extends IGradient {
    
    /** [Config Option] (Object) */
    var end: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns the value of end
      * @returns Object
      */
    var getEnd: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of start
      * @returns Object
      */
    var getStart: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of end
      * @param end Object The new value.
      */
    var setEnd: js.UndefOr[js.Function1[/* end */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of start
      * @param start Object The new value.
      */
    var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Object) */
    var start: js.UndefOr[js.Any] = js.native
  }
  object IRadial {
    
    @scala.inline
    def apply(): IRadial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadial]
    }
    
    @scala.inline
    implicit class IRadialMutableBuilder[Self <: IRadial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setGetEnd(value: () => _): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEndUndefined: Self = StObject.set(x, "getEnd", js.undefined)
      
      @scala.inline
      def setGetStart(value: () => _): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStartUndefined: Self = StObject.set(x, "getStart", js.undefined)
      
      @scala.inline
      def setSetEnd(value: /* end */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEndUndefined: Self = StObject.set(x, "setEnd", js.undefined)
      
      @scala.inline
      def setSetStart(value: /* start */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStartUndefined: Self = StObject.set(x, "setStart", js.undefined)
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}

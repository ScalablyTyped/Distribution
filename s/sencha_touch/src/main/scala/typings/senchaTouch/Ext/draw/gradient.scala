package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.draw.engine.ISvgContext
import typings.senchaTouch.Ext.mixin.IIdentifiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradient {
  
  trait IGradient
    extends StObject
       with IIdentifiable {
    
    /** [Config Option] (Array/Object) */
    var Defines: js.UndefOr[Any] = js.undefined
    
    /** [Method] Generates the gradient for the given context
      * @param ctx Ext.draw.engine.SvgContext The context.
      * @param bbox Object
      * @returns Object
      */
    var generateGradient: js.UndefOr[js.Function2[/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    @JSName("getId")
    var getId_IGradient: js.UndefOr[js.Function0[String]] = js.undefined
  }
  object IGradient {
    
    inline def apply(): IGradient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGradient]
    }
    
    extension [Self <: IGradient](x: Self) {
      
      inline def setDefines(value: Any): Self = StObject.set(x, "Defines", value.asInstanceOf[js.Any])
      
      inline def setDefinesUndefined: Self = StObject.set(x, "Defines", js.undefined)
      
      inline def setGenerateGradient(value: (/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "generateGradient", js.Any.fromFunction2(value))
      
      inline def setGenerateGradientUndefined: Self = StObject.set(x, "generateGradient", js.undefined)
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    }
  }
  
  trait ILinear
    extends StObject
       with IGradient {
    
    /** [Config Option] (Number) */
    var The: js.UndefOr[Double] = js.undefined
  }
  object ILinear {
    
    inline def apply(): ILinear = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinear]
    }
    
    extension [Self <: ILinear](x: Self) {
      
      inline def setThe(value: Double): Self = StObject.set(x, "The", value.asInstanceOf[js.Any])
      
      inline def setTheUndefined: Self = StObject.set(x, "The", js.undefined)
    }
  }
  
  trait IRadial
    extends StObject
       with IGradient {
    
    /** [Config Option] (Object) */
    var end: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of end
      * @returns Object
      */
    var getEnd: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of start
      * @returns Object
      */
    var getStart: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of end
      * @param end Object The new value.
      */
    var setEnd: js.UndefOr[js.Function1[/* end */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of start
      * @param start Object The new value.
      */
    var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var start: js.UndefOr[Any] = js.undefined
  }
  object IRadial {
    
    inline def apply(): IRadial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadial]
    }
    
    extension [Self <: IRadial](x: Self) {
      
      inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setGetEnd(value: () => Any): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
      
      inline def setGetEndUndefined: Self = StObject.set(x, "getEnd", js.undefined)
      
      inline def setGetStart(value: () => Any): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
      
      inline def setGetStartUndefined: Self = StObject.set(x, "getStart", js.undefined)
      
      inline def setSetEnd(value: /* end */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction1(value))
      
      inline def setSetEndUndefined: Self = StObject.set(x, "setEnd", js.undefined)
      
      inline def setSetStart(value: /* start */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction1(value))
      
      inline def setSetStartUndefined: Self = StObject.set(x, "setStart", js.undefined)
      
      inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}

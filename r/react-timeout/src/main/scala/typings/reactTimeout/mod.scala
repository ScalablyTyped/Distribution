package typings.reactTimeout

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-timeout", JSImport.Namespace)
  @js.native
  def apply[T](SourceComponent: ComponentClass[T, ComponentState]): ComponentClass[T, ComponentState] = js.native
  @JSImport("react-timeout", JSImport.Namespace)
  @js.native
  def apply[T](SourceComponent: StatelessComponent[T]): ComponentClass[T, ComponentState] = js.native
  
  type Id = Double
  
  @js.native
  trait ReactTimeoutProps extends StObject {
    
    var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
    
    var clearImmediate: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
    
    var clearInterval: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
    
    var clearTimeout: js.UndefOr[js.Function1[/* timer */ Timer, Unit]] = js.native
    
    var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Id]] = js.native
    
    var setImmediate: js.UndefOr[
        js.Function2[/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any, Id]
      ] = js.native
    
    var setInterval: js.UndefOr[
        js.Function3[
          /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
          /* ms */ Double, 
          /* repeated */ js.Any, 
          Id
        ]
      ] = js.native
    
    var setTimeout: js.UndefOr[
        js.Function3[
          /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
          /* ms */ Double, 
          /* repeated */ js.Any, 
          Timer
        ]
      ] = js.native
  }
  object ReactTimeoutProps {
    
    @scala.inline
    def apply(): ReactTimeoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactTimeoutProps]
    }
    
    @scala.inline
    implicit class ReactTimeoutPropsMutableBuilder[Self <: ReactTimeoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelAnimationFrame(value: /* id */ Id => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCancelAnimationFrameUndefined: Self = StObject.set(x, "cancelAnimationFrame", js.undefined)
      
      @scala.inline
      def setClearImmediate(value: /* id */ Id => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearImmediateUndefined: Self = StObject.set(x, "clearImmediate", js.undefined)
      
      @scala.inline
      def setClearInterval(value: /* id */ Id => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearIntervalUndefined: Self = StObject.set(x, "clearInterval", js.undefined)
      
      @scala.inline
      def setClearTimeout(value: /* timer */ Timer => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearTimeoutUndefined: Self = StObject.set(x, "clearTimeout", js.undefined)
      
      @scala.inline
      def setRequestAnimationFrame(value: /* callback */ js.Function1[/* repeated */ js.Any, Unit] => Id): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      @scala.inline
      def setSetImmediate(value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Id): Self = StObject.set(x, "setImmediate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetImmediateUndefined: Self = StObject.set(x, "setImmediate", js.undefined)
      
      @scala.inline
      def setSetInterval(
        value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Id
      ): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
      
      @scala.inline
      def setSetTimeout(
        value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timer
      ): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    }
  }
  
  type Timer = typings.node.NodeJS.Timer | Double
}

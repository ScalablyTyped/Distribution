package typings.primereact

import typings.react.mod.Component
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredContentMod {
  
  @JSImport("primereact/components/deferredcontent/DeferredContent", "DeferredContent")
  @js.native
  class DeferredContent protected ()
    extends Component[DeferredContentProps, js.Any, js.Any] {
    def this(props: DeferredContentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DeferredContentProps, context: js.Any) = this()
  }
  
  trait DeferredContentProps extends StObject {
    
    var onLoad: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object DeferredContentProps {
    
    inline def apply(): DeferredContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeferredContentProps]
    }
    
    extension [Self <: DeferredContentProps](x: Self) {
      
      inline def setOnLoad(value: /* event */ Event => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    }
  }
}

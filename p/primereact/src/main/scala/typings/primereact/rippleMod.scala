package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rippleMod {
  
  @JSImport("primereact/components/ripple/Ripple", "Ripple")
  @js.native
  class Ripple protected ()
    extends Component[RippleProps, js.Any, js.Any] {
    def this(props: RippleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RippleProps, context: js.Any) = this()
  }
  
  trait RippleProps extends StObject
}

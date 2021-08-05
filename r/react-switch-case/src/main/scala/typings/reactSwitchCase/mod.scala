package typings.reactSwitchCase

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-switch-case", JSImport.Default)
  @js.native
  class default ()
    extends Component[SwitchProps, js.Object, js.Any]
  
  @JSImport("react-switch-case", "Case")
  @js.native
  class Case protected ()
    extends Component[CaseProps, js.Object, js.Any] {
    def this(props: CaseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CaseProps, context: js.Any) = this()
  }
  
  @JSImport("react-switch-case", "Default")
  @js.native
  class Default_ protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  trait CaseProps extends StObject {
    
    var value: js.Any
  }
  object CaseProps {
    
    inline def apply(value: js.Any): CaseProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaseProps]
    }
    
    extension [Self <: CaseProps](x: Self) {
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Switch = Component[SwitchProps, js.Object, js.Any]
  
  trait SwitchProps extends StObject {
    
    var condition: js.Any
  }
  object SwitchProps {
    
    inline def apply(condition: js.Any): SwitchProps = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setCondition(value: js.Any): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    }
  }
}

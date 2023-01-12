package typings.reactSwitchCase

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-switch-case", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SwitchProps, js.Object, Any]
  
  @JSImport("react-switch-case", "Case")
  @js.native
  open class Case protected ()
    extends Component[CaseProps, js.Object, Any] {
    def this(props: CaseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CaseProps, context: Any) = this()
  }
  
  @JSImport("react-switch-case", "Default")
  @js.native
  open class Default_ protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  trait CaseProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var value: Any
  }
  object CaseProps {
    
    inline def apply(value: Any): CaseProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaseProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Switch = Component[SwitchProps, js.Object, Any]
  
  trait SwitchProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var condition: Any
  }
  object SwitchProps {
    
    inline def apply(condition: Any): SwitchProps = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCondition(value: Any): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    }
  }
}

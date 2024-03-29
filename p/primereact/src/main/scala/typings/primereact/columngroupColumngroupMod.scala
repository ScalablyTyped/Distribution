package typings.primereact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columngroupColumngroupMod {
  
  @JSImport("primereact/columngroup/columngroup", "ColumnGroup")
  @js.native
  open class ColumnGroup protected () extends Component[ColumnGroupProps, Any, Any] {
    def this(props: ColumnGroupProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnGroupProps, context: Any) = this()
  }
  
  trait ColumnGroupProps extends StObject {
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object ColumnGroupProps {
    
    inline def apply(): ColumnGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnGroupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}

package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableBody", JSImport.Default)
  @js.native
  val default: StatelessComponent[TableBodyProps] = js.native
  
  @js.native
  trait StrictTableBodyProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
  }
  object StrictTableBodyProps {
    
    @scala.inline
    def apply(): StrictTableBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableBodyProps]
    }
    
    @scala.inline
    implicit class StrictTableBodyPropsMutableBuilder[Self <: StrictTableBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait TableBodyProps
    extends StrictTableBodyProps
       with /* key */ StringDictionary[js.Any]
  object TableBodyProps {
    
    @scala.inline
    def apply(): TableBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBodyProps]
    }
  }
  
  type _To = StatelessComponent[TableBodyProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableBodyMod.foo` */
  override def _to: StatelessComponent[TableBodyProps] = default
}

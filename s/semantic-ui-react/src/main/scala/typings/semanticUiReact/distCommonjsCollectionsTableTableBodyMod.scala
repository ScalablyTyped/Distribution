package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsTableTableBodyMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableBody", JSImport.Default)
  @js.native
  val default: FC[TableBodyProps] = js.native
  
  trait StrictTableBodyProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
  }
  object StrictTableBodyProps {
    
    inline def apply(): StrictTableBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableBodyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictTableBodyProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait TableBodyProps
    extends StObject
       with StrictTableBodyProps
       with /* key */ StringDictionary[Any]
  object TableBodyProps {
    
    inline def apply(): TableBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBodyProps]
    }
  }
  
  type _To = FC[TableBodyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsTableTableBodyMod.foo` */
  override def _to: FC[TableBodyProps] = default
}

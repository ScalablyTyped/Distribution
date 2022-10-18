package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsButtonButtonOrMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonOr", JSImport.Default)
  @js.native
  val default: FC[ButtonOrProps] = js.native
  
  trait ButtonOrProps
    extends StObject
       with StrictButtonOrProps
       with /* key */ StringDictionary[Any]
  object ButtonOrProps {
    
    inline def apply(): ButtonOrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOrProps]
    }
  }
  
  trait StrictButtonOrProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Or buttons can have their text localized, or adjusted by using the text prop. */
    var text: js.UndefOr[Double | String] = js.undefined
  }
  object StrictButtonOrProps {
    
    inline def apply(): StrictButtonOrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonOrProps]
    }
    
    extension [Self <: StrictButtonOrProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setText(value: Double | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = FC[ButtonOrProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsButtonButtonOrMod.foo` */
  override def _to: FC[ButtonOrProps] = default
}

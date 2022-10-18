package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibFormMod {
  
  @JSImport("reactstrap/types/lib/Form", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FormProps, js.Object, Any]
  
  type Form = Component[FormProps, js.Object, Any]
  
  trait FormProps
    extends StObject
       with FormHTMLAttributes[HTMLFormElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLFormElement]] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object FormProps {
    
    inline def apply(): FormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps]
    }
    
    extension [Self <: FormProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLFormElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLFormElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}

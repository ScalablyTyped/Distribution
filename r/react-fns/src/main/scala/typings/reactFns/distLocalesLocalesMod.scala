package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.distTypesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocalesLocalesMod {
  
  @JSImport("react-fns/dist/Locales/Locales", "Locales")
  @js.native
  open class Locales protected () extends Component[SharedRenderProps[LocalesProps], LocalesProps, Any] {
    def this(props: SharedRenderProps[LocalesProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[LocalesProps], context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MLocales(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLocales(): Unit = js.native
    
    def handleLanguageChange(): Unit = js.native
    
    def preferredLocales(): String = js.native
  }
  
  trait LocalesProps extends StObject {
    
    var locale: String
  }
  object LocalesProps {
    
    inline def apply(locale: String): LocalesProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalesProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalesProps] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}

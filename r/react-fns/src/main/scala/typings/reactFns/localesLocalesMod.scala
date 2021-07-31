package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesLocalesMod {
  
  @JSImport("react-fns/dist/Locales/Locales", "Locales")
  @js.native
  class Locales protected ()
    extends Component[SharedRenderProps[LocalesProps], LocalesProps, js.Any] {
    def this(props: SharedRenderProps[LocalesProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[LocalesProps], context: js.Any) = this()
    
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
    
    @scala.inline
    def apply(locale: String): LocalesProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalesProps]
    }
    
    @scala.inline
    implicit class LocalesPropsMutableBuilder[Self <: LocalesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}

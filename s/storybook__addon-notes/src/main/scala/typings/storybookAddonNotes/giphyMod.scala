package typings.storybookAddonNotes

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object giphyMod {
  
  @JSImport("@storybook/addon-notes/dist/giphy", JSImport.Default)
  @js.native
  class default () extends Giphy
  
  @js.native
  trait Giphy
    extends Component[Props, State, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MGiphy(): Unit = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var query: String = js.native
  }
  object Props {
    
    @scala.inline
    def apply(query: String): Props = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var src: String | Null = js.native
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcNull: Self = StObject.set(x, "src", null)
    }
  }
}

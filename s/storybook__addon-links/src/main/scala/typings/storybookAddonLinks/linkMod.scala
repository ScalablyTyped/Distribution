package typings.storybookAddonLinks

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("@storybook/addon-links/dist/react/components/link", JSImport.Default)
  @js.native
  class default () extends LinkTo
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-links/dist/react/components/link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-links/dist/react/components/link", "default.defaultProps")
    @js.native
    def defaultProps: Props = js.native
    inline def defaultProps_=(x: Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LinkTo
    extends PureComponent[Props, State, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MLinkTo(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLinkTo(prevProps: Props): Unit = js.native
    
    def handleClick(): Unit = js.native
    
    def updateHref(): js.Promise[Unit] = js.native
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var kind: String
    
    var story: String
  }
  object Props {
    
    inline def apply(kind: String, story: String): Props = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setStory(value: String): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var href: String
  }
  object State {
    
    inline def apply(href: String): State = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
}

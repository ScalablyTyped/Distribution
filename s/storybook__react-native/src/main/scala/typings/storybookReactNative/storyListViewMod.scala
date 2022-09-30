package typings.storybookReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyListViewMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/StoryListView", JSImport.Default)
  @js.native
  open class default protected () extends StoryListView {
    def this(props: Props) = this()
  }
  
  trait Props extends StObject {
    
    var stories: Any
  }
  object Props {
    
    inline def apply(stories: Any): Props = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setStories(value: Any): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var data: js.Array[Any]
    
    var originalData: js.Array[Any]
  }
  object State {
    
    inline def apply(data: js.Array[Any], originalData: js.Array[Any]): State = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalData = originalData.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setOriginalData(value: js.Array[Any]): Self = StObject.set(x, "originalData", value.asInstanceOf[js.Any])
      
      inline def setOriginalDataVarargs(value: Any*): Self = StObject.set(x, "originalData", js.Array(value*))
    }
  }
  
  @js.native
  trait StoryListView extends Component[Props, State, Any] {
    
    def changeStory(storyId: String): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MStoryListView(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MStoryListView(): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    def handleChangeSearchText(text: String): Unit = js.native
    
    def handleStoryAdded(): Unit = js.native
  }
}

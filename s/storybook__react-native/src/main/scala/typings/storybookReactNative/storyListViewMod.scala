package typings.storybookReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyListViewMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/StoryListView", JSImport.Default)
  @js.native
  class default protected () extends StoryListView {
    def this(props: Props) = this()
  }
  
  @js.native
  trait Props extends StObject {
    
    var stories: js.Any = js.native
  }
  object Props {
    
    @scala.inline
    def apply(stories: js.Any): Props = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStories(value: js.Any): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var data: js.Array[_] = js.native
    
    var originalData: js.Array[_] = js.native
  }
  object State {
    
    @scala.inline
    def apply(data: js.Array[_], originalData: js.Array[_]): State = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalData = originalData.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setOriginalData(value: js.Array[_]): Self = StObject.set(x, "originalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalDataVarargs(value: js.Any*): Self = StObject.set(x, "originalData", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StoryListView
    extends Component[Props, State, js.Any] {
    
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

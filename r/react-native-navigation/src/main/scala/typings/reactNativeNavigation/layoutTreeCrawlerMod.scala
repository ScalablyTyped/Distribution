package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandNameMod.CommandName
import typings.reactNativeNavigation.layoutTypeMod.LayoutType
import typings.reactNativeNavigation.optionsProcessorMod.OptionsProcessor
import typings.reactNativeNavigation.storeMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutTreeCrawlerMod {
  
  @JSImport("react-native-navigation/lib/dist/commands/LayoutTreeCrawler", "LayoutTreeCrawler")
  @js.native
  class LayoutTreeCrawler protected () extends StObject {
    def this(store: Store, optionsProcessor: OptionsProcessor) = this()
    
    var applyStaticOptions: js.Any = js.native
    
    var assertComponentDataName: js.Any = js.native
    
    def crawl(node: LayoutNode, commandName: CommandName): Unit = js.native
    
    var handleComponent: js.Any = js.native
    
    var isComponentWithOptions: js.Any = js.native
    
    val optionsProcessor: js.Any = js.native
    
    var savePropsToStore: js.Any = js.native
    
    var staticOptionsIfPossible: js.Any = js.native
    
    val store: Store = js.native
  }
  
  trait Data extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var passProps: js.UndefOr[js.Any] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPassProps(value: js.Any): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  trait LayoutNode extends StObject {
    
    var children: js.Array[LayoutNode]
    
    var data: Data
    
    var id: String
    
    var `type`: LayoutType
  }
  object LayoutNode {
    
    @scala.inline
    def apply(children: js.Array[LayoutNode], data: Data, id: String, `type`: LayoutType): LayoutNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutNode]
    }
    
    @scala.inline
    implicit class LayoutNodeMutableBuilder[Self <: LayoutNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[LayoutNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: LayoutNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: LayoutType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

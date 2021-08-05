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
    
    /* private */ var applyStaticOptions: js.Any = js.native
    
    /* private */ var assertComponentDataName: js.Any = js.native
    
    def crawl(node: LayoutNode, commandName: CommandName): Unit = js.native
    
    /* private */ var handleComponent: js.Any = js.native
    
    /* private */ var isComponentWithOptions: js.Any = js.native
    
    /* private */ val optionsProcessor: js.Any = js.native
    
    /* private */ var savePropsToStore: js.Any = js.native
    
    /* private */ var staticOptionsIfPossible: js.Any = js.native
    
    val store: Store = js.native
  }
  
  trait Data extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var passProps: js.UndefOr[js.Any] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPassProps(value: js.Any): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      inline def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  trait LayoutNode extends StObject {
    
    var children: js.Array[LayoutNode]
    
    var data: Data
    
    var id: String
    
    var `type`: LayoutType
  }
  object LayoutNode {
    
    inline def apply(children: js.Array[LayoutNode], data: Data, id: String, `type`: LayoutType): LayoutNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutNode]
    }
    
    extension [Self <: LayoutNode](x: Self) {
      
      inline def setChildren(value: js.Array[LayoutNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: LayoutNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: LayoutType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

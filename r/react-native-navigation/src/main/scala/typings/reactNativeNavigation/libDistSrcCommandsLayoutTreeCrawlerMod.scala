package typings.reactNativeNavigation

import typings.reactNativeNavigation.libDistSrcCommandsLayoutTypeMod.LayoutType
import typings.reactNativeNavigation.libDistSrcCommandsOptionsProcessorMod.OptionsProcessor
import typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typings.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcCommandsLayoutTreeCrawlerMod {
  
  @JSImport("react-native-navigation/lib/dist/src/commands/LayoutTreeCrawler", "LayoutTreeCrawler")
  @js.native
  open class LayoutTreeCrawler protected () extends StObject {
    def this(store: Store, optionsProcessor: OptionsProcessor) = this()
    
    /* private */ var assertComponentDataName: Any = js.native
    
    def crawl(node: LayoutNode, commandName: CommandName): Unit = js.native
    
    /* private */ var handleComponent: Any = js.native
    
    /* private */ val optionsProcessor: Any = js.native
    
    /* private */ var savePropsToStore: Any = js.native
    
    val store: Store = js.native
  }
  
  trait Data extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    var passProps: js.UndefOr[Any] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPassProps(value: Any): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutNode] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[LayoutNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: LayoutNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: LayoutType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

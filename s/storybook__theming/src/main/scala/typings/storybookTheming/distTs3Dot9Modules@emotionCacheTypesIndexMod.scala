package typings.storybookTheming

import typings.std.HTMLElement
import typings.storybookTheming.`distTs3Dot9Modules@emotionCacheNodeModules@emotionUtilsTypesIndexMod`.EmotionCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@emotionCacheTypesIndexMod` {
  
  @JSImport("@storybook/theming/dist/ts3.9/_modules/@emotion-cache-types-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): EmotionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[EmotionCache]
  
  trait Options extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var insertionPoint: js.UndefOr[HTMLElement] = js.undefined
    
    var key: String
    
    var nonce: js.UndefOr[String] = js.undefined
    
    /** @deprecate use `insertionPoint` instead */
    var prepend: js.UndefOr[Boolean] = js.undefined
    
    var speedy: js.UndefOr[Boolean] = js.undefined
    
    var stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.undefined
  }
  object Options {
    
    inline def apply(key: String): Options = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setInsertionPoint(value: HTMLElement): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
      
      inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
      
      inline def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
      
      inline def setStylisPlugins(value: js.Array[StylisPlugin]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      inline def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      inline def setStylisPluginsVarargs(value: StylisPlugin*): Self = StObject.set(x, "stylisPlugins", js.Array(value*))
    }
  }
  
  trait StylisElement extends StObject {
    
    var children: js.Array[StylisElement] | String
    
    var column: Double
    
    var length: Double
    
    var line: Double
    
    var parent: StylisElement | Null
    
    var props: js.Array[String] | String
    
    var `return`: String
    
    var root: StylisElement | Null
    
    var `type`: String
    
    var value: String
  }
  object StylisElement {
    
    inline def apply(
      children: js.Array[StylisElement] | String,
      column: Double,
      length: Double,
      line: Double,
      props: js.Array[String] | String,
      `return`: String,
      `type`: String,
      value: String
    ): StylisElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], parent = null, root = null)
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylisElement]
    }
    
    extension [Self <: StylisElement](x: Self) {
      
      inline def setChildren(value: js.Array[StylisElement] | String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: StylisElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setParent(value: StylisElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setProps(value: js.Array[String] | String): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: String*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setReturn(value: String): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: StylisElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StylisPlugin extends StObject {
    
    def apply(
      element: StylisElement,
      index: Double,
      children: js.Array[StylisElement],
      callback: StylisPluginCallback
    ): String | Unit = js.native
  }
  
  @js.native
  trait StylisPluginCallback extends StObject {
    
    def apply(
      element: StylisElement,
      index: Double,
      children: js.Array[StylisElement],
      callback: StylisPluginCallback
    ): String | Unit = js.native
  }
}

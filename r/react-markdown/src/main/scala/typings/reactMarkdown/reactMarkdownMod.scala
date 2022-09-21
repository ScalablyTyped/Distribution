package typings.reactMarkdown

import typings.propTypes.mod.Requireable
import typings.reactMarkdown.rehypeFilterMod.Options
import typings.unified.mod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMarkdownMod {
  
  object ReactMarkdown {
    
    inline def apply(options: ReactMarkdownOptions): ReactElement = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.allowElement")
      @js.native
      val allowElement: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.allowedElements")
      @js.native
      val allowedElements: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.children")
      @js.native
      val children: Requireable[String] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.components")
      @js.native
      val components: Requireable[js.Object] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.disallowedElements")
      @js.native
      val disallowedElements: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.includeElementIndex")
      @js.native
      val includeElementIndex: Requireable[Boolean] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.linkTarget")
      @js.native
      val linkTarget: Requireable[String | (js.Function1[/* repeated */ Any, Any])] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.rawSourcePos")
      @js.native
      val rawSourcePos: Requireable[Boolean] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.rehypePlugins")
      @js.native
      val rehypePlugins: Requireable[js.Array[js.UndefOr[js.Object | Null]]] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.remarkPlugins")
      @js.native
      val remarkPlugins: Requireable[js.Array[js.UndefOr[js.Object | Null]]] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.skipHtml")
      @js.native
      val skipHtml: Requireable[Boolean] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.sourcePos")
      @js.native
      val sourcePos: Requireable[Boolean] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.transformImageUri")
      @js.native
      val transformImageUri: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.transformLinkUri")
      @js.native
      val transformLinkUri: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.native
      
      @JSImport("react-markdown/lib/react-markdown", "ReactMarkdown.propTypes.unwrapDisallowed")
      @js.native
      val unwrapDisallowed: Requireable[Boolean] = js.native
    }
  }
  
  trait CoreOptions extends StObject {
    
    var children: String
  }
  object CoreOptions {
    
    inline def apply(children: String): CoreOptions = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoreOptions]
    }
    
    extension [Self <: CoreOptions](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait Deprecation extends StObject {
    
    var id: String
    
    var to: js.UndefOr[String] = js.undefined
  }
  object Deprecation {
    
    inline def apply(id: String): Deprecation = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deprecation]
    }
    
    extension [Self <: Deprecation](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type FilterOptions = Options
  
  trait LayoutOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object LayoutOptions {
    
    inline def apply(): LayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOptions]
    }
    
    extension [Self <: LayoutOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type PluggableList = typings.unified.mod.PluggableList
  
  trait PluginOptions extends StObject {
    
    var rehypePlugins: js.UndefOr[typings.unified.mod.PluggableList] = js.undefined
    
    var remarkPlugins: js.UndefOr[typings.unified.mod.PluggableList] = js.undefined
    
    var remarkRehypeOptions: js.UndefOr[typings.remarkRehype.mod.Options] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setRehypePlugins(value: typings.unified.mod.PluggableList): Self = StObject.set(x, "rehypePlugins", value.asInstanceOf[js.Any])
      
      inline def setRehypePluginsUndefined: Self = StObject.set(x, "rehypePlugins", js.undefined)
      
      inline def setRehypePluginsVarargs(value: Pluggable[js.Array[Any]]*): Self = StObject.set(x, "rehypePlugins", js.Array(value*))
      
      inline def setRemarkPlugins(value: typings.unified.mod.PluggableList): Self = StObject.set(x, "remarkPlugins", value.asInstanceOf[js.Any])
      
      inline def setRemarkPluginsUndefined: Self = StObject.set(x, "remarkPlugins", js.undefined)
      
      inline def setRemarkPluginsVarargs(value: Pluggable[js.Array[Any]]*): Self = StObject.set(x, "remarkPlugins", js.Array(value*))
      
      inline def setRemarkRehypeOptions(value: typings.remarkRehype.mod.Options): Self = StObject.set(x, "remarkRehypeOptions", value.asInstanceOf[js.Any])
      
      inline def setRemarkRehypeOptionsUndefined: Self = StObject.set(x, "remarkRehypeOptions", js.undefined)
    }
  }
  
  type ReactElement = typings.react.mod.ReactElement
  
  trait ReactMarkdownOptions
    extends StObject
       with CoreOptions
       with PluginOptions
       with LayoutOptions
       with Options
       with typings.reactMarkdown.astToReactMod.Options
  object ReactMarkdownOptions {
    
    inline def apply(children: String): ReactMarkdownOptions = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMarkdownOptions]
    }
  }
  
  type ReactNode = typings.react.mod.ReactNode
  
  type Root = typings.hast.mod.Root
  
  type TransformOptions = typings.reactMarkdown.astToReactMod.Options
}

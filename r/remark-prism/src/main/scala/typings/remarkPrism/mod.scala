package typings.remarkPrism

import org.scalablytyped.runtime.Shortcut
import typings.mdast.mod.Root
import typings.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-prism", JSImport.Namespace)
  @js.native
  val ^ : Prism = js.native
  
  trait Options extends StObject {
    
    var plugins: js.UndefOr[js.Array[SupportedPlugins]] = js.undefined
    
    var transformInlineCode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPlugins(value: js.Array[SupportedPlugins]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: SupportedPlugins*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setTransformInlineCode(value: Boolean): Self = StObject.set(x, "transformInlineCode", value.asInstanceOf[js.Any])
      
      inline def setTransformInlineCodeUndefined: Self = StObject.set(x, "transformInlineCode", js.undefined)
    }
  }
  
  /**
    * Plugin to use prism with remark.
    * https://github.com/unifiedjs/unified/blob/main/index.d.ts#L488-L489
    */
  type Prism = Plugin[js.Array[js.UndefOr[Options | Unit]], Root, Root]
  
  /* Rewritten from type alias, can be one of: 
    - typings.remarkPrism.remarkPrismStrings.autolinker
    - typings.remarkPrism.remarkPrismStrings.`command-line`
    - typings.remarkPrism.remarkPrismStrings.`data-uri-highlight`
    - typings.remarkPrism.remarkPrismStrings.`diff-highlight`
    - typings.remarkPrism.remarkPrismStrings.`inline-color`
    - typings.remarkPrism.remarkPrismStrings.`keep-markup`
    - typings.remarkPrism.remarkPrismStrings.`line-numbers`
    - typings.remarkPrism.remarkPrismStrings.`show-invisibles`
    - typings.remarkPrism.remarkPrismStrings.treeview
  */
  trait SupportedPlugins extends StObject
  object SupportedPlugins {
    
    inline def autolinker: typings.remarkPrism.remarkPrismStrings.autolinker = "autolinker".asInstanceOf[typings.remarkPrism.remarkPrismStrings.autolinker]
    
    inline def `command-line`: typings.remarkPrism.remarkPrismStrings.`command-line` = "command-line".asInstanceOf[typings.remarkPrism.remarkPrismStrings.`command-line`]
    
    inline def `data-uri-highlight`: typings.remarkPrism.remarkPrismStrings.`data-uri-highlight` = "data-uri-highlight".asInstanceOf[typings.remarkPrism.remarkPrismStrings.`data-uri-highlight`]
    
    inline def `diff-highlight`: typings.remarkPrism.remarkPrismStrings.`diff-highlight` = "diff-highlight".asInstanceOf[typings.remarkPrism.remarkPrismStrings.`diff-highlight`]
    
    inline def `inline-color`: typings.remarkPrism.remarkPrismStrings.`inline-color` = "inline-color".asInstanceOf[typings.remarkPrism.remarkPrismStrings.`inline-color`]
    
    inline def `keep-markup`: typings.remarkPrism.remarkPrismStrings.`keep-markup` = "keep-markup".asInstanceOf[typings.remarkPrism.remarkPrismStrings.`keep-markup`]
    
    inline def `line-numbers`: typings.remarkPrism.remarkPrismStrings.`line-numbers` = "line-numbers".asInstanceOf[typings.remarkPrism.remarkPrismStrings.`line-numbers`]
    
    inline def `show-invisibles`: typings.remarkPrism.remarkPrismStrings.`show-invisibles` = "show-invisibles".asInstanceOf[typings.remarkPrism.remarkPrismStrings.`show-invisibles`]
    
    inline def treeview: typings.remarkPrism.remarkPrismStrings.treeview = "treeview".asInstanceOf[typings.remarkPrism.remarkPrismStrings.treeview]
  }
  
  type _To = Prism
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Prism = ^
}

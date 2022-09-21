package typings.reactMarkdown

import typings.unified.mod.Transformer
import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rehypeFilterMod {
  
  @JSImport("react-markdown/lib/rehype-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root])]
  
  type AllowElement = js.Function3[
    /* element */ Element, 
    /* index */ Double, 
    /* parent */ Element | Root, 
    js.UndefOr[Boolean]
  ]
  
  type Element = typings.hast.mod.Element
  
  type Node = typings.unist.mod.Node[Data]
  
  trait Options extends StObject {
    
    var allowElement: js.UndefOr[AllowElement] = js.undefined
    
    var allowedElements: js.UndefOr[js.Array[String]] = js.undefined
    
    var disallowedElements: js.UndefOr[js.Array[String]] = js.undefined
    
    var unwrapDisallowed: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowElement(
        value: (/* element */ Element, /* index */ Double, /* parent */ Element | Root) => js.UndefOr[Boolean]
      ): Self = StObject.set(x, "allowElement", js.Any.fromFunction3(value))
      
      inline def setAllowElementUndefined: Self = StObject.set(x, "allowElement", js.undefined)
      
      inline def setAllowedElements(value: js.Array[String]): Self = StObject.set(x, "allowedElements", value.asInstanceOf[js.Any])
      
      inline def setAllowedElementsUndefined: Self = StObject.set(x, "allowedElements", js.undefined)
      
      inline def setAllowedElementsVarargs(value: String*): Self = StObject.set(x, "allowedElements", js.Array(value*))
      
      inline def setDisallowedElements(value: js.Array[String]): Self = StObject.set(x, "disallowedElements", value.asInstanceOf[js.Any])
      
      inline def setDisallowedElementsUndefined: Self = StObject.set(x, "disallowedElements", js.undefined)
      
      inline def setDisallowedElementsVarargs(value: String*): Self = StObject.set(x, "disallowedElements", js.Array(value*))
      
      inline def setUnwrapDisallowed(value: Boolean): Self = StObject.set(x, "unwrapDisallowed", value.asInstanceOf[js.Any])
      
      inline def setUnwrapDisallowedUndefined: Self = StObject.set(x, "unwrapDisallowed", js.undefined)
    }
  }
  
  type Root = typings.hast.mod.Root
}

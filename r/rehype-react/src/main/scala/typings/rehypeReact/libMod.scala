package typings.rehypeReact

import typings.rehypeReact.complexTypesMod.ComponentsWithNodeOptions
import typings.rehypeReact.complexTypesMod.ComponentsWithoutNodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("rehype-react/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait CreateElementLike extends StObject {
    
    def apply(name: Any, props: Any, children: ReactNode*): ReactNode = js.native
  }
  
  type Element = typings.hast.mod.Element
  
  type Options = (ComponentsWithNodeOptions & SharedOptions) | (ComponentsWithoutNodeOptions & SharedOptions)
  
  type ReactElement = typings.react.mod.ReactElement
  
  type ReactNode = typings.react.mod.ReactNode
  
  type Root = typings.hast.mod.Root
  
  trait SharedOptions extends StObject {
    
    /**
      * Create fragments instead of an outer `<div>` if available.
      * You should typically pass `React.Fragment`.
      */
    var Fragment: js.UndefOr[js.Function1[/* props */ Any, ReactNode]] = js.undefined
    
    /**
      * How to create elements or components.
      * You should typically pass `React.createElement`.
      */
    var createElement: CreateElementLike
    
    /**
      * React key prefix
      */
    var prefix: js.UndefOr[String] = js.undefined
  }
  object SharedOptions {
    
    inline def apply(createElement: CreateElementLike): SharedOptions = {
      val __obj = js.Dynamic.literal(createElement = createElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedOptions]
    }
    
    extension [Self <: SharedOptions](x: Self) {
      
      inline def setCreateElement(value: CreateElementLike): Self = StObject.set(x, "createElement", value.asInstanceOf[js.Any])
      
      inline def setFragment(value: /* props */ Any => ReactNode): Self = StObject.set(x, "Fragment", js.Any.fromFunction1(value))
      
      inline def setFragmentUndefined: Self = StObject.set(x, "Fragment", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}

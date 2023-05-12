package typings.rehypeReact

import typings.rehypeReact.libComplexTypesMod.ComponentsWithNodeOptions
import typings.rehypeReact.libComplexTypesMod.ComponentsWithoutNodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("rehype-react/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(settings_0: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(settings_0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait CreateElementLike extends StObject {
    
    def apply(name: Any, props: Any, children: ReactNode*): ReactNode = js.native
  }
  
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
      * Fix obsolete align attributes on table cells by turning them
      * into inline styles.
      * Keep it on when working with markdown, turn it off when working
      * with markup for emails.
      * The default is `true`.
      */
    var fixTableCellAlign: js.UndefOr[Boolean] = js.undefined
    
    /**
      * React key prefix.
      */
    var prefix: js.UndefOr[String] = js.undefined
  }
  object SharedOptions {
    
    inline def apply(createElement: CreateElementLike): SharedOptions = {
      val __obj = js.Dynamic.literal(createElement = createElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateElement(value: CreateElementLike): Self = StObject.set(x, "createElement", value.asInstanceOf[js.Any])
      
      inline def setFixTableCellAlign(value: Boolean): Self = StObject.set(x, "fixTableCellAlign", value.asInstanceOf[js.Any])
      
      inline def setFixTableCellAlignUndefined: Self = StObject.set(x, "fixTableCellAlign", js.undefined)
      
      inline def setFragment(value: /* props */ Any => ReactNode): Self = StObject.set(x, "Fragment", js.Any.fromFunction1(value))
      
      inline def setFragmentUndefined: Self = StObject.set(x, "Fragment", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}

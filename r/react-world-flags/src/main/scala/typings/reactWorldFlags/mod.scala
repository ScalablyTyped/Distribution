package typings.reactWorldFlags

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLProps
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Easy to use SVG flags of the world for react
    */
  @JSImport("react-world-flags", JSImport.Default)
  @js.native
  val default: FC[FlagProps] = js.native
  
  trait FlagProps
    extends StObject
       with HTMLProps[HTMLElement] {
    
    /**
      * code is the two letter, three letter or three digit country code.
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * You can also pass an optional fallback which renders if the given code doesn't correspond to a flag
      */
    var fallback: js.UndefOr[Element | Null] = js.undefined
  }
  object FlagProps {
    
    inline def apply(): FlagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagProps]
    }
    
    extension [Self <: FlagProps](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setFallback(value: Element): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  type _To = FC[FlagProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[FlagProps] = default
}

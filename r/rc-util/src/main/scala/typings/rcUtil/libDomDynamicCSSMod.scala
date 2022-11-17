package typings.rcUtil

import typings.rcUtil.anon.Nonce
import typings.std.Element
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomDynamicCSSMod {
  
  @JSImport("rc-util/lib/Dom/dynamicCSS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectCSS(css: String): HTMLStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("injectCSS")(css.asInstanceOf[js.Any]).asInstanceOf[HTMLStyleElement]
  inline def injectCSS(css: String, option: Options): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("injectCSS")(css.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  
  inline def removeCSS(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeCSS(key: String, option: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(key.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateCSS(css: String, key: String): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCSS")(css.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  inline def updateCSS(css: String, key: String, option: Options): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCSS")(css.asInstanceOf[js.Any], key.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  
  object AppendType {
    
    inline def append: "append" = "append".asInstanceOf["append"]
    
    inline def prepend: "prepend" = "prepend".asInstanceOf["prepend"]
    
    inline def prependQueue: "prependQueue" = "prependQueue".asInstanceOf["prependQueue"]
  }
  type AppendType = "prependQueue" | "append" | "prepend"
  
  trait Options extends StObject {
    
    var attachTo: js.UndefOr[Element] = js.undefined
    
    var csp: js.UndefOr[Nonce] = js.undefined
    
    var mark: js.UndefOr[String] = js.undefined
    
    var prepend: js.UndefOr[Prepend] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttachTo(value: Element): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setCsp(value: Nonce): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setPrepend(value: Prepend): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    }
  }
  
  type Prepend = Boolean | "queue"
}

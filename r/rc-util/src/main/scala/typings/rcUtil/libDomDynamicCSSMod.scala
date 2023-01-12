package typings.rcUtil

import typings.rcUtil.anon.Nonce
import typings.rcUtil.rcUtilStrings.queue
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcUtil.rcUtilStrings.prependQueue
    - typings.rcUtil.rcUtilStrings.append
    - typings.rcUtil.rcUtilStrings.prepend
  */
  trait AppendType extends StObject
  object AppendType {
    
    inline def append: typings.rcUtil.rcUtilStrings.append = "append".asInstanceOf[typings.rcUtil.rcUtilStrings.append]
    
    inline def prepend: typings.rcUtil.rcUtilStrings.prepend = "prepend".asInstanceOf[typings.rcUtil.rcUtilStrings.prepend]
    
    inline def prependQueue: typings.rcUtil.rcUtilStrings.prependQueue = "prependQueue".asInstanceOf[typings.rcUtil.rcUtilStrings.prependQueue]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
  
  type Prepend = Boolean | queue
}

package typings.puppeteerCore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerUtilErrorLikeMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/util/ErrorLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isErrnoException(obj: Any): /* is node.NodeJS.ErrnoException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrnoException")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is node.NodeJS.ErrnoException */ Boolean]
  
  inline def isErrorLike(obj: Any): /* is puppeteer-core.puppeteer-core/lib/cjs/puppeteer/util/ErrorLike.ErrorLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorLike")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is puppeteer-core.puppeteer-core/lib/cjs/puppeteer/util/ErrorLike.ErrorLike */ Boolean]
  
  trait ErrorLike
    extends StObject
       with Error
  object ErrorLike {
    
    inline def apply(message: String, name: String): ErrorLike = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorLike]
    }
  }
}

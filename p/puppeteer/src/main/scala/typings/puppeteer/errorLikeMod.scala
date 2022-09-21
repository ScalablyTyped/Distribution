package typings.puppeteer

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorLikeMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/util/ErrorLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isErrnoException(obj: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrnoException")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException * / any */ Boolean]
  
  inline def isErrorLike(obj: Any): /* is puppeteer.puppeteer/lib/cjs/puppeteer/util/ErrorLike.ErrorLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorLike")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is puppeteer.puppeteer/lib/cjs/puppeteer/util/ErrorLike.ErrorLike */ Boolean]
  
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

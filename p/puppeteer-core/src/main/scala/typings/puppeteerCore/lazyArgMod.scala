package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyArgMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/LazyArg", "LazyArg")
  @js.native
  open class LazyArg[T] protected () extends StObject {
    def this(get: js.Function0[js.Promise[T]]) = this()
    
    def get(): js.Promise[T] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}

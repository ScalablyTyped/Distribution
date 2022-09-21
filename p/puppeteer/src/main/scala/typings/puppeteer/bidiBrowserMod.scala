package typings.puppeteer

import typings.node.childProcessMod.ChildProcess
import typings.puppeteer.browserMod.BrowserCloseCallback
import typings.puppeteer.connectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bidiBrowserMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/bidi/Browser", "Browser")
  @js.native
  open class Browser protected ()
    extends typings.puppeteer.browserMod.Browser {
    /**
      * @internal
      */
    def this(opts: Options) = this()
    
    /* private */ var `private`: Any = js.native
  }
  /* static members */
  object Browser {
    
    @JSImport("puppeteer/lib/cjs/puppeteer/common/bidi/Browser", "Browser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def create(opts: Options): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]
  }
  
  trait Options extends StObject {
    
    var closeCallback: js.UndefOr[BrowserCloseCallback] = js.undefined
    
    var connection: Connection
    
    var process: js.UndefOr[ChildProcess] = js.undefined
  }
  object Options {
    
    inline def apply(connection: Connection): Options = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCloseCallback(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "closeCallback", js.Any.fromFunction0(value))
      
      inline def setCloseCallbackUndefined: Self = StObject.set(x, "closeCallback", js.undefined)
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
}

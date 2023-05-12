package typings.quicklink

import typings.quicklink.anon.PartialListenOptions
import typings.quicklink.mod.MaybeReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object quicklink {
    
    @JSGlobal("quicklink")
    @js.native
    val ^ : js.Any = js.native
    
    inline def listen(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[js.Function0[Unit]]
    inline def listen(options: PartialListenOptions): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def prefetch(urls: MaybeReadonlyArray[String]): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(urls.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def prefetch(urls: MaybeReadonlyArray[String], isPriority: Boolean): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(urls.asInstanceOf[js.Any], isPriority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    
    inline def prerender(urls: MaybeReadonlyArray[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("prerender")(urls.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
}

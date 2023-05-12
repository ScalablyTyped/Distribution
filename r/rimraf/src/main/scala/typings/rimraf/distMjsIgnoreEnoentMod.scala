package typings.rimraf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsIgnoreEnoentMod {
  
  @JSImport("rimraf/dist/mjs/ignore-enoent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ignoreENOENT(p: js.Promise[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreENOENT")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def ignoreENOENTSync(fn: js.Function0[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreENOENTSync")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
}

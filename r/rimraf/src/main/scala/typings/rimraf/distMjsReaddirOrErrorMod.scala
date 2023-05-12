package typings.rimraf

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Dirent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsReaddirOrErrorMod {
  
  @JSImport("rimraf/dist/mjs/readdir-or-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readdirOrError(path: String): js.Promise[js.Array[Dirent] | ErrnoException] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirOrError")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Dirent] | ErrnoException]]
  
  inline def readdirOrErrorSync(path: String): js.Array[Dirent] | ErrnoException = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirOrErrorSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Dirent] | ErrnoException]
}

package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibNpmMod {
  
  @JSImport("snyk/dist/lib/npm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: String, packages: js.Array[String], live: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(method: String, packages: js.Array[String], live: Boolean, cwd: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(method: String, packages: js.Array[String], live: Boolean, cwd: String, flags: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(method: String, packages: js.Array[String], live: Boolean, cwd: Null, flags: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(method: String, packages: Null, live: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(method: String, packages: Null, live: Boolean, cwd: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(method: String, packages: Null, live: Boolean, cwd: String, flags: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(method: String, packages: Null, live: Boolean, cwd: Null, flags: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getVersion(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[js.Promise[Any]]
}

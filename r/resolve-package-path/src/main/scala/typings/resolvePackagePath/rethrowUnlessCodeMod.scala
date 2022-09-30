package typings.resolvePackagePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rethrowUnlessCodeMod {
  
  @JSImport("resolve-package-path/lib/rethrow-unless-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(maybeError: Any, codes: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(maybeError.asInstanceOf[js.Any]).`++`(codes.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}

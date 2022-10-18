package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUnexpectedErrorMod {
  
  @JSImport("snyk/dist/lib/unexpected-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callHandlingUnexpectedErrors(callable: js.Function0[js.Promise[Any]], exitCode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("callHandlingUnexpectedErrors")(callable.asInstanceOf[js.Any], exitCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}

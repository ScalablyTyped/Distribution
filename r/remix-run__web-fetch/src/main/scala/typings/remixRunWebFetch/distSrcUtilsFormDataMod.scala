package typings.remixRunWebFetch

import typings.remixRunWebFetch.anon.BodyheadersHeadersundefin
import typings.std.AsyncGenerator
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsFormDataMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/utils/form-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formDataIterator(form: FormData, boundary: String): AsyncGenerator[Any, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("formDataIterator")(form.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Any, Unit, Unit]]
  
  inline def getBoundary(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")().asInstanceOf[String]
  
  inline def getFormDataLength(form: FormData, boundary: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormDataLength")(form.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toFormData(source: BodyheadersHeadersundefin): js.Promise[FormData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFormData")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FormData]]
}

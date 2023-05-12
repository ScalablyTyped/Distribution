package typings.remixRunWebFetch

import typings.remixRunWebFetch.distSrcHeadersMod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object srcHeadersDotjsMod {
  
  @JSImport("@remix-run/web-fetch/src/headers.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromRawHeaders(): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRawHeaders")().asInstanceOf[Headers]
  inline def fromRawHeaders(headers: js.Array[String]): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRawHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[Headers]
}

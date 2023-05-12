package typings.remixRunWebFetch

import typings.std.Record
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHeadersMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@remix-run/web-fetch/dist/src/headers", JSImport.Default)
  @js.native
  /**
    * Headers class
    *
    * @constructor
    * @param {HeadersInit} [init] - Response headers
    */
  open class default ()
    extends StObject
       with Headers {
    def this(init: HeadersInit) = this()
  }
  
  inline def fromRawHeaders(): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRawHeaders")().asInstanceOf[Headers]
  inline def fromRawHeaders(headers: js.Array[String]): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRawHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[Headers]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers * / any */ @js.native
  trait Headers
    extends StObject
       with URLSearchParams {
    
    var get: Any = js.native
    
    /**
      * Node-fetch non-spec method
      * returning all headers and their values as array
      * @returns {Record<string, string[]>}
      */
    def raw(): Record[String, js.Array[String]] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
  }
  
  type HeadersInit = Headers | (Record[String, String]) | (js.Iterable[js.Iterable[String] | (js.Tuple2[String, String])])
}

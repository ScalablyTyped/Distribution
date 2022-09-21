package typings.shouldSendSameSiteNone

import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("should-send-same-site-none", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSameSiteNoneCompatible(useragent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameSiteNoneCompatible")(useragent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("should-send-same-site-none", "shouldSendSameSiteNone")
  @js.native
  val shouldSendSameSiteNone: RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = js.native
}

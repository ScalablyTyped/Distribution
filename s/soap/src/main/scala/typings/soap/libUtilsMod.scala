package typings.soap

import typings.node.bufferMod.global.Buffer
import typings.soap.anon.Name
import typings.soap.anon.Prefix
import typings.soap.libTypesMod.IMTOMAttachments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("soap/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("soap/lib/utils", "TNS_PREFIX")
  @js.native
  val TNS_PREFIX: /* "__tns__" */ String = js.native
  
  inline def findPrefix(xmlnsMapping: Any, nsURI: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findPrefix")(xmlnsMapping.asInstanceOf[js.Any], nsURI.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseMTOMResp(
    payload: Buffer,
    boundary: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* resp */ js.UndefOr[IMTOMAttachments], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMTOMResp")(payload.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def passwordDigest(nonce: String, created: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("passwordDigest")(nonce.asInstanceOf[js.Any], created.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def splitQName[T](nsName: T): Name[T] | Prefix = ^.asInstanceOf[js.Dynamic].applyDynamic("splitQName")(nsName.asInstanceOf[js.Any]).asInstanceOf[Name[T] | Prefix]
  
  inline def xmlEscape(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlEscape")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
}

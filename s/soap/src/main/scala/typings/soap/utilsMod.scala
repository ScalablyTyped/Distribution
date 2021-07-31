package typings.soap

import typings.soap.anon.Name
import typings.soap.anon.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("soap/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("soap/lib/utils", "TNS_PREFIX")
  @js.native
  val TNS_PREFIX: /* "__tns__" */ String = js.native
  
  @scala.inline
  def findPrefix(xmlnsMapping: js.Any, nsURI: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findPrefix")(xmlnsMapping.asInstanceOf[js.Any], nsURI.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def passwordDigest(nonce: String, created: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("passwordDigest")(nonce.asInstanceOf[js.Any], created.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def splitQName[T](nsName: T): Name[T] | Prefix = ^.asInstanceOf[js.Dynamic].applyDynamic("splitQName")(nsName.asInstanceOf[js.Any]).asInstanceOf[Name[T] | Prefix]
  
  @scala.inline
  def xmlEscape(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlEscape")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}

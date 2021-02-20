package typings.soap

import typings.soap.anon.Name
import typings.soap.anon.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("soap/lib/utils", "TNS_PREFIX")
  @js.native
  val TNS_PREFIX: /* "__tns__" */ String = js.native
  
  @JSImport("soap/lib/utils", "findPrefix")
  @js.native
  def findPrefix(xmlnsMapping: js.Any, nsURI: js.Any): String = js.native
  
  @JSImport("soap/lib/utils", "passwordDigest")
  @js.native
  def passwordDigest(nonce: String, created: String, password: String): String = js.native
  
  @JSImport("soap/lib/utils", "splitQName")
  @js.native
  def splitQName[T](nsName: T): Name[T] | Prefix = js.native
  
  @JSImport("soap/lib/utils", "xmlEscape")
  @js.native
  def xmlEscape(obj: js.Any): js.Any = js.native
}

package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("sip.js/lib/core/messages/utils", "createRandomToken")
  @js.native
  def createRandomToken(size: Double): String = js.native
  @JSImport("sip.js/lib/core/messages/utils", "createRandomToken")
  @js.native
  def createRandomToken(size: Double, base: Double): String = js.native
  
  @JSImport("sip.js/lib/core/messages/utils", "getReasonPhrase")
  @js.native
  def getReasonPhrase(code: Double): String = js.native
  
  @JSImport("sip.js/lib/core/messages/utils", "headerize")
  @js.native
  def headerize(str: String): String = js.native
  
  @JSImport("sip.js/lib/core/messages/utils", "newTag")
  @js.native
  def newTag(): String = js.native
  
  @JSImport("sip.js/lib/core/messages/utils", "utf8Length")
  @js.native
  def utf8Length(str: String): Double = js.native
}

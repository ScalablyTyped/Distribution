package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def createRandomToken(size: Double): String = js.native
  def createRandomToken(size: Double, base: Double): String = js.native
  def getReasonPhrase(code: Double): String = js.native
  def headerize(str: String): String = js.native
  def newTag(): String = js.native
  @JSName("str_utf8_length")
  def strUtf8Length(str: String): Double = js.native
}


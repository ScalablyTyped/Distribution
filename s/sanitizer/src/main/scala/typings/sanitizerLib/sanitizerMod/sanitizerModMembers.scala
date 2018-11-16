package typings
package sanitizerLib.sanitizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sanitizer", JSImport.Namespace)
@js.native
object sanitizerModMembers extends js.Object {
  def escape(s: java.lang.String): java.lang.String = js.native
  def makeSaxParser(yourHandler: ISaxHandler): js.Function1[/* repeated */js.Any, _] = js.native
  def normalizeRCData(s: java.lang.String): java.lang.String = js.native
  def sanitize(s: java.lang.String): java.lang.String = js.native
  def unescapeEntities(s: java.lang.String): java.lang.String = js.native
}


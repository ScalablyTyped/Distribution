package typings.sanitizer.sanitizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sanitizer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def escape(s: String): String = js.native
  def makeSaxParser(yourHandler: ISaxHandler): js.Function1[/* repeated */ js.Any, _] = js.native
  def normalizeRCData(s: String): String = js.native
  def sanitize(s: String): String = js.native
  def unescapeEntities(s: String): String = js.native
}


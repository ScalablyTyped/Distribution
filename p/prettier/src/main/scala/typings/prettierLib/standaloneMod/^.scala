package typings
package prettierLib.standaloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier/standalone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(source: java.lang.String): scala.Boolean = js.native
  def check(source: java.lang.String, options: prettierLib.prettierMod.Options): scala.Boolean = js.native
  def format(source: java.lang.String): java.lang.String = js.native
  def format(source: java.lang.String, options: prettierLib.prettierMod.Options): java.lang.String = js.native
  def formatWithCursor(source: java.lang.String, options: prettierLib.prettierMod.CursorOptions): prettierLib.prettierMod.CursorResult = js.native
}


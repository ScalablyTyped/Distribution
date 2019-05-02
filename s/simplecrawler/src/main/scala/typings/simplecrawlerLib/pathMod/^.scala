package typings
package simplecrawlerLib.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var delimiter: simplecrawlerLib.simplecrawlerLibStrings.`;` | simplecrawlerLib.simplecrawlerLibStrings.`:` = js.native
  var sep: simplecrawlerLib.simplecrawlerLibStrings.BACKSLASHBACKSLASH | simplecrawlerLib.simplecrawlerLibStrings.`/` = js.native
  def basename(p: java.lang.String): java.lang.String = js.native
  def basename(p: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def dirname(p: java.lang.String): java.lang.String = js.native
  def extname(p: java.lang.String): java.lang.String = js.native
  def format(pathObject: FormatInputPathObject): java.lang.String = js.native
  def isAbsolute(path: java.lang.String): scala.Boolean = js.native
  def join(paths: java.lang.String*): java.lang.String = js.native
  def normalize(p: java.lang.String): java.lang.String = js.native
  def parse(pathString: java.lang.String): ParsedPath = js.native
  def relative(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  def resolve(pathSegments: java.lang.String*): java.lang.String = js.native
}


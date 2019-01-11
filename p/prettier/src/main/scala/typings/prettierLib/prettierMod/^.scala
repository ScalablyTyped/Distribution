package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def check(source: java.lang.String): scala.Boolean = js.native
  def check(source: java.lang.String, options: prettierLib.prettierMod.Options): scala.Boolean = js.native
  def clearConfigCache(): scala.Unit = js.native
  def format(source: java.lang.String): java.lang.String = js.native
  def format(source: java.lang.String, options: prettierLib.prettierMod.Options): java.lang.String = js.native
  def formatWithCursor(source: java.lang.String, options: prettierLib.prettierMod.CursorOptions): prettierLib.prettierMod.CursorResult = js.native
  def getFileInfo(filePath: java.lang.String): js.Promise[prettierLib.prettierMod.FileInfoResult] = js.native
  def getFileInfo(filePath: java.lang.String, options: prettierLib.prettierMod.FileInfoOptions): js.Promise[prettierLib.prettierMod.FileInfoResult] = js.native
  def getSupportInfo(): prettierLib.prettierMod.SupportInfo = js.native
  def getSupportInfo(version: java.lang.String): prettierLib.prettierMod.SupportInfo = js.native
  def resolveConfig(filePath: java.lang.String): js.Promise[scala.Null | prettierLib.prettierMod.Options] = js.native
  def resolveConfig(filePath: java.lang.String, options: prettierLib.prettierMod.ResolveConfigOptions): js.Promise[scala.Null | prettierLib.prettierMod.Options] = js.native
}


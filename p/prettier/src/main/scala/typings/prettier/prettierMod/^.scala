package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def check(source: String): Boolean = js.native
  def check(source: String, options: Options): Boolean = js.native
  def clearConfigCache(): Unit = js.native
  def format(source: String): String = js.native
  def format(source: String, options: Options): String = js.native
  def formatWithCursor(source: String, options: CursorOptions): CursorResult = js.native
  def getFileInfo(filePath: String): js.Promise[FileInfoResult] = js.native
  def getFileInfo(filePath: String, options: FileInfoOptions): js.Promise[FileInfoResult] = js.native
  def getSupportInfo(): SupportInfo = js.native
  def getSupportInfo(version: String): SupportInfo = js.native
  def resolveConfig(filePath: String): js.Promise[Null | Options] = js.native
  def resolveConfig(filePath: String, options: ResolveConfigOptions): js.Promise[Null | Options] = js.native
  def resolveConfigFile(): js.Promise[Null | String] = js.native
  def resolveConfigFile(filePath: String): js.Promise[Null | String] = js.native
}


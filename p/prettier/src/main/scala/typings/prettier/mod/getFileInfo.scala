package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFileInfo {
  
  @JSImport("prettier", "getFileInfo")
  @js.native
  def apply(filePath: String): js.Promise[FileInfoResult] = js.native
  @JSImport("prettier", "getFileInfo")
  @js.native
  def apply(filePath: String, options: FileInfoOptions): js.Promise[FileInfoResult] = js.native
  
  @JSImport("prettier", "getFileInfo.sync")
  @js.native
  def sync(filePath: String): FileInfoResult = js.native
  @JSImport("prettier", "getFileInfo.sync")
  @js.native
  def sync(filePath: String, options: FileInfoOptions): FileInfoResult = js.native
}

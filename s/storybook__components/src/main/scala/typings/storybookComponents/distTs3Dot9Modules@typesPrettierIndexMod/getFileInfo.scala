package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFileInfo {
  
  inline def apply(filePath: String): js.Promise[FileInfoResult] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileInfoResult]]
  inline def apply(filePath: String, options: FileInfoOptions): js.Promise[FileInfoResult] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileInfoResult]]
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@types-prettier-index", "getFileInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(filePath: String): FileInfoResult = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any]).asInstanceOf[FileInfoResult]
  inline def sync(filePath: String, options: FileInfoOptions): FileInfoResult = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileInfoResult]
}

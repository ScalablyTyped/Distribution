package typings.puppeteerBrowsers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsFileUtilMod {
  
  @JSImport("@puppeteer/browsers/lib/cjs/fileUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unpackArchive(archivePath: String, folderPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackArchive")(archivePath.asInstanceOf[js.Any], folderPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}

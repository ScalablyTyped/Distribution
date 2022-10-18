package typings.snyk

import typings.snyk.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibGetFileContentsMod {
  
  @JSImport("snyk/dist/lib/get-file-contents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileContents(root: String, fileName: String): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileContents")(root.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Content]
}

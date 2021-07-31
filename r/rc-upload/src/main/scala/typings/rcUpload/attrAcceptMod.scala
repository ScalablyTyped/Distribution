package typings.rcUpload

import typings.rcUpload.interfaceMod.RcFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attrAcceptMod {
  
  @JSImport("rc-upload/es/attr-accept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(file: RcFile, acceptedFiles: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(file: RcFile, acceptedFiles: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

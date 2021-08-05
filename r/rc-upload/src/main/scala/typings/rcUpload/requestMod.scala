package typings.rcUpload

import typings.rcUpload.anon.Abort
import typings.rcUpload.interfaceMod.UploadRequestOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("rc-upload/es/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(option: UploadRequestOption[js.Any]): Abort = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(option.asInstanceOf[js.Any]).asInstanceOf[Abort]
}

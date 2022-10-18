package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsNoSupportedSastFilesFoundMod {
  
  @JSImport("snyk/dist/lib/errors/no-supported-sast-files-found", "NoSupportedSastFiles")
  @js.native
  open class NoSupportedSastFiles () extends CustomError
  /* static members */
  object NoSupportedSastFiles {
    
    @JSImport("snyk/dist/lib/errors/no-supported-sast-files-found", "NoSupportedSastFiles")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/no-supported-sast-files-found", "NoSupportedSastFiles.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}

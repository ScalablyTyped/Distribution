package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsDockerImageNotFoundErrorMod {
  
  @JSImport("snyk/dist/lib/errors/docker-image-not-found-error", "DockerImageNotFoundError")
  @js.native
  open class DockerImageNotFoundError protected () extends CustomError {
    def this(image: String) = this()
  }
  /* static members */
  object DockerImageNotFoundError {
    
    @JSImport("snyk/dist/lib/errors/docker-image-not-found-error", "DockerImageNotFoundError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/docker-image-not-found-error", "DockerImageNotFoundError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
  }
}

package typings.samchon

import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/interfaces/IExternalServer", JSImport.Namespace)
@js.native
object templatesExternalInterfacesIExternalServerMod extends js.Object {
  @js.native
  trait IExternalServer extends ExternalSystem {
    /**
      * Connect to the external server.
      */
    def connect(): Unit = js.native
  }
  
}


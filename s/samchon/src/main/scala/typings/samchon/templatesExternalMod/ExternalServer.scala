package typings.samchon.templatesExternalMod

import typings.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", "ExternalServer")
@js.native
abstract class ExternalServer protected ()
  extends typings.samchon.templatesExternalDerivedExternalServerMod.ExternalServer {
  /**
    * Construct from parent {@link ExternalSystemArray}.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    */
  def this(systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
}


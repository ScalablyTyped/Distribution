package typings
package samchonLib.templatesExternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", "ExternalServer")
@js.native
abstract class ExternalServer protected ()
  extends samchonLib.templatesExternalDerivedExternalServerMod.ExternalServer {
  /**
    * Construct from parent {@link ExternalSystemArray}.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalInterfacesIExternalServerMod.IExternalServer]) = this()
}


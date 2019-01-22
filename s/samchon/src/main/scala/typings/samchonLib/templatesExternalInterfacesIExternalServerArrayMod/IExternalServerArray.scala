package typings
package samchonLib.templatesExternalInterfacesIExternalServerArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalServerArray[System /* <: samchonLib.templatesExternalInterfacesIExternalServerMod.IExternalServer */]
  extends samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[System] {
  /**
    * Connect to {@link IExternalServer external servers}.
    *
    * This method calls children elements' method {@link IExternalServer.connect} gradually.
    */
  def connect(): scala.Unit = js.native
}


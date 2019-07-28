package typings.samchon.templatesExternalInterfacesIExternalServerArrayMod

import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalServerArray[System /* <: IExternalServer */] extends ExternalSystemArray[System] {
  /**
    * Connect to {@link IExternalServer external servers}.
    *
    * This method calls children elements' method {@link IExternalServer.connect} gradually.
    */
  def connect(): Unit = js.native
}


package typings.samchon.templatesExternalInterfacesIExternalServerClientArrayMod

import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.samchon.templatesExternalInterfacesIExternalClientArrayMod.IExternalClientArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalServerClientArray[System /* <: ExternalSystem */] extends IExternalClientArray[System] {
  /**
    * Connect to {@link IExternalServer external servers}.
    *
    * This method calls children elements' method {@link IExternalServer.connect} gradually.
    */
  def connect(): Unit = js.native
}


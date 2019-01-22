package typings
package samchonLib.templatesExternalInterfacesIExternalServerClientArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalServerClientArray[System /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */]
  extends samchonLib.templatesExternalInterfacesIExternalClientArrayMod.IExternalClientArray[System] {
  /**
    * Connect to {@link IExternalServer external servers}.
    *
    * This method calls children elements' method {@link IExternalServer.connect} gradually.
    */
  def connect(): scala.Unit = js.native
}


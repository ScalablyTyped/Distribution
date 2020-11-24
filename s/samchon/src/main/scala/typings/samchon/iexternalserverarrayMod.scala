package typings.samchon

import typings.samchon.externalSystemArrayMod.ExternalSystemArray
import typings.samchon.iexternalserverMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/external/interfaces/IExternalServerArray", JSImport.Namespace)
@js.native
object iexternalserverarrayMod extends js.Object {
  
  @js.native
  trait IExternalServerArray[System /* <: IExternalServer */] extends ExternalSystemArray[System] {
    
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
  }
}

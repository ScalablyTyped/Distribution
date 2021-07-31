package typings.samchon

import typings.samchon.externalSystemArrayMod.ExternalSystemArray
import typings.samchon.iexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iexternalserverarrayMod {
  
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

package typings.samchon

import typings.samchon.externalSystemMod.ExternalSystem
import typings.samchon.iexternalclientarrayMod.IExternalClientArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iexternalserverclientarrayMod {
  
  @js.native
  trait IExternalServerClientArray[System /* <: ExternalSystem */] extends IExternalClientArray[System] {
    
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
  }
}

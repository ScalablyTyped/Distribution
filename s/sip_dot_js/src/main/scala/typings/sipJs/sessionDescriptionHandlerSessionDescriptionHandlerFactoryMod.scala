package typings.sipJs

import typings.sipJs.apiMod.Session
import typings.sipJs.sessionDescriptionHandlerFactoryOptionsMod.SessionDescriptionHandlerFactoryOptions
import typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod {
  
  @js.native
  trait SessionDescriptionHandlerFactory
    extends typings.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory {
    
    /**
      * SessionDescriptionHandler factory function.
      * @remarks
      * The `options` are provided as part of the UserAgent configuration
      * and passed through on every call to SessionDescriptionHandlerFactory's constructor.
      */
    def apply(session: Session): SessionDescriptionHandler = js.native
    def apply(session: Session, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  }
}

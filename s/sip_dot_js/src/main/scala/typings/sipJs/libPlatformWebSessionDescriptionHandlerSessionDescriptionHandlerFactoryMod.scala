package typings.sipJs

import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerFactoryOptionsMod.SessionDescriptionHandlerFactoryOptions
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerFactoryMod {
  
  @js.native
  trait SessionDescriptionHandlerFactory
    extends typings.sipJs.libApiSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory {
    
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

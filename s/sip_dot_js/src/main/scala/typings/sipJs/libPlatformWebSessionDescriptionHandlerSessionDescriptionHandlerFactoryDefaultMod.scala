package typings.sipJs

import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerFactoryDefaultMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler-factory-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSessionDescriptionHandlerFactory")().asInstanceOf[SessionDescriptionHandlerFactory]
  inline def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSessionDescriptionHandlerFactory")(mediaStreamFactory.asInstanceOf[js.Any]).asInstanceOf[SessionDescriptionHandlerFactory]
}

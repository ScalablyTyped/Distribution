package typings.sipJs

import typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDescriptionHandlerFactoryDefaultMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler-factory-default", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = js.native
  @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler-factory-default", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = js.native
}

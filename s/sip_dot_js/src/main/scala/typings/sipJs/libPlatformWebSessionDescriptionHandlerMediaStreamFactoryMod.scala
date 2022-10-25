package typings.sipJs

import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerOptionsMod.SessionDescriptionHandlerOptions
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerMediaStreamFactoryMod {
  
  type MediaStreamFactory = js.Function3[
    /* constraints */ MediaStreamConstraints, 
    /* sessionDescriptionHandler */ SessionDescriptionHandler, 
    /* options */ js.UndefOr[SessionDescriptionHandlerOptions], 
    js.Promise[MediaStream]
  ]
}

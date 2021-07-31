package typings.sipJs

import typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaStreamFactoryMod {
  
  type MediaStreamFactory = js.Function2[
    /* constraints */ MediaStreamConstraints, 
    /* sessionDescriptionHandler */ SessionDescriptionHandler, 
    js.Promise[MediaStream]
  ]
}

package typings.sipJs

import typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web/session-description-handler/media-stream-factory", JSImport.Namespace)
@js.native
object mediaStreamFactoryMod extends js.Object {
  type MediaStreamFactory = js.Function2[
    /* constraints */ MediaStreamConstraints, 
    /* sessionDescriptionHandler */ SessionDescriptionHandler, 
    js.Promise[MediaStream]
  ]
}


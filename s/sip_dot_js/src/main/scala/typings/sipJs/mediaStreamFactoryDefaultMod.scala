package typings.sipJs

import typings.sipJs.mediaStreamFactoryMod.MediaStreamFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaStreamFactoryDefaultMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler/media-stream-factory-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultMediaStreamFactory(): MediaStreamFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMediaStreamFactory")().asInstanceOf[MediaStreamFactory]
}

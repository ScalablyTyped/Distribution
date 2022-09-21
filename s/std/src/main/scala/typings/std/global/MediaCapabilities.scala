package typings.std.global

import typings.std.MediaCapabilitiesDecodingInfo
import typings.std.MediaCapabilitiesEncodingInfo
import typings.std.MediaDecodingConfiguration
import typings.std.MediaEncodingConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaCapabilities")
@js.native
/* standard dom */
open class MediaCapabilities ()
  extends StObject
     with typings.std.MediaCapabilities {
  
  /* standard dom */
  /* CompleteClass */
  override def decodingInfo(configuration: MediaDecodingConfiguration): js.Promise[MediaCapabilitiesDecodingInfo] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def encodingInfo(configuration: MediaEncodingConfiguration): js.Promise[MediaCapabilitiesEncodingInfo] = js.native
}

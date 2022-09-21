package typings.std.global

import typings.std.MediaKeySystemConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaKeySystemAccess")
@js.native
/* standard dom */
open class MediaKeySystemAccess ()
  extends StObject
     with typings.std.MediaKeySystemAccess {
  
  /* standard dom */
  /* CompleteClass */
  override def createMediaKeys(): js.Promise[typings.std.MediaKeys] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
}

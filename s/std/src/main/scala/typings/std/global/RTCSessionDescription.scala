package typings.std.global

import typings.std.RTCSdpType
import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCSessionDescription")
@js.native
open class RTCSessionDescription protected ()
  extends StObject
     with typings.std.RTCSessionDescription {
  /* standard dom */
  def this(descriptionInitDict: RTCSessionDescriptionInit) = this()
  
  /* standard dom */
  /* CompleteClass */
  override val sdp: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val `type`: RTCSdpType = js.native
}

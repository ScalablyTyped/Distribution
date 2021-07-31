package typings.std.global

import typings.std.MediaDeviceKind
import typings.std.MediaTrackCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("InputDeviceInfo")
@js.native
class InputDeviceInfo ()
  extends StObject
     with typings.std.InputDeviceInfo {
  
  /* CompleteClass */
  override val deviceId: java.lang.String = js.native
  
  /* CompleteClass */
  override def getCapabilities(): MediaTrackCapabilities = js.native
  
  /* CompleteClass */
  override val groupId: java.lang.String = js.native
  
  /* CompleteClass */
  override val kind: MediaDeviceKind = js.native
  
  /* CompleteClass */
  override val label: java.lang.String = js.native
  
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

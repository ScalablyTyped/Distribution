package typings.std.global

import typings.std.MediaDeviceKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("InputDeviceInfo")
@js.native
/* standard dom */
open class InputDeviceInfo ()
  extends StObject
     with typings.std.MediaDeviceInfo {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/deviceId) */
  /* standard dom */
  /* CompleteClass */
  override val deviceId: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/groupId) */
  /* standard dom */
  /* CompleteClass */
  override val groupId: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind) */
  /* standard dom */
  /* CompleteClass */
  override val kind: MediaDeviceKind = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/label) */
  /* standard dom */
  /* CompleteClass */
  override val label: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/toJSON) */
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}

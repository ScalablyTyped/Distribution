package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MediaDevicesInfo interface contains information that describes a single media input or output device.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo)
  */
trait MediaDeviceInfo extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/deviceId) */
  /* standard dom */
  val deviceId: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/groupId) */
  /* standard dom */
  val groupId: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind) */
  /* standard dom */
  val kind: MediaDeviceKind
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/label) */
  /* standard dom */
  val label: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/toJSON) */
  /* standard dom */
  def toJSON(): Any
}
object MediaDeviceInfo {
  
  inline def apply(
    deviceId: java.lang.String,
    groupId: java.lang.String,
    kind: MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => Any
  ): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MediaDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: MediaDeviceKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}

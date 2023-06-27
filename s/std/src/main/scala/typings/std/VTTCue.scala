package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue) */
@js.native
trait VTTCue
  extends StObject
     with TextTrackCue {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align) */
  /* standard dom */
  var align: AlignSetting = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/getCueAsHTML) */
  /* standard dom */
  def getCueAsHTML(): DocumentFragment = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/line) */
  /* standard dom */
  var line: LineAndPositionSetting = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign) */
  /* standard dom */
  var lineAlign: LineAlignSetting = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/position) */
  /* standard dom */
  var position: LineAndPositionSetting = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign) */
  /* standard dom */
  var positionAlign: PositionAlignSetting = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/region) */
  /* standard dom */
  var region: VTTRegion | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/size) */
  /* standard dom */
  var size: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/snapToLines) */
  /* standard dom */
  var snapToLines: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/text) */
  /* standard dom */
  var text: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical) */
  /* standard dom */
  var vertical: DirectionSetting = js.native
}

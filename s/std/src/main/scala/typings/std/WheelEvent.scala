package typings.std

import typings.std.stdInts.`0x00`
import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events that occur due to the user moving a mouse wheel or similar input device.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent)
  */
@js.native
trait WheelEvent
  extends StObject
     with MouseEvent {
  
  /* standard dom */
  val DOM_DELTA_LINE: `0x01` = js.native
  
  /* standard dom */
  val DOM_DELTA_PAGE: `0x02` = js.native
  
  /* standard dom */
  val DOM_DELTA_PIXEL: `0x00` = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaMode) */
  /* standard dom */
  val deltaMode: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaX) */
  /* standard dom */
  val deltaX: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaY) */
  /* standard dom */
  val deltaY: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaZ) */
  /* standard dom */
  val deltaZ: Double = js.native
}

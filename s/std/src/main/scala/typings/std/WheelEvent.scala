package typings.std

import typings.std.stdInts.`0x00`
import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events that occur due to the user moving a mouse wheel or similar input device. */
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
  
  /* standard dom */
  val deltaMode: Double = js.native
  
  /* standard dom */
  val deltaX: Double = js.native
  
  /* standard dom */
  val deltaY: Double = js.native
  
  /* standard dom */
  val deltaZ: Double = js.native
}

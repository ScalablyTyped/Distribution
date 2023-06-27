package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent) */
@js.native
trait InputEvent
  extends StObject
     with UIEvent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/data) */
  /* standard dom */
  val data: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/dataTransfer) */
  /* standard dom */
  val dataTransfer: DataTransfer | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/getTargetRanges) */
  /* standard dom */
  def getTargetRanges(): js.Array[StaticRange] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/inputType) */
  /* standard dom */
  val inputType: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/isComposing) */
  /* standard dom */
  val isComposing: scala.Boolean = js.native
}

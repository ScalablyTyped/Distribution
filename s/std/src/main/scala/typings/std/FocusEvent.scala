package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Focus-related events like focus, blur, focusin, or focusout.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
  */
@js.native
trait FocusEvent
  extends StObject
     with UIEvent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget) */
  /* standard dom */
  val relatedTarget: EventTarget | Null = js.native
}

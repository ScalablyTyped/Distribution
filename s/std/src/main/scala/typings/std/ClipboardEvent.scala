package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events providing information related to modification of the clipboard, that is cut, copy, and paste events.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent)
  */
@js.native
trait ClipboardEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent/clipboardData) */
  /* standard dom */
  val clipboardData: DataTransfer | Null = js.native
}

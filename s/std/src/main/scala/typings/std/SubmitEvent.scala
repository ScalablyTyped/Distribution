package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent) */
@js.native
trait SubmitEvent
  extends StObject
     with Event {
  
  /**
    * Returns the element representing the submit button that triggered the form submission, or null if the submission was not triggered by a button.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent/submitter)
    */
  /* standard dom */
  val submitter: HTMLElement | Null = js.native
}

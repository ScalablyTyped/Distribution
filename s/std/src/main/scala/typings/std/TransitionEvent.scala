package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events providing information related to transitions.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
  */
@js.native
trait TransitionEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/elapsedTime) */
  /* standard dom */
  val elapsedTime: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/propertyName) */
  /* standard dom */
  val propertyName: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/pseudoElement) */
  /* standard dom */
  val pseudoElement: java.lang.String = js.native
}

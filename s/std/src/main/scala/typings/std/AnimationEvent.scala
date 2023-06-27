package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events providing information related to animations.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent)
  */
@js.native
trait AnimationEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/animationName) */
  /* standard dom */
  val animationName: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/elapsedTime) */
  /* standard dom */
  val elapsedTime: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/pseudoElement) */
  /* standard dom */
  val pseudoElement: java.lang.String = js.native
}

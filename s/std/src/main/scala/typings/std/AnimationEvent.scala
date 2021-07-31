package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events providing information related to animations. */
@js.native
trait AnimationEvent
  extends StObject
     with Event {
  
  val animationName: java.lang.String = js.native
  
  val elapsedTime: Double = js.native
  
  val pseudoElement: java.lang.String = js.native
}

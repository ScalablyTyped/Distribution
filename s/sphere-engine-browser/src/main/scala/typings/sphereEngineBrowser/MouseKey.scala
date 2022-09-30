package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MouseKey extends StObject
/**
  * Identifies the type of input received from a mouse.
  */
@JSGlobal("MouseKey")
@js.native
object MouseKey extends StObject {
  
  /** The Back button. */
  @js.native
  sealed trait Back
    extends StObject
       with MouseKey
  
  /** The Forward button. */
  @js.native
  sealed trait Forward
    extends StObject
       with MouseKey
  
  /** The left mouse button. */
  @js.native
  sealed trait Left
    extends StObject
       with MouseKey
  
  /** The middle mouse button or the wheel button. */
  @js.native
  sealed trait Middle
    extends StObject
       with MouseKey
  
  /** The right mouse button. */
  @js.native
  sealed trait Right
    extends StObject
       with MouseKey
  
  /** Synthetic. Produced when the wheel is spun to scroll down. */
  @js.native
  sealed trait WheelDown
    extends StObject
       with MouseKey
  
  /** Synthetic. Produced when the wheel is spun to scroll up. */
  @js.native
  sealed trait WheelUp
    extends StObject
       with MouseKey
}

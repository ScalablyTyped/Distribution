package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance of the built-in pseudorandom number generator.
  */
@JSGlobal("RNG")
@js.native
/**
  * Construct a new RNG using a seed based on the current date and time.
  */
open class RNG ()
  extends StObject
     with typings.sphereEngineBrowser.RNG
object RNG {
  
  @JSGlobal("RNG")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Construct a new RNG using a given seed. Each seed value produces a different sequence of
    * random numbers.
    * @param seed A number whose integer part will be used to determine the initial RNG state.
    */
  /* static member */
  inline def fromSeed(seed: Double): typings.sphereEngineBrowser.RNG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[typings.sphereEngineBrowser.RNG]
  
  /**
    * Construct a new RNG which starts in a specified state.
    * @param state A 32-byte hexadecimal string specifying the initial state of the new RNG, in the
    *              same format as the `state` property.
    * @throws `TypeError` if `state` is not exactly 32 characters or contains anything other than
    *         hexadecimal digits (0-9, A-F, case-insensitive).
    */
  /* static member */
  inline def fromState(state: String): typings.sphereEngineBrowser.RNG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(state.asInstanceOf[js.Any]).asInstanceOf[typings.sphereEngineBrowser.RNG]
}

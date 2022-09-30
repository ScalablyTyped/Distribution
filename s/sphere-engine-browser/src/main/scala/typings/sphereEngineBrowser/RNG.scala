package typings.sphereEngineBrowser

import typings.std.Iterable
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance of the built-in pseudorandom number generator.
  */
@js.native
trait RNG
  extends StObject
     with Iterable[Double] {
  
  /**
    * Get the next random number in the sequence. Follows the ES6 iterator protocol.
    */
  def next(): IteratorResult[Double, Any] = js.native
  
  /**
    * A 32-byte string of hexadecimal digits representing the current state of this RNG. This
    * string can be saved, e.g., to a file, and later passed to `RNG.fromState` to resume the
    * RNG from that exact point.
    */
  var state: String = js.native
}

package typings
package simmerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoConflict extends js.Object {
  /**
    * Just in case you also had the brilliant idea of using a variable
    * called "Simmer", or you wish to move it off of the global object then
    * you can use the noConflict method to receive a reference to the
    * object and remove it from the window. Calling it will also revert the
    * original value of window.Simmer which was there before loading the
    * Simmer.js script (if there was one)
    */
  def noConflict(): js.Any
}

object Anon_NoConflict {
  @scala.inline
  def apply(noConflict: () => js.Any): Anon_NoConflict = {
    val __obj = js.Dynamic.literal(noConflict = js.Any.fromFunction0(noConflict))
  
    __obj.asInstanceOf[Anon_NoConflict]
  }
}


package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddImplementation
  extends org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Thenable[js.Object]] {
  /**
    * Adds a property to a class prototype to allow runtime checks of whether
    * instances of that class implement the Thenable interface. This function
    * will also ensure the prototype's {@code then} function is exported from
    * compiled code.
    * @param {function(new: Thenable, ...?)} ctor The
    *     constructor whose prototype to modify.
    */
  def addImplementation(ctor: js.Function): scala.Unit = js.native
  /**
    * Checks if an object has been tagged for implementing the Thenable
    * interface as defined by {@link Thenable.addImplementation}.
    * @param {*} object The object to test.
    * @return {boolean} Whether the object is an implementation of the Thenable
    *     interface.
    */
  def isImplementation(`object`: js.Any): scala.Boolean = js.native
}


package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterRegistryRadix extends js.Object {
  /**
    * Adds a route.
    */
  def add(route: Route): scala.Boolean
  /**
    * Get registry.
    */
  def get(): js.Array[Route]
  /**
    * Registry for route.
    */
  def lookup(method: java.lang.String, pathname: java.lang.String): js.UndefOr[Chain]
  /**
    * Removes a route.
    */
  def remove(name: java.lang.String): js.UndefOr[Route]
}

object RouterRegistryRadix {
  @scala.inline
  def apply(
    add: Route => scala.Boolean,
    get: () => js.Array[Route],
    lookup: (java.lang.String, java.lang.String) => js.UndefOr[Chain],
    remove: java.lang.String => js.UndefOr[Route],
    toString: () => java.lang.String
  ): RouterRegistryRadix = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction0(get), lookup = js.Any.fromFunction2(lookup), remove = js.Any.fromFunction1(remove), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[RouterRegistryRadix]
  }
}


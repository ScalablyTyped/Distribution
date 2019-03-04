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
    add: js.Function1[Route, scala.Boolean],
    get: js.Function0[js.Array[Route]],
    lookup: js.Function2[java.lang.String, java.lang.String, js.UndefOr[Chain]],
    remove: js.Function1[java.lang.String, js.UndefOr[Route]],
    toString: js.Function0[java.lang.String]
  ): RouterRegistryRadix = {
    val __obj = js.Dynamic.literal(add = add, get = get, lookup = lookup, remove = remove, toString = toString)
  
    __obj.asInstanceOf[RouterRegistryRadix]
  }
}


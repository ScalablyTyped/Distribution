package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterRegistryRadix extends js.Object {
  /**
    * Adds a route.
    */
  def add(route: Route): Boolean
  /**
    * Get registry.
    */
  def get(): js.Array[Route]
  /**
    * Registry for route.
    */
  def lookup(method: String, pathname: String): js.UndefOr[Chain]
  /**
    * Removes a route.
    */
  def remove(name: String): js.UndefOr[Route]
}

object RouterRegistryRadix {
  @scala.inline
  def apply(
    add: Route => Boolean,
    get: () => js.Array[Route],
    lookup: (String, String) => js.UndefOr[Chain],
    remove: String => js.UndefOr[Route]
  ): RouterRegistryRadix = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction0(get), lookup = js.Any.fromFunction2(lookup), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[RouterRegistryRadix]
  }
}


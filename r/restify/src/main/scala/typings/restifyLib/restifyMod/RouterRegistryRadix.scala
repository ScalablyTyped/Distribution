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


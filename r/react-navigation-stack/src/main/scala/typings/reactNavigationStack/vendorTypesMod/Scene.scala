package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.AnonCurrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene[T] extends js.Object {
  /**
    * Descriptor object for the route containing options and navigation object.
    */
  var descriptor: StackDescriptor
  /**
    * Animated nodes representing the progress of the animation.
    */
  var progress: AnonCurrent
  /**
    * Current route object,
    */
  var route: T
}

object Scene {
  @scala.inline
  def apply[T](descriptor: StackDescriptor, progress: AnonCurrent, route: T): Scene[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene[T]]
  }
}


package typings.ractive.ractiveMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registries[T /* <: Ractive[T] */] extends js.Object {
  var adaptors: Registry[Adaptor]
  var components: Registry[Component]
  var decorators: Registry[Decorator[T]]
  var easings: Registry[Easing]
  var events: Registry[Event]
  var helpers: Registry[Helper]
  var interpolators: Registry[Interpolator]
  var partials: Registry[Partial]
}

object Registries {
  @scala.inline
  def apply[T /* <: Ractive[T] */](
    adaptors: Registry[Adaptor],
    components: Registry[Component],
    decorators: Registry[Decorator[T]],
    easings: Registry[Easing],
    events: Registry[Event],
    helpers: Registry[Helper],
    interpolators: Registry[Interpolator],
    partials: Registry[Partial]
  ): Registries[T] = {
    val __obj = js.Dynamic.literal(adaptors = adaptors, components = components, decorators = decorators, easings = easings, events = events, helpers = helpers, interpolators = interpolators, partials = partials)
  
    __obj.asInstanceOf[Registries[T]]
  }
}


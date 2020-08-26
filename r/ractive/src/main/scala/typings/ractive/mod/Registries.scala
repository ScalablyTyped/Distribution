package typings.ractive.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registries[T /* <: Ractive[T] */] extends js.Object {
  var adaptors: Registry[Adaptor] = js.native
  var components: Registry[Component] = js.native
  var decorators: Registry[Decorator[T]] = js.native
  var easings: Registry[Easing] = js.native
  var events: Registry[Event] = js.native
  var helpers: Registry[Helper] = js.native
  var interpolators: Registry[Interpolator] = js.native
  var partials: Registry[Partial] = js.native
}

object Registries {
  @scala.inline
  def apply[/* <: typings.ractive.mod.Ractive[T] */ T](
    adaptors: Registry[Adaptor],
    components: Registry[Component],
    decorators: Registry[Decorator[T]],
    easings: Registry[Easing],
    events: Registry[Event],
    helpers: Registry[Helper],
    interpolators: Registry[Interpolator],
    partials: Registry[Partial]
  ): Registries[T] = {
    val __obj = js.Dynamic.literal(adaptors = adaptors.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], easings = easings.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], interpolators = interpolators.asInstanceOf[js.Any], partials = partials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registries[T]]
  }
  @scala.inline
  implicit class RegistriesOps[Self <: Registries[_], /* <: typings.ractive.mod.Ractive[T] */ T] (val x: Self with Registries[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdaptors(value: Registry[Adaptor]): Self = this.set("adaptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponents(value: Registry[Component]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecorators(value: Registry[Decorator[T]]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasings(value: Registry[Easing]): Self = this.set("easings", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: Registry[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpers(value: Registry[Helper]): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolators(value: Registry[Interpolator]): Self = this.set("interpolators", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartials(value: Registry[Partial]): Self = this.set("partials", value.asInstanceOf[js.Any])
  }
  
}


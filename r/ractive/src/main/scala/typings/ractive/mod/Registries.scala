package typings.ractive.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registries[T /* <: Ractive[T] */] extends StObject {
  
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
    val __obj = js.Dynamic.literal(adaptors = adaptors.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], easings = easings.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], interpolators = interpolators.asInstanceOf[js.Any], partials = partials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registries[T]]
  }
  
  @scala.inline
  implicit class RegistriesMutableBuilder[Self <: Registries[_], T /* <: Ractive[T] */] (val x: Self with Registries[T]) extends AnyVal {
    
    @scala.inline
    def setAdaptors(value: Registry[Adaptor]): Self = StObject.set(x, "adaptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: Registry[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorators(value: Registry[Decorator[T]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasings(value: Registry[Easing]): Self = StObject.set(x, "easings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: Registry[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpers(value: Registry[Helper]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolators(value: Registry[Interpolator]): Self = StObject.set(x, "interpolators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartials(value: Registry[Partial]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
  }
}

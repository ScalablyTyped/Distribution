package typings.ractive.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registries[T /* <: Ractive[T] */] extends StObject {
  
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
  
  inline def apply[T /* <: Ractive[T] */](
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
  
  extension [Self <: Registries[?], T /* <: Ractive[T] */](x: Self & Registries[T]) {
    
    inline def setAdaptors(value: Registry[Adaptor]): Self = StObject.set(x, "adaptors", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: Registry[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: Registry[Decorator[T]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setEasings(value: Registry[Easing]): Self = StObject.set(x, "easings", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Registry[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setHelpers(value: Registry[Helper]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setInterpolators(value: Registry[Interpolator]): Self = StObject.set(x, "interpolators", value.asInstanceOf[js.Any])
    
    inline def setPartials(value: Registry[Partial]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
  }
}

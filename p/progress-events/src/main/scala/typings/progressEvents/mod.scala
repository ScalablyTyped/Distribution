package typings.progressEvents

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.progressEvents.mod.ProgressEvent because var conflicts: `type`. Inlined detail */ @JSImport("progress-events", "CustomProgressEvent")
  @js.native
  open class CustomProgressEvent[D, T /* <: String */] protected ()
    extends StObject
       with Event {
    def this(`type`: T) = this()
    def this(`type`: T, detail: Any) = this()
    
    var detail: D = js.native
    
    @JSName("type")
    var type_CustomProgressEvent: T = js.native
  }
  
  trait ProgressEvent[T /* <: String */, D] extends StObject {
    
    /**
      * Context-specific event information
      */
    var detail: D
    
    /**
      * The event type
      */
    var `type`: T
  }
  object ProgressEvent {
    
    inline def apply[T /* <: String */, D](detail: D, `type`: T): ProgressEvent[T, D] = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressEvent[T, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressEvent[?, ?], T /* <: String */, D] (val x: Self & (ProgressEvent[T, D])) extends AnyVal {
      
      inline def setDetail(value: D): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressOptions[Event /* <: ProgressEvent[Any, Any] */] extends StObject {
    
    var onProgress: js.UndefOr[js.Function1[/* evt */ Event, Unit]] = js.undefined
  }
  object ProgressOptions {
    
    inline def apply[Event /* <: ProgressEvent[Any, Any] */](): ProgressOptions[Event] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressOptions[Event]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressOptions[?], Event /* <: ProgressEvent[Any, Any] */] (val x: Self & ProgressOptions[Event]) extends AnyVal {
      
      inline def setOnProgress(value: /* evt */ Event => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
}

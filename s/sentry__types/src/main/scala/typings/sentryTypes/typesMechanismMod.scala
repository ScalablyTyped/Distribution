package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMechanismMod {
  
  trait Mechanism extends StObject {
    
    /**
      * Arbitrary data to be associated with the mechanism (for example, errors coming from event handlers include the
      * handler name and the event target. Will show up in the UI directly above the stacktrace.
      */
    var data: js.UndefOr[StringDictionary[String | Boolean]] = js.undefined
    
    /**
      * In theory, whether or not the exception has been handled by the user. In practice, whether or not we see it before
      * it hits the global error/rejection handlers, whether through explicit handling by the user or auto instrumentation.
      * Converted to a tag on ingest and used in various ways in the UI.
      */
    var handled: Boolean
    
    /**
      * True when `captureException` is called with anything other than an instance of `Error` (or, in the case of browser,
      * an instance of `ErrorEvent`, `DOMError`, or `DOMException`). causing us to create a synthetic error in an attempt
      * to recreate the stacktrace.
      */
    var synthetic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For now, restricted to `onerror`, `onunhandledrejection` (both obvious), `instrument` (the result of
      * auto-instrumentation), and `generic` (everything else). Converted to a tag on ingest.
      */
    var `type`: String
  }
  object Mechanism {
    
    inline def apply(handled: Boolean, `type`: String): Mechanism = {
      val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[String | Boolean]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setSynthetic(value: Boolean): Self = StObject.set(x, "synthetic", value.asInstanceOf[js.Any])
      
      inline def setSyntheticUndefined: Self = StObject.set(x, "synthetic", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

package typings.sentryNode

import typings.sentryNode.transportsHttpMod.NodeTransportOptions
import typings.sentryTypes.integrationMod.Integration
import typings.sentryTypes.optionsMod.ClientOptions
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.stackframeMod.StackFrame
import typings.sentryTypes.tracingMod.TracePropagationTargets
import typings.sentryTypes.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait BaseNodeOptions extends StObject {
    
    /** Callback that is executed when a fatal global error occurs. */
    var onFatalError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /** Sets an optional server name (device name) */
    var serverName: js.UndefOr[String] = js.undefined
    
    /**
      * List of strings/regex controlling to which outgoing requests
      * the SDK will attach tracing headers.
      *
      * By default the SDK will attach those headers to all outgoing
      * requests. If this option is provided, the SDK will match the
      * request URL of outgoing requests against the items in this
      * array, and only attach tracing headers if a match was found.
      */
    var tracePropagationTargets: js.UndefOr[TracePropagationTargets] = js.undefined
  }
  object BaseNodeOptions {
    
    inline def apply(): BaseNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseNodeOptions]
    }
    
    extension [Self <: BaseNodeOptions](x: Self) {
      
      inline def setOnFatalError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onFatalError", js.Any.fromFunction1(value))
      
      inline def setOnFatalErrorUndefined: Self = StObject.set(x, "onFatalError", js.undefined)
      
      inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
      
      inline def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
      
      inline def setTracePropagationTargets(value: TracePropagationTargets): Self = StObject.set(x, "tracePropagationTargets", value.asInstanceOf[js.Any])
      
      inline def setTracePropagationTargetsUndefined: Self = StObject.set(x, "tracePropagationTargets", js.undefined)
      
      inline def setTracePropagationTargetsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tracePropagationTargets", js.Array(value*))
    }
  }
  
  trait NodeClientOptions
    extends StObject
       with ClientOptions[NodeTransportOptions]
       with BaseNodeOptions
  object NodeClientOptions {
    
    inline def apply(
      integrations: js.Array[Integration],
      stackParser: (/* stack */ String, /* skipFirst */ js.UndefOr[Double]) => js.Array[StackFrame],
      transport: NodeTransportOptions => Transport
    ): NodeClientOptions = {
      val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], stackParser = js.Any.fromFunction2(stackParser), transport = js.Any.fromFunction1(transport))
      __obj.asInstanceOf[NodeClientOptions]
    }
  }
  
  trait NodeOptions
    extends StObject
       with Options[NodeTransportOptions]
       with BaseNodeOptions
  object NodeOptions {
    
    inline def apply(): NodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeOptions]
    }
  }
}

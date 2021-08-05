package typings.samchon

import typings.samchon.entityArrayMod.EntityArray
import typings.samchon.invokeParameterMod.InvokeParameter
import typings.std.Uint8Array
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeMod {
  
  @JSImport("samchon/protocol/invoke/Invoke", "Invoke")
  @js.native
  /**
    * Default Constructor.
    */
  class Invoke () extends EntityArray[InvokeParameter] {
    /**
      * Copy Constructor.
      *
      * @param invoke
      */
    def this(invoke: Invoke) = this()
    def this(listener: String) = this()
    /**
      * Construct from listener and parametric values.
      *
      * @param listener
      * @param parameters
      */
    def this(listener: String, parameters: (Boolean | Double | String | XML | Uint8Array)*) = this()
    
    /**
      * Apply to a matched function.
      *
      * @param obj Target object to find matched function.
      * @return Whether succeded to find matched function.
      */
    @JSName("apply")
    def apply(obj: js.Object): Boolean = js.native
    /**
      * Apply to a function.
      *
      * @param thisArg Owner of the function.
      * @param func Function to call.
      */
    @JSName("apply")
    def apply(thisArg: js.Object, func: js.Function): Unit = js.native
    
    /**
      * Get arguments for Function.apply().
      *
      * @return An array containing values of the contained parameters.
      */
    def getArguments(): js.Array[js.Any] = js.native
    
    /**
      * Get listener.
      */
    def getListener(): String = js.native
    
    /**
      * Listener, represent function's name.
      */
    /* private */ var listener: js.Any = js.native
  }
}

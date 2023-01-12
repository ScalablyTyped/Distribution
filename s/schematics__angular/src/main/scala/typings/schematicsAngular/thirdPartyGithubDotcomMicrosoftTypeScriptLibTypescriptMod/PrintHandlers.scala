package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintHandlers extends StObject {
  
  /**
    * A hook used by the Printer when generating unique names to avoid collisions with
    * globally defined names that exist outside of the current source file.
    */
  var hasGlobalName: js.UndefOr[js.Function1[/* name */ java.lang.String, Boolean]] = js.undefined
  
  /**
    * A hook used to check if an emit notification is required for a node.
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  
  /**
    * A hook used by the Printer to provide notifications prior to emitting a node. A
    * compatible implementation **must** invoke `emitCallback` with the provided `hint` and
    * `node` values.
    * @param hint A hint indicating the intended purpose of the node.
    * @param node The node to emit.
    * @param emitCallback A callback that, when invoked, will emit the node.
    * @example
    * ```ts
    * var printer = createPrinter(printerOptions, {
    *   onEmitNode(hint, node, emitCallback) {
    *     // set up or track state prior to emitting the node...
    *     emitCallback(hint, node);
    *     // restore state after emitting the node...
    *   }
    * });
    * ```
    */
  var onEmitNode: js.UndefOr[
    js.Function3[
      /* hint */ EmitHint, 
      /* node */ Node, 
      /* emitCallback */ js.Function2[/* hint */ EmitHint, /* node */ Node, Unit], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A hook used by the Printer to perform just-in-time substitution of a node. This is
    * primarily used by node transformations that need to substitute one node for another,
    * such as replacing `myExportedVar` with `exports.myExportedVar`.
    * @param hint A hint indicating the intended purpose of the node.
    * @param node The node to emit.
    * @example
    * ```ts
    * var printer = createPrinter(printerOptions, {
    *   substituteNode(hint, node) {
    *     // perform substitution if necessary...
    *     return node;
    *   }
    * });
    * ```
    */
  var substituteNode: js.UndefOr[js.Function2[/* hint */ EmitHint, /* node */ Node, Node]] = js.undefined
}
object PrintHandlers {
  
  inline def apply(): PrintHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintHandlers] (val x: Self) extends AnyVal {
    
    inline def setHasGlobalName(value: /* name */ java.lang.String => Boolean): Self = StObject.set(x, "hasGlobalName", js.Any.fromFunction1(value))
    
    inline def setHasGlobalNameUndefined: Self = StObject.set(x, "hasGlobalName", js.undefined)
    
    inline def setIsEmitNotificationEnabled(value: /* node */ Node => Boolean): Self = StObject.set(x, "isEmitNotificationEnabled", js.Any.fromFunction1(value))
    
    inline def setIsEmitNotificationEnabledUndefined: Self = StObject.set(x, "isEmitNotificationEnabled", js.undefined)
    
    inline def setOnEmitNode(
      value: (/* hint */ EmitHint, /* node */ Node, /* emitCallback */ js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit
    ): Self = StObject.set(x, "onEmitNode", js.Any.fromFunction3(value))
    
    inline def setOnEmitNodeUndefined: Self = StObject.set(x, "onEmitNode", js.undefined)
    
    inline def setSubstituteNode(value: (/* hint */ EmitHint, /* node */ Node) => Node): Self = StObject.set(x, "substituteNode", js.Any.fromFunction2(value))
    
    inline def setSubstituteNodeUndefined: Self = StObject.set(x, "substituteNode", js.undefined)
  }
}

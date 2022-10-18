package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node in a tree of nested declarations in a file.
  * The top node is always a script or module node.
  */
trait NavigationTree extends StObject {
  
  /** Present if non-empty */
  var childItems: js.UndefOr[js.Array[NavigationTree]] = js.undefined
  
  var kind: ScriptElementKind
  
  /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
  var kindModifiers: java.lang.String
  
  var nameSpan: js.UndefOr[TextSpan] = js.undefined
  
  /**
    * Spans of the nodes that generated this declaration.
    * There will be more than one if this is the result of merging.
    */
  var spans: js.Array[TextSpan]
  
  /** Name of the declaration, or a short description, e.g. "<class>". */
  var text: java.lang.String
}
object NavigationTree {
  
  inline def apply(
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationTree = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTree]
  }
  
  extension [Self <: NavigationTree](x: Self) {
    
    inline def setChildItems(value: js.Array[NavigationTree]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
    
    inline def setChildItemsUndefined: Self = StObject.set(x, "childItems", js.undefined)
    
    inline def setChildItemsVarargs(value: NavigationTree*): Self = StObject.set(x, "childItems", js.Array(value*))
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setNameSpan(value: TextSpan): Self = StObject.set(x, "nameSpan", value.asInstanceOf[js.Any])
    
    inline def setNameSpanUndefined: Self = StObject.set(x, "nameSpan", js.undefined)
    
    inline def setSpans(value: js.Array[TextSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    inline def setSpansVarargs(value: TextSpan*): Self = StObject.set(x, "spans", js.Array(value*))
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

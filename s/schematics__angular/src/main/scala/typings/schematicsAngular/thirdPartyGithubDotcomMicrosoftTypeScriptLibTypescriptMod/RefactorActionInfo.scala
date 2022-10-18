package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single refactoring action - for example, the "Extract Method..." refactor might
  * offer several actions, each corresponding to a surround class or closure to extract into.
  */
trait RefactorActionInfo extends StObject {
  
  /**
    * A description of this refactoring action to show to the user.
    * If the parent refactoring is inlined away, this will be the only text shown,
    * so this description should make sense by itself if the parent is inlineable=true
    */
  var description: java.lang.String
  
  /**
    * The hierarchical dotted name of the refactor action.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The programmatic name of the refactoring action
    */
  var name: java.lang.String
  
  /**
    * A message to show to the user if the refactoring cannot be applied in
    * the current context.
    */
  var notApplicableReason: js.UndefOr[java.lang.String] = js.undefined
}
object RefactorActionInfo {
  
  inline def apply(description: java.lang.String, name: java.lang.String): RefactorActionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorActionInfo]
  }
  
  extension [Self <: RefactorActionInfo](x: Self) {
    
    inline def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setKind(value: java.lang.String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableReason(value: java.lang.String): Self = StObject.set(x, "notApplicableReason", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableReasonUndefined: Self = StObject.set(x, "notApplicableReason", js.undefined)
  }
}

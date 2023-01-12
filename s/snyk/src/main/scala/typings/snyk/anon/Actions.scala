package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.ResourceActions
import typings.snyk.snykStrings.`no-op`
import typings.snyk.snykStrings.create
import typings.snyk.snykStrings.delete
import typings.snyk.snykStrings.read
import typings.snyk.snykStrings.update
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: ResourceActions
  
  var after: (Record[String, Any]) | Null
  
  var before: (Record[String, Any]) | Null
}
object Actions {
  
  inline def apply(actions: ResourceActions): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], after = null, before = null)
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ResourceActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (`no-op` | create | read | update | delete)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAfter(value: Record[String, Any]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterNull: Self = StObject.set(x, "after", null)
    
    inline def setBefore(value: Record[String, Any]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeNull: Self = StObject.set(x, "before", null)
  }
}

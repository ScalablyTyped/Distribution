package typings.storybookCsf.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryContextUpdate[TArgs]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var args: js.UndefOr[TArgs] = js.undefined
  
  var globals: js.UndefOr[Globals] = js.undefined
}
object StoryContextUpdate {
  
  inline def apply[TArgs](): StoryContextUpdate[TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryContextUpdate[TArgs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoryContextUpdate[?], TArgs] (val x: Self & StoryContextUpdate[TArgs]) extends AnyVal {
    
    inline def setArgs(value: TArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setGlobals(value: Globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
  }
}

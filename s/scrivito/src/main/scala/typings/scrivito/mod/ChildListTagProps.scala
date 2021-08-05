package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildListTagProps extends StObject {
  
  var parent: js.UndefOr[Obj] = js.undefined
  
  // TODO: hard to type
  var renderChild: js.UndefOr[js.Function1[/* child */ js.Any, js.Any]] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object ChildListTagProps {
  
  inline def apply(): ChildListTagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildListTagProps]
  }
  
  extension [Self <: ChildListTagProps](x: Self) {
    
    inline def setParent(value: Obj): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRenderChild(value: /* child */ js.Any => js.Any): Self = StObject.set(x, "renderChild", js.Any.fromFunction1(value))
    
    inline def setRenderChildUndefined: Self = StObject.set(x, "renderChild", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}

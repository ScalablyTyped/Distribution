package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildListTagProps extends StObject {
  
  var parent: js.UndefOr[Obj] = js.native
  
  // TODO: hard to type
  var renderChild: js.UndefOr[js.Function1[/* child */ js.Any, _]] = js.native
  
  var tag: js.UndefOr[String] = js.native
}
object ChildListTagProps {
  
  @scala.inline
  def apply(): ChildListTagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildListTagProps]
  }
  
  @scala.inline
  implicit class ChildListTagPropsMutableBuilder[Self <: ChildListTagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: Obj): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRenderChild(value: /* child */ js.Any => _): Self = StObject.set(x, "renderChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderChildUndefined: Self = StObject.set(x, "renderChild", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}

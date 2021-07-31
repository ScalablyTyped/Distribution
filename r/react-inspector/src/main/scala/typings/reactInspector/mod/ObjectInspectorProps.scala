package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectInspectorProps
  extends StObject
     with TreeViewProps
     with ThemedComponentProps {
  
  /**
    * Show non-enumerable properties.
    */
  var showNonenumerable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sort object keys with optional compare function.
    */
  var sortObjectKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.undefined
}
object ObjectInspectorProps {
  
  @scala.inline
  def apply(): ObjectInspectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectInspectorProps]
  }
  
  @scala.inline
  implicit class ObjectInspectorPropsMutableBuilder[Self <: ObjectInspectorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowNonenumerable(value: Boolean): Self = StObject.set(x, "showNonenumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNonenumerableUndefined: Self = StObject.set(x, "showNonenumerable", js.undefined)
    
    @scala.inline
    def setSortObjectKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = StObject.set(x, "sortObjectKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortObjectKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "sortObjectKeys", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortObjectKeysUndefined: Self = StObject.set(x, "sortObjectKeys", js.undefined)
  }
}

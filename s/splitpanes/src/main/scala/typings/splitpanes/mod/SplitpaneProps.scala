package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneProps extends StObject {
  
  // true
  var dblClickSplitter: Boolean
  
  // true
  var firstSplitter: Boolean
  
  var horizontal: Boolean
  
  // false
  var pushOtherPanes: Boolean
}
object SplitpaneProps {
  
  inline def apply(dblClickSplitter: Boolean, firstSplitter: Boolean, horizontal: Boolean, pushOtherPanes: Boolean): SplitpaneProps = {
    val __obj = js.Dynamic.literal(dblClickSplitter = dblClickSplitter.asInstanceOf[js.Any], firstSplitter = firstSplitter.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], pushOtherPanes = pushOtherPanes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitpaneProps] (val x: Self) extends AnyVal {
    
    inline def setDblClickSplitter(value: Boolean): Self = StObject.set(x, "dblClickSplitter", value.asInstanceOf[js.Any])
    
    inline def setFirstSplitter(value: Boolean): Self = StObject.set(x, "firstSplitter", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setPushOtherPanes(value: Boolean): Self = StObject.set(x, "pushOtherPanes", value.asInstanceOf[js.Any])
  }
}

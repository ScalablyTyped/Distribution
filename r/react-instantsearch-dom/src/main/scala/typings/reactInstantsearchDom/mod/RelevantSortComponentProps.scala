package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelevantSortComponentProps extends StObject {
  
  var isRelevantSorted: Boolean
}
object RelevantSortComponentProps {
  
  inline def apply(isRelevantSorted: Boolean): RelevantSortComponentProps = {
    val __obj = js.Dynamic.literal(isRelevantSorted = isRelevantSorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelevantSortComponentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelevantSortComponentProps] (val x: Self) extends AnyVal {
    
    inline def setIsRelevantSorted(value: Boolean): Self = StObject.set(x, "isRelevantSorted", value.asInstanceOf[js.Any])
  }
}

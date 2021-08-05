package typings.react.mod

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseListCommonProps extends StObject {
  
  /**
    * Note that SuspenseList require more than one child;
    * it is a runtime warning to provide only a single child.
    *
    * It does, however, allow those children to be wrapped inside a single
    * level of `<React.Fragment>`.
    */
  var children: ReactElement | Iterable[ReactElement]
}
object SuspenseListCommonProps {
  
  inline def apply(children: ReactElement | Iterable[ReactElement]): SuspenseListCommonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListCommonProps]
  }
  
  extension [Self <: SuspenseListCommonProps](x: Self) {
    
    inline def setChildren(value: ReactElement | Iterable[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}

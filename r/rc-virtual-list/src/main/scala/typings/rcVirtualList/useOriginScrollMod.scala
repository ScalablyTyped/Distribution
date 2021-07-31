package typings.rcVirtualList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOriginScrollMod {
  
  @JSImport("rc-virtual-list/es/hooks/useOriginScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(isScrollAtTop: Boolean, isScrollAtBottom: Boolean): js.Function2[/* deltaY */ Double, /* smoothOffset */ js.UndefOr[Boolean], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(isScrollAtTop.asInstanceOf[js.Any], isScrollAtBottom.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* deltaY */ Double, /* smoothOffset */ js.UndefOr[Boolean], Boolean]]
}

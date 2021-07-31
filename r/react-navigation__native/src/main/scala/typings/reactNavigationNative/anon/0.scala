package typings.reactNavigationNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def getInitialState(): js.Promise[js.UndefOr[PartialPickReadonlykeystrHistory]]
}
object `0` {
  
  @scala.inline
  def apply(getInitialState: () => js.Promise[js.UndefOr[PartialPickReadonlykeystrHistory]]): `0` = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInitialState(value: () => js.Promise[js.UndefOr[PartialPickReadonlykeystrHistory]]): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
  }
}

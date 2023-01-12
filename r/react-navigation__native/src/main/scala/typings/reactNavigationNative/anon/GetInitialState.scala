package typings.reactNavigationNative.anon

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInitialState extends StObject {
  
  def getInitialState(): PromiseLike[js.UndefOr[PartialOmitReadonlykeystrHistory]]
}
object GetInitialState {
  
  inline def apply(getInitialState: () => PromiseLike[js.UndefOr[PartialOmitReadonlykeystrHistory]]): GetInitialState = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState))
    __obj.asInstanceOf[GetInitialState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInitialState] (val x: Self) extends AnyVal {
    
    inline def setGetInitialState(value: () => PromiseLike[js.UndefOr[PartialOmitReadonlykeystrHistory]]): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
  }
}

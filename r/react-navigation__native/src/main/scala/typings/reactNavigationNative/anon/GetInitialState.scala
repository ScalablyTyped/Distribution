package typings.reactNavigationNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInitialState extends StObject {
  
  def getInitialState(): js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]]
}
object GetInitialState {
  
  inline def apply(getInitialState: () => js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]]): GetInitialState = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState))
    __obj.asInstanceOf[GetInitialState]
  }
  
  extension [Self <: GetInitialState](x: Self) {
    
    inline def setGetInitialState(value: () => js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]]): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
  }
}

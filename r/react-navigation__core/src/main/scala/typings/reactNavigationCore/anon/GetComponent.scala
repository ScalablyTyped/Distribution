package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteConfigComponent
import typings.reactNavigationCore.libTypescriptSrcTypesMod.ScreenComponentType
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */]
  extends StObject
     with RouteConfigComponent[ParamList, RouteName] {
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Lazily get a React component to render for this screen.
    */
  def getComponent(): ScreenComponentType[ParamList, RouteName]
}
object GetComponent {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](getComponent: () => ScreenComponentType[ParamList, RouteName]): GetComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent))
    __obj.asInstanceOf[GetComponent[ParamList, RouteName]]
  }
  
  extension [Self <: GetComponent[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (GetComponent[ParamList, RouteName])) {
    
    inline def setGetComponent(value: () => ScreenComponentType[ParamList, RouteName]): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
  }
}

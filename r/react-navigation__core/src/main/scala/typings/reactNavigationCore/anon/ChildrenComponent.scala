package typings.reactNavigationCore.anon

import typings.react.mod.ReactNode
import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteConfigComponent
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */]
  extends StObject
     with RouteConfigComponent[ParamList, RouteName] {
  
  /**
    * Render callback to render content of this screen.
    */
  def children(props: Route[ParamList, RouteName]): ReactNode
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  var getComponent: js.UndefOr[scala.Nothing] = js.undefined
}
object ChildrenComponent {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](children: Route[ParamList, RouteName] => ReactNode): ChildrenComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ChildrenComponent[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenComponent[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self & (ChildrenComponent[ParamList, RouteName])) extends AnyVal {
    
    inline def setChildren(value: Route[ParamList, RouteName] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}

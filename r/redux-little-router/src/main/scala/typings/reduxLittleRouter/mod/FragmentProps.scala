package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentProps extends StObject {
  
  var forNoMatch: js.UndefOr[Boolean] = js.undefined
  
  var forRoute: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var matchRoute: js.UndefOr[js.Function] = js.undefined
  
  var matchWildcardRoute: js.UndefOr[js.Function] = js.undefined
  
  var parentId: js.UndefOr[String] = js.undefined
  
  var parentRoute: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[ObjectLiteral[Any]] = js.undefined
  
  var withConditions: js.UndefOr[js.Function1[/* location */ Location, Boolean]] = js.undefined
}
object FragmentProps {
  
  inline def apply(): FragmentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentProps]
  }
  
  extension [Self <: FragmentProps](x: Self) {
    
    inline def setForNoMatch(value: Boolean): Self = StObject.set(x, "forNoMatch", value.asInstanceOf[js.Any])
    
    inline def setForNoMatchUndefined: Self = StObject.set(x, "forNoMatch", js.undefined)
    
    inline def setForRoute(value: String): Self = StObject.set(x, "forRoute", value.asInstanceOf[js.Any])
    
    inline def setForRouteUndefined: Self = StObject.set(x, "forRoute", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMatchRoute(value: js.Function): Self = StObject.set(x, "matchRoute", value.asInstanceOf[js.Any])
    
    inline def setMatchRouteUndefined: Self = StObject.set(x, "matchRoute", js.undefined)
    
    inline def setMatchWildcardRoute(value: js.Function): Self = StObject.set(x, "matchWildcardRoute", value.asInstanceOf[js.Any])
    
    inline def setMatchWildcardRouteUndefined: Self = StObject.set(x, "matchWildcardRoute", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setParentRoute(value: String): Self = StObject.set(x, "parentRoute", value.asInstanceOf[js.Any])
    
    inline def setParentRouteUndefined: Self = StObject.set(x, "parentRoute", js.undefined)
    
    inline def setStyle(value: ObjectLiteral[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWithConditions(value: /* location */ Location => Boolean): Self = StObject.set(x, "withConditions", js.Any.fromFunction1(value))
    
    inline def setWithConditionsUndefined: Self = StObject.set(x, "withConditions", js.undefined)
  }
}

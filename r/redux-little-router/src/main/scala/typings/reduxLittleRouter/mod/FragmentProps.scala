package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentProps extends StObject {
  
  var forNoMatch: js.UndefOr[Boolean] = js.native
  
  var forRoute: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var matchRoute: js.UndefOr[js.Function] = js.native
  
  var matchWildcardRoute: js.UndefOr[js.Function] = js.native
  
  var parentId: js.UndefOr[String] = js.native
  
  var parentRoute: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[ObjectLiteral[_]] = js.native
  
  var withConditions: js.UndefOr[js.Function1[/* location */ Location, Boolean]] = js.native
}
object FragmentProps {
  
  @scala.inline
  def apply(): FragmentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentProps]
  }
  
  @scala.inline
  implicit class FragmentPropsMutableBuilder[Self <: FragmentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForNoMatch(value: Boolean): Self = StObject.set(x, "forNoMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForNoMatchUndefined: Self = StObject.set(x, "forNoMatch", js.undefined)
    
    @scala.inline
    def setForRoute(value: String): Self = StObject.set(x, "forRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForRouteUndefined: Self = StObject.set(x, "forRoute", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMatchRoute(value: js.Function): Self = StObject.set(x, "matchRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchRouteUndefined: Self = StObject.set(x, "matchRoute", js.undefined)
    
    @scala.inline
    def setMatchWildcardRoute(value: js.Function): Self = StObject.set(x, "matchWildcardRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchWildcardRouteUndefined: Self = StObject.set(x, "matchWildcardRoute", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setParentRoute(value: String): Self = StObject.set(x, "parentRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRouteUndefined: Self = StObject.set(x, "parentRoute", js.undefined)
    
    @scala.inline
    def setStyle(value: ObjectLiteral[_]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWithConditions(value: /* location */ Location => Boolean): Self = StObject.set(x, "withConditions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithConditionsUndefined: Self = StObject.set(x, "withConditions", js.undefined)
  }
}

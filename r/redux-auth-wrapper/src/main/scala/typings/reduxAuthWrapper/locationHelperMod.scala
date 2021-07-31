package typings.reduxAuthWrapper

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationHelperMod {
  
  @JSImport("redux-auth-wrapper/history3/locationHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Props](config: LocationHelperConfig[Props]): LocationHelper[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[LocationHelper[Props]]
  
  trait LocationHelper[Props] extends StObject {
    
    def createRedirectLoc(props: Props, redirectPath: String): LocationDescriptorObject[LocationState]
    
    def getRedirectQueryParam(props: Props): String
  }
  object LocationHelper {
    
    @scala.inline
    def apply[Props](
      createRedirectLoc: (Props, String) => LocationDescriptorObject[LocationState],
      getRedirectQueryParam: Props => String
    ): LocationHelper[Props] = {
      val __obj = js.Dynamic.literal(createRedirectLoc = js.Any.fromFunction2(createRedirectLoc), getRedirectQueryParam = js.Any.fromFunction1(getRedirectQueryParam))
      __obj.asInstanceOf[LocationHelper[Props]]
    }
    
    @scala.inline
    implicit class LocationHelperMutableBuilder[Self <: LocationHelper[?], Props] (val x: Self & LocationHelper[Props]) extends AnyVal {
      
      @scala.inline
      def setCreateRedirectLoc(value: (Props, String) => LocationDescriptorObject[LocationState]): Self = StObject.set(x, "createRedirectLoc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetRedirectQueryParam(value: Props => String): Self = StObject.set(x, "getRedirectQueryParam", js.Any.fromFunction1(value))
    }
  }
  
  trait LocationHelperConfig[Props] extends StObject {
    
    var locationSelector: js.UndefOr[js.Function1[/* props */ Props, LocationDescriptorObject[LocationState]]] = js.undefined
    
    var redirectQueryParamName: js.UndefOr[String] = js.undefined
  }
  object LocationHelperConfig {
    
    @scala.inline
    def apply[Props](): LocationHelperConfig[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationHelperConfig[Props]]
    }
    
    @scala.inline
    implicit class LocationHelperConfigMutableBuilder[Self <: LocationHelperConfig[?], Props] (val x: Self & LocationHelperConfig[Props]) extends AnyVal {
      
      @scala.inline
      def setLocationSelector(value: /* props */ Props => LocationDescriptorObject[LocationState]): Self = StObject.set(x, "locationSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocationSelectorUndefined: Self = StObject.set(x, "locationSelector", js.undefined)
      
      @scala.inline
      def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
    }
  }
}

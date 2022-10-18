package typings.reduxAuthWrapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object history3LocationHelperMod {
  
  @JSImport("redux-auth-wrapper/history3/locationHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](config: LocationHelperConfig[Props]): LocationHelper[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[LocationHelper[Props]]
  
  trait LocationHelper[Props] extends StObject {
    
    def createRedirectLoc(props: Props, redirectPath: String): Any
    
    def getRedirectQueryParam(props: Props): String
  }
  object LocationHelper {
    
    inline def apply[Props](createRedirectLoc: (Props, String) => Any, getRedirectQueryParam: Props => String): LocationHelper[Props] = {
      val __obj = js.Dynamic.literal(createRedirectLoc = js.Any.fromFunction2(createRedirectLoc), getRedirectQueryParam = js.Any.fromFunction1(getRedirectQueryParam))
      __obj.asInstanceOf[LocationHelper[Props]]
    }
    
    extension [Self <: LocationHelper[?], Props](x: Self & LocationHelper[Props]) {
      
      inline def setCreateRedirectLoc(value: (Props, String) => Any): Self = StObject.set(x, "createRedirectLoc", js.Any.fromFunction2(value))
      
      inline def setGetRedirectQueryParam(value: Props => String): Self = StObject.set(x, "getRedirectQueryParam", js.Any.fromFunction1(value))
    }
  }
  
  trait LocationHelperConfig[Props] extends StObject {
    
    var locationSelector: js.UndefOr[
        js.Function1[
          /* props */ Props, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any
        ]
      ] = js.undefined
    
    var redirectQueryParamName: js.UndefOr[String] = js.undefined
  }
  object LocationHelperConfig {
    
    inline def apply[Props](): LocationHelperConfig[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationHelperConfig[Props]]
    }
    
    extension [Self <: LocationHelperConfig[?], Props](x: Self & LocationHelperConfig[Props]) {
      
      inline def setLocationSelector(
        value: /* props */ Props => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any
      ): Self = StObject.set(x, "locationSelector", js.Any.fromFunction1(value))
      
      inline def setLocationSelectorUndefined: Self = StObject.set(x, "locationSelector", js.undefined)
      
      inline def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      inline def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
    }
  }
}

package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.anon.Path
import typings.storybookApi.mod.ModuleFn
import typings.storybookRouter.mod.NavigateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesUrlMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/url", "init")
  @js.native
  val init: ModuleFn = js.native
  
  type QueryParams = StringDictionary[String | Null]
  
  trait SubAPI extends StObject {
    
    def getQueryParam(key: String): js.UndefOr[String]
    
    def getUrlState(): Path
    
    def navigateUrl(url: String, options: NavigateOptions): Unit
    
    def setQueryParams(input: QueryParams): Unit
  }
  object SubAPI {
    
    inline def apply(
      getQueryParam: String => js.UndefOr[String],
      getUrlState: () => Path,
      navigateUrl: (String, NavigateOptions) => Unit,
      setQueryParams: QueryParams => Unit
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getQueryParam = js.Any.fromFunction1(getQueryParam), getUrlState = js.Any.fromFunction0(getUrlState), navigateUrl = js.Any.fromFunction2(navigateUrl), setQueryParams = js.Any.fromFunction1(setQueryParams))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      inline def setGetQueryParam(value: String => js.UndefOr[String]): Self = StObject.set(x, "getQueryParam", js.Any.fromFunction1(value))
      
      inline def setGetUrlState(value: () => Path): Self = StObject.set(x, "getUrlState", js.Any.fromFunction0(value))
      
      inline def setNavigateUrl(value: (String, NavigateOptions) => Unit): Self = StObject.set(x, "navigateUrl", js.Any.fromFunction2(value))
      
      inline def setSetQueryParams(value: QueryParams => Unit): Self = StObject.set(x, "setQueryParams", js.Any.fromFunction1(value))
    }
  }
  
  trait SubState extends StObject {
    
    var customQueryParams: QueryParams
  }
  object SubState {
    
    inline def apply(customQueryParams: QueryParams): SubState = {
      val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      inline def setCustomQueryParams(value: QueryParams): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    }
  }
}

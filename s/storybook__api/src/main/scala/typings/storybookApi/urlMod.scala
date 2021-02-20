package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.reachRouter.mod.NavigateOptions
import typings.storybookApi.anon.Path
import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@storybook/api/dist/modules/url", "init")
  @js.native
  val init: ModuleFn = js.native
  
  type QueryParams = StringDictionary[String | Null]
  
  @js.native
  trait SubAPI extends StObject {
    
    def getQueryParam(key: String): js.UndefOr[String] = js.native
    
    def getUrlState(): Path = js.native
    
    def navigateUrl(url: String, options: NavigateOptions[js.Object]): Unit = js.native
    
    def setQueryParams(input: QueryParams): Unit = js.native
  }
  object SubAPI {
    
    @scala.inline
    def apply(
      getQueryParam: String => js.UndefOr[String],
      getUrlState: () => Path,
      navigateUrl: (String, NavigateOptions[js.Object]) => Unit,
      setQueryParams: QueryParams => Unit
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getQueryParam = js.Any.fromFunction1(getQueryParam), getUrlState = js.Any.fromFunction0(getUrlState), navigateUrl = js.Any.fromFunction2(navigateUrl), setQueryParams = js.Any.fromFunction1(setQueryParams))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetQueryParam(value: String => js.UndefOr[String]): Self = StObject.set(x, "getQueryParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUrlState(value: () => Path): Self = StObject.set(x, "getUrlState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNavigateUrl(value: (String, NavigateOptions[js.Object]) => Unit): Self = StObject.set(x, "navigateUrl", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetQueryParams(value: QueryParams => Unit): Self = StObject.set(x, "setQueryParams", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SubState extends StObject {
    
    var customQueryParams: QueryParams = js.native
  }
  object SubState {
    
    @scala.inline
    def apply(customQueryParams: QueryParams): SubState = {
      val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit class SubStateMutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomQueryParams(value: QueryParams): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    }
  }
}

package typings.reduxSentryMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxSentryMiddleware.anon.TypeofSentry
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line: no-unnecessary-generics
  @JSImport("redux-sentry-middleware", JSImport.Namespace)
  @js.native
  def apply[T](sentry: TypeofSentry): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-sentry-middleware", JSImport.Namespace)
  @js.native
  def apply[T](sentry: TypeofSentry, options: Options[T]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @js.native
  trait Options[T] extends StObject {
    
    var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
    
    var breadcrumbCategory: js.UndefOr[String] = js.native
    
    var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
    
    var breadcrumbMessageFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
    
    var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.native
    
    var getTags: js.UndefOr[js.Function1[/* state */ T, js.UndefOr[StringDictionary[String]]]] = js.native
    
    var getUserContext: js.UndefOr[js.Function1[/* state */ T, User]] = js.native
    
    var stateTransformer: js.UndefOr[js.Function1[/* state */ T, _]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setActionTransformer(value: /* action */ Action[_] => _): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      @scala.inline
      def setBreadcrumbCategory(value: String): Self = StObject.set(x, "breadcrumbCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbCategoryUndefined: Self = StObject.set(x, "breadcrumbCategory", js.undefined)
      
      @scala.inline
      def setBreadcrumbDataFromAction(value: /* action */ Action[_] => _): Self = StObject.set(x, "breadcrumbDataFromAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBreadcrumbDataFromActionUndefined: Self = StObject.set(x, "breadcrumbDataFromAction", js.undefined)
      
      @scala.inline
      def setBreadcrumbMessageFromAction(value: /* action */ Action[_] => _): Self = StObject.set(x, "breadcrumbMessageFromAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBreadcrumbMessageFromActionUndefined: Self = StObject.set(x, "breadcrumbMessageFromAction", js.undefined)
      
      @scala.inline
      def setFilterBreadcrumbActions(value: /* action */ Action[_] => Boolean): Self = StObject.set(x, "filterBreadcrumbActions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterBreadcrumbActionsUndefined: Self = StObject.set(x, "filterBreadcrumbActions", js.undefined)
      
      @scala.inline
      def setGetTags(value: /* state */ T => js.UndefOr[StringDictionary[String]]): Self = StObject.set(x, "getTags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTagsUndefined: Self = StObject.set(x, "getTags", js.undefined)
      
      @scala.inline
      def setGetUserContext(value: /* state */ T => User): Self = StObject.set(x, "getUserContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUserContextUndefined: Self = StObject.set(x, "getUserContext", js.undefined)
      
      @scala.inline
      def setStateTransformer(value: /* state */ T => _): Self = StObject.set(x, "stateTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateTransformerUndefined: Self = StObject.set(x, "stateTransformer", js.undefined)
    }
  }
}

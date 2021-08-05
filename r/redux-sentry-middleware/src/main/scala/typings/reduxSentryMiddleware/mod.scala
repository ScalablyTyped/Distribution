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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line: no-unnecessary-generics
  inline def apply[T](sentry: TypeofSentry): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].apply(sentry.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  inline def apply[T](sentry: TypeofSentry, options: Options[T]): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].apply(sentry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  
  @JSImport("redux-sentry-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options[T] extends StObject {
    
    var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[js.Any], js.Any]] = js.undefined
    
    var breadcrumbCategory: js.UndefOr[String] = js.undefined
    
    var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[js.Any], js.Any]] = js.undefined
    
    var breadcrumbMessageFromAction: js.UndefOr[js.Function1[/* action */ Action[js.Any], js.Any]] = js.undefined
    
    var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[js.Any], Boolean]] = js.undefined
    
    var getTags: js.UndefOr[js.Function1[/* state */ T, js.UndefOr[StringDictionary[String]]]] = js.undefined
    
    var getUserContext: js.UndefOr[js.Function1[/* state */ T, User]] = js.undefined
    
    var stateTransformer: js.UndefOr[js.Function1[/* state */ T, js.Any]] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setActionTransformer(value: /* action */ Action[js.Any] => js.Any): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      inline def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      inline def setBreadcrumbCategory(value: String): Self = StObject.set(x, "breadcrumbCategory", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbCategoryUndefined: Self = StObject.set(x, "breadcrumbCategory", js.undefined)
      
      inline def setBreadcrumbDataFromAction(value: /* action */ Action[js.Any] => js.Any): Self = StObject.set(x, "breadcrumbDataFromAction", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbDataFromActionUndefined: Self = StObject.set(x, "breadcrumbDataFromAction", js.undefined)
      
      inline def setBreadcrumbMessageFromAction(value: /* action */ Action[js.Any] => js.Any): Self = StObject.set(x, "breadcrumbMessageFromAction", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbMessageFromActionUndefined: Self = StObject.set(x, "breadcrumbMessageFromAction", js.undefined)
      
      inline def setFilterBreadcrumbActions(value: /* action */ Action[js.Any] => Boolean): Self = StObject.set(x, "filterBreadcrumbActions", js.Any.fromFunction1(value))
      
      inline def setFilterBreadcrumbActionsUndefined: Self = StObject.set(x, "filterBreadcrumbActions", js.undefined)
      
      inline def setGetTags(value: /* state */ T => js.UndefOr[StringDictionary[String]]): Self = StObject.set(x, "getTags", js.Any.fromFunction1(value))
      
      inline def setGetTagsUndefined: Self = StObject.set(x, "getTags", js.undefined)
      
      inline def setGetUserContext(value: /* state */ T => User): Self = StObject.set(x, "getUserContext", js.Any.fromFunction1(value))
      
      inline def setGetUserContextUndefined: Self = StObject.set(x, "getUserContext", js.undefined)
      
      inline def setStateTransformer(value: /* state */ T => js.Any): Self = StObject.set(x, "stateTransformer", js.Any.fromFunction1(value))
      
      inline def setStateTransformerUndefined: Self = StObject.set(x, "stateTransformer", js.undefined)
    }
  }
}

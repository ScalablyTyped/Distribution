package typings.reduxDashSentryDashMiddleware.reduxDashSentryDashMiddlewareMod

import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.undefined
  var breadcrumbCategory: js.UndefOr[String] = js.undefined
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.undefined
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.undefined
  var getTags: js.UndefOr[
    js.Function1[
      /* state */ T, 
      /* import warning: ImportType.apply Failed type conversion: any['tags'] */ js.Any
    ]
  ] = js.undefined
  var getUserContext: js.UndefOr[
    js.Function1[
      /* state */ T, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Sentry.User */ _
    ]
  ] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    actionTransformer: /* action */ Action[_] => _ = null,
    breadcrumbCategory: String = null,
    breadcrumbDataFromAction: /* action */ Action[_] => _ = null,
    filterBreadcrumbActions: /* action */ Action[_] => Boolean = null,
    getTags: /* state */ T => /* import warning: ImportType.apply Failed type conversion: any['tags'] */ js.Any = null,
    getUserContext: /* state */ T => /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Sentry.User */ _ = null,
    stateTransformer: /* state */ T => _ = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(js.Any.fromFunction1(actionTransformer))
    if (breadcrumbCategory != null) __obj.updateDynamic("breadcrumbCategory")(breadcrumbCategory)
    if (breadcrumbDataFromAction != null) __obj.updateDynamic("breadcrumbDataFromAction")(js.Any.fromFunction1(breadcrumbDataFromAction))
    if (filterBreadcrumbActions != null) __obj.updateDynamic("filterBreadcrumbActions")(js.Any.fromFunction1(filterBreadcrumbActions))
    if (getTags != null) __obj.updateDynamic("getTags")(js.Any.fromFunction1(getTags))
    if (getUserContext != null) __obj.updateDynamic("getUserContext")(js.Any.fromFunction1(getUserContext))
    if (stateTransformer != null) __obj.updateDynamic("stateTransformer")(js.Any.fromFunction1(stateTransformer))
    __obj.asInstanceOf[Options[T]]
  }
}


package typings
package reduxDashSentryDashMiddlewareLib.reduxDashSentryDashMiddlewareMod.createSentryMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var actionTransformer: js.UndefOr[
    js.Function1[/* action */ reduxLib.reduxMod.Action[_], reduxLib.reduxMod.Action[_]]
  ] = js.undefined
  var breadcrumbCategory: js.UndefOr[java.lang.String] = js.undefined
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ reduxLib.reduxMod.Action[_], _]] = js.undefined
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ reduxLib.reduxMod.Action[_], scala.Boolean]] = js.undefined
  var getTags: js.UndefOr[js.Function1[/* state */ T, scala.Nothing]] = js.undefined
  var getUserContext: js.UndefOr[
    js.Function1[
      /* state */ T, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Sentry.User */ _
    ]
  ] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, T]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    actionTransformer: /* action */ reduxLib.reduxMod.Action[_] => reduxLib.reduxMod.Action[_] = null,
    breadcrumbCategory: java.lang.String = null,
    breadcrumbDataFromAction: /* action */ reduxLib.reduxMod.Action[_] => _ = null,
    filterBreadcrumbActions: /* action */ reduxLib.reduxMod.Action[_] => scala.Boolean = null,
    getTags: /* state */ T => scala.Nothing = null,
    getUserContext: /* state */ T => /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Sentry.User */ _ = null,
    stateTransformer: /* state */ T => T = null
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


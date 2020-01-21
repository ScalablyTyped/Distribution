package typings.reduxSentryMiddleware.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-sentry-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // tslint:disable-next-line: no-unnecessary-generics
  def apply[T](sentry: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sentry */ js.Any): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](
    sentry: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sentry */ js.Any,
    options: Options[T]
  ): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}


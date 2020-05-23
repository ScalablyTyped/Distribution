package typings.sqlite.anon

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseConstructor
import typings.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cached extends js.Object {
  var cached: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var promise: js.UndefOr[
    PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ])
  ] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Cached {
  @scala.inline
  def apply(
    cached: js.UndefOr[Boolean] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    promise: PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ]) = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Cached = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cached)) __obj.updateDynamic("cached")(cached.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cached]
  }
}


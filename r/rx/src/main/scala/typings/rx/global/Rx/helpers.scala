package typings.rx.global.Rx

import typings.rx.Rx.internals.NotImplementedError
import typings.rx.Rx.internals.NotSupportedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.helpers")
@js.native
object helpers extends js.Object {
  var asArray: js.Function1[/* repeated */ js.Any, js.Array[js.Any]] = js.native
  var defaultComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
  var defaultError: js.Function1[/* err */ js.Any, Unit] = js.native
  var defaultKeySerializer: js.Function1[/* key */ js.Any, String] = js.native
  var defaultNow: js.Function0[Double] = js.native
  var defaultSubComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Double] = js.native
  var identity: js.Function1[/* value */ js.Any, js.Any] = js.native
  var isFunction: js.Function1[/* value */ js.Any, Boolean] = js.native
  var isPromise: js.Function1[/* p */ js.Any, Boolean] = js.native
  var noop: js.Function0[Unit] = js.native
  var not: js.Function1[/* value */ js.Any, Boolean] = js.native
  var notDefined: js.Function1[/* value */ js.Any, Boolean] = js.native
  var notImplemented: js.Function0[NotImplementedError] = js.native
  var notSupported: js.Function0[NotSupportedError] = js.native
}


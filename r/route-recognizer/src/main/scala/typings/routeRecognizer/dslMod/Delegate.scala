package typings.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  var contextEntered: js.UndefOr[js.Function2[/* context */ String, /* route */ MatchDSL, Unit]] = js.undefined
  var willAddRoute: js.UndefOr[js.Function2[/* context */ js.UndefOr[String], /* route */ String, String]] = js.undefined
}

object Delegate {
  @scala.inline
  def apply(
    contextEntered: (/* context */ String, /* route */ MatchDSL) => Unit = null,
    willAddRoute: (/* context */ js.UndefOr[String], /* route */ String) => String = null
  ): Delegate = {
    val __obj = js.Dynamic.literal()
    if (contextEntered != null) __obj.updateDynamic("contextEntered")(js.Any.fromFunction2(contextEntered))
    if (willAddRoute != null) __obj.updateDynamic("willAddRoute")(js.Any.fromFunction2(willAddRoute))
    __obj.asInstanceOf[Delegate]
  }
}


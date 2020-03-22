package typings.storybookAddonKnobs

import typings.storybookApi.urlMod.QueryParams
import typings.storybookChannels.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/api.@storybook/api.API, 'on' | 'off' | 'emit' | 'getQueryParam' | 'setQueryParams'> */
trait PickAPIonoffemitgetQueryP extends js.Object {
  var emit: js.Function2[/* type */ String, /* repeated */ js.Any, Unit]
  var getQueryParam: js.Function1[/* key */ String, js.UndefOr[String]]
  var off: js.Function2[/* type */ String, /* cb */ Listener, Unit]
  var on: js.Function2[/* type */ String, /* cb */ Listener, js.Function0[Unit]]
  var setQueryParams: js.Function1[/* input */ QueryParams, Unit]
}

object PickAPIonoffemitgetQueryP {
  @scala.inline
  def apply(
    emit: (/* type */ String, /* repeated */ js.Any) => Unit,
    getQueryParam: /* key */ String => js.UndefOr[String],
    off: (/* type */ String, /* cb */ Listener) => Unit,
    on: (/* type */ String, /* cb */ Listener) => js.Function0[Unit],
    setQueryParams: /* input */ QueryParams => Unit
  ): PickAPIonoffemitgetQueryP = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), getQueryParam = js.Any.fromFunction1(getQueryParam), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setQueryParams = js.Any.fromFunction1(setQueryParams))
  
    __obj.asInstanceOf[PickAPIonoffemitgetQueryP]
  }
}


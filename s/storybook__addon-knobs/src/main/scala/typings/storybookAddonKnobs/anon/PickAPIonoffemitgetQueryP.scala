package typings.storybookAddonKnobs.anon

import typings.storybookApi.urlMod.QueryParams
import typings.storybookChannels.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/api.@storybook/api.API, 'on' | 'off' | 'emit' | 'getQueryParam' | 'setQueryParams'> */
@js.native
trait PickAPIonoffemitgetQueryP extends js.Object {
  var emit: js.Function2[/* type */ String, /* repeated */ js.Any, Unit] = js.native
  var getQueryParam: js.Function1[/* key */ String, js.UndefOr[String]] = js.native
  var off: js.Function2[/* type */ String, /* cb */ Listener, Unit] = js.native
  var on: js.Function2[/* type */ String, /* cb */ Listener, js.Function0[Unit]] = js.native
  var setQueryParams: js.Function1[/* input */ QueryParams, Unit] = js.native
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
  @scala.inline
  implicit class PickAPIonoffemitgetQueryPOps[Self <: PickAPIonoffemitgetQueryP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmit(value: (/* type */ String, /* repeated */ js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setGetQueryParam(value: /* key */ String => js.UndefOr[String]): Self = this.set("getQueryParam", js.Any.fromFunction1(value))
    @scala.inline
    def setOff(value: (/* type */ String, /* cb */ Listener) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (/* type */ String, /* cb */ Listener) => js.Function0[Unit]): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setSetQueryParams(value: /* input */ QueryParams => Unit): Self = this.set("setQueryParams", js.Any.fromFunction1(value))
  }
  
}


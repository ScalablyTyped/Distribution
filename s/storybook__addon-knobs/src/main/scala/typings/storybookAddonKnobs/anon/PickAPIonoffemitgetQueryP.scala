package typings.storybookAddonKnobs.anon

import typings.storybookApi.distTs3Dot9ModulesUrlMod.QueryParams
import typings.storybookChannels.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/api.@storybook/api.API, 'on' | 'off' | 'emit' | 'getQueryParam' | 'setQueryParams'> */
trait PickAPIonoffemitgetQueryP extends StObject {
  
  var emit: js.Function2[/* type */ String, /* repeated */ Any, Unit]
  
  var getQueryParam: js.Function1[/* key */ String, js.UndefOr[String]]
  
  var off: js.Function2[/* type */ String, /* cb */ Listener, Unit]
  
  var on: js.Function2[/* type */ String, /* cb */ Listener, js.Function0[Unit]]
  
  var setQueryParams: js.Function1[/* input */ QueryParams, Unit]
}
object PickAPIonoffemitgetQueryP {
  
  inline def apply(
    emit: (/* type */ String, /* repeated */ Any) => Unit,
    getQueryParam: /* key */ String => js.UndefOr[String],
    off: (/* type */ String, /* cb */ Listener) => Unit,
    on: (/* type */ String, /* cb */ Listener) => js.Function0[Unit],
    setQueryParams: /* input */ QueryParams => Unit
  ): PickAPIonoffemitgetQueryP = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), getQueryParam = js.Any.fromFunction1(getQueryParam), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setQueryParams = js.Any.fromFunction1(setQueryParams))
    __obj.asInstanceOf[PickAPIonoffemitgetQueryP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickAPIonoffemitgetQueryP] (val x: Self) extends AnyVal {
    
    inline def setEmit(value: (/* type */ String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setGetQueryParam(value: /* key */ String => js.UndefOr[String]): Self = StObject.set(x, "getQueryParam", js.Any.fromFunction1(value))
    
    inline def setOff(value: (/* type */ String, /* cb */ Listener) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (/* type */ String, /* cb */ Listener) => js.Function0[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setSetQueryParams(value: /* input */ QueryParams => Unit): Self = StObject.set(x, "setQueryParams", js.Any.fromFunction1(value))
  }
}

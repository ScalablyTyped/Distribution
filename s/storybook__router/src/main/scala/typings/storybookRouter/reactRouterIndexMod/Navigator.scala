package typings.storybookRouter.reactRouterIndexMod

import typings.storybookRouter.reactRouterNodeModulesHistoryIndexMod.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@storybook/router.@storybook/router/dist/ts3.9/_modules/react-router-node_modules-history-index.History, 'action' | 'location' | 'back' | 'forward' | 'listen' | 'block'> */
trait Navigator extends StObject {
  
  var createHref: js.Function1[/* to */ To, String]
  
  var go: js.Function1[/* delta */ Double, Unit]
  
  var push: js.Function2[/* to */ To, /* state */ js.UndefOr[Any], Unit]
  
  var replace: js.Function2[/* to */ To, /* state */ js.UndefOr[Any], Unit]
}
object Navigator {
  
  inline def apply(
    createHref: /* to */ To => String,
    go: /* delta */ Double => Unit,
    push: (/* to */ To, /* state */ js.UndefOr[Any]) => Unit,
    replace: (/* to */ To, /* state */ js.UndefOr[Any]) => Unit
  ): Navigator = {
    val __obj = js.Dynamic.literal(createHref = js.Any.fromFunction1(createHref), go = js.Any.fromFunction1(go), push = js.Any.fromFunction2(push), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setCreateHref(value: /* to */ To => String): Self = StObject.set(x, "createHref", js.Any.fromFunction1(value))
    
    inline def setGo(value: /* delta */ Double => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    
    inline def setPush(value: (/* to */ To, /* state */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
    
    inline def setReplace(value: (/* to */ To, /* state */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
  }
}

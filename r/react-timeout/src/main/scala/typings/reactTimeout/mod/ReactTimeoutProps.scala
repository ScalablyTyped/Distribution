package typings.reactTimeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTimeoutProps extends js.Object {
  
  var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
  
  var clearImmediate: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
  
  var clearInterval: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
  
  var clearTimeout: js.UndefOr[js.Function1[/* timer */ Timer, Unit]] = js.native
  
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Id]] = js.native
  
  var setImmediate: js.UndefOr[
    js.Function2[/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any, Id]
  ] = js.native
  
  var setInterval: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Id
    ]
  ] = js.native
  
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Timer
    ]
  ] = js.native
}
object ReactTimeoutProps {
  
  @scala.inline
  def apply(): ReactTimeoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactTimeoutProps]
  }
  
  @scala.inline
  implicit class ReactTimeoutPropsOps[Self <: ReactTimeoutProps] (val x: Self) extends AnyVal {
    
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
    def setCancelAnimationFrame(value: /* id */ Id => Unit): Self = this.set("cancelAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancelAnimationFrame: Self = this.set("cancelAnimationFrame", js.undefined)
    
    @scala.inline
    def setClearImmediate(value: /* id */ Id => Unit): Self = this.set("clearImmediate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearImmediate: Self = this.set("clearImmediate", js.undefined)
    
    @scala.inline
    def setClearInterval(value: /* id */ Id => Unit): Self = this.set("clearInterval", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearInterval: Self = this.set("clearInterval", js.undefined)
    
    @scala.inline
    def setClearTimeout(value: /* timer */ Timer => Unit): Self = this.set("clearTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearTimeout: Self = this.set("clearTimeout", js.undefined)
    
    @scala.inline
    def setRequestAnimationFrame(value: /* callback */ js.Function1[/* repeated */ js.Any, Unit] => Id): Self = this.set("requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestAnimationFrame: Self = this.set("requestAnimationFrame", js.undefined)
    
    @scala.inline
    def setSetImmediate(value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Id): Self = this.set("setImmediate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetImmediate: Self = this.set("setImmediate", js.undefined)
    
    @scala.inline
    def setSetInterval(
      value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Id
    ): Self = this.set("setInterval", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetInterval: Self = this.set("setInterval", js.undefined)
    
    @scala.inline
    def setSetTimeout(
      value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timer
    ): Self = this.set("setTimeout", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
  }
}

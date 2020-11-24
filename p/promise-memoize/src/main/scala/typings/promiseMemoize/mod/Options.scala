package typings.promiseMemoize.mod

import typings.promiseMemoize.promiseMemoizeStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var maxErrorAge: js.UndefOr[Double] = js.native
  
  var resolve: js.UndefOr[KeyResolver] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMaxErrorAge(value: Double): Self = this.set("maxErrorAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxErrorAge: Self = this.set("maxErrorAge", js.undefined)
    
    @scala.inline
    def setResolveVarargs(value: (json | (js.Function1[/* arg */ js.Any, js.Any]))*): Self = this.set("resolve", js.Array(value :_*))
    
    @scala.inline
    def setResolveFunction1(value: /* args */ js.Array[js.Any] => js.Any): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(value: KeyResolver): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
}

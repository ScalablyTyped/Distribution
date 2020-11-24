package typings.restartHooks.useCustomEffectMod

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEffectOptions[TDeps /* <: DependencyList */] extends js.Object {
  
  var effectHook: js.UndefOr[EffectHook] = js.native
  
  var isEqual: IsEqual[TDeps] = js.native
}
object CustomEffectOptions {
  
  @scala.inline
  def apply[TDeps /* <: DependencyList */](isEqual: (TDeps, TDeps) => Boolean): CustomEffectOptions[TDeps] = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction2(isEqual))
    __obj.asInstanceOf[CustomEffectOptions[TDeps]]
  }
  
  @scala.inline
  implicit class CustomEffectOptionsOps[Self <: CustomEffectOptions[_], TDeps /* <: DependencyList */] (val x: Self with CustomEffectOptions[TDeps]) extends AnyVal {
    
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
    def setIsEqual(value: (TDeps, TDeps) => Boolean): Self = this.set("isEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEffectHook(value: (/* effect */ EffectCallback, /* deps */ js.UndefOr[DependencyList]) => Unit): Self = this.set("effectHook", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEffectHook: Self = this.set("effectHook", js.undefined)
  }
}

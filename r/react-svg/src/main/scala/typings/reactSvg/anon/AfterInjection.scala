package typings.reactSvg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterInjection extends js.Object {
  
  def afterInjection(): js.UndefOr[scala.Nothing] = js.native
  
  def beforeInjection(): js.UndefOr[scala.Nothing] = js.native
  
  var evalScripts: String = js.native
  
  var fallback: Null = js.native
  
  var loading: Null = js.native
  
  var renumerateIRIElements: Boolean = js.native
  
  var useRequestCache: Boolean = js.native
  
  var wrapper: String = js.native
}
object AfterInjection {
  
  @scala.inline
  def apply(
    afterInjection: () => js.UndefOr[scala.Nothing],
    beforeInjection: () => js.UndefOr[scala.Nothing],
    evalScripts: String,
    fallback: Null,
    loading: Null,
    renumerateIRIElements: Boolean,
    useRequestCache: Boolean,
    wrapper: String
  ): AfterInjection = {
    val __obj = js.Dynamic.literal(afterInjection = js.Any.fromFunction0(afterInjection), beforeInjection = js.Any.fromFunction0(beforeInjection), evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], useRequestCache = useRequestCache.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterInjection]
  }
  
  @scala.inline
  implicit class AfterInjectionOps[Self <: AfterInjection] (val x: Self) extends AnyVal {
    
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
    def setAfterInjection(value: () => js.UndefOr[scala.Nothing]): Self = this.set("afterInjection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeInjection(value: () => js.UndefOr[scala.Nothing]): Self = this.set("beforeInjection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvalScripts(value: String): Self = this.set("evalScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: Null): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Null): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenumerateIRIElements(value: Boolean): Self = this.set("renumerateIRIElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRequestCache(value: Boolean): Self = this.set("useRequestCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
}

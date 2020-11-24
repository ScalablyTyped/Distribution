package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeshakingOptions extends js.Object {
  
  var annotations: js.UndefOr[Boolean] = js.native
  
  var moduleSideEffects: js.UndefOr[ModuleSideEffectsOption] = js.native
  
  var propertyReadSideEffects: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Use `moduleSideEffects` instead */
  var pureExternalModules: js.UndefOr[PureModulesOption] = js.native
  
  var tryCatchDeoptimization: js.UndefOr[Boolean] = js.native
  
  var unknownGlobalSideEffects: js.UndefOr[Boolean] = js.native
}
object TreeshakingOptions {
  
  @scala.inline
  def apply(): TreeshakingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeshakingOptions]
  }
  
  @scala.inline
  implicit class TreeshakingOptionsOps[Self <: TreeshakingOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotations(value: Boolean): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setModuleSideEffectsFunction2(value: (/* id */ String, /* external */ Boolean) => Boolean): Self = this.set("moduleSideEffects", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModuleSideEffectsVarargs(value: String*): Self = this.set("moduleSideEffects", js.Array(value :_*))
    
    @scala.inline
    def setModuleSideEffects(value: ModuleSideEffectsOption): Self = this.set("moduleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleSideEffects: Self = this.set("moduleSideEffects", js.undefined)
    
    @scala.inline
    def setPropertyReadSideEffects(value: Boolean): Self = this.set("propertyReadSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyReadSideEffects: Self = this.set("propertyReadSideEffects", js.undefined)
    
    @scala.inline
    def setPureExternalModulesVarargs(value: String*): Self = this.set("pureExternalModules", js.Array(value :_*))
    
    @scala.inline
    def setPureExternalModulesFunction1(value: /* id */ String => js.UndefOr[Boolean | Null]): Self = this.set("pureExternalModules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPureExternalModules(value: PureModulesOption): Self = this.set("pureExternalModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePureExternalModules: Self = this.set("pureExternalModules", js.undefined)
    
    @scala.inline
    def setTryCatchDeoptimization(value: Boolean): Self = this.set("tryCatchDeoptimization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTryCatchDeoptimization: Self = this.set("tryCatchDeoptimization", js.undefined)
    
    @scala.inline
    def setUnknownGlobalSideEffects(value: Boolean): Self = this.set("unknownGlobalSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownGlobalSideEffects: Self = this.set("unknownGlobalSideEffects", js.undefined)
  }
}

package typings.reactSpringAnimated.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-spring/animated.@react-spring/animated/index.cjs.HostConfig> */
@js.native
trait PartialHostConfig extends js.Object {
  
  var applyAnimatedValues: js.UndefOr[
    js.Function2[
      /* node */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any, 
      Boolean | Unit
    ]
  ] = js.native
  
  var createAnimatedStyle: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* style */ js.Any, 
      typings.reactSpringAnimated.indexCjsMod.Animated[_]
    ]
  ] = js.native
  
  var getComponentProps: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ _
    ]
  ] = js.native
}
object PartialHostConfig {
  
  @scala.inline
  def apply(): PartialHostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHostConfig]
  }
  
  @scala.inline
  implicit class PartialHostConfigOps[Self <: PartialHostConfig] (val x: Self) extends AnyVal {
    
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
    def setApplyAnimatedValues(
      value: (/* node */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any) => Boolean | Unit
    ): Self = this.set("applyAnimatedValues", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteApplyAnimatedValues: Self = this.set("applyAnimatedValues", js.undefined)
    
    @scala.inline
    def setCreateAnimatedStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* style */ js.Any => typings.reactSpringAnimated.indexCjsMod.Animated[_]
    ): Self = this.set("createAnimatedStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateAnimatedStyle: Self = this.set("createAnimatedStyle", js.undefined)
    
    @scala.inline
    def setGetComponentProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ _
    ): Self = this.set("getComponentProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetComponentProps: Self = this.set("getComponentProps", js.undefined)
  }
}

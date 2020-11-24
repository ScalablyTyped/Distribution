package typings.reactSpringAnimated.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostConfig extends js.Object {
  
  /** Provide custom logic for native updates */
  def applyAnimatedValues(
    node: js.Any,
    props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any
  ): Boolean | Unit = js.native
  
  /** Wrap the `style` prop with an animated node */
  def createAnimatedStyle(
    style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any
  ): Animated[_] = js.native
  
  /** Intercept props before they're passed to an animated component */
  def getComponentProps(
    props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any
  ): js.Any = js.native
}
object HostConfig {
  
  @scala.inline
  def apply(
    applyAnimatedValues: (js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any) => Boolean | Unit,
    createAnimatedStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => Animated[_],
    getComponentProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => js.Any
  ): HostConfig = {
    val __obj = js.Dynamic.literal(applyAnimatedValues = js.Any.fromFunction2(applyAnimatedValues), createAnimatedStyle = js.Any.fromFunction1(createAnimatedStyle), getComponentProps = js.Any.fromFunction1(getComponentProps))
    __obj.asInstanceOf[HostConfig]
  }
  
  @scala.inline
  implicit class HostConfigOps[Self <: HostConfig] (val x: Self) extends AnyVal {
    
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
      value: (js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any) => Boolean | Unit
    ): Self = this.set("applyAnimatedValues", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateAnimatedStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => Animated[_]
    ): Self = this.set("createAnimatedStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetComponentProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => js.Any
    ): Self = this.set("getComponentProps", js.Any.fromFunction1(value))
  }
}

package typings.reactSpringAnimated.mod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeContext extends js.Object {
  
  var dependencies: Set[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ _
  ] = js.native
  
  var host: HostConfig = js.native
}
object TreeContext {
  
  @scala.inline
  def apply(
    dependencies: Set[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ _
    ],
    host: HostConfig
  ): TreeContext = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeContext]
  }
  
  @scala.inline
  implicit class TreeContextOps[Self <: TreeContext] (val x: Self) extends AnyVal {
    
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
    def setDependencies(
      value: Set[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ _
        ]
    ): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: HostConfig): Self = this.set("host", value.asInstanceOf[js.Any])
  }
}

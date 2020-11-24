package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alias extends js.Object {
  
  /**
    * The previous name of the resource.  If not provided, the current name of the resource is
    * used.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The previous parent of the resource.  If not provided (i.e. `{ name: "foo" }`), the current
    * parent of the resource is used (`opts.parent` if provided, else the implicit stack resource
    * parent).
    *
    * To specify no original parent, use `{ parent: pulumi.rootStackResource }`.
    */
  var parent: js.UndefOr[Resource | Input[URN]] = js.native
  
  /**
    * The previous project of the resource. If not provided, defaults to `pulumi.getProject()`.
    */
  var project: js.UndefOr[Input[String]] = js.native
  
  /**
    * The previous stack of the resource.  If not provided, defaults to `pulumi.getStack()`.
    */
  var stack: js.UndefOr[Input[String]] = js.native
  
  /**
    * The previous type of the resource.  If not provided, the current type of the resource is used.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object Alias {
  
  @scala.inline
  def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit class AliasOps[Self <: Alias] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: Resource | Input[URN]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProject(value: Input[String]): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setStack(value: Input[String]): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

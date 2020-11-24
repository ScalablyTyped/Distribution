package typings.storybookCore.anon

import typings.storybookClientApi.typesMod.RenderContextWithoutStoryContext
import typings.storybookCore.storyRendererMod.RenderMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var context: RenderContextWithoutStoryContext = js.native
  
  var metadata: RenderMetadata = js.native
}
object Context {
  
  @scala.inline
  def apply(context: RenderContextWithoutStoryContext, metadata: RenderMetadata): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setContext(value: RenderContextWithoutStoryContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: RenderMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
}

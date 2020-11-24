package typings.sandboxedModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SandboxOptions extends js.Object {
  
  /**
    * An object of global variables to inject into the sandboxed module.
    */
  var globals: js.UndefOr[js.Object] = js.native
  
  /**
    * An object of local variables to inject into the sandboxed module.
    */
  var locals: js.UndefOr[js.Object] = js.native
  
  /**
    * An object containing moduleIds and the values to inject for them when required by the sandboxed module.
    * This does not affect children of the sandboxed module.
    */
  var requires: js.UndefOr[js.Object] = js.native
  
  /**
    * If false, modules that are required by the sandboxed module will not be sandboxed. By default all modules
    * required by the sandboxedModule will be sandboxed using the same options that were used for the original
    * sandboxed module.
    */
  var singleOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * An object of named functions which will transform the source code required with SandboxedModule.require.
    * For example, CoffeeScript & istanbul support is implemented with built-in sourceTransformer functions
    * (see #registerBuiltInSourceTransformer).
    *
    * A source transformer receives the source (as it's been transformed thus far) and must return the transformed
    * source (whether it's changed or unchanged).
    *
    * An example source transformer to change all instances of the number "3" to "5" would look like this:
    *
    * SandboxedModule.require('../fixture/baz', {
    *   sourceTransformers: {
    *     turn3sInto5s: function(source) {
    *       return source.replace(/3/g,'5');
    *     }
    *   }
    * })
    */
  var sourceTransformers: js.UndefOr[js.Object] = js.native
  
  /**
    * If false, the source transformers will not be run against modules required by the sandboxed module.
    * By default it will take the same value as {@link SandboxOptions.singleOnly}.
    */
  var sourceTransformersSingleOnly: js.UndefOr[Boolean] = js.native
}
object SandboxOptions {
  
  @scala.inline
  def apply(): SandboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SandboxOptions]
  }
  
  @scala.inline
  implicit class SandboxOptionsOps[Self <: SandboxOptions] (val x: Self) extends AnyVal {
    
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
    def setGlobals(value: js.Object): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setLocals(value: js.Object): Self = this.set("locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    
    @scala.inline
    def setRequires(value: js.Object): Self = this.set("requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequires: Self = this.set("requires", js.undefined)
    
    @scala.inline
    def setSingleOnly(value: Boolean): Self = this.set("singleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleOnly: Self = this.set("singleOnly", js.undefined)
    
    @scala.inline
    def setSourceTransformers(value: js.Object): Self = this.set("sourceTransformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTransformers: Self = this.set("sourceTransformers", js.undefined)
    
    @scala.inline
    def setSourceTransformersSingleOnly(value: Boolean): Self = this.set("sourceTransformersSingleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTransformersSingleOnly: Self = this.set("sourceTransformersSingleOnly", js.undefined)
  }
}

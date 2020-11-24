package typings.reactDocgenTypescriptPlugin.pluginMod

import typings.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypescriptOptions extends js.Object {
  
  /** Specify TypeScript compiler options. Can not be used with tsconfigPath. */
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  
  /**
    * Specify the location of the tsconfig.json to use. Can not be used with
    * compilerOptions.
    **/
  var tsconfigPath: js.UndefOr[String] = js.native
}
object TypescriptOptions {
  
  @scala.inline
  def apply(): TypescriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypescriptOptions]
  }
  
  @scala.inline
  implicit class TypescriptOptionsOps[Self <: TypescriptOptions] (val x: Self) extends AnyVal {
    
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
    def setCompilerOptions(value: CompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    
    @scala.inline
    def setTsconfigPath(value: String): Self = this.set("tsconfigPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsconfigPath: Self = this.set("tsconfigPath", js.undefined)
  }
}

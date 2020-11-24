package typings.rollupPluginTypescript2.tscacheMod

import typings.typescript.mod.OutputFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICode extends js.Object {
  
  var code: String = js.native
  
  var dts: js.UndefOr[OutputFile] = js.native
  
  var dtsmap: js.UndefOr[OutputFile] = js.native
  
  var map: js.UndefOr[String] = js.native
  
  var references: js.UndefOr[js.Array[String]] = js.native
}
object ICode {
  
  @scala.inline
  def apply(code: String): ICode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICode]
  }
  
  @scala.inline
  implicit class ICodeOps[Self <: ICode] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDts(value: OutputFile): Self = this.set("dts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDts: Self = this.set("dts", js.undefined)
    
    @scala.inline
    def setDtsmap(value: OutputFile): Self = this.set("dtsmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtsmap: Self = this.set("dtsmap", js.undefined)
    
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setReferencesVarargs(value: String*): Self = this.set("references", js.Array(value :_*))
    
    @scala.inline
    def setReferences(value: js.Array[String]): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
  }
}

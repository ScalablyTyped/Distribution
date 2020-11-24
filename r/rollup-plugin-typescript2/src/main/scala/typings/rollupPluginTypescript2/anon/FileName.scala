package typings.rollupPluginTypescript2.anon

import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileName extends js.Object {
  
  var fileName: js.UndefOr[String] = js.native
  
  var parsedTsConfig: ParsedCommandLine = js.native
}
object FileName {
  
  @scala.inline
  def apply(parsedTsConfig: ParsedCommandLine): FileName = {
    val __obj = js.Dynamic.literal(parsedTsConfig = parsedTsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
  
  @scala.inline
  implicit class FileNameOps[Self <: FileName] (val x: Self) extends AnyVal {
    
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
    def setParsedTsConfig(value: ParsedCommandLine): Self = this.set("parsedTsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
  }
}

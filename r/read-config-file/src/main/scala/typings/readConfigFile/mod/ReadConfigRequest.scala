package typings.readConfigFile.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadConfigRequest extends js.Object {
  
  var configFilename: String = js.native
  
  var packageKey: String = js.native
  
  var packageMetadata: (Lazy[StringDictionary[_] | Null]) | Null = js.native
  
  var projectDir: String = js.native
}
object ReadConfigRequest {
  
  @scala.inline
  def apply(configFilename: String, packageKey: String, projectDir: String): ReadConfigRequest = {
    val __obj = js.Dynamic.literal(configFilename = configFilename.asInstanceOf[js.Any], packageKey = packageKey.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfigRequest]
  }
  
  @scala.inline
  implicit class ReadConfigRequestOps[Self <: ReadConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigFilename(value: String): Self = this.set("configFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageKey(value: String): Self = this.set("packageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDir(value: String): Self = this.set("projectDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageMetadata(value: Lazy[StringDictionary[_] | Null]): Self = this.set("packageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageMetadataNull: Self = this.set("packageMetadata", null)
  }
}

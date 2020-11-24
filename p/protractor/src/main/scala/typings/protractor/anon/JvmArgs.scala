package typings.protractor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JvmArgs extends js.Object {
  
  /**
    * Additional command line options to pass to selenium. For example,
    * if you need to change the browser timeout, use
    * seleniumArgs: ['-browserTimeout=60']
    */
  var args: js.UndefOr[js.Any] = js.native
  
  /**
    * Additional command line jvm options to pass to selenium. For example,
    * if you need to change the browser driver, use
    * jvmArgs: ['-Dwebdriver.ie.driver=IEDriverServer_Win32_2.53.1.exe']
    */
  var jvmArgs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The port to start the Selenium Server on, or null if the server should
    * find its own unused port.
    */
  var port: js.UndefOr[js.Any] = js.native
}
object JvmArgs {
  
  @scala.inline
  def apply(): JvmArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JvmArgs]
  }
  
  @scala.inline
  implicit class JvmArgsOps[Self <: JvmArgs] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setJvmArgsVarargs(value: String*): Self = this.set("jvmArgs", js.Array(value :_*))
    
    @scala.inline
    def setJvmArgs(value: js.Array[String]): Self = this.set("jvmArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJvmArgs: Self = this.set("jvmArgs", js.undefined)
    
    @scala.inline
    def setPort(value: js.Any): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}

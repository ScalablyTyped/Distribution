package typings.sinonTest.mod

import typings.sinonTest.sinonTestStrings.clock
import typings.sinonTest.sinonTestStrings.mock
import typings.sinonTest.sinonTestStrings.requests
import typings.sinonTest.sinonTestStrings.server
import typings.sinonTest.sinonTestStrings.spy
import typings.sinonTest.sinonTestStrings.stub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var injectInto: js.UndefOr[js.Any] = js.native
  
  var injectIntoThis: js.UndefOr[Boolean] = js.native
  
  var properties: js.UndefOr[js.Array[spy | stub | mock | clock | server | requests]] = js.native
  
  var useFakeServer: js.UndefOr[Boolean] = js.native
  
  var useFakeTimers: js.UndefOr[Boolean] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setInjectInto(value: js.Any): Self = this.set("injectInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectInto: Self = this.set("injectInto", js.undefined)
    
    @scala.inline
    def setInjectIntoThis(value: Boolean): Self = this.set("injectIntoThis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectIntoThis: Self = this.set("injectIntoThis", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: (spy | stub | mock | clock | server | requests)*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[spy | stub | mock | clock | server | requests]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setUseFakeServer(value: Boolean): Self = this.set("useFakeServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFakeServer: Self = this.set("useFakeServer", js.undefined)
    
    @scala.inline
    def setUseFakeTimers(value: Boolean): Self = this.set("useFakeTimers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFakeTimers: Self = this.set("useFakeTimers", js.undefined)
  }
}

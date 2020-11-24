package typings.speedtestNet.mod

import typings.speedtestNet.anon.Dynamic
import typings.speedtestNet.anon.Latency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteData extends js.Object {
  
  var global: Dynamic = js.native
  
  var testStage: Latency = js.native
}
object SuiteData {
  
  @scala.inline
  def apply(global: Dynamic, testStage: Latency): SuiteData = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], testStage = testStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteData]
  }
  
  @scala.inline
  implicit class SuiteDataOps[Self <: SuiteData] (val x: Self) extends AnyVal {
    
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
    def setGlobal(value: Dynamic): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStage(value: Latency): Self = this.set("testStage", value.asInstanceOf[js.Any])
  }
}

package typings.reactNativeSensorManager.mod.reactNativeAugmentingMod

import typings.reactNativeSensorManager.mod.SensorManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeModulesStatic extends js.Object {
  
  var SensorManager: typings.reactNativeSensorManager.mod.SensorManager = js.native
}
object NativeModulesStatic {
  
  @scala.inline
  def apply(SensorManager: SensorManager): NativeModulesStatic = {
    val __obj = js.Dynamic.literal(SensorManager = SensorManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeModulesStatic]
  }
  
  @scala.inline
  implicit class NativeModulesStaticOps[Self <: NativeModulesStatic] (val x: Self) extends AnyVal {
    
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
    def setSensorManager(value: SensorManager): Self = this.set("SensorManager", value.asInstanceOf[js.Any])
  }
}

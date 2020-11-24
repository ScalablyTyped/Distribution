package typings.reactNativeFabric.mod

import typings.reactNativeFabric.anon.Crash
import typings.reactNativeFabric.anon.LogAddToCart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fabric extends js.Object {
  
  /**
    * API for interacting with the Answers kit.
    *
    * https://docs.fabric.io/ios/answers/index.html
    */
  var Answers: LogAddToCart = js.native
  
  /**
    * API for interacting with the Crashlytics kit.
    *
    * https://docs.fabric.io/ios/crashlytics/index.html
    */        
  var Crashlytics: Crash = js.native
}
object Fabric {
  
  @scala.inline
  def apply(Answers: LogAddToCart, Crashlytics: Crash): Fabric = {
    val __obj = js.Dynamic.literal(Answers = Answers.asInstanceOf[js.Any], Crashlytics = Crashlytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fabric]
  }
  
  @scala.inline
  implicit class FabricOps[Self <: Fabric] (val x: Self) extends AnyVal {
    
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
    def setAnswers(value: LogAddToCart): Self = this.set("Answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashlytics(value: Crash): Self = this.set("Crashlytics", value.asInstanceOf[js.Any])
  }
}

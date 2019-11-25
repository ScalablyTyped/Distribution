package typings.reactDashNativeDashFabric.reactDashNativeDashFabricMod

import typings.reactDashNativeDashFabric.Anon_Attributes
import typings.reactDashNativeDashFabric.Anon_Crash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fabric extends js.Object {
  /**
    * API for interacting with the Answers kit.
    *
    * https://docs.fabric.io/ios/answers/index.html
    */
  var Answers: Anon_Attributes
  /**
    * API for interacting with the Crashlytics kit.
    *
    * https://docs.fabric.io/ios/crashlytics/index.html
    */        
  var Crashlytics: Anon_Crash
}

object Fabric {
  @scala.inline
  def apply(Answers: Anon_Attributes, Crashlytics: Anon_Crash): Fabric = {
    val __obj = js.Dynamic.literal(Answers = Answers.asInstanceOf[js.Any], Crashlytics = Crashlytics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Fabric]
  }
}


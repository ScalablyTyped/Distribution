package typings.reactNativeFabric.mod

import typings.reactNativeFabric.anon.Crash
import typings.reactNativeFabric.anon.LogAddToCart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fabric extends js.Object {
  /**
    * API for interacting with the Answers kit.
    *
    * https://docs.fabric.io/ios/answers/index.html
    */
  var Answers: LogAddToCart
  /**
    * API for interacting with the Crashlytics kit.
    *
    * https://docs.fabric.io/ios/crashlytics/index.html
    */        
  var Crashlytics: Crash
}

object Fabric {
  @scala.inline
  def apply(Answers: LogAddToCart, Crashlytics: Crash): Fabric = {
    val __obj = js.Dynamic.literal(Answers = Answers.asInstanceOf[js.Any], Crashlytics = Crashlytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fabric]
  }
}


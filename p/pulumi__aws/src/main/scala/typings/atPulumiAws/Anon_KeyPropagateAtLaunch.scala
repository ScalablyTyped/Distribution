package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyPropagateAtLaunch extends js.Object {
  var key: Input[String]
  var propagateAtLaunch: Input[Boolean]
  var value: Input[String]
}

object Anon_KeyPropagateAtLaunch {
  @scala.inline
  def apply(key: Input[String], propagateAtLaunch: Input[Boolean], value: Input[String]): Anon_KeyPropagateAtLaunch = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], propagateAtLaunch = propagateAtLaunch.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyPropagateAtLaunch]
  }
}


package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TtlType extends js.Object {
  var ttl: Input[Double]
  var `type`: Input[String]
}

object Anon_TtlType {
  @scala.inline
  def apply(ttl: Input[Double], `type`: Input[String]): Anon_TtlType = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TtlType]
  }
}


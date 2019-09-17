package typings.atReduxDashSagaCore.typesEffectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallEffectDescriptor extends js.Object {
  var args: js.Array[_]
  var context: js.Any
  var fn: js.Function
}

object CallEffectDescriptor {
  @scala.inline
  def apply(args: js.Array[_], context: js.Any, fn: js.Function): CallEffectDescriptor = {
    val __obj = js.Dynamic.literal(args = args, context = context, fn = fn)
  
    __obj.asInstanceOf[CallEffectDescriptor]
  }
}


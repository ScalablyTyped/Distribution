package typings.reduxSagaCore.effectsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionChannelEffectDescriptor extends js.Object {
  var buffer: js.UndefOr[Buffer] = js.undefined
  var pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
}

object ActionChannelEffectDescriptor {
  @scala.inline
  def apply(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any,
    buffer: Buffer = null
  ): ActionChannelEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionChannelEffectDescriptor]
  }
}


package typings.reduxSagaTypes.mod

import typings.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinatorEffect[T, E] extends js.Object {
  
  @JSName("@@redux-saga/IO")
  var `@@redux-sagaSlashIO`: `true` = js.native
  
  var combinator: `true` = js.native
  
  var payload: CombinatorEffectDescriptor[E] = js.native
  
  var `type`: T = js.native
}
object CombinatorEffect {
  
  @scala.inline
  def apply[T, E](
    `@@redux-sagaSlashIO`: `true`,
    combinator: `true`,
    payload: CombinatorEffectDescriptor[E],
    `type`: T
  ): CombinatorEffect[T, E] = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinatorEffect[T, E]]
  }
  
  @scala.inline
  implicit class CombinatorEffectOps[Self <: CombinatorEffect[_, _], T, E] (val x: Self with (CombinatorEffect[T, E])) extends AnyVal {
    
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
    def `set@@redux-sagaSlashIO`(value: `true`): Self = this.set("@@redux-saga/IO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombinator(value: `true`): Self = this.set("combinator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadVarargs(value: E*): Self = this.set("payload", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: CombinatorEffectDescriptor[E]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

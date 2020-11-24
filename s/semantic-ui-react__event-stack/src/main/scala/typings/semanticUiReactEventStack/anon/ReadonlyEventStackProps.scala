package typings.semanticUiReactEventStack.anon

import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@semantic-ui-react/event-stack.@semantic-ui-react/event-stack/lib/types/EventStack.EventStackProps> */
@js.native
trait ReadonlyEventStackProps extends js.Object {
  
  val name: String = js.native
  
  val on: InputEventListener = js.native
  
  val pool: js.UndefOr[String] = js.native
  
  val target: js.UndefOr[InputTargetElement] = js.native
}
object ReadonlyEventStackProps {
  
  @scala.inline
  def apply(name: String, on: InputEventListener): ReadonlyEventStackProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEventStackProps]
  }
  
  @scala.inline
  implicit class ReadonlyEventStackPropsOps[Self <: ReadonlyEventStackProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVarargs(value: EventListener*): Self = this.set("on", js.Array(value :_*))
    
    @scala.inline
    def setOnFunction1(value: /* evt */ Event => Unit): Self = this.set("on", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: InputEventListener): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: String): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setTarget(value: InputTargetElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}

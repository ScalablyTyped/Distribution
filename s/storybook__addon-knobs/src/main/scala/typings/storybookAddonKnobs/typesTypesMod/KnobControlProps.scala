package typings.storybookAddonKnobs.typesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobControlProps[T] extends js.Object {
  var knob: KnobControlConfig[T] = js.native
  def onChange(value: T): T = js.native
}

object KnobControlProps {
  @scala.inline
  def apply[T](knob: KnobControlConfig[T], onChange: T => T): KnobControlProps[T] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[KnobControlProps[T]]
  }
  @scala.inline
  implicit class KnobControlPropsOps[Self <: KnobControlProps[_], T] (val x: Self with KnobControlProps[T]) extends AnyVal {
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
    def setKnob(value: KnobControlConfig[T]): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: T => T): Self = this.set("onChange", js.Any.fromFunction1(value))
  }
  
}


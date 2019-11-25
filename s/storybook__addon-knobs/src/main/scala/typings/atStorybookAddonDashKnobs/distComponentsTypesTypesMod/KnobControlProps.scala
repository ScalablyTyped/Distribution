package typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobControlProps[T] extends js.Object {
  var knob: KnobControlConfig[T]
  def onChange(value: T): T
}

object KnobControlProps {
  @scala.inline
  def apply[T](knob: KnobControlConfig[T], onChange: T => T): KnobControlProps[T] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[KnobControlProps[T]]
  }
}


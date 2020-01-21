package typings.storybookAddonKnobs

import org.scalablytyped.runtime.Instantiable0
import typings.storybookAddonKnobs.objectMod.ObjectTypeProps
import typings.storybookAddonKnobs.objectMod.ObjectTypeState
import typings.storybookAddonKnobs.objectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassObjectType
  extends Instantiable0[default[js.Object]] {
  var defaultProps: ObjectTypeProps[_] = js.native
  var propTypes: AnonKnobOnChangeValueAny = js.native
  def deserialize[T](value: String): T = js.native
  def getDerivedStateFromProps[T](props: ObjectTypeProps[T], state: ObjectTypeState[T]): ObjectTypeState[T] | Null = js.native
  def serialize[T](`object`: T): String = js.native
}


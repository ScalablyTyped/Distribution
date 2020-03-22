package typings.storybookAddonKnobs.objectMod

import typings.storybookAddonKnobs.AnonOnChangeValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
@js.native
class default[T] () extends ObjectType[T]

/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: ObjectTypeProps[_] = js.native
  var propTypes: AnonOnChangeValidator = js.native
  def deserialize[T](value: String): T = js.native
  def getDerivedStateFromProps[T](props: ObjectTypeProps[T], state: ObjectTypeState[T]): ObjectTypeState[T] | Null = js.native
  def serialize[T](`object`: T): String = js.native
}


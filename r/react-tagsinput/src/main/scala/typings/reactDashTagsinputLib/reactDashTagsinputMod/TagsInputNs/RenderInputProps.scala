package typings
package reactDashTagsinputLib.reactDashTagsinputMod.TagsInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInputProps extends InputProps {
   // parameter is either a DOM element or a mounted React component
  val value: reactDashTagsinputLib.Tag
  def addTag(tag: reactDashTagsinputLib.Tag): scala.Unit
  def onChange(e: reactLib.reactMod.ReactNs.ChangeEvent[reactDashTagsinputLib.Anon_Value]): scala.Unit
  def ref(r: js.Any): scala.Unit
}

object RenderInputProps {
  @scala.inline
  def apply(
    addTag: js.Function1[reactDashTagsinputLib.Tag, scala.Unit],
    onChange: js.Function1[
      reactLib.reactMod.ReactNs.ChangeEvent[reactDashTagsinputLib.Anon_Value], 
      scala.Unit
    ],
    ref: js.Function1[js.Any, scala.Unit],
    value: reactDashTagsinputLib.Tag
  ): RenderInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTag")(addTag)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RenderInputProps]
  }
}


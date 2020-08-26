package typings.reactFlex.mod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexProps
  extends Props[Flex]
     with CommonFlexProps

object FlexProps {
  @scala.inline
  def apply(): FlexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps]
  }
}


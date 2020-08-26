package typings.rebassForms.mod

import typings.styledSystem.mod.AlignItemsProps
import typings.styledSystem.mod.FlexDirectionProps
import typings.styledSystem.mod.FlexWrapProps
import typings.styledSystem.mod.JustifyContentProps
import typings.styledSystem.mod.RequiredTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelKnownProps
  extends BoxKnownProps
     with FlexWrapProps[RequiredTheme]
     with FlexDirectionProps[RequiredTheme]
     with AlignItemsProps[RequiredTheme]
     with JustifyContentProps[RequiredTheme]

object LabelKnownProps {
  @scala.inline
  def apply(): LabelKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelKnownProps]
  }
}


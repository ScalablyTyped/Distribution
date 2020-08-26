package typings.rebass.mod

import typings.rebass.rebassStrings.fontWeights
import typings.styledSystem.mod.FontWeightProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.styledSystem.mod.ButtonStyleProps because var conflicts: variant. Inlined  */ @js.native
trait ButtonKnownProps
  extends BoxKnownProps
     with FontWeightProps[RequiredTheme, ThemeValue[fontWeights, RequiredTheme, js.Any]]

object ButtonKnownProps {
  @scala.inline
  def apply(): ButtonKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonKnownProps]
  }
}


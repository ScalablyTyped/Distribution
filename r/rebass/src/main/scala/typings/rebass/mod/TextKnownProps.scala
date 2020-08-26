package typings.rebass.mod

import typings.rebass.rebassStrings.fontWeights
import typings.rebass.rebassStrings.letterSpacings
import typings.rebass.rebassStrings.lineHeights
import typings.styledSystem.mod.FontFamilyProps
import typings.styledSystem.mod.FontStyleProps
import typings.styledSystem.mod.FontWeightProps
import typings.styledSystem.mod.LetterSpacingProps
import typings.styledSystem.mod.LineHeightProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.TextAlignProps
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextKnownProps
  extends BoxKnownProps
     with FontFamilyProps[RequiredTheme]
     with FontWeightProps[RequiredTheme, ThemeValue[fontWeights, RequiredTheme, js.Any]]
     with FontStyleProps[RequiredTheme]
     with TextAlignProps[RequiredTheme]
     with LineHeightProps[RequiredTheme, ThemeValue[lineHeights, RequiredTheme, js.Any]]
     with LetterSpacingProps[RequiredTheme, ThemeValue[letterSpacings, RequiredTheme, js.Any]]

object TextKnownProps {
  @scala.inline
  def apply(): TextKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextKnownProps]
  }
}


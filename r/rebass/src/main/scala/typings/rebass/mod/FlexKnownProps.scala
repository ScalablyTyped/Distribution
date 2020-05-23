package typings.rebass.mod

import typings.styledSystem.mod.AlignContentProps
import typings.styledSystem.mod.AlignItemsProps
import typings.styledSystem.mod.FlexDirectionProps
import typings.styledSystem.mod.FlexGrowProps
import typings.styledSystem.mod.FlexShrinkProps
import typings.styledSystem.mod.FlexWrapProps
import typings.styledSystem.mod.JustifyContentProps
import typings.styledSystem.mod.JustifyItemsProps
import typings.styledSystem.mod.JustifySelfProps
import typings.styledSystem.mod.RequiredTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexKnownProps
  extends BoxKnownProps
     with FlexGrowProps[RequiredTheme]
     with FlexShrinkProps[RequiredTheme]
     with FlexWrapProps[RequiredTheme]
     with FlexDirectionProps[RequiredTheme]
     with AlignItemsProps[RequiredTheme]
     with AlignContentProps[RequiredTheme]
     with JustifyItemsProps[RequiredTheme]
     with JustifyContentProps[RequiredTheme]
     with JustifySelfProps[RequiredTheme]


package typings.reactNativeSvgCharts

import typings.reactNativeSvgCharts.mod.GridDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeSvgChartsStrings {
  @js.native
  sealed trait BOTH extends GridDirection
  
  @js.native
  sealed trait HORIZONTAL extends GridDirection
  
  @js.native
  sealed trait VERTICAL extends GridDirection
  
  @scala.inline
  def BOTH: BOTH = "BOTH".asInstanceOf[BOTH]
  @scala.inline
  def HORIZONTAL: HORIZONTAL = "HORIZONTAL".asInstanceOf[HORIZONTAL]
  @scala.inline
  def VERTICAL: VERTICAL = "VERTICAL".asInstanceOf[VERTICAL]
}


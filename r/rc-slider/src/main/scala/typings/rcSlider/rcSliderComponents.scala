package typings.rcSlider

import typings.rcSlider.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcSliderComponents extends rcSliderProps {
  @scala.inline
  def Handle: ComponentType[HandleProps] = js.constructorOf[typings.rcSlider.mod.Handle].asInstanceOf[ComponentType[HandleProps]]
  @scala.inline
  def Range: ComponentType[RangeProps] = js.constructorOf[typings.rcSlider.mod.Range].asInstanceOf[ComponentType[RangeProps]]
  @scala.inline
  def RcSlider: ComponentType[RcSliderProps] = js.constructorOf[default].asInstanceOf[ComponentType[RcSliderProps]]
}


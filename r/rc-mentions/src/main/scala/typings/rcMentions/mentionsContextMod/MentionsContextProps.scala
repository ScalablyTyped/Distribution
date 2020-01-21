package typings.rcMentions.mentionsContextMod

import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsContextProps extends js.Object {
  var activeIndex: Double
  var notFoundContent: ReactNode
  var onBlur: FocusEventHandler[HTMLElement]
  var onFocus: FocusEventHandler[HTMLElement]
  def selectOption(option: OptionProps): Unit
  def setActiveIndex(index: Double): Unit
}

object MentionsContextProps {
  @scala.inline
  def apply(
    activeIndex: Double,
    onBlur: FocusEvent[HTMLElement] => Unit,
    onFocus: FocusEvent[HTMLElement] => Unit,
    selectOption: OptionProps => Unit,
    setActiveIndex: Double => Unit,
    notFoundContent: ReactNode = null
  ): MentionsContextProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsContextProps]
  }
}


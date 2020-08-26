package typings.sharepoint.SP.UI

import typings.sharepoint.SP.HtmlBuilder
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  def attachEvents(): Unit = js.native
  def get_displayName(): String = js.native
  def get_elementIDPrefix(): String = js.native
  def get_href(): String = js.native
  def get_isDropDownCommand(): Boolean = js.native
  def get_isEnabled(): Boolean = js.native
  def get_linkElement(): HTMLAnchorElement = js.native
  def get_name(): String = js.native
  def get_tooltip(): String = js.native
  /**Should override*/
  def onClick(): Unit = js.native
  def render(builder: HtmlBuilder): Unit = js.native
  def set_displayName(value: String): String = js.native
  def set_elementIDPrefix(value: String): String = js.native
  def set_isDropDownCommand(value: Boolean): Boolean = js.native
  def set_isEnabled(value: Boolean): Boolean = js.native
  def set_tooltip(value: String): String = js.native
}

object Command {
  @scala.inline
  def apply(
    attachEvents: () => Unit,
    get_displayName: () => String,
    get_elementIDPrefix: () => String,
    get_href: () => String,
    get_isDropDownCommand: () => Boolean,
    get_isEnabled: () => Boolean,
    get_linkElement: () => HTMLAnchorElement,
    get_name: () => String,
    get_tooltip: () => String,
    onClick: () => Unit,
    render: HtmlBuilder => Unit,
    set_displayName: String => String,
    set_elementIDPrefix: String => String,
    set_isDropDownCommand: Boolean => Boolean,
    set_isEnabled: Boolean => Boolean,
    set_tooltip: String => String
  ): Command = {
    val __obj = js.Dynamic.literal(attachEvents = js.Any.fromFunction0(attachEvents), get_displayName = js.Any.fromFunction0(get_displayName), get_elementIDPrefix = js.Any.fromFunction0(get_elementIDPrefix), get_href = js.Any.fromFunction0(get_href), get_isDropDownCommand = js.Any.fromFunction0(get_isDropDownCommand), get_isEnabled = js.Any.fromFunction0(get_isEnabled), get_linkElement = js.Any.fromFunction0(get_linkElement), get_name = js.Any.fromFunction0(get_name), get_tooltip = js.Any.fromFunction0(get_tooltip), onClick = js.Any.fromFunction0(onClick), render = js.Any.fromFunction1(render), set_displayName = js.Any.fromFunction1(set_displayName), set_elementIDPrefix = js.Any.fromFunction1(set_elementIDPrefix), set_isDropDownCommand = js.Any.fromFunction1(set_isDropDownCommand), set_isEnabled = js.Any.fromFunction1(set_isEnabled), set_tooltip = js.Any.fromFunction1(set_tooltip))
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachEvents(value: () => Unit): Self = this.set("attachEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_displayName(value: () => String): Self = this.set("get_displayName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_elementIDPrefix(value: () => String): Self = this.set("get_elementIDPrefix", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_href(value: () => String): Self = this.set("get_href", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_isDropDownCommand(value: () => Boolean): Self = this.set("get_isDropDownCommand", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_isEnabled(value: () => Boolean): Self = this.set("get_isEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_linkElement(value: () => HTMLAnchorElement): Self = this.set("get_linkElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_tooltip(value: () => String): Self = this.set("get_tooltip", js.Any.fromFunction0(value))
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def setRender(value: HtmlBuilder => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_displayName(value: String => String): Self = this.set("set_displayName", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_elementIDPrefix(value: String => String): Self = this.set("set_elementIDPrefix", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_isDropDownCommand(value: Boolean => Boolean): Self = this.set("set_isDropDownCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_isEnabled(value: Boolean => Boolean): Self = this.set("set_isEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_tooltip(value: String => String): Self = this.set("set_tooltip", js.Any.fromFunction1(value))
  }
  
}


package typings.reduxDevtoolsLogMonitor.mod

import typings.base16.mod.ColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogMonitorProps extends js.Object {
  /**
    * When true, displays the action object expanded rather than collapsed.
    *
    * @default true
    */
  var expandActionRoot: js.UndefOr[Boolean] = js.native
  /**
    * When true, displays the state object expanded rather than collapsed.
    *
    * @default true
    */
  var expandStateRoot: js.UndefOr[Boolean] = js.native
  /**
    * When true, records the current scroll top every second so it
    * can be restored on refresh. This only has effect when used together
    * with persistState() enhancer from Redux DevTools.
    *
    * @default true
    */
  var preserveScrollTop: js.UndefOr[Boolean] = js.native
  /**
    * A function that selects the slice of the state for DevTools to show.
    *
    * @example state => state.thePart.iCare.about.
    * @default state => state.
    */
  var select: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  /**
    * Either a string referring to one of the themes provided by
    * redux-devtools-themes or a custom object of the same format.
    *
    * @see https://github.com/gaearon/redux-devtools-themes
    */
  var theme: js.UndefOr[String | ColorScheme] = js.native
}

object ILogMonitorProps {
  @scala.inline
  def apply(): ILogMonitorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILogMonitorProps]
  }
  @scala.inline
  implicit class ILogMonitorPropsOps[Self <: ILogMonitorProps] (val x: Self) extends AnyVal {
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
    def setExpandActionRoot(value: Boolean): Self = this.set("expandActionRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandActionRoot: Self = this.set("expandActionRoot", js.undefined)
    @scala.inline
    def setExpandStateRoot(value: Boolean): Self = this.set("expandStateRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandStateRoot: Self = this.set("expandStateRoot", js.undefined)
    @scala.inline
    def setPreserveScrollTop(value: Boolean): Self = this.set("preserveScrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveScrollTop: Self = this.set("preserveScrollTop", js.undefined)
    @scala.inline
    def setSelect(value: /* state */ js.Any => _): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTheme(value: String | ColorScheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}


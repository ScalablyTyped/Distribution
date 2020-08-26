package typings.reactMdAutocomplete.highlightedResultMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightedResultProps extends js.Object {
  /**
    * The children to highlight. If this is not a string, the highlight will not
    * work.
    */
  var children: ReactNode = js.native
  /**
    * An optional className to provide to the `<span>`.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Boolean if the highlighting functionality should be enabled. Setting this
    * to false will just return the `children` instead.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * An optional id to use for the `<span>`. This will be suffixed by the
    * current `index` if it was provided
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The match index which is automatically added when the `repeatable` prop is
    * used for nested matches.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Boolean if the highlighting can be repeated multiple times within the
    * children string.
    */
  var repeatable: js.UndefOr[Boolean] = js.native
  /**
    * An optional style to provide to the `<span>`.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * The current value to match against.
    */
  var value: String = js.native
}

object HighlightedResultProps {
  @scala.inline
  def apply(value: String): HighlightedResultProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedResultProps]
  }
  @scala.inline
  implicit class HighlightedResultPropsOps[Self <: HighlightedResultProps] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setRepeatable(value: Boolean): Self = this.set("repeatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatable: Self = this.set("repeatable", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}


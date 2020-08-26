package typings.reactMdExpansionPanel.usePanelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsePanelsOptions extends js.Object {
  /**
    * The number of panels that will be used by this expansion logic and
    * generates the number of panel props to be used in the return value. This
    * should be a number greater than 0 and will throw a `RangeError` if it is
    * not in development.
    */
  var count: Double = js.native
  /**
    * Either the index that should be expanded by default, a list of indexes that
    * should be expanded by default, or `-1` which will expand all panels by
    * default.
    *
    * When this is omitted and `undefined`, no panels will be expanded by
    * default.
    */
  var defaultExpandedIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * The prefix to use for all of the panel ids. This is used to generate the id
    * for each panel as well as determine if a panel is expanded.
    */
  var idPrefix: String = js.native
  /**
    * Boolean if multiple panels can be expanded at a time. The default behavior
    * is to only allow one panel to be expanded and will close the previous panel
    * when a new one is expanded.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the expansion logic should prevent all the panels from being
    * closed.
    */
  var preventAllClosed: js.UndefOr[Boolean] = js.native
}

object UsePanelsOptions {
  @scala.inline
  def apply(count: Double, idPrefix: String): UsePanelsOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], idPrefix = idPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePanelsOptions]
  }
  @scala.inline
  implicit class UsePanelsOptionsOps[Self <: UsePanelsOptions] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultExpandedIndexVarargs(value: Double*): Self = this.set("defaultExpandedIndex", js.Array(value :_*))
    @scala.inline
    def setDefaultExpandedIndex(value: Double | js.Array[Double]): Self = this.set("defaultExpandedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExpandedIndex: Self = this.set("defaultExpandedIndex", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setPreventAllClosed(value: Boolean): Self = this.set("preventAllClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventAllClosed: Self = this.set("preventAllClosed", js.undefined)
  }
  
}


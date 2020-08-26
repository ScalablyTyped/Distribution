package typings.reactMdLink.skipToMainContentMod

import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipToMainContentProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  /**
    * The id to use for the `<main>` content that should be focused once this
    * link is clicked.
    */
  var mainId: String = js.native
  /**
    * Boolean if the skip to main content link should be unstyled so that you can
    * provide your own styles. This is just helpful if you are using this
    * component in a multiple places and don't want to keep overriding the
    * default styles each time.
    *
    * Note: there will still be the "base" link styles, font size, and z-index.
    * The `$rmd-link-skip-styles` and `$rmd-link-skip-active-styles` will not be
    * applied.
    */
  var unstyled: js.UndefOr[Boolean] = js.native
}

object SkipToMainContentProps {
  @scala.inline
  def apply(mainId: String): SkipToMainContentProps = {
    val __obj = js.Dynamic.literal(mainId = mainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipToMainContentProps]
  }
  @scala.inline
  implicit class SkipToMainContentPropsOps[Self <: SkipToMainContentProps] (val x: Self) extends AnyVal {
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
    def setMainId(value: String): Self = this.set("mainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnstyled(value: Boolean): Self = this.set("unstyled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnstyled: Self = this.set("unstyled", js.undefined)
  }
  
}


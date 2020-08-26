package typings.reactFlex.mod

import typings.react.mod.Props
import typings.reactFlex.reactFlexStrings.`fit-content`
import typings.reactFlex.reactFlexStrings.`max-content`
import typings.reactFlex.reactFlexStrings.`min-content`
import typings.reactFlex.reactFlexStrings.auto
import typings.reactFlex.reactFlexStrings.content
import typings.reactFlex.reactFlexStrings.fit
import typings.reactFlex.reactFlexStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemProps
  extends Props[Flex]
     with CommonFlexProps {
  /**
    * A value for the flex-basis css property. Valid values are: `0` (and `'none'`, which is the same),
    * `'auto'`, `'content'`, `'fit-content'`, `'min-content'`, `'max-content'`, `'fit'`.
    */
  var flexBasis: js.UndefOr[
    Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit
  ] = js.native
  /**
    * A number/string from 0 to 24 for `flex-grow`. Most of the times, using `flex` is just enough.
    */
  var flexGrow: js.UndefOr[Double | String | Boolean] = js.native
  /**
    * A value for the `flex-shrink` css property. From `0` to `24`.
    */
  var flexShrink: js.UndefOr[Double | String] = js.native
}

object ItemProps {
  @scala.inline
  def apply(): ItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemProps]
  }
  @scala.inline
  implicit class ItemPropsOps[Self <: ItemProps] (val x: Self) extends AnyVal {
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
    def setFlexBasis(value: Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    @scala.inline
    def setFlexGrow(value: Double | String | Boolean): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    @scala.inline
    def setFlexShrink(value: Double | String): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
  }
  
}


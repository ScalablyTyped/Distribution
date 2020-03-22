package typings.storybookComponents.propJsDocMod

import typings.storybookComponents.propDefMod.JsDocTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropJsDocProps extends js.Object {
  var tags: JsDocTags = js.native
}

object PropJsDocProps {
  @scala.inline
  def apply(tags: JsDocTags): PropJsDocProps = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropJsDocProps]
  }
}


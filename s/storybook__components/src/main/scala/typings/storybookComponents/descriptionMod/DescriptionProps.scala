package typings.storybookComponents.descriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptionProps extends js.Object {
  var markdown: String = js.native
}

object DescriptionProps {
  @scala.inline
  def apply(markdown: String): DescriptionProps = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescriptionProps]
  }
}


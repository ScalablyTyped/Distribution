package typings.storybookAddonStoryshots

import typings.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStorybook extends js.Object {
  var storybook: ClientApi
}

object AnonStorybook {
  @scala.inline
  def apply(storybook: ClientApi): AnonStorybook = {
    val __obj = js.Dynamic.literal(storybook = storybook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStorybook]
  }
}


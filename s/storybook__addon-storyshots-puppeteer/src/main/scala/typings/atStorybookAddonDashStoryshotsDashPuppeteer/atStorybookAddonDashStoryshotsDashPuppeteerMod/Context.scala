package typings.atStorybookAddonDashStoryshotsDashPuppeteer.atStorybookAddonDashStoryshotsDashPuppeteerMod

import typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod.StoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: StoryContext
  var url: String
}

object Context {
  @scala.inline
  def apply(context: StoryContext, url: String): Context = {
    val __obj = js.Dynamic.literal(context = context, url = url)
  
    __obj.asInstanceOf[Context]
  }
}


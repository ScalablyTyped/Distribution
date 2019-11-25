package typings.storybookDashReactDashRouter

import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Object
  var routerProps: MemoryRouterProps
  var story: StoryApi[_]
}

object Anon_Links {
  @scala.inline
  def apply(links: js.Object, routerProps: MemoryRouterProps, story: StoryApi[_]): Anon_Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Links]
  }
}


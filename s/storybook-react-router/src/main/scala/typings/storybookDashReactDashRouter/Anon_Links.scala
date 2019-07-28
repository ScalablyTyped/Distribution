package typings.storybookDashReactDashRouter

import typings.atStorybookReact.atStorybookReactMod.Story
import typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Object
  var routerProps: MemoryRouterProps
  var story: Story
}

object Anon_Links {
  @scala.inline
  def apply(links: js.Object, routerProps: MemoryRouterProps, story: Story): Anon_Links = {
    val __obj = js.Dynamic.literal(links = links, routerProps = routerProps, story = story)
  
    __obj.asInstanceOf[Anon_Links]
  }
}


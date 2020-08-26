package typings.storybookReactRouter.anon

import typings.reactRouter.mod.MemoryRouterProps
import typings.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Links extends js.Object {
  var links: js.Object = js.native
  var routerProps: MemoryRouterProps = js.native
  var story: StoryApi[_] = js.native
}

object Links {
  @scala.inline
  def apply(links: js.Object, routerProps: MemoryRouterProps, story: StoryApi[_]): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  @scala.inline
  implicit class LinksOps[Self <: Links] (val x: Self) extends AnyVal {
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
    def setLinks(value: js.Object): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouterProps(value: MemoryRouterProps): Self = this.set("routerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setStory(value: StoryApi[_]): Self = this.set("story", value.asInstanceOf[js.Any])
  }
  
}


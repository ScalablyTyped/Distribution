package typings.atStorybookHtml.atStorybookHtmlMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryObject extends js.Object {
  var name: String = js.native
  @JSName("render")
  var render_Original: RenderFunction = js.native
  def render(): String | js.Array[String] | HTMLElement = js.native
}


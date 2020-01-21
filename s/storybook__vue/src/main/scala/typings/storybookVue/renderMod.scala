package typings.storybookVue

import typings.storybookVue.storybookVueStrings.STORYBOOK_COMPONENT
import typings.storybookVue.storybookVueStrings.STORYBOOK_VALUES
import typings.storybookVue.typesMod.RenderMainArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue/dist/client/preview/render", JSImport.Namespace)
@js.native
object renderMod extends js.Object {
  val COMPONENT: STORYBOOK_COMPONENT = js.native
  val VALUES: STORYBOOK_VALUES = js.native
  def default(hasStoryFnSelectedKindSelectedStoryShowMainShowErrorShowExceptionForceRender: RenderMainArgs): Unit = js.native
}


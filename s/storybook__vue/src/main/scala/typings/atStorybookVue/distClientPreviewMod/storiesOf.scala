package typings.atStorybookVue.distClientPreviewMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookVue.distClientPreviewTypesMod.StoryFnVueReturnType
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue/dist/client/preview", "storiesOf")
@js.native
object storiesOf
  extends TopLevel[
      js.Function2[/* kind */ String, /* module */ NodeModule, StoryApi[StoryFnVueReturnType]]
    ]


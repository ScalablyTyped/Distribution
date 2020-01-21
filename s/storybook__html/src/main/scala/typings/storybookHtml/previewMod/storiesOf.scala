package typings.storybookHtml.previewMod

import org.scalablytyped.runtime.TopLevel
import typings.node.NodeModule
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookHtml.typesMod.StoryFnHtmlReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/html/dist/client/preview", "storiesOf")
@js.native
object storiesOf
  extends TopLevel[
      js.Function2[/* kind */ String, /* module */ NodeModule, StoryApi[StoryFnHtmlReturnType]]
    ]


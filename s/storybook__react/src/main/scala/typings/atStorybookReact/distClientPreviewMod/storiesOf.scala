package typings.atStorybookReact.distClientPreviewMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react/dist/client/preview", "storiesOf")
@js.native
object storiesOf
  extends TopLevel[
      js.Function2[/* kind */ String, /* module */ NodeModule, StoryApi[StoryFnReactReturnType]]
    ]


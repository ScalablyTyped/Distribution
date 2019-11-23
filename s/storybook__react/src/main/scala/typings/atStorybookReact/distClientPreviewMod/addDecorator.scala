package typings.atStorybookReact.distClientPreviewMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnReactReturnType], 
        StoryApi[StoryFnReactReturnType]
      ]
    ]


package typings.atStorybookHtml.distClientPreviewMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookHtml.distClientPreviewTypesMod.StoryFnHtmlReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/html/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnHtmlReturnType], 
        StoryApi[StoryFnHtmlReturnType]
      ]
    ]


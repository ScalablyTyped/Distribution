package typings.atStorybookVue.distClientPreviewMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookVue.distClientPreviewTypesMod.StoryFnVueReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnVueReturnType], 
        StoryApi[StoryFnVueReturnType]
      ]
    ]


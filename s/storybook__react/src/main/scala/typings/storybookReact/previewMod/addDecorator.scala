package typings.storybookReact.previewMod

import org.scalablytyped.runtime.TopLevel
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookReact.typesMod.StoryFnReactReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/react/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnReactReturnType], 
        StoryApi[StoryFnReactReturnType]
      ]
    ]


package typings.storybookUi.toolbarMod

import org.scalablytyped.runtime.TopLevel
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.PropsWithChildren
import typings.std.Pick
import typings.std.Record
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.Shown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/preview/toolbar", "Toolbar")
@js.native
object Toolbar extends TopLevel[
      StyledComponent[
        PropsWithChildren[Shown with (Record[String, _])], 
        Pick[PropsWithChildren[Shown with (Record[String, _])], String], 
        Theme
      ]
    ]

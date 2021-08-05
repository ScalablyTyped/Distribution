package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.releaseNotesMod.ReleaseNotesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseNotesStoriesMod {
  
  @JSImport("@storybook/ui/dist/settings/release_notes.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/settings/release_notes.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/settings/release_notes.stories", "default.component")
    @js.native
    def component: FunctionComponent[ReleaseNotesProps] = js.native
    inline def component_=(x: FunctionComponent[ReleaseNotesProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/release_notes.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def DidHitMaxWaitTime(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DidHitMaxWaitTime")().asInstanceOf[Element]
  
  inline def Loading(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Loading")().asInstanceOf[Element]
}

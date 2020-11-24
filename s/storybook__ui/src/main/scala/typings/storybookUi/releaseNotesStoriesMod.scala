package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.releaseNotesMod.ReleaseNotesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/settings/release_notes.stories", JSImport.Namespace)
@js.native
object releaseNotesStoriesMod extends js.Object {
  
  def DidHitMaxWaitTime(): Element = js.native
  
  def Loading(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: FunctionComponent[ReleaseNotesProps] = js.native
    
    var title: String = js.native
  }
}

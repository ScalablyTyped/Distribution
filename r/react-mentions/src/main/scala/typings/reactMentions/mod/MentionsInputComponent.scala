package typings.reactMentions.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionsInputComponent
  extends Component[MentionsInputProps, js.Object, js.Any] {
  
  // MentionsInput uses substyle (https://github.com/jfschwarz/substyle) which adds this wrappedInstance
  var wrappedInstance: js.UndefOr[MentionsInputComponentUnrwapped] = js.native
}

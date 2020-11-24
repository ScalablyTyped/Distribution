package typings.reactTagsinput.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsInput[Tag]
  extends Component[ReactTagsInputProps[Tag], js.Object, js.Any] {
  
  def accept(): js.Any = js.native
  
  def addTag(tag: Tag): js.Any = js.native
  
  def blur(): Unit = js.native
  
  def clearInput(): Unit = js.native
  
  def focus(): Unit = js.native
}

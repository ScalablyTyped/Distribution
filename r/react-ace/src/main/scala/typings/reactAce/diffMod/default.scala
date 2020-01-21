package typings.reactAce.diffMod

import typings.propTypes.mod.ValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace/lib/diff", JSImport.Default)
@js.native
class default protected () extends DiffComponent {
  def this(props: IDiffEditorProps) = this()
}

/* static members */
@JSImport("react-ace/lib/diff", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Partial[IDiffEditorProps] = js.native
  var propTypes: ValidationMap[IDiffEditorProps] = js.native
}


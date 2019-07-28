package typings.reactDashAce.libAceMod

import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace/lib/ace", JSImport.Default)
@js.native
class default protected () extends ReactAce {
  def this(props: IAceEditorProps) = this()
}

/* static members */
@JSImport("react-ace/lib/ace", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Partial[IAceEditorProps] = js.native
  var propTypes: ValidationMap[IAceEditorProps] = js.native
}


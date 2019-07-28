package typings.reactDashAce.reactDashAceMod

import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.reactDashAce.libDiffMod.IDiffEditorProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace", "diff")
@js.native
class diff protected ()
  extends typings.reactDashAce.libDiffMod.default {
  def this(props: IDiffEditorProps) = this()
}

/* static members */
@JSImport("react-ace", "diff")
@js.native
object diff extends js.Object {
  var defaultProps: Partial[IDiffEditorProps] = js.native
  var propTypes: ValidationMap[IDiffEditorProps] = js.native
}


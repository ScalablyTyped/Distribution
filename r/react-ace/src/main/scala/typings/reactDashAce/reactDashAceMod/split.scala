package typings.reactDashAce.reactDashAceMod

import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.reactDashAce.libSplitMod.ISplitEditorProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace", "split")
@js.native
class split protected ()
  extends typings.reactDashAce.libSplitMod.default {
  def this(props: ISplitEditorProps) = this()
}

/* static members */
@JSImport("react-ace", "split")
@js.native
object split extends js.Object {
  var defaultProps: Partial[ISplitEditorProps] = js.native
  var propTypes: ValidationMap[ISplitEditorProps] = js.native
}


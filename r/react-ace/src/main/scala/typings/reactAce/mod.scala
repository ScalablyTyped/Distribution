package typings.reactAce

import typings.propTypes.mod.ValidationMap
import typings.reactAce.aceMod.IAceEditorProps
import typings.reactAce.diffMod.IDiffEditorProps
import typings.reactAce.splitMod.ISplitEditorProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typings.reactAce.aceMod.default {
    def this(props: IAceEditorProps) = this()
  }
  
  @js.native
  class diff protected ()
    extends typings.reactAce.diffMod.default {
    def this(props: IDiffEditorProps) = this()
  }
  
  @js.native
  class split protected ()
    extends typings.reactAce.splitMod.default {
    def this(props: ISplitEditorProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Partial[IAceEditorProps] = js.native
    var propTypes: ValidationMap[IAceEditorProps] = js.native
  }
  
  /* static members */
  @js.native
  object diff extends js.Object {
    var defaultProps: Partial[IDiffEditorProps] = js.native
    var propTypes: ValidationMap[IDiffEditorProps] = js.native
  }
  
  /* static members */
  @js.native
  object split extends js.Object {
    var defaultProps: Partial[ISplitEditorProps] = js.native
    var propTypes: ValidationMap[ISplitEditorProps] = js.native
  }
  
}


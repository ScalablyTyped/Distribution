package typings.reactAce

import typings.reactAce.aceMod.IAceEditorProps
import typings.reactAce.anon.PartialIAceEditorProps
import typings.reactAce.anon.PartialIDiffEditorProps
import typings.reactAce.anon.PartialISplitEditorProps
import typings.reactAce.anon.ValidationMapIAceEditorPr
import typings.reactAce.anon.ValidationMapIDiffEditorP
import typings.reactAce.anon.ValidationMapISplitEditor
import typings.reactAce.diffMod.IDiffEditorProps
import typings.reactAce.splitMod.ISplitEditorProps
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
    var defaultProps: PartialIAceEditorProps = js.native
    var propTypes: ValidationMapIAceEditorPr = js.native
  }
  
  /* static members */
  @js.native
  object diff extends js.Object {
    var defaultProps: PartialIDiffEditorProps = js.native
    var propTypes: ValidationMapIDiffEditorP = js.native
  }
  
  /* static members */
  @js.native
  object split extends js.Object {
    var defaultProps: PartialISplitEditorProps = js.native
    var propTypes: ValidationMapISplitEditor = js.native
  }
  
}


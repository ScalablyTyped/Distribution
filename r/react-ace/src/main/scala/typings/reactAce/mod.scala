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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ace", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.reactAce.aceMod.default {
    def this(props: IAceEditorProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-ace", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace", "default.defaultProps")
    @js.native
    def defaultProps: PartialIAceEditorProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIAceEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace", "default.propTypes")
    @js.native
    def propTypes: ValidationMapIAceEditorPr = js.native
    @scala.inline
    def propTypes_=(x: ValidationMapIAceEditorPr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-ace", "diff")
  @js.native
  class diff protected ()
    extends typings.reactAce.diffMod.default {
    def this(props: IDiffEditorProps) = this()
  }
  /* static members */
  object diff {
    
    @JSImport("react-ace", "diff")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace", "diff.defaultProps")
    @js.native
    def defaultProps: PartialIDiffEditorProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDiffEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace", "diff.propTypes")
    @js.native
    def propTypes: ValidationMapIDiffEditorP = js.native
    @scala.inline
    def propTypes_=(x: ValidationMapIDiffEditorP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-ace", "split")
  @js.native
  class split protected ()
    extends typings.reactAce.splitMod.default {
    def this(props: ISplitEditorProps) = this()
  }
  /* static members */
  object split {
    
    @JSImport("react-ace", "split")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace", "split.defaultProps")
    @js.native
    def defaultProps: PartialISplitEditorProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialISplitEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace", "split.propTypes")
    @js.native
    def propTypes: ValidationMapISplitEditor = js.native
    @scala.inline
    def propTypes_=(x: ValidationMapISplitEditor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}

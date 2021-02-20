package typings.reactLatexNext

import typings.reactLatexNext.anon.PartialLatexProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-latex-next/dist", JSImport.Default)
  @js.native
  class default ()
    extends typings.reactLatexNext.latexMod.default
  /* static members */
  object default {
    
    @JSImport("react-latex-next/dist", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-latex-next/dist", "default.defaultProps")
    @js.native
    def defaultProps: PartialLatexProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialLatexProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}

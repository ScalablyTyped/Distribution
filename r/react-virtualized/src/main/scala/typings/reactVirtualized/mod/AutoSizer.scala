package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.DisableHeight
import typings.reactVirtualized.esAutoSizerMod.AutoSizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "AutoSizer")
@js.native
class AutoSizer protected ()
  extends typings.reactVirtualized.esAutoSizerMod.AutoSizer {
  def this(props: AutoSizerProps) = this()
}
/* static members */
object AutoSizer {
  
  @JSImport("react-virtualized", "AutoSizer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "AutoSizer.defaultProps")
  @js.native
  def defaultProps: DisableHeight = js.native
  inline def defaultProps_=(x: DisableHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}

package typings.reactDock

import typings.reactDock.anon.DefaultSize
import typings.reactDock.anon.DimMode
import typings.reactDock.libTypesDockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dock", "Dock")
  @js.native
  open class Dock () extends default
  /* static members */
  object Dock {
    
    @JSImport("react-dock", "Dock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dock", "Dock.defaultProps")
    @js.native
    def defaultProps: DimMode = js.native
    inline def defaultProps_=(x: DimMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-dock", "Dock.propTypes")
    @js.native
    def propTypes: DefaultSize = js.native
    inline def propTypes_=(x: DefaultSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}

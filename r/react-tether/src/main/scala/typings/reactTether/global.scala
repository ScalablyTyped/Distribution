package typings.reactTether

import typings.reactTether.mod.ReactTether.TetherComponentProps
import typings.reactTether.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ReactTether")
  @js.native
  class ReactTether () extends default
  object ReactTether {
    
    @JSGlobal("ReactTether")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSGlobal("ReactTether.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ReactTether.defaultProps.renderElementTag")
      @js.native
      def renderElementTag: String = js.native
      inline def renderElementTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderElementTag")(x.asInstanceOf[js.Any])
      
      @JSGlobal("ReactTether.defaultProps.renderElementTo")
      @js.native
      def renderElementTo: js.Any = js.native
      inline def renderElementTo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderElementTo")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSGlobal("ReactTether.propTypes")
    @js.native
    def propTypes: TetherComponentProps = js.native
    inline def propTypes_=(x: TetherComponentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}

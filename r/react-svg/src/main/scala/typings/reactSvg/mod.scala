package typings.reactSvg

import typings.reactSvg.anon.AfterInjection
import typings.reactSvg.anon.BeforeInjection
import typings.reactSvg.distTypesMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg", "ReactSVG")
  @js.native
  open class ReactSVG protected ()
    extends typings.reactSvg.distReactSVGMod.ReactSVG {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object ReactSVG {
    
    @JSImport("react-svg", "ReactSVG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-svg", "ReactSVG.defaultProps")
    @js.native
    def defaultProps: AfterInjection = js.native
    inline def defaultProps_=(x: AfterInjection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-svg", "ReactSVG.propTypes")
    @js.native
    def propTypes: BeforeInjection = js.native
    inline def propTypes_=(x: BeforeInjection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}

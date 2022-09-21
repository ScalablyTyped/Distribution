package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.reactSketchapp.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowsPropTypesMod {
  
  object ShadowsPropTypes {
    
    @JSImport("react-sketchapp/lib/components/ShadowsPropTypes", "ShadowsPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/ShadowsPropTypes", "ShadowsPropTypes.shadowColor")
    @js.native
    def shadowColor: Requireable[String | Double] = js.native
    inline def shadowColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ShadowsPropTypes", "ShadowsPropTypes.shadowInner")
    @js.native
    def shadowInner: Requireable[Boolean] = js.native
    inline def shadowInner_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowInner")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ShadowsPropTypes", "ShadowsPropTypes.shadowOffset")
    @js.native
    def shadowOffset: Requireable[InferProps[Height]] = js.native
    inline def shadowOffset_=(x: Requireable[InferProps[Height]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ShadowsPropTypes", "ShadowsPropTypes.shadowOpacity")
    @js.native
    def shadowOpacity: Requireable[Double] = js.native
    inline def shadowOpacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ShadowsPropTypes", "ShadowsPropTypes.shadowRadius")
    @js.native
    def shadowRadius: Requireable[Double] = js.native
    inline def shadowRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ShadowsPropTypes", "ShadowsPropTypes.shadowSpread")
    @js.native
    def shadowSpread: Requireable[Double] = js.native
    inline def shadowSpread_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowSpread")(x.asInstanceOf[js.Any])
  }
}

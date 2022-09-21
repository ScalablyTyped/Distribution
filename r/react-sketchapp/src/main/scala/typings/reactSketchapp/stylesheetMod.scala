package typings.reactSketchapp

import typings.reactSketchapp.anon.`1`
import typings.reactSketchapp.stylesheetTypesMod.RawStyle
import typings.reactSketchapp.stylesheetTypesMod.RawStyles
import typings.reactSketchapp.stylesheetTypesMod.Style
import typings.reactSketchapp.stylesheetTypesMod.StyleSheetInstance
import typings.reactSketchapp.stylesheetTypesMod.UserStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesheetMod {
  
  object StyleSheet {
    
    @JSImport("react-sketchapp/lib/module/stylesheet", "StyleSheet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/stylesheet", "StyleSheet.absoluteFill")
    @js.native
    def absoluteFill: Double = js.native
    inline def absoluteFill_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("absoluteFill")(x.asInstanceOf[js.Any])
    
    inline def create(styles: RawStyles): StyleSheetInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleSheetInstance]
    
    inline def flatten(): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[js.UndefOr[Style]]
    inline def flatten(input: js.Array[UserStyle]): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Style]]
    inline def flatten(input: Double): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Style]]
    inline def flatten(input: RawStyle): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Style]]
    
    @JSImport("react-sketchapp/lib/module/stylesheet", "StyleSheet.hairlineWidth")
    @js.native
    def hairlineWidth: Double = js.native
    inline def hairlineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hairlineWidth")(x.asInstanceOf[js.Any])
    
    inline def resolve(style: UserStyle): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[`1`]
  }
}

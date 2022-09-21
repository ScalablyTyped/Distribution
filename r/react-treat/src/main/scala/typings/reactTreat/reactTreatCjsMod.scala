package typings.reactTreat

import typings.react.mod.global.JSX.Element
import typings.reactTreat.mod.TreatProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTreatCjsMod {
  
  @JSImport("react-treat/dist/react-treat.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreatProvider(hasThemeChildren: TreatProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreatProvider")(hasThemeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useClassName(
    classRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useClassName")(classRef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useStyles[UserStyles /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreatModule */ Any */](styles: UserStyles): UserStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[UserStyles]
  
  inline def useTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[String]
}

package typings.reactTreat

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("react-treat/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreatProvider(hasThemeChildren: TreatProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreatProvider")(hasThemeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useClassName(
    classRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useClassName")(classRef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useStyles[UserStyles /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreatModule */ Any */](styles: UserStyles): UserStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[UserStyles]
  
  inline def useTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[String]
  
  trait TreatProviderProps extends StObject {
    
    var children: ReactNode
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
  }
  object TreatProviderProps {
    
    inline def apply(
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
    ): TreatProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreatProviderProps]
    }
    
    extension [Self <: TreatProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}

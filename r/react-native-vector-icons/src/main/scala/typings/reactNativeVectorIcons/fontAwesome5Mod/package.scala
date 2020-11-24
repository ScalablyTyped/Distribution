package typings.reactNativeVectorIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fontAwesome5Mod {
  
  type AllowOnlyOne[T, Keys /* <: /* keyof T */ java.lang.String */] = (typings.reactNativeVectorIcons.fontAwesome5Mod.Omit[T, Keys]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Partial<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  
  type FontAwesome5Icon = typings.react.mod.Component[typings.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps, js.Any, js.Any]
  
  type FontAwesome5IconProps = typings.reactNativeVectorIcons.fontAwesome5Mod.AllowOnlyOne[
    typings.reactNativeVectorIcons.anon.KinFontAwesome5IconVarian, 
    typings.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconVariants
  ]
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

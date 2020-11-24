package typings.reactSpringShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esmTypesMod {
  
  type Animatable[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @react-spring/shared.@react-spring/shared/esm/types.Animatable<T[P]> * / object}
    */ typings.reactSpringShared.reactSpringSharedStrings.Animatable with org.scalablytyped.runtime.TopLevel[js.Any]) | (js.Array[scala.Double | java.lang.String]) | java.lang.String | scala.Double
  
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  
  type FrameRequestCallback = js.Function1[/* time */ js.UndefOr[scala.Double], scala.Unit]
  
  type InterpolatorArgs[In, Out] = (js.Array[
    typings.reactSpringShared.esmTypesMod.InterpolatorConfig[Out] | (typings.reactSpringShared.esmTypesMod.InterpolatorFn[typings.reactSpringShared.typesDotutilMod.Arrify[In], Out])
  ]) | (js.Tuple3[
    js.Array[scala.Double], 
    js.Array[
      typings.reactSpringShared.typesDotutilMod.Constrain[Out, typings.reactSpringShared.esmTypesMod.Animatable[js.Any]]
    ], 
    js.UndefOr[typings.reactSpringShared.esmTypesMod.ExtrapolateType]
  ])
  
  type InterpolatorFn[In, Out] = js.Function1[/* inputs */ typings.reactSpringShared.typesDotutilMod.Arrify[In], Out]
}

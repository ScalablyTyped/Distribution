package typings.reactSpring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webMod {
  type AnimatedValue[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-spring.react-spring/web.OpaqueInterpolation<T[P]>}
    */ typings.reactSpring.reactSpringStrings.AnimatedValue with org.scalablytyped.runtime.TopLevel[T]
  type ForwardedProps[T] = typings.std.Pick[
    T, 
    typings.std.Exclude[/* keyof T */ java.lang.String, typings.reactSpring.webMod.ExcludedProps]
  ]
  // NOTE: because of the Partial, this makes a weak type, which can have excess props
  type InferFrom[T /* <: js.Object */] = typings.std.Partial[js.Any | typings.reactSpring.webMod.ForwardedProps[T]]
  // This is similar to "Omit<A, keyof B> & B",
  //  but with a delayed evaluation that still allows A to be inferrable
  type Merge[A, B] = typings.reactSpring.reactSpringStrings.Merge with org.scalablytyped.runtime.TopLevel[js.Any] with B
  type OpaqueInterpolation[T] = typings.reactSpring.anon.GetValue[T] with T
  type OverwriteKeys[A, B] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: K extends keyof B? B[K] : A[K]}
    */ typings.reactSpring.reactSpringStrings.OverwriteKeys with org.scalablytyped.runtime.TopLevel[js.Any]
  type SetUpdateFn[DS /* <: js.Object */] = js.Function1[
    /* ds */ typings.std.Partial[typings.reactSpring.webMod.UseSpringProps[DS]], 
    scala.Unit
  ]
  type UseSpringProps[DS /* <: js.Object */] = typings.reactSpring.webMod.Merge[
    DS with typings.reactSpring.webMod.UseSpringBaseProps, 
    typings.reactSpring.anon.From[DS]
  ]
}

package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryableMod {
  type Diff[T /* <: KeyOf */, U /* <: KeyOf */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type KeyOf = java.lang.String | scala.Double | js.Symbol
  type Omit[T, K /* <: KeyOf */] = stdLib.Pick[T, Diff[java.lang.String, K]]
  type OptionalKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  type RequiredKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  type Resolved[T] = ResolvedSimple[js.Any | T]
  type ResolvedObject[T] = ModifyOptionalProperties[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>}
    */ atPulumiPulumiLib.atPulumiPulumiLibStrings.ResolvedObject with T
  ]
  type ResolvedResource[T /* <: atPulumiPulumiLib.resourceMod.Resource */] = Omit[
    Resolved[T], 
    atPulumiPulumiLib.atPulumiPulumiLibStrings.urn | atPulumiPulumiLib.atPulumiPulumiLibStrings.getProvider
  ]
  type ResolvedSimple[T] = ResolvedObject[T] | ResolvedArray[js.Any] | T
  type primitive = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
}

package typings.atPulumiPulumi

import typings.atPulumiPulumi.atPulumiPulumiStrings.getProvider
import typings.atPulumiPulumi.atPulumiPulumiStrings.urn
import typings.atPulumiPulumi.resourceMod.Resource
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryableMod {
  type OptionalKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  type PulumiExclude[T, U] = T
  type PulumiOmit[T, K /* <: String */] = Pick[T, PulumiExclude[String, K]]
  type RequiredKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  type Resolved[T] = ResolvedSimple[js.Any | T]
  type ResolvedObject[T] = ModifyOptionalProperties[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>}
    */ typings.atPulumiPulumi.atPulumiPulumiStrings.ResolvedObject with T
  ]
  type ResolvedResource[T /* <: Resource */] = PulumiOmit[Resolved[T], urn | getProvider]
  type ResolvedSimple[T] = ResolvedObject[T] | ResolvedArray[js.Any] | T
  type primitive = js.UndefOr[String | Double | Boolean | Null]
}

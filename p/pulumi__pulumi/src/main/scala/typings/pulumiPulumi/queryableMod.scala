package typings.pulumiPulumi

import org.scalablytyped.runtime.TopLevel
import typings.pulumiPulumi.pulumiPulumiStrings.getProvider
import typings.pulumiPulumi.pulumiPulumiStrings.urn
import typings.pulumiPulumi.resourceMod.Resource
import typings.std.Array
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryableMod {
  
  @js.native
  trait ModifyOptionalProperties[T] extends StObject
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  
  type Resolved[T] = ResolvedSimple[js.Any | T]
  
  @js.native
  trait ResolvedArray[T]
    extends StObject
       with Array[Resolved[T]]
  
  type ResolvedObject[T] = ModifyOptionalProperties[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>}
    */ typings.pulumiPulumi.pulumiPulumiStrings.ResolvedObject & TopLevel[T]
  ]
  
  type ResolvedResource[T /* <: Resource */] = Omit[Resolved[T], urn | getProvider]
  
  type ResolvedSimple[T] = ResolvedObject[T] | ResolvedArray[js.Any] | T
  
  type primitive = js.UndefOr[String | Double | Boolean | Null]
}

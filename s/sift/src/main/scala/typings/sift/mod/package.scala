package typings.sift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ElemMatch[T /* <: org.scalablytyped.runtime.StringDictionary[js.Array[_]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sift.sift.SiftQuery<T[P]>}
    */ typings.sift.siftStrings.ElemMatch with T
  type Exec = js.Function1[/* array */ typings.sift.mod.SupportedTypes, typings.sift.mod.SupportedTypes]
  type ExternalQuery[T /* <: typings.sift.mod.SupportedTypes */] = typings.sift.mod.ElemMatch[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  type FilterFn = js.Function3[
    /* value */ js.Any, 
    /* index */ js.UndefOr[scala.Double], 
    /* array */ js.UndefOr[js.Array[js.Any]], 
    scala.Boolean
  ]
  type KeyOrValue[T /* <: typings.sift.mod.SupportedTypes */] = T with (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  type PluginDefinition[T] = org.scalablytyped.runtime.StringDictionary[js.Function2[/* a */ T, /* b */ T, scala.Boolean | scala.Double]]
  type PluginFunction[T] = js.Function1[/* sift */ typings.sift.mod.Sift, typings.sift.mod.PluginDefinition[T]]
  type SiftQuery[T /* <: typings.sift.mod.SupportedTypes */] = typings.sift.mod.ExternalQuery[T] with typings.sift.mod.InternalQuery[T]
  type SupportedTypes = js.Array[
    java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Double | scala.Null | js.Any
  ]
  type WhereFn[T /* <: typings.sift.mod.SupportedTypes */] = js.ThisFunction3[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ /* this */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ /* value */ js.Any, 
    /* index */ scala.Double, 
    /* array */ T, 
    scala.Boolean
  ]
}

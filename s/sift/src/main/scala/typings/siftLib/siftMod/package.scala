package typings
package siftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object siftMod {
  type ElemMatch[T /* <: org.scalablytyped.runtime.StringDictionary[js.Array[_]] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sift.sift.SiftQuery<T[P]>}
    */ siftLib.siftLibStrings.ElemMatch with T
  type Exec = js.Function1[/* array */ SupportedTypes, SupportedTypes]
  type ExternalQuery[T /* <: SupportedTypes */] = ElemMatch[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
  type FilterFn = js.Function3[
    /* value */ js.Any, 
    /* index */ js.UndefOr[scala.Double], 
    /* array */ js.UndefOr[js.Array[js.Any]], 
    scala.Boolean
  ]
  type KeyOrValue[T /* <: SupportedTypes */] = T with (/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any)
  type PluginDefinition[T] = org.scalablytyped.runtime.StringDictionary[js.Function2[/* a */ T, /* b */ T, scala.Boolean | scala.Double]]
  type PluginFunction[T] = js.Function1[/* sift */ Sift, PluginDefinition[T]]
  type SiftQuery[T /* <: SupportedTypes */] = ExternalQuery[T] with InternalQuery[T]
  type SupportedTypes = js.Array[
    java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Double | scala.Null | js.Any
  ]
  type WhereFn[T /* <: SupportedTypes */] = js.ThisFunction3[
    /* import warning: ImportType.apply Failed type conversion: T[0] */ /* this */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: T[0] */ /* value */ js.Any, 
    /* index */ scala.Double, 
    /* array */ T, 
    scala.Boolean
  ]
}

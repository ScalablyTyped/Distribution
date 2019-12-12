package typings.sift

import org.scalablytyped.runtime.StringDictionary
import typings.sift.siftMod.ElemMatch
import typings.sift.siftMod.Exec
import typings.sift.siftMod.ExternalQuery
import typings.sift.siftMod.FilterFn
import typings.sift.siftMod.InternalQuery
import typings.sift.siftMod.PluginDefinition
import typings.sift.siftMod.PluginFunction
import typings.sift.siftMod.Query
import typings.sift.siftMod.Sift
import typings.sift.siftMod.SiftQuery
import typings.sift.siftMod.SupportedTypes
import typings.sift.siftMod.WhereFn
import typings.sift.siftNumbers.`-1`
import typings.sift.siftNumbers.`0`
import typings.sift.siftNumbers.`1`
import typings.sift.siftStrings.g
import typings.sift.siftStrings.i
import typings.sift.siftStrings.m
import typings.sift.siftStrings.u
import typings.std.Partial
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sift", JSImport.Namespace)
@js.native
object siftMod extends js.Object {
  @js.native
  trait InternalQuery[T /* <: SupportedTypes */] extends Query[T]
  
  @js.native
  trait Query[T /* <: SupportedTypes */] extends js.Object {
    @JSName("$all")
    var $all: js.UndefOr[
        js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
      ] = js.native
    @JSName("$and")
    var $and: js.UndefOr[
        js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
      ] = js.native
    @JSName("$elemMatch")
    var $elemMatch: js.UndefOr[ExternalQuery[T]] = js.native
    @JSName("$eq")
    var $eq: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ] = js.native
    @JSName("$exists")
    var $exists: js.UndefOr[Boolean] = js.native
    @JSName("$gt")
    var $gt: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ] = js.native
    @JSName("$gte")
    var $gte: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ] = js.native
    @JSName("$in")
    var $in: js.UndefOr[
        js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
      ] = js.native
    @JSName("$lt")
    var $lt: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ] = js.native
    @JSName("$lte")
    var $lte: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ] = js.native
    @JSName("$mod")
    var $mod: js.UndefOr[js.Array[Double]] = js.native
    @JSName("$ne")
    var $ne: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ] = js.native
    @JSName("$nin")
    var $nin: js.UndefOr[
        js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
      ] = js.native
    @JSName("$nor")
    var $nor: js.UndefOr[
        js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
      ] = js.native
    @JSName("$not")
    var $not: js.UndefOr[SiftQuery[T]] = js.native
    @JSName("$options")
    var $options: js.UndefOr[i | g | m | u] = js.native
    @JSName("$or")
    var $or: js.UndefOr[
        js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
      ] = js.native
    @JSName("$regex")
    var $regex: js.UndefOr[RegExp | String] = js.native
    @JSName("$size")
    var $size: js.UndefOr[Double] = js.native
    @JSName("$type")
    var $type: js.UndefOr[js.Any] = js.native
    @JSName("$where")
    var $where: js.UndefOr[String | WhereFn[T]] = js.native
  }
  
  @js.native
  trait Sift extends js.Object {
    def apply[T /* <: js.Array[SupportedTypes] */](query: SiftQuery[T]): FilterFn = js.native
    def apply[T](query: SiftQuery[_], rawSelector: js.Function1[/* item */ T, Boolean]): Exec = js.native
    def apply[T /* <: SupportedTypes */](query: SiftQuery[T], target: T): T = js.native
    def apply[T /* <: SupportedTypes */](query: SiftQuery[T], target: T, rawSelector: js.Any): T = js.native
    def apply[T /* <: SupportedTypes */](query: RegExp, target: T): T = js.native
    def apply[T /* <: SupportedTypes */](query: RegExp, target: T, rawSelector: js.Any): T = js.native
    def compare[T, K](a: T, b: K): `0` | `-1` | `1` = js.native
    def indexOf[T /* <: SupportedTypes */](query: SiftQuery[T], target: T): Double = js.native
    def indexOf[T /* <: SupportedTypes */](query: SiftQuery[T], target: T, rawSelector: js.Any): Double = js.native
    def use[K](plugin: PluginDefinition[K]): Unit = js.native
    def use[K](plugin: PluginFunction[K]): Unit = js.native
  }
  
  val default: Sift = js.native
  type ElemMatch[T /* <: StringDictionary[js.Array[_]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sift.sift.SiftQuery<T[P]>}
    */ typings.sift.siftStrings.ElemMatch with T
  type Exec = js.Function1[/* array */ SupportedTypes, SupportedTypes]
  type ExternalQuery[T /* <: SupportedTypes */] = ElemMatch[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  type FilterFn = js.Function3[
    /* value */ js.Any, 
    /* index */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[js.Any]], 
    Boolean
  ]
  type KeyOrValue[T /* <: SupportedTypes */] = T with (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  type PluginDefinition[T] = StringDictionary[js.Function2[/* a */ T, /* b */ T, Boolean | Double]]
  type PluginFunction[T] = js.Function1[/* sift */ Sift, PluginDefinition[T]]
  type SiftQuery[T /* <: SupportedTypes */] = ExternalQuery[T] with InternalQuery[T]
  type SupportedTypes = js.Array[String | StringDictionary[js.Any] | Double | Null | js.Any]
  type WhereFn[T /* <: SupportedTypes */] = js.ThisFunction3[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ /* this */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ /* value */ js.Any, 
    /* index */ Double, 
    /* array */ T, 
    Boolean
  ]
}


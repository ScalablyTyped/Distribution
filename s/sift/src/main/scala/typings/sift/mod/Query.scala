package typings.sift.mod

import typings.sift.siftStrings.g
import typings.sift.siftStrings.i
import typings.sift.siftStrings.m
import typings.sift.siftStrings.u
import typings.std.Partial
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[T /* <: SupportedTypes */] extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.undefined
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.undefined
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[ExternalQuery[T]] = js.undefined
  @JSName("$eq")
  var $eq: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.undefined
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.undefined
  @JSName("$gt")
  var $gt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.undefined
  @JSName("$gte")
  var $gte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.undefined
  @JSName("$in")
  var $in: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.undefined
  @JSName("$lt")
  var $lt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.undefined
  @JSName("$lte")
  var $lte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.undefined
  @JSName("$mod")
  var $mod: js.UndefOr[js.Array[Double]] = js.undefined
  @JSName("$ne")
  var $ne: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.undefined
  @JSName("$nin")
  var $nin: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.undefined
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.undefined
  @JSName("$not")
  var $not: js.UndefOr[SiftQuery[T]] = js.undefined
  @JSName("$options")
  var $options: js.UndefOr[i | g | m | u] = js.undefined
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.undefined
  @JSName("$regex")
  var $regex: js.UndefOr[RegExp | String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.undefined
  @JSName("$type")
  var $type: js.UndefOr[js.Any] = js.undefined
  @JSName("$where")
  var $where: js.UndefOr[String | WhereFn[T]] = js.undefined
}

object Query {
  @scala.inline
  def apply[T /* <: SupportedTypes */](
    $all: js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ] = null,
    $and: js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ] = null,
    $elemMatch: ExternalQuery[T] = null,
    $eq: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = null,
    $exists: js.UndefOr[Boolean] = js.undefined,
    $gt: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = null,
    $gte: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = null,
    $in: js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ] = null,
    $lt: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = null,
    $lte: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = null,
    $mod: js.Array[Double] = null,
    $ne: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = null,
    $nin: js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ] = null,
    $nor: js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ] = null,
    $not: SiftQuery[T] = null,
    $options: i | g | m | u = null,
    $or: js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ] = null,
    $regex: RegExp | String = null,
    $size: Int | Double = null,
    $type: js.Any = null,
    $where: String | WhereFn[T] = null
  ): Query[T] = {
    val __obj = js.Dynamic.literal()
    if ($all != null) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if ($and != null) __obj.updateDynamic("$and")($and.asInstanceOf[js.Any])
    if ($elemMatch != null) __obj.updateDynamic("$elemMatch")($elemMatch.asInstanceOf[js.Any])
    if ($eq != null) __obj.updateDynamic("$eq")($eq.asInstanceOf[js.Any])
    if (!js.isUndefined($exists)) __obj.updateDynamic("$exists")($exists.asInstanceOf[js.Any])
    if ($gt != null) __obj.updateDynamic("$gt")($gt.asInstanceOf[js.Any])
    if ($gte != null) __obj.updateDynamic("$gte")($gte.asInstanceOf[js.Any])
    if ($in != null) __obj.updateDynamic("$in")($in.asInstanceOf[js.Any])
    if ($lt != null) __obj.updateDynamic("$lt")($lt.asInstanceOf[js.Any])
    if ($lte != null) __obj.updateDynamic("$lte")($lte.asInstanceOf[js.Any])
    if ($mod != null) __obj.updateDynamic("$mod")($mod.asInstanceOf[js.Any])
    if ($ne != null) __obj.updateDynamic("$ne")($ne.asInstanceOf[js.Any])
    if ($nin != null) __obj.updateDynamic("$nin")($nin.asInstanceOf[js.Any])
    if ($nor != null) __obj.updateDynamic("$nor")($nor.asInstanceOf[js.Any])
    if ($not != null) __obj.updateDynamic("$not")($not.asInstanceOf[js.Any])
    if ($options != null) __obj.updateDynamic("$options")($options.asInstanceOf[js.Any])
    if ($or != null) __obj.updateDynamic("$or")($or.asInstanceOf[js.Any])
    if ($regex != null) __obj.updateDynamic("$regex")($regex.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    if ($where != null) __obj.updateDynamic("$where")($where.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[T]]
  }
}


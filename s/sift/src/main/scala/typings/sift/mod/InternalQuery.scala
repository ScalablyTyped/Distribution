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

trait InternalQuery[T /* <: SupportedTypes */] extends Query[T]

object InternalQuery {
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
  ): InternalQuery[T] = {
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
    __obj.asInstanceOf[InternalQuery[T]]
  }
}


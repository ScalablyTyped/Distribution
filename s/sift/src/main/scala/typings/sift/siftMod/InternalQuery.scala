package typings.sift.siftMod

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
      Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $and: js.Array[
      Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $elemMatch: ExternalQuery[T] = null,
    $eq: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $exists: js.UndefOr[Boolean] = js.undefined,
    $gt: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $gte: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $in: js.Array[
      Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $lt: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $lte: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $mod: js.Array[Double] = null,
    $ne: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $nin: js.Array[
      Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $nor: js.Array[
      Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $not: SiftQuery[T] = null,
    $options: i | g | m | u = null,
    $or: js.Array[
      Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $regex: RegExp | String = null,
    $size: Int | Double = null,
    $type: js.Any = null,
    $where: String | WhereFn[T] = null
  ): InternalQuery[T] = {
    val __obj = js.Dynamic.literal()
    if ($all != null) __obj.updateDynamic("$all")($all)
    if ($and != null) __obj.updateDynamic("$and")($and)
    if ($elemMatch != null) __obj.updateDynamic("$elemMatch")($elemMatch)
    if ($eq != null) __obj.updateDynamic("$eq")($eq)
    if (!js.isUndefined($exists)) __obj.updateDynamic("$exists")($exists)
    if ($gt != null) __obj.updateDynamic("$gt")($gt)
    if ($gte != null) __obj.updateDynamic("$gte")($gte)
    if ($in != null) __obj.updateDynamic("$in")($in)
    if ($lt != null) __obj.updateDynamic("$lt")($lt)
    if ($lte != null) __obj.updateDynamic("$lte")($lte)
    if ($mod != null) __obj.updateDynamic("$mod")($mod)
    if ($ne != null) __obj.updateDynamic("$ne")($ne)
    if ($nin != null) __obj.updateDynamic("$nin")($nin)
    if ($nor != null) __obj.updateDynamic("$nor")($nor)
    if ($not != null) __obj.updateDynamic("$not")($not)
    if ($options != null) __obj.updateDynamic("$options")($options.asInstanceOf[js.Any])
    if ($or != null) __obj.updateDynamic("$or")($or)
    if ($regex != null) __obj.updateDynamic("$regex")($regex.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type)
    if ($where != null) __obj.updateDynamic("$where")($where.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalQuery[T]]
  }
}


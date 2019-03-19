package typings
package siftLib.siftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[T /* <: SupportedTypes */] extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[
    js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ]
  ] = js.undefined
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ]
  ] = js.undefined
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[ExternalQuery[T]] = js.undefined
  @JSName("$eq")
  var $eq: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any] = js.undefined
  @JSName("$exists")
  var $exists: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$gt")
  var $gt: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any] = js.undefined
  @JSName("$gte")
  var $gte: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any] = js.undefined
  @JSName("$in")
  var $in: js.UndefOr[
    js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ]
  ] = js.undefined
  @JSName("$lt")
  var $lt: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any] = js.undefined
  @JSName("$lte")
  var $lte: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any] = js.undefined
  @JSName("$mod")
  var $mod: js.UndefOr[js.Array[scala.Double]] = js.undefined
  @JSName("$ne")
  var $ne: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any] = js.undefined
  @JSName("$nin")
  var $nin: js.UndefOr[
    js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ]
  ] = js.undefined
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ]
  ] = js.undefined
  @JSName("$not")
  var $not: js.UndefOr[SiftQuery[T]] = js.undefined
  @JSName("$options")
  var $options: js.UndefOr[
    siftLib.siftLibStrings.i | siftLib.siftLibStrings.g | siftLib.siftLibStrings.m | siftLib.siftLibStrings.u
  ] = js.undefined
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ]
  ] = js.undefined
  @JSName("$regex")
  var $regex: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.undefined
  @JSName("$type")
  var $type: js.UndefOr[js.Any] = js.undefined
  @JSName("$where")
  var $where: js.UndefOr[java.lang.String | WhereFn[T]] = js.undefined
}

object Query {
  @scala.inline
  def apply[T /* <: SupportedTypes */](
    $all: js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $and: js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $elemMatch: ExternalQuery[T] = null,
    $eq: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $exists: js.UndefOr[scala.Boolean] = js.undefined,
    $gt: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $gte: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $in: js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $lt: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $lte: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $mod: js.Array[scala.Double] = null,
    $ne: /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any = null,
    $nin: js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $nor: js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $not: SiftQuery[T] = null,
    $options: siftLib.siftLibStrings.i | siftLib.siftLibStrings.g | siftLib.siftLibStrings.m | siftLib.siftLibStrings.u = null,
    $or: js.Array[
      stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
    ] = null,
    $regex: stdLib.RegExp | java.lang.String = null,
    $size: scala.Int | scala.Double = null,
    $type: js.Any = null,
    $where: java.lang.String | WhereFn[T] = null
  ): Query[T] = {
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
    __obj.asInstanceOf[Query[T]]
  }
}


package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operator symbols to be used when querying data
  */
trait Operators extends js.Object {
  var adjacent: js.Symbol
  var all: js.Symbol
  var and: js.Symbol
  var any: js.Symbol
  var between: js.Symbol
  var col: js.Symbol
  var contained: js.Symbol
  var contains: js.Symbol
  @JSName("eq")
  var eq_FOperators: js.Symbol
  var gt: js.Symbol
  var gte: js.Symbol
  var iLike: js.Symbol
  var iRegexp: js.Symbol
  var in: js.Symbol
  var is: js.Symbol
  var join: js.Symbol
  var like: js.Symbol
  var lt: js.Symbol
  var lte: js.Symbol
  @JSName("ne")
  var ne_FOperators: js.Symbol
  var noExtendLeft: js.Symbol
  var noExtendRight: js.Symbol
  var not: js.Symbol
  var notBetween: js.Symbol
  var notILike: js.Symbol
  var notIRegexp: js.Symbol
  var notIn: js.Symbol
  var notLike: js.Symbol
  var notRegexp: js.Symbol
  var or: js.Symbol
  var overlap: js.Symbol
  var placeholder: js.Symbol
  var raw: js.Symbol
  var regexp: js.Symbol
  var strictLeft: js.Symbol
  var strictRight: js.Symbol
  var values: js.Symbol
}

object Operators {
  @scala.inline
  def apply(
    adjacent: js.Symbol,
    all: js.Symbol,
    and: js.Symbol,
    any: js.Symbol,
    between: js.Symbol,
    col: js.Symbol,
    contained: js.Symbol,
    contains: js.Symbol,
    eq: js.Symbol,
    gt: js.Symbol,
    gte: js.Symbol,
    iLike: js.Symbol,
    iRegexp: js.Symbol,
    in: js.Symbol,
    is: js.Symbol,
    join: js.Symbol,
    like: js.Symbol,
    lt: js.Symbol,
    lte: js.Symbol,
    ne: js.Symbol,
    noExtendLeft: js.Symbol,
    noExtendRight: js.Symbol,
    not: js.Symbol,
    notBetween: js.Symbol,
    notILike: js.Symbol,
    notIRegexp: js.Symbol,
    notIn: js.Symbol,
    notLike: js.Symbol,
    notRegexp: js.Symbol,
    or: js.Symbol,
    overlap: js.Symbol,
    placeholder: js.Symbol,
    raw: js.Symbol,
    regexp: js.Symbol,
    strictLeft: js.Symbol,
    strictRight: js.Symbol,
    values: js.Symbol
  ): Operators = {
    val __obj = js.Dynamic.literal(adjacent = adjacent, all = all, and = and, any = any, between = between, col = col, contained = contained, contains = contains, eq = eq, gt = gt, gte = gte, iLike = iLike, iRegexp = iRegexp, in = in, is = is, join = join, like = like, lt = lt, lte = lte, ne = ne, noExtendLeft = noExtendLeft, noExtendRight = noExtendRight, not = not, notBetween = notBetween, notILike = notILike, notIRegexp = notIRegexp, notIn = notIn, notLike = notLike, notRegexp = notRegexp, or = or, overlap = overlap, placeholder = placeholder, raw = raw, regexp = regexp, strictLeft = strictLeft, strictRight = strictRight, values = values)
  
    __obj.asInstanceOf[Operators]
  }
}


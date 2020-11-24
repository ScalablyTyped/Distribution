package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Operator symbols to be used when querying data
  */
@js.native
trait Operators extends js.Object {
  
  var adjacent: js.Symbol = js.native
  
  var all: js.Symbol = js.native
  
  var and: js.Symbol = js.native
  
  var any: js.Symbol = js.native
  
  var between: js.Symbol = js.native
  
  var col: js.Symbol = js.native
  
  var contained: js.Symbol = js.native
  
  var contains: js.Symbol = js.native
  
  @JSName("eq")
  var eq_FOperators: js.Symbol = js.native
  
  var gt: js.Symbol = js.native
  
  var gte: js.Symbol = js.native
  
  var iLike: js.Symbol = js.native
  
  var iRegexp: js.Symbol = js.native
  
  var in: js.Symbol = js.native
  
  var is: js.Symbol = js.native
  
  var join: js.Symbol = js.native
  
  var like: js.Symbol = js.native
  
  var lt: js.Symbol = js.native
  
  var lte: js.Symbol = js.native
  
  @JSName("ne")
  var ne_FOperators: js.Symbol = js.native
  
  var noExtendLeft: js.Symbol = js.native
  
  var noExtendRight: js.Symbol = js.native
  
  var not: js.Symbol = js.native
  
  var notBetween: js.Symbol = js.native
  
  var notILike: js.Symbol = js.native
  
  var notIRegexp: js.Symbol = js.native
  
  var notIn: js.Symbol = js.native
  
  var notLike: js.Symbol = js.native
  
  var notRegexp: js.Symbol = js.native
  
  var or: js.Symbol = js.native
  
  var overlap: js.Symbol = js.native
  
  var placeholder: js.Symbol = js.native
  
  var raw: js.Symbol = js.native
  
  var regexp: js.Symbol = js.native
  
  var strictLeft: js.Symbol = js.native
  
  var strictRight: js.Symbol = js.native
  
  var values: js.Symbol = js.native
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
    val __obj = js.Dynamic.literal(adjacent = adjacent.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], between = between.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], contained = contained.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], eq = eq.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any], iLike = iLike.asInstanceOf[js.Any], iRegexp = iRegexp.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], noExtendLeft = noExtendLeft.asInstanceOf[js.Any], noExtendRight = noExtendRight.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notBetween = notBetween.asInstanceOf[js.Any], notILike = notILike.asInstanceOf[js.Any], notIRegexp = notIRegexp.asInstanceOf[js.Any], notIn = notIn.asInstanceOf[js.Any], notLike = notLike.asInstanceOf[js.Any], notRegexp = notRegexp.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], overlap = overlap.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], strictLeft = strictLeft.asInstanceOf[js.Any], strictRight = strictRight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operators]
  }
  
  @scala.inline
  implicit class OperatorsOps[Self <: Operators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdjacent(value: js.Symbol): Self = this.set("adjacent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: js.Symbol): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnd(value: js.Symbol): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAny(value: js.Symbol): Self = this.set("any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetween(value: js.Symbol): Self = this.set("between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCol(value: js.Symbol): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContained(value: js.Symbol): Self = this.set("contained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: js.Symbol): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEq(value: js.Symbol): Self = this.set("eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGt(value: js.Symbol): Self = this.set("gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGte(value: js.Symbol): Self = this.set("gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setILike(value: js.Symbol): Self = this.set("iLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIRegexp(value: js.Symbol): Self = this.set("iRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn(value: js.Symbol): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs(value: js.Symbol): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoin(value: js.Symbol): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike(value: js.Symbol): Self = this.set("like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLt(value: js.Symbol): Self = this.set("lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLte(value: js.Symbol): Self = this.set("lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNe(value: js.Symbol): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoExtendLeft(value: js.Symbol): Self = this.set("noExtendLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoExtendRight(value: js.Symbol): Self = this.set("noExtendRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot(value: js.Symbol): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBetween(value: js.Symbol): Self = this.set("notBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotILike(value: js.Symbol): Self = this.set("notILike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotIRegexp(value: js.Symbol): Self = this.set("notIRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotIn(value: js.Symbol): Self = this.set("notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotLike(value: js.Symbol): Self = this.set("notLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotRegexp(value: js.Symbol): Self = this.set("notRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOr(value: js.Symbol): Self = this.set("or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlap(value: js.Symbol): Self = this.set("overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: js.Symbol): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: js.Symbol): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexp(value: js.Symbol): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictLeft(value: js.Symbol): Self = this.set("strictLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictRight(value: js.Symbol): Self = this.set("strictRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Symbol): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}

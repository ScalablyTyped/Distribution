package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Operator symbols to be used when querying data
  */
trait Operators extends StObject {
  
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
  
  inline def apply(
    adjacent: js.Symbol,
    all: js.Symbol,
    and: js.Symbol,
    any: js.Symbol,
    between: js.Symbol,
    col: js.Symbol,
    contained: js.Symbol,
    contains: js.Symbol,
    eq_ : js.Symbol,
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
    ne_ : js.Symbol,
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
    val __obj = js.Dynamic.literal(adjacent = adjacent.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], between = between.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], contained = contained.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any], iLike = iLike.asInstanceOf[js.Any], iRegexp = iRegexp.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any], noExtendLeft = noExtendLeft.asInstanceOf[js.Any], noExtendRight = noExtendRight.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notBetween = notBetween.asInstanceOf[js.Any], notILike = notILike.asInstanceOf[js.Any], notIRegexp = notIRegexp.asInstanceOf[js.Any], notIn = notIn.asInstanceOf[js.Any], notLike = notLike.asInstanceOf[js.Any], notRegexp = notRegexp.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], overlap = overlap.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], strictLeft = strictLeft.asInstanceOf[js.Any], strictRight = strictRight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("eq")(eq_.asInstanceOf[js.Any])
    __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operators]
  }
  
  extension [Self <: Operators](x: Self) {
    
    inline def setAdjacent(value: js.Symbol): Self = StObject.set(x, "adjacent", value.asInstanceOf[js.Any])
    
    inline def setAll(value: js.Symbol): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAnd(value: js.Symbol): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAny(value: js.Symbol): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setBetween(value: js.Symbol): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setCol(value: js.Symbol): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setContained(value: js.Symbol): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
    
    inline def setContains(value: js.Symbol): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setEq_(value: js.Symbol): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setGt(value: js.Symbol): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGte(value: js.Symbol): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setILike(value: js.Symbol): Self = StObject.set(x, "iLike", value.asInstanceOf[js.Any])
    
    inline def setIRegexp(value: js.Symbol): Self = StObject.set(x, "iRegexp", value.asInstanceOf[js.Any])
    
    inline def setIn(value: js.Symbol): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setIs(value: js.Symbol): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setJoin(value: js.Symbol): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setLike(value: js.Symbol): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
    
    inline def setLt(value: js.Symbol): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLte(value: js.Symbol): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setNe_(value: js.Symbol): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
    
    inline def setNoExtendLeft(value: js.Symbol): Self = StObject.set(x, "noExtendLeft", value.asInstanceOf[js.Any])
    
    inline def setNoExtendRight(value: js.Symbol): Self = StObject.set(x, "noExtendRight", value.asInstanceOf[js.Any])
    
    inline def setNot(value: js.Symbol): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotBetween(value: js.Symbol): Self = StObject.set(x, "notBetween", value.asInstanceOf[js.Any])
    
    inline def setNotILike(value: js.Symbol): Self = StObject.set(x, "notILike", value.asInstanceOf[js.Any])
    
    inline def setNotIRegexp(value: js.Symbol): Self = StObject.set(x, "notIRegexp", value.asInstanceOf[js.Any])
    
    inline def setNotIn(value: js.Symbol): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    inline def setNotLike(value: js.Symbol): Self = StObject.set(x, "notLike", value.asInstanceOf[js.Any])
    
    inline def setNotRegexp(value: js.Symbol): Self = StObject.set(x, "notRegexp", value.asInstanceOf[js.Any])
    
    inline def setOr(value: js.Symbol): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOverlap(value: js.Symbol): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: js.Symbol): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: js.Symbol): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRegexp(value: js.Symbol): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setStrictLeft(value: js.Symbol): Self = StObject.set(x, "strictLeft", value.asInstanceOf[js.Any])
    
    inline def setStrictRight(value: js.Symbol): Self = StObject.set(x, "strictRight", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Symbol): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}

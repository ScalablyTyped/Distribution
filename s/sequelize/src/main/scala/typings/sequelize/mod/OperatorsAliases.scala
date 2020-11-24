package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{[key: string] : symbol,   $eq :symbol,   $ne :symbol,   $gte :symbol,   $gt :symbol,   $lte :symbol,   $lt :symbol,   $not :symbol,   $in :symbol,   $notIn :symbol,   $is :symbol,   $like :symbol,   $notLike :symbol,   $iLike :symbol,   $notILike :symbol,   $regexp :symbol,   $notRegexp :symbol,   $iRegexp :symbol,   $notIRegexp :symbol,   $between :symbol,   $notBetween :symbol,   $overlap :symbol,   $contains :symbol,   $contained :symbol,   $adjacent :symbol,   $strictLeft :symbol,   $strictRight :symbol,   $noExtendRight :symbol,   $noExtendLeft :symbol,   $and :symbol,   $or :symbol,   $any :symbol,   $all :symbol,   $values :symbol,   $col :symbol,   $raw :symbol}> */
@js.native
trait OperatorsAliases extends js.Object {
  
  @JSName("$adjacent")
  var $adjacent: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$all")
  var $all: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$and")
  var $and: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$any")
  var $any: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$between")
  var $between: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$col")
  var $col: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$contained")
  var $contained: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$contains")
  var $contains: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$eq")
  var $eq: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$gt")
  var $gt: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$gte")
  var $gte: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$iLike")
  var $iLike: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$iRegexp")
  var $iRegexp: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$in")
  var $in: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$is")
  var $is: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$like")
  var $like: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$lt")
  var $lt: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$lte")
  var $lte: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$ne")
  var $ne: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$noExtendLeft")
  var $noExtendLeft: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$noExtendRight")
  var $noExtendRight: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$not")
  var $not: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$notBetween")
  var $notBetween: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$notILike")
  var $notILike: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$notIRegexp")
  var $notIRegexp: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$notIn")
  var $notIn: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$notLike")
  var $notLike: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$notRegexp")
  var $notRegexp: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$or")
  var $or: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$overlap")
  var $overlap: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$raw")
  var $raw: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$regexp")
  var $regexp: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$strictLeft")
  var $strictLeft: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$strictRight")
  var $strictRight: js.UndefOr[js.Symbol] = js.native
  
  @JSName("$values")
  var $values: js.UndefOr[js.Symbol] = js.native
}
object OperatorsAliases {
  
  @scala.inline
  def apply(): OperatorsAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatorsAliases]
  }
  
  @scala.inline
  implicit class OperatorsAliasesOps[Self <: OperatorsAliases] (val x: Self) extends AnyVal {
    
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
    def set$adjacent(value: js.Symbol): Self = this.set("$adjacent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$adjacent: Self = this.set("$adjacent", js.undefined)
    
    @scala.inline
    def set$all(value: js.Symbol): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def set$and(value: js.Symbol): Self = this.set("$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$and: Self = this.set("$and", js.undefined)
    
    @scala.inline
    def set$any(value: js.Symbol): Self = this.set("$any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$any: Self = this.set("$any", js.undefined)
    
    @scala.inline
    def set$between(value: js.Symbol): Self = this.set("$between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$between: Self = this.set("$between", js.undefined)
    
    @scala.inline
    def set$col(value: js.Symbol): Self = this.set("$col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$col: Self = this.set("$col", js.undefined)
    
    @scala.inline
    def set$contained(value: js.Symbol): Self = this.set("$contained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$contained: Self = this.set("$contained", js.undefined)
    
    @scala.inline
    def set$contains(value: js.Symbol): Self = this.set("$contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$contains: Self = this.set("$contains", js.undefined)
    
    @scala.inline
    def set$eq(value: js.Symbol): Self = this.set("$eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$eq: Self = this.set("$eq", js.undefined)
    
    @scala.inline
    def set$gt(value: js.Symbol): Self = this.set("$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gt: Self = this.set("$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: js.Symbol): Self = this.set("$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gte: Self = this.set("$gte", js.undefined)
    
    @scala.inline
    def set$iLike(value: js.Symbol): Self = this.set("$iLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$iLike: Self = this.set("$iLike", js.undefined)
    
    @scala.inline
    def set$iRegexp(value: js.Symbol): Self = this.set("$iRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$iRegexp: Self = this.set("$iRegexp", js.undefined)
    
    @scala.inline
    def set$in(value: js.Symbol): Self = this.set("$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$in: Self = this.set("$in", js.undefined)
    
    @scala.inline
    def set$is(value: js.Symbol): Self = this.set("$is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$is: Self = this.set("$is", js.undefined)
    
    @scala.inline
    def set$like(value: js.Symbol): Self = this.set("$like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$like: Self = this.set("$like", js.undefined)
    
    @scala.inline
    def set$lt(value: js.Symbol): Self = this.set("$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lt: Self = this.set("$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: js.Symbol): Self = this.set("$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lte: Self = this.set("$lte", js.undefined)
    
    @scala.inline
    def set$ne(value: js.Symbol): Self = this.set("$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ne: Self = this.set("$ne", js.undefined)
    
    @scala.inline
    def set$noExtendLeft(value: js.Symbol): Self = this.set("$noExtendLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$noExtendLeft: Self = this.set("$noExtendLeft", js.undefined)
    
    @scala.inline
    def set$noExtendRight(value: js.Symbol): Self = this.set("$noExtendRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$noExtendRight: Self = this.set("$noExtendRight", js.undefined)
    
    @scala.inline
    def set$not(value: js.Symbol): Self = this.set("$not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$not: Self = this.set("$not", js.undefined)
    
    @scala.inline
    def set$notBetween(value: js.Symbol): Self = this.set("$notBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notBetween: Self = this.set("$notBetween", js.undefined)
    
    @scala.inline
    def set$notILike(value: js.Symbol): Self = this.set("$notILike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notILike: Self = this.set("$notILike", js.undefined)
    
    @scala.inline
    def set$notIRegexp(value: js.Symbol): Self = this.set("$notIRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notIRegexp: Self = this.set("$notIRegexp", js.undefined)
    
    @scala.inline
    def set$notIn(value: js.Symbol): Self = this.set("$notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notIn: Self = this.set("$notIn", js.undefined)
    
    @scala.inline
    def set$notLike(value: js.Symbol): Self = this.set("$notLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notLike: Self = this.set("$notLike", js.undefined)
    
    @scala.inline
    def set$notRegexp(value: js.Symbol): Self = this.set("$notRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notRegexp: Self = this.set("$notRegexp", js.undefined)
    
    @scala.inline
    def set$or(value: js.Symbol): Self = this.set("$or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$or: Self = this.set("$or", js.undefined)
    
    @scala.inline
    def set$overlap(value: js.Symbol): Self = this.set("$overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$overlap: Self = this.set("$overlap", js.undefined)
    
    @scala.inline
    def set$raw(value: js.Symbol): Self = this.set("$raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$raw: Self = this.set("$raw", js.undefined)
    
    @scala.inline
    def set$regexp(value: js.Symbol): Self = this.set("$regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$regexp: Self = this.set("$regexp", js.undefined)
    
    @scala.inline
    def set$strictLeft(value: js.Symbol): Self = this.set("$strictLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$strictLeft: Self = this.set("$strictLeft", js.undefined)
    
    @scala.inline
    def set$strictRight(value: js.Symbol): Self = this.set("$strictRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$strictRight: Self = this.set("$strictRight", js.undefined)
    
    @scala.inline
    def set$values(value: js.Symbol): Self = this.set("$values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$values: Self = this.set("$values", js.undefined)
  }
}

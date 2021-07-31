package typings.sequelize.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logic of where statement
  */
/* Inlined std.Partial<{  $ne :string | number | sequelize.sequelize.WhereLogic,   $in :std.Array<string | number> | sequelize.sequelize.literal,   $not :boolean | string | number | sequelize.sequelize.AnyWhereOptions,   $notIn :std.Array<string | number> | sequelize.sequelize.literal,   $gte :number | string | std.Date,   $gt :number | string | std.Date,   $lte :number | string | std.Date,   $lt :number | string | std.Date,   $like :string | sequelize.sequelize.WherePGStatement,   $iLike :string | sequelize.sequelize.WherePGStatement,   $ilike :string | sequelize.sequelize.WherePGStatement,   $notLike :string | sequelize.sequelize.WherePGStatement,   $notILike :string | sequelize.sequelize.WherePGStatement,   $between :[number, number] | [std.Date, std.Date],   .. :[number, number] | [string, string],   $notBetween :[number, number],   !.. :[number, number] | [string, string],   $overlap :[number, number] | [string, string],   && :[number, number],   $contains :any,   @> :any,   $contained :any,   <@ :any}> */
trait WhereLogic extends StObject {
  
  @JSName("$between")
  var $between: js.UndefOr[js.Tuple2[Date | Double, Date | Double]] = js.undefined
  
  @JSName("$contained")
  var $contained: js.UndefOr[js.Any] = js.undefined
  
  @JSName("$contains")
  var $contains: js.UndefOr[js.Any] = js.undefined
  
  @JSName("$gt")
  var $gt: js.UndefOr[Double | String | Date] = js.undefined
  
  @JSName("$gte")
  var $gte: js.UndefOr[Double | String | Date] = js.undefined
  
  @JSName("$iLike")
  var $iLike: js.UndefOr[String | WherePGStatement] = js.undefined
  
  @JSName("$ilike")
  var $ilike: js.UndefOr[String | WherePGStatement] = js.undefined
  
  @JSName("$in")
  var $in: js.UndefOr[(js.Array[String | Double]) | literal] = js.undefined
  
  @JSName("$like")
  var $like: js.UndefOr[String | WherePGStatement] = js.undefined
  
  @JSName("$lt")
  var $lt: js.UndefOr[Double | String | Date] = js.undefined
  
  @JSName("$lte")
  var $lte: js.UndefOr[Double | String | Date] = js.undefined
  
  @JSName("$ne")
  var $ne: js.UndefOr[String | Double | WhereLogic] = js.undefined
  
  @JSName("$not")
  var $not: js.UndefOr[Boolean | String | Double | AnyWhereOptions] = js.undefined
  
  @JSName("$notBetween")
  var $notBetween: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  @JSName("$notILike")
  var $notILike: js.UndefOr[String | WherePGStatement] = js.undefined
  
  @JSName("$notIn")
  var $notIn: js.UndefOr[(js.Array[String | Double]) | literal] = js.undefined
  
  @JSName("$notLike")
  var $notLike: js.UndefOr[String | WherePGStatement] = js.undefined
  
  @JSName("$overlap")
  var $overlap: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
  
  @JSName("@>")
  var `@Greaterthansign`: js.UndefOr[js.Any] = js.undefined
  
  @JSName("&&")
  var AmpersandAmpersand: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  @JSName("..")
  var DotDot: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
  
  @JSName("!..")
  var ExclamationmarkDotDot: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
  
  @JSName("<@")
  var `Lessthansign@`: js.UndefOr[js.Any] = js.undefined
}
object WhereLogic {
  
  @scala.inline
  def apply(): WhereLogic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhereLogic]
  }
  
  @scala.inline
  implicit class WhereLogicMutableBuilder[Self <: WhereLogic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$between(value: js.Tuple2[Date | Double, Date | Double]): Self = StObject.set(x, "$between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$betweenUndefined: Self = StObject.set(x, "$between", js.undefined)
    
    @scala.inline
    def set$contained(value: js.Any): Self = StObject.set(x, "$contained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$containedUndefined: Self = StObject.set(x, "$contained", js.undefined)
    
    @scala.inline
    def set$contains(value: js.Any): Self = StObject.set(x, "$contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$containsUndefined: Self = StObject.set(x, "$contains", js.undefined)
    
    @scala.inline
    def set$gt(value: Double | String | Date): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: Double | String | Date): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
    
    @scala.inline
    def set$iLike(value: String | WherePGStatement): Self = StObject.set(x, "$iLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$iLikeUndefined: Self = StObject.set(x, "$iLike", js.undefined)
    
    @scala.inline
    def set$in(value: (js.Array[String | Double]) | literal): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
    
    @scala.inline
    def set$inVarargs(value: (String | Double)*): Self = StObject.set(x, "$in", js.Array(value :_*))
    
    @scala.inline
    def set$like(value: String | WherePGStatement): Self = StObject.set(x, "$like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$likeUndefined: Self = StObject.set(x, "$like", js.undefined)
    
    @scala.inline
    def set$lt(value: Double | String | Date): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: Double | String | Date): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
    
    @scala.inline
    def set$ne(value: String | Double | WhereLogic): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
    
    @scala.inline
    def set$not(value: Boolean | String | Double | AnyWhereOptions): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$notBetween(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "$notBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$notBetweenUndefined: Self = StObject.set(x, "$notBetween", js.undefined)
    
    @scala.inline
    def set$notILike(value: String | WherePGStatement): Self = StObject.set(x, "$notILike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$notILikeUndefined: Self = StObject.set(x, "$notILike", js.undefined)
    
    @scala.inline
    def set$notIn(value: (js.Array[String | Double]) | literal): Self = StObject.set(x, "$notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$notInUndefined: Self = StObject.set(x, "$notIn", js.undefined)
    
    @scala.inline
    def set$notInVarargs(value: (String | Double)*): Self = StObject.set(x, "$notIn", js.Array(value :_*))
    
    @scala.inline
    def set$notLike(value: String | WherePGStatement): Self = StObject.set(x, "$notLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$notLikeUndefined: Self = StObject.set(x, "$notLike", js.undefined)
    
    @scala.inline
    def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
    
    @scala.inline
    def set$overlap(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "$overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$overlapUndefined: Self = StObject.set(x, "$overlap", js.undefined)
    
    @scala.inline
    def `set@Greaterthansign`(value: js.Any): Self = StObject.set(x, "@>", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@GreaterthansignUndefined`: Self = StObject.set(x, "@>", js.undefined)
    
    @scala.inline
    def setAmpersandAmpersand(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "&&", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpersandAmpersandUndefined: Self = StObject.set(x, "&&", js.undefined)
    
    @scala.inline
    def setDotDot(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "..", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotDotUndefined: Self = StObject.set(x, "..", js.undefined)
    
    @scala.inline
    def setExclamationmarkDotDot(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "!..", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclamationmarkDotDotUndefined: Self = StObject.set(x, "!..", js.undefined)
    
    @scala.inline
    def `setLessthansign@`(value: js.Any): Self = StObject.set(x, "<@", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLessthansign@Undefined`: Self = StObject.set(x, "<@", js.undefined)
  }
}

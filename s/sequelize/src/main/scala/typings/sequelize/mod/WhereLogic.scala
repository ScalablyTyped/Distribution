package typings.sequelize.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logic of where statement
  */
/* Inlined std.Partial<{  $ne :string | number | sequelize.sequelize.WhereLogic,   $in :std.Array<string | number> | sequelize.sequelize.literal,   $not :boolean | string | number | sequelize.sequelize.AnyWhereOptions,   $notIn :std.Array<string | number> | sequelize.sequelize.literal,   $gte :number | string | std.Date,   $gt :number | string | std.Date,   $lte :number | string | std.Date,   $lt :number | string | std.Date,   $like :string | sequelize.sequelize.WherePGStatement,   $iLike :string | sequelize.sequelize.WherePGStatement,   $ilike :string | sequelize.sequelize.WherePGStatement,   $notLike :string | sequelize.sequelize.WherePGStatement,   $notILike :string | sequelize.sequelize.WherePGStatement,   $between :[number, number] | [std.Date, std.Date],   .. :[number, number] | [string, string],   $notBetween :[number, number],   !.. :[number, number] | [string, string],   $overlap :[number, number] | [string, string],   && :[number, number],   $contains :any,   @> :any,   $contained :any,   <@ :any}> */
@js.native
trait WhereLogic extends js.Object {
  
  @JSName("$between")
  var $between: js.UndefOr[js.Tuple2[Date | Double, Date | Double]] = js.native
  
  @JSName("$contained")
  var $contained: js.UndefOr[js.Any] = js.native
  
  @JSName("$contains")
  var $contains: js.UndefOr[js.Any] = js.native
  
  @JSName("$gt")
  var $gt: js.UndefOr[Double | String | Date] = js.native
  
  @JSName("$gte")
  var $gte: js.UndefOr[Double | String | Date] = js.native
  
  @JSName("$iLike")
  var $iLike: js.UndefOr[String | WherePGStatement] = js.native
  
  @JSName("$ilike")
  var $ilike: js.UndefOr[String | WherePGStatement] = js.native
  
  @JSName("$in")
  var $in: js.UndefOr[(js.Array[String | Double]) | literal] = js.native
  
  @JSName("$like")
  var $like: js.UndefOr[String | WherePGStatement] = js.native
  
  @JSName("$lt")
  var $lt: js.UndefOr[Double | String | Date] = js.native
  
  @JSName("$lte")
  var $lte: js.UndefOr[Double | String | Date] = js.native
  
  @JSName("$ne")
  var $ne: js.UndefOr[String | Double | WhereLogic] = js.native
  
  @JSName("$not")
  var $not: js.UndefOr[Boolean | String | Double | AnyWhereOptions] = js.native
  
  @JSName("$notBetween")
  var $notBetween: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  @JSName("$notILike")
  var $notILike: js.UndefOr[String | WherePGStatement] = js.native
  
  @JSName("$notIn")
  var $notIn: js.UndefOr[(js.Array[String | Double]) | literal] = js.native
  
  @JSName("$notLike")
  var $notLike: js.UndefOr[String | WherePGStatement] = js.native
  
  @JSName("$overlap")
  var $overlap: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  
  @JSName("@>")
  var `@Greaterthansign`: js.UndefOr[js.Any] = js.native
  
  @JSName("&&")
  var AmpersandAmpersand: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  @JSName("..")
  var DotDot: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  
  @JSName("!..")
  var ExclamationmarkDotDot: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  
  @JSName("<@")
  var `Lessthansign@`: js.UndefOr[js.Any] = js.native
}
object WhereLogic {
  
  @scala.inline
  def apply(): WhereLogic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhereLogic]
  }
  
  @scala.inline
  implicit class WhereLogicOps[Self <: WhereLogic] (val x: Self) extends AnyVal {
    
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
    def set$between(value: js.Tuple2[Date | Double, Date | Double]): Self = this.set("$between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$between: Self = this.set("$between", js.undefined)
    
    @scala.inline
    def set$contained(value: js.Any): Self = this.set("$contained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$contained: Self = this.set("$contained", js.undefined)
    
    @scala.inline
    def set$contains(value: js.Any): Self = this.set("$contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$contains: Self = this.set("$contains", js.undefined)
    
    @scala.inline
    def set$gt(value: Double | String | Date): Self = this.set("$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gt: Self = this.set("$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: Double | String | Date): Self = this.set("$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gte: Self = this.set("$gte", js.undefined)
    
    @scala.inline
    def set$iLike(value: String | WherePGStatement): Self = this.set("$iLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$iLike: Self = this.set("$iLike", js.undefined)
    
    @scala.inline
    def set$inVarargs(value: (String | Double)*): Self = this.set("$in", js.Array(value :_*))
    
    @scala.inline
    def set$in(value: (js.Array[String | Double]) | literal): Self = this.set("$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$in: Self = this.set("$in", js.undefined)
    
    @scala.inline
    def set$like(value: String | WherePGStatement): Self = this.set("$like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$like: Self = this.set("$like", js.undefined)
    
    @scala.inline
    def set$lt(value: Double | String | Date): Self = this.set("$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lt: Self = this.set("$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: Double | String | Date): Self = this.set("$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lte: Self = this.set("$lte", js.undefined)
    
    @scala.inline
    def set$ne(value: String | Double | WhereLogic): Self = this.set("$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ne: Self = this.set("$ne", js.undefined)
    
    @scala.inline
    def set$not(value: Boolean | String | Double | AnyWhereOptions): Self = this.set("$not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$not: Self = this.set("$not", js.undefined)
    
    @scala.inline
    def set$notBetween(value: js.Tuple2[Double, Double]): Self = this.set("$notBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notBetween: Self = this.set("$notBetween", js.undefined)
    
    @scala.inline
    def set$notILike(value: String | WherePGStatement): Self = this.set("$notILike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notILike: Self = this.set("$notILike", js.undefined)
    
    @scala.inline
    def set$notInVarargs(value: (String | Double)*): Self = this.set("$notIn", js.Array(value :_*))
    
    @scala.inline
    def set$notIn(value: (js.Array[String | Double]) | literal): Self = this.set("$notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notIn: Self = this.set("$notIn", js.undefined)
    
    @scala.inline
    def set$notLike(value: String | WherePGStatement): Self = this.set("$notLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$notLike: Self = this.set("$notLike", js.undefined)
    
    @scala.inline
    def set$overlap(value: js.Tuple2[Double | String, Double | String]): Self = this.set("$overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$overlap: Self = this.set("$overlap", js.undefined)
    
    @scala.inline
    def `set@Greaterthansign`(value: js.Any): Self = this.set("@>", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete@Greaterthansign`: Self = this.set("@>", js.undefined)
    
    @scala.inline
    def setAmpersandAmpersand(value: js.Tuple2[Double, Double]): Self = this.set("&&", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpersandAmpersand: Self = this.set("&&", js.undefined)
    
    @scala.inline
    def setDotDot(value: js.Tuple2[Double | String, Double | String]): Self = this.set("..", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotDot: Self = this.set("..", js.undefined)
    
    @scala.inline
    def setExclamationmarkDotDot(value: js.Tuple2[Double | String, Double | String]): Self = this.set("!..", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclamationmarkDotDot: Self = this.set("!..", js.undefined)
    
    @scala.inline
    def `setLessthansign@`(value: js.Any): Self = this.set("<@", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLessthansign@`: Self = this.set("<@", js.undefined)
  }
}

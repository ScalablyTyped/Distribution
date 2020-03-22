package typings.sequelize.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logic of where statement
  */
/* Inlined std.Partial<{  $ne  :string | number | sequelize.sequelize.WhereLogic,   $in  :std.Array<string | number> | sequelize.sequelize.literal,   $not  :boolean | string | number | sequelize.sequelize.AnyWhereOptions,   $notIn  :std.Array<string | number> | sequelize.sequelize.literal,   $gte  :number | string | std.Date,   $gt  :number | string | std.Date,   $lte  :number | string | std.Date,   $lt  :number | string | std.Date,   $like  :string | sequelize.sequelize.WherePGStatement,   $iLike  :string | sequelize.sequelize.WherePGStatement,   $ilike  :string | sequelize.sequelize.WherePGStatement,   $notLike  :string | sequelize.sequelize.WherePGStatement,   $notILike  :string | sequelize.sequelize.WherePGStatement,   $between  :[number, number] | [std.Date, std.Date],   ..  :[number, number] | [string, string],   $notBetween  :[number, number],   !..  :[number, number] | [string, string],   $overlap  :[number, number] | [string, string],   &&  :[number, number],   $contains  :any,   @>  :any,   $contained  :any,   <@  :any}> */
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


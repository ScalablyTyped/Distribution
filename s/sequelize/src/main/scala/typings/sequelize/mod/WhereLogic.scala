package typings.sequelize.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logic of where statement
  */
/* Inlined std.Partial<{  $ne  :string | number | sequelize.sequelize.WhereLogic,   $in  :std.Array<string | number> | sequelize.sequelize.literal,   $not  :boolean | string | number | sequelize.sequelize.AnyWhereOptions,   $notIn  :std.Array<string | number> | sequelize.sequelize.literal,   $gte  :number | string | std.Date,   $gt  :number | string | std.Date,   $lte  :number | string | std.Date,   $lt  :number | string | std.Date,   $like  :string | sequelize.sequelize.WherePGStatement,   $iLike  :string | sequelize.sequelize.WherePGStatement,   $ilike  :string | sequelize.sequelize.WherePGStatement,   $notLike  :string | sequelize.sequelize.WherePGStatement,   $notILike  :string | sequelize.sequelize.WherePGStatement,   $between  :[number, number] | [std.Date, std.Date],   ..  :[number, number] | [string, string],   $notBetween  :[number, number],   !..  :[number, number] | [string, string],   $overlap  :[number, number] | [string, string],   &&  :[number, number],   $contains  :any,   @>  :any,   $contained  :any,   <@  :any}> */
trait WhereLogic extends js.Object {
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
  def apply(
    $between: js.Tuple2[Date | Double, Date | Double] = null,
    $contained: js.Any = null,
    $contains: js.Any = null,
    $gt: Double | String | Date = null,
    $gte: Double | String | Date = null,
    $iLike: String | WherePGStatement = null,
    $ilike: String | WherePGStatement = null,
    $in: (js.Array[String | Double]) | literal = null,
    $like: String | WherePGStatement = null,
    $lt: Double | String | Date = null,
    $lte: Double | String | Date = null,
    $ne: String | Double | WhereLogic = null,
    $not: Boolean | String | Double | AnyWhereOptions = null,
    $notBetween: js.Tuple2[Double, Double] = null,
    $notILike: String | WherePGStatement = null,
    $notIn: (js.Array[String | Double]) | literal = null,
    $notLike: String | WherePGStatement = null,
    $overlap: js.Tuple2[Double | String, Double | String] = null,
    `@Greaterthansign`: js.Any = null,
    AmpersandAmpersand: js.Tuple2[Double, Double] = null,
    DotDot: js.Tuple2[Double | String, Double | String] = null,
    ExclamationmarkDotDot: js.Tuple2[Double | String, Double | String] = null,
    `Lessthansign@`: js.Any = null
  ): WhereLogic = {
    val __obj = js.Dynamic.literal()
    if ($between != null) __obj.updateDynamic("$between")($between.asInstanceOf[js.Any])
    if ($contained != null) __obj.updateDynamic("$contained")($contained.asInstanceOf[js.Any])
    if ($contains != null) __obj.updateDynamic("$contains")($contains.asInstanceOf[js.Any])
    if ($gt != null) __obj.updateDynamic("$gt")($gt.asInstanceOf[js.Any])
    if ($gte != null) __obj.updateDynamic("$gte")($gte.asInstanceOf[js.Any])
    if ($iLike != null) __obj.updateDynamic("$iLike")($iLike.asInstanceOf[js.Any])
    if ($ilike != null) __obj.updateDynamic("$ilike")($ilike.asInstanceOf[js.Any])
    if ($in != null) __obj.updateDynamic("$in")($in.asInstanceOf[js.Any])
    if ($like != null) __obj.updateDynamic("$like")($like.asInstanceOf[js.Any])
    if ($lt != null) __obj.updateDynamic("$lt")($lt.asInstanceOf[js.Any])
    if ($lte != null) __obj.updateDynamic("$lte")($lte.asInstanceOf[js.Any])
    if ($ne != null) __obj.updateDynamic("$ne")($ne.asInstanceOf[js.Any])
    if ($not != null) __obj.updateDynamic("$not")($not.asInstanceOf[js.Any])
    if ($notBetween != null) __obj.updateDynamic("$notBetween")($notBetween.asInstanceOf[js.Any])
    if ($notILike != null) __obj.updateDynamic("$notILike")($notILike.asInstanceOf[js.Any])
    if ($notIn != null) __obj.updateDynamic("$notIn")($notIn.asInstanceOf[js.Any])
    if ($notLike != null) __obj.updateDynamic("$notLike")($notLike.asInstanceOf[js.Any])
    if ($overlap != null) __obj.updateDynamic("$overlap")($overlap.asInstanceOf[js.Any])
    if (`@Greaterthansign` != null) __obj.updateDynamic("@>")(`@Greaterthansign`.asInstanceOf[js.Any])
    if (AmpersandAmpersand != null) __obj.updateDynamic("&&")(AmpersandAmpersand.asInstanceOf[js.Any])
    if (DotDot != null) __obj.updateDynamic("..")(DotDot.asInstanceOf[js.Any])
    if (ExclamationmarkDotDot != null) __obj.updateDynamic("!..")(ExclamationmarkDotDot.asInstanceOf[js.Any])
    if (`Lessthansign@` != null) __obj.updateDynamic("<@")(`Lessthansign@`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereLogic]
  }
}


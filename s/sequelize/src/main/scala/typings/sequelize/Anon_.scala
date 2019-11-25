package typings.sequelize

import typings.sequelize.sequelizeMod.AnyWhereOptions
import typings.sequelize.sequelizeMod.WherePGStatement
import typings.sequelize.sequelizeMod.literal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var `!..`: js.Tuple2[Double | String, Double | String]
  @JSName("$between")
  var $between: js.Tuple2[Date | Double, Date | Double]
  @JSName("$contained")
  var $contained: js.Any
  @JSName("$contains")
  var $contains: js.Any
  @JSName("$gt")
  var $gt: Double | String | Date
  @JSName("$gte")
  var $gte: Double | String | Date
  @JSName("$iLike")
  var $iLike: String | WherePGStatement
  @JSName("$ilike")
  var $ilike: String | WherePGStatement
  @JSName("$in")
  var $in: (js.Array[String | Double]) | literal
  @JSName("$like")
  var $like: String | WherePGStatement
  @JSName("$lt")
  var $lt: Double | String | Date
  @JSName("$lte")
  var $lte: Double | String | Date
  @JSName("$ne")
  var $ne: String | Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias sequelize.sequelize.WhereLogic */ js.Object)
  @JSName("$not")
  var $not: Boolean | String | Double | AnyWhereOptions
  @JSName("$notBetween")
  var $notBetween: js.Tuple2[Double, Double]
  @JSName("$notILike")
  var $notILike: String | WherePGStatement
  @JSName("$notIn")
  var $notIn: (js.Array[String | Double]) | literal
  @JSName("$notLike")
  var $notLike: String | WherePGStatement
  @JSName("$overlap")
  var $overlap: js.Tuple2[Double | String, Double | String]
  var `&&`: js.Tuple2[Double, Double]
  var `..`: js.Tuple2[Double | String, Double | String]
  var `<@`: js.Any
  var `@>`: js.Any
}

object Anon_ {
  @scala.inline
  def apply(
    `!..`: js.Tuple2[Double | String, Double | String],
    $between: js.Tuple2[Date | Double, Date | Double],
    $contained: js.Any,
    $contains: js.Any,
    $gt: Double | String | Date,
    $gte: Double | String | Date,
    $iLike: String | WherePGStatement,
    $ilike: String | WherePGStatement,
    $in: (js.Array[String | Double]) | literal,
    $like: String | WherePGStatement,
    $lt: Double | String | Date,
    $lte: Double | String | Date,
    $ne: String | Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias sequelize.sequelize.WhereLogic */ js.Object),
    $not: Boolean | String | Double | AnyWhereOptions,
    $notBetween: js.Tuple2[Double, Double],
    $notILike: String | WherePGStatement,
    $notIn: (js.Array[String | Double]) | literal,
    $notLike: String | WherePGStatement,
    $overlap: js.Tuple2[Double | String, Double | String],
    `&&`: js.Tuple2[Double, Double],
    `..`: js.Tuple2[Double | String, Double | String],
    `<@`: js.Any,
    `@>`: js.Any
  ): Anon_ = {
    val __obj = js.Dynamic.literal($between = $between.asInstanceOf[js.Any], $contained = $contained.asInstanceOf[js.Any], $contains = $contains.asInstanceOf[js.Any], $gt = $gt.asInstanceOf[js.Any], $gte = $gte.asInstanceOf[js.Any], $iLike = $iLike.asInstanceOf[js.Any], $ilike = $ilike.asInstanceOf[js.Any], $in = $in.asInstanceOf[js.Any], $like = $like.asInstanceOf[js.Any], $lt = $lt.asInstanceOf[js.Any], $lte = $lte.asInstanceOf[js.Any], $ne = $ne.asInstanceOf[js.Any], $not = $not.asInstanceOf[js.Any], $notBetween = $notBetween.asInstanceOf[js.Any], $notILike = $notILike.asInstanceOf[js.Any], $notIn = $notIn.asInstanceOf[js.Any], $notLike = $notLike.asInstanceOf[js.Any], $overlap = $overlap.asInstanceOf[js.Any])
    __obj.updateDynamic("!..")(`!..`.asInstanceOf[js.Any])
    __obj.updateDynamic("&&")(`&&`.asInstanceOf[js.Any])
    __obj.updateDynamic("..")(`..`.asInstanceOf[js.Any])
    __obj.updateDynamic("<@")(`<@`.asInstanceOf[js.Any])
    __obj.updateDynamic("@>")(`@>`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}


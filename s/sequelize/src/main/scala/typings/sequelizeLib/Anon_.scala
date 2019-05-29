package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var `!..`: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String]
  @JSName("$between")
  var $between: js.Tuple2[stdLib.Date | scala.Double, stdLib.Date | scala.Double]
  @JSName("$contained")
  var $contained: js.Any
  @JSName("$contains")
  var $contains: js.Any
  @JSName("$gt")
  var $gt: scala.Double | java.lang.String | stdLib.Date
  @JSName("$gte")
  var $gte: scala.Double | java.lang.String | stdLib.Date
  @JSName("$iLike")
  var $iLike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement
  @JSName("$ilike")
  var $ilike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement
  @JSName("$in")
  var $in: (js.Array[java.lang.String | scala.Double]) | sequelizeLib.sequelizeMod.literal
  @JSName("$like")
  var $like: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement
  @JSName("$lt")
  var $lt: scala.Double | java.lang.String | stdLib.Date
  @JSName("$lte")
  var $lte: scala.Double | java.lang.String | stdLib.Date
  @JSName("$ne")
  var $ne: java.lang.String | scala.Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias sequelize.sequelize.WhereLogic */ js.Object)
  @JSName("$not")
  var $not: scala.Boolean | java.lang.String | scala.Double | sequelizeLib.sequelizeMod.AnyWhereOptions
  @JSName("$notBetween")
  var $notBetween: js.Tuple2[scala.Double, scala.Double]
  @JSName("$notILike")
  var $notILike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement
  @JSName("$notIn")
  var $notIn: (js.Array[java.lang.String | scala.Double]) | sequelizeLib.sequelizeMod.literal
  @JSName("$notLike")
  var $notLike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement
  @JSName("$overlap")
  var $overlap: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String]
  var `&&`: js.Tuple2[scala.Double, scala.Double]
  var `..`: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String]
  var `<@`: js.Any
  var `@>`: js.Any
}

object Anon_ {
  @scala.inline
  def apply(
    `!..`: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String],
    $between: js.Tuple2[stdLib.Date | scala.Double, stdLib.Date | scala.Double],
    $contained: js.Any,
    $contains: js.Any,
    $gt: scala.Double | java.lang.String | stdLib.Date,
    $gte: scala.Double | java.lang.String | stdLib.Date,
    $iLike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement,
    $ilike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement,
    $in: (js.Array[java.lang.String | scala.Double]) | sequelizeLib.sequelizeMod.literal,
    $like: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement,
    $lt: scala.Double | java.lang.String | stdLib.Date,
    $lte: scala.Double | java.lang.String | stdLib.Date,
    $ne: java.lang.String | scala.Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias sequelize.sequelize.WhereLogic */ js.Object),
    $not: scala.Boolean | java.lang.String | scala.Double | sequelizeLib.sequelizeMod.AnyWhereOptions,
    $notBetween: js.Tuple2[scala.Double, scala.Double],
    $notILike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement,
    $notIn: (js.Array[java.lang.String | scala.Double]) | sequelizeLib.sequelizeMod.literal,
    $notLike: java.lang.String | sequelizeLib.sequelizeMod.WherePGStatement,
    $overlap: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String],
    `&&`: js.Tuple2[scala.Double, scala.Double],
    `..`: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String],
    `<@`: js.Any,
    `@>`: js.Any
  ): Anon_ = {
    val __obj = js.Dynamic.literal($between = $between, $contained = $contained, $contains = $contains, $gt = $gt.asInstanceOf[js.Any], $gte = $gte.asInstanceOf[js.Any], $iLike = $iLike.asInstanceOf[js.Any], $ilike = $ilike.asInstanceOf[js.Any], $in = $in.asInstanceOf[js.Any], $like = $like.asInstanceOf[js.Any], $lt = $lt.asInstanceOf[js.Any], $lte = $lte.asInstanceOf[js.Any], $ne = $ne.asInstanceOf[js.Any], $not = $not.asInstanceOf[js.Any], $notBetween = $notBetween, $notILike = $notILike.asInstanceOf[js.Any], $notIn = $notIn.asInstanceOf[js.Any], $notLike = $notLike.asInstanceOf[js.Any], $overlap = $overlap)
    __obj.updateDynamic("!..")(`!..`)
    __obj.updateDynamic("&&")(`&&`)
    __obj.updateDynamic("..")(`..`)
    __obj.updateDynamic("<@")(`<@`)
    __obj.updateDynamic("@>")(`@>`)
    __obj.asInstanceOf[Anon_]
  }
}


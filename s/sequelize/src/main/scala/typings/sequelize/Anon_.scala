package typings.sequelize

import typings.sequelize.sequelizeMod.AnyWhereOptions
import typings.sequelize.sequelizeMod.WherePGStatement
import typings.sequelize.sequelizeMod.literal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ extends js.Object {
  var `!..`: js.Tuple2[Double | String, Double | String] = js.native
  @JSName("$between")
  var $between: js.Tuple2[Date | Double, Date | Double] = js.native
  @JSName("$contained")
  var $contained: js.Any = js.native
  @JSName("$contains")
  var $contains: js.Any = js.native
  @JSName("$gt")
  var $gt: Double | String | Date = js.native
  @JSName("$gte")
  var $gte: Double | String | Date = js.native
  @JSName("$iLike")
  var $iLike: String | WherePGStatement = js.native
  @JSName("$ilike")
  var $ilike: String | WherePGStatement = js.native
  @JSName("$in")
  var $in: (js.Array[String | Double]) | literal = js.native
  @JSName("$like")
  var $like: String | WherePGStatement = js.native
  @JSName("$lt")
  var $lt: Double | String | Date = js.native
  @JSName("$lte")
  var $lte: Double | String | Date = js.native
  @JSName("$ne")
  var $ne: String | Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias sequelize.sequelize.WhereLogic */ js.Object) = js.native
  @JSName("$not")
  var $not: Boolean | String | Double | AnyWhereOptions = js.native
  @JSName("$notBetween")
  var $notBetween: js.Tuple2[Double, Double] = js.native
  @JSName("$notILike")
  var $notILike: String | WherePGStatement = js.native
  @JSName("$notIn")
  var $notIn: (js.Array[String | Double]) | literal = js.native
  @JSName("$notLike")
  var $notLike: String | WherePGStatement = js.native
  @JSName("$overlap")
  var $overlap: js.Tuple2[Double | String, Double | String] = js.native
  var `&&`: js.Tuple2[Double, Double] = js.native
  var `..`: js.Tuple2[Double | String, Double | String] = js.native
  var `<@`: js.Any = js.native
  var `@>`: js.Any = js.native
}


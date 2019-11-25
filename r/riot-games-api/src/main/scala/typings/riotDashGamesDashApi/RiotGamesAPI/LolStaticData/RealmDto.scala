package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmDto extends js.Object {
  var cdn: String
  var css: String
  var dd: String
  var l: String
  var lg: String
  var n: js.Array[StringDictionary[String]]
  var profileiconmax: Double
  var storage: String
  var v: String
}

object RealmDto {
  @scala.inline
  def apply(
    cdn: String,
    css: String,
    dd: String,
    l: String,
    lg: String,
    n: js.Array[StringDictionary[String]],
    profileiconmax: Double,
    storage: String,
    v: String
  ): RealmDto = {
    val __obj = js.Dynamic.literal(cdn = cdn.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], profileiconmax = profileiconmax.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RealmDto]
  }
}


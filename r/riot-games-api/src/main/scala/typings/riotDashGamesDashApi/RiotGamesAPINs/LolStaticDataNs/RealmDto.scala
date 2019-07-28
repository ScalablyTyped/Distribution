package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

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
    val __obj = js.Dynamic.literal(cdn = cdn, css = css, dd = dd, l = l, lg = lg, n = n, profileiconmax = profileiconmax, storage = storage, v = v)
  
    __obj.asInstanceOf[RealmDto]
  }
}


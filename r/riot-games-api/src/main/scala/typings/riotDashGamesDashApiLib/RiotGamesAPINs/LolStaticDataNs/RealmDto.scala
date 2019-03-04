package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmDto extends js.Object {
  var cdn: java.lang.String
  var css: java.lang.String
  var dd: java.lang.String
  var l: java.lang.String
  var lg: java.lang.String
  var n: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  var profileiconmax: scala.Double
  var storage: java.lang.String
  var v: java.lang.String
}

object RealmDto {
  @scala.inline
  def apply(
    cdn: java.lang.String,
    css: java.lang.String,
    dd: java.lang.String,
    l: java.lang.String,
    lg: java.lang.String,
    n: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]],
    profileiconmax: scala.Double,
    storage: java.lang.String,
    v: java.lang.String
  ): RealmDto = {
    val __obj = js.Dynamic.literal(cdn = cdn, css = css, dd = dd, l = l, lg = lg, n = n, profileiconmax = profileiconmax, storage = storage, v = v)
  
    __obj.asInstanceOf[RealmDto]
  }
}


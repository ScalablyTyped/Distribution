package typings
package sccDashBrokerDashClientLib.sccDashBrokerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingEngine extends js.Object {
  def findSite(key: java.lang.String): java.lang.String
  def getSites(): js.Array[java.lang.String]
  def setSites(sites: js.Array[java.lang.String]): scala.Unit
}

object MappingEngine {
  @scala.inline
  def apply(
    findSite: js.Function1[java.lang.String, java.lang.String],
    getSites: js.Function0[js.Array[java.lang.String]],
    setSites: js.Function1[js.Array[java.lang.String], scala.Unit]
  ): MappingEngine = {
    val __obj = js.Dynamic.literal(findSite = findSite, getSites = getSites, setSites = setSites)
  
    __obj.asInstanceOf[MappingEngine]
  }
}


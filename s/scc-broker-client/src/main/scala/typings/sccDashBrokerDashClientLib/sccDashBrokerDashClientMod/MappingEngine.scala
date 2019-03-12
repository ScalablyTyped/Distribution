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
    findSite: java.lang.String => java.lang.String,
    getSites: () => js.Array[java.lang.String],
    setSites: js.Array[java.lang.String] => scala.Unit
  ): MappingEngine = {
    val __obj = js.Dynamic.literal(findSite = js.Any.fromFunction1(findSite), getSites = js.Any.fromFunction0(getSites), setSites = js.Any.fromFunction1(setSites))
  
    __obj.asInstanceOf[MappingEngine]
  }
}


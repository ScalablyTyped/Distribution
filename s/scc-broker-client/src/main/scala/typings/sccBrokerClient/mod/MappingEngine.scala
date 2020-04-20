package typings.sccBrokerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingEngine extends js.Object {
  def findSite(key: String): String
  def getSites(): js.Array[String]
  def setSites(sites: js.Array[String]): Unit
}

object MappingEngine {
  @scala.inline
  def apply(findSite: String => String, getSites: () => js.Array[String], setSites: js.Array[String] => Unit): MappingEngine = {
    val __obj = js.Dynamic.literal(findSite = js.Any.fromFunction1(findSite), getSites = js.Any.fromFunction0(getSites), setSites = js.Any.fromFunction1(setSites))
    __obj.asInstanceOf[MappingEngine]
  }
}


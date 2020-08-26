package typings.sccBrokerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingEngine extends js.Object {
  def findSite(key: String): String = js.native
  def getSites(): js.Array[String] = js.native
  def setSites(sites: js.Array[String]): Unit = js.native
}

object MappingEngine {
  @scala.inline
  def apply(findSite: String => String, getSites: () => js.Array[String], setSites: js.Array[String] => Unit): MappingEngine = {
    val __obj = js.Dynamic.literal(findSite = js.Any.fromFunction1(findSite), getSites = js.Any.fromFunction0(getSites), setSites = js.Any.fromFunction1(setSites))
    __obj.asInstanceOf[MappingEngine]
  }
  @scala.inline
  implicit class MappingEngineOps[Self <: MappingEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindSite(value: String => String): Self = this.set("findSite", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSites(value: () => js.Array[String]): Self = this.set("getSites", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSites(value: js.Array[String] => Unit): Self = this.set("setSites", js.Any.fromFunction1(value))
  }
  
}


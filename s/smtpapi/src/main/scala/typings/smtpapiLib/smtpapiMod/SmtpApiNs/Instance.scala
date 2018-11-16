package typings
package smtpapiLib.smtpapiMod.SmtpApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var header: Header = js.native
  var version: java.lang.String = js.native
  def addCategory(cat: java.lang.String): scala.Unit = js.native
  def addCategory(cat: js.Array[java.lang.String]): scala.Unit = js.native
  def addFilter(filter: java.lang.String, setting: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def addFilter(filter: java.lang.String, setting: java.lang.String, `val`: scala.Double): scala.Unit = js.native
  def addSection(sec: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def addSendEachAt(send_each_at: js.Array[scala.Double]): scala.Unit = js.native
  def addSendEachAt(send_each_at: scala.Double): scala.Unit = js.native
  def addSubstitution(key: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def addSubstitution(key: java.lang.String, `val`: js.Array[java.lang.String]): scala.Unit = js.native
  def addTo(to: java.lang.String): scala.Unit = js.native
  def addTo(tos: js.Array[java.lang.String]): scala.Unit = js.native
  def addUniqueArg(key: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def jsonObject(): Header = js.native
  def jsonString(): java.lang.String = js.native
  def setASMGroupID(asm_group_id: scala.Double): scala.Unit = js.native
  def setCategories(cats: java.lang.String): scala.Unit = js.native
  def setCategories(cats: js.Array[java.lang.String]): scala.Unit = js.native
  def setFilters(filters: js.Object): scala.Unit = js.native
  def setIpPool(ip_pool: java.lang.String): scala.Unit = js.native
  def setSections(sec: js.Object): scala.Unit = js.native
  def setSendAt(send_at: scala.Double): scala.Unit = js.native
  def setSendEachAt(send_each_at: js.Array[scala.Double]): scala.Unit = js.native
  def setSubstitutions(subs: js.Object): scala.Unit = js.native
  def setTos(email: java.lang.String): scala.Unit = js.native
  def setTos(emails: js.Array[java.lang.String]): scala.Unit = js.native
  def setUniqueArgs(`val`: js.Object): scala.Unit = js.native
}


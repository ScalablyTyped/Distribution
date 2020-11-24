package typings.smtpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  def addCategory(cat: String): Unit = js.native
  def addCategory(cat: js.Array[String]): Unit = js.native
  
  def addFilter(filter: String, setting: String, `val`: String): Unit = js.native
  def addFilter(filter: String, setting: String, `val`: Double): Unit = js.native
  
  def addSection(sec: String, `val`: String): Unit = js.native
  
  def addSendEachAt(send_each_at: js.Array[Double]): Unit = js.native
  def addSendEachAt(send_each_at: Double): Unit = js.native
  
  def addSubstitution(key: String, `val`: String): Unit = js.native
  def addSubstitution(key: String, `val`: js.Array[String]): Unit = js.native
  
  def addTo(to: String): Unit = js.native
  def addTo(tos: js.Array[String]): Unit = js.native
  
  def addUniqueArg(key: String, `val`: String): Unit = js.native
  
  var header: Header = js.native
  
  def jsonObject(): Header = js.native
  
  def jsonString(): String = js.native
  
  def setASMGroupID(asm_group_id: Double): Unit = js.native
  
  def setCategories(cats: String): Unit = js.native
  def setCategories(cats: js.Array[String]): Unit = js.native
  
  def setFilters(filters: js.Object): Unit = js.native
  
  def setIpPool(ip_pool: String): Unit = js.native
  
  def setSections(sec: js.Object): Unit = js.native
  
  def setSendAt(send_at: Double): Unit = js.native
  
  def setSendEachAt(send_each_at: js.Array[Double]): Unit = js.native
  
  def setSubstitutions(subs: js.Object): Unit = js.native
  
  def setTos(email: String): Unit = js.native
  def setTos(emails: js.Array[String]): Unit = js.native
  
  def setUniqueArgs(`val`: js.Object): Unit = js.native
  
  var version: String = js.native
}

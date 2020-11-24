package typings.reactI18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportNamespaces extends js.Object {
  
  def addUsedNamespaces(namespaces: js.Array[Namespace]): Unit = js.native
  
  def getUsedNamespaces(): js.Array[String] = js.native
}
object ReportNamespaces {
  
  @scala.inline
  def apply(addUsedNamespaces: js.Array[Namespace] => Unit, getUsedNamespaces: () => js.Array[String]): ReportNamespaces = {
    val __obj = js.Dynamic.literal(addUsedNamespaces = js.Any.fromFunction1(addUsedNamespaces), getUsedNamespaces = js.Any.fromFunction0(getUsedNamespaces))
    __obj.asInstanceOf[ReportNamespaces]
  }
  
  @scala.inline
  implicit class ReportNamespacesOps[Self <: ReportNamespaces] (val x: Self) extends AnyVal {
    
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
    def setAddUsedNamespaces(value: js.Array[Namespace] => Unit): Self = this.set("addUsedNamespaces", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUsedNamespaces(value: () => js.Array[String]): Self = this.set("getUsedNamespaces", js.Any.fromFunction0(value))
  }
}

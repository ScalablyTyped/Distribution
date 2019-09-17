package typings.reactDashI18next.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportNamespaces extends js.Object {
  def addUsedNamespaces(namespaces: js.Array[Namespace]): Unit
  def getUsedNamespaces(): js.Array[String]
}

object ReportNamespaces {
  @scala.inline
  def apply(addUsedNamespaces: js.Array[Namespace] => Unit, getUsedNamespaces: () => js.Array[String]): ReportNamespaces = {
    val __obj = js.Dynamic.literal(addUsedNamespaces = js.Any.fromFunction1(addUsedNamespaces), getUsedNamespaces = js.Any.fromFunction0(getUsedNamespaces))
  
    __obj.asInstanceOf[ReportNamespaces]
  }
}


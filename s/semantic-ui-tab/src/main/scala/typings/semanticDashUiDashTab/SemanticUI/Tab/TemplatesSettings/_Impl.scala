package typings.semanticDashUiDashTab.SemanticUI.Tab.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * returns page title
    */
  def determineTitle(tabArray: js.Array[_]): String
}

object _Impl {
  @scala.inline
  def apply(determineTitle: js.Array[_] => String): _Impl = {
    val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
  
    __obj.asInstanceOf[_Impl]
  }
}


package typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * returns page title
    */
  def determineTitle(tabArray: js.Array[_]): String
}

object Impl {
  @scala.inline
  def apply(determineTitle: js.Array[_] => String): Impl = {
    val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
  
    __obj.asInstanceOf[Impl]
  }
}


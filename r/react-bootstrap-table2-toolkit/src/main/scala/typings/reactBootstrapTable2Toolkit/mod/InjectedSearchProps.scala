package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedSearchProps extends js.Object {
  var searchText: String
  def onClear(): Unit
  def onSearch(`val`: String): Unit
}

object InjectedSearchProps {
  @scala.inline
  def apply(onClear: () => Unit, onSearch: String => Unit, searchText: String): InjectedSearchProps = {
    val __obj = js.Dynamic.literal(onClear = js.Any.fromFunction0(onClear), onSearch = js.Any.fromFunction1(onSearch), searchText = searchText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InjectedSearchProps]
  }
}


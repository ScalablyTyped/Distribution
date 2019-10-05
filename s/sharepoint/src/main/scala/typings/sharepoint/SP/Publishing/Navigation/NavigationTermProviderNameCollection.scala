package typings.sharepoint.SP.Publishing.Navigation

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationTermProviderNameCollection extends ClientObjectCollection[String] {
  def Add(item: String): Unit = js.native
  def Clear(): Unit = js.native
  def Remove(item: String): BooleanResult = js.native
}


package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends js.Object {
  /** @deprecated */
  def AddSearchProvider(): Unit
  /** @deprecated */
  def IsSearchProviderInstalled(): Unit
}

object External {
  @scala.inline
  def apply(AddSearchProvider: () => Unit, IsSearchProviderInstalled: () => Unit): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = js.Any.fromFunction0(AddSearchProvider), IsSearchProviderInstalled = js.Any.fromFunction0(IsSearchProviderInstalled))
    __obj.asInstanceOf[External]
  }
}


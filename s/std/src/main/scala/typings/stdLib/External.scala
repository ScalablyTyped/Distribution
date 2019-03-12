package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends js.Object {
  /** @deprecated */
  def AddSearchProvider(): scala.Unit
  /** @deprecated */
  def IsSearchProviderInstalled(): scala.Unit
}

object External {
  @scala.inline
  def apply(AddSearchProvider: () => scala.Unit, IsSearchProviderInstalled: () => scala.Unit): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = js.Any.fromFunction0(AddSearchProvider), IsSearchProviderInstalled = js.Any.fromFunction0(IsSearchProviderInstalled))
  
    __obj.asInstanceOf[External]
  }
}


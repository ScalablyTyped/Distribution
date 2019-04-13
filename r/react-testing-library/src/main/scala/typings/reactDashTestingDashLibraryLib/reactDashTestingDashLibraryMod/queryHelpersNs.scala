package typings
package reactDashTestingDashLibraryLib.reactDashTestingDashLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-testing-library", "queryHelpers")
@js.native
object queryHelpersNs extends js.Object {
  val queryAllByAttribute: domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.AllByAttribute = js.native
  val queryByAttribute: domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.QueryByAttribute = js.native
  def debugDOM(htmlElement: stdLib.HTMLElement): java.lang.String = js.native
  def firstResultOrNull(fn: domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.AllByAttribute): stdLib.HTMLElement | scala.Null = js.native
  def firstResultOrNull(
    fn: domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.AllByAttribute,
    container: stdLib.HTMLElement
  ): stdLib.HTMLElement | scala.Null = js.native
  def firstResultOrNull(
    fn: domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.AllByAttribute,
    container: stdLib.HTMLElement,
    id: domDashTestingDashLibraryLib.typingsMatchesMod.Matcher
  ): stdLib.HTMLElement | scala.Null = js.native
  def firstResultOrNull(
    fn: domDashTestingDashLibraryLib.typingsQueryDashHelpersMod.AllByAttribute,
    container: stdLib.HTMLElement,
    id: domDashTestingDashLibraryLib.typingsMatchesMod.Matcher,
    options: domDashTestingDashLibraryLib.typingsMatchesMod.MatcherOptions
  ): stdLib.HTMLElement | scala.Null = js.native
  def getElementError(message: java.lang.String, container: stdLib.HTMLElement): stdLib.Error = js.native
}


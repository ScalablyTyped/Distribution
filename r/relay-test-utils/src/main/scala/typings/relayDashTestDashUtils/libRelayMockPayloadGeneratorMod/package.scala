package typings.relayDashTestDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRelayMockPayloadGeneratorMod {
  import org.scalablytyped.runtime.StringDictionary

  type MockResolver = js.Function2[/* context */ MockResolverContext, /* generateId */ js.Function0[Double], js.Any]
  type MockResolvers = StringDictionary[MockResolver]
}

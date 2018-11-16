package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypeHelpersNs {
  type One[T] = js.Function1[/* value */ T, sjclLib.sjclMod.sjclNs.BigNumber]
  type Two[T1, T2] = js.Function2[/* x */ T1, /* N */ T2, sjclLib.sjclMod.sjclNs.BigNumber]
}

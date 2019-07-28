package typings.sjcl.sjclMod

import typings.sjcl.sjclMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypeHelpersNs {
  type One[T] = js.Function1[/* value */ T, BigNumber]
  type Two[T1, T2] = js.Function2[/* x */ T1, /* N */ T2, BigNumber]
}

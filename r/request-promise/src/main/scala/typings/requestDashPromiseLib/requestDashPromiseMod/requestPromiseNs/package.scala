package typings
package requestDashPromiseLib.requestDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestPromiseNs {
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = requestLib.requestMod.requestNs.UriOptions with RequestPromiseOptions
  type OptionsWithUrl = requestLib.requestMod.requestNs.UrlOptions with RequestPromiseOptions
}

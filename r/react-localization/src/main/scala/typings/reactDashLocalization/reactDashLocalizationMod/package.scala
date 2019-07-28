package typings.reactDashLocalization

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLocalizationMod {
  type FormatObject[U /* <: Formatted */] = StringDictionary[U]
  type Formatted = Double | String | Element
  type GlobalStrings[T] = StringDictionary[T]
  type LocalizedStrings[T] = LocalizedStringsMethods with T
}

package typings.reactDashLocalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLocalizationMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.Global.JSXNs.Element

  type FormatObject[U /* <: Formatted */] = StringDictionary[U]
  type Formatted = Double | String | Element
  type GlobalStrings[T] = StringDictionary[T]
  type LocalizedStrings[T] = LocalizedStringsMethods with T
}

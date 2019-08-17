package typings.reactDashTagsinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTagsinputMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ReactChild
  import typings.react.reactMod.ReactElement

  type InputProps = StringDictionary[js.Any]
  type RenderLayout = js.Function2[
    /* tagElements */ js.Array[ReactElement], 
    /* inputElement */ ReactElement, 
    ReactChild
  ]
  type TagProps = StringDictionary[js.Any]
}

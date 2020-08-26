package typings.reactMdTable

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLTableCaptionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/table/types/Caption", JSImport.Namespace)
@js.native
object captionMod extends js.Object {
  /**
    * This component is really just a simple wrapper for applying the `<caption>`
    * typography styles and probably doesn't have much real use if you don't use
    * captions.
    */
  val default: ForwardRefExoticComponent[CaptionProps with RefAttributes[HTMLTableCaptionElement]] = js.native
  type CaptionProps = HTMLAttributes[HTMLTableCaptionElement]
}


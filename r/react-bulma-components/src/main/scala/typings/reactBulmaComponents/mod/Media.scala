package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends ForwardRefExoticComponent[PropsWithoutRef[MediaProps] with RefAttributes[_]] {
  var Content: ForwardRefExoticComponent[PropsWithoutRef[MediaContentProps] with RefAttributes[_]] = js.native
  var Item: ForwardRefExoticComponent[PropsWithoutRef[MediaItemProps] with RefAttributes[_]] = js.native
}

@JSImport("react-bulma-components", "Media")
@js.native
object Media extends TopLevel[Media]


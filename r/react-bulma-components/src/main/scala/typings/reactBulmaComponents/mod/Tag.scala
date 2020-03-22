package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends ForwardRefExoticComponent[PropsWithoutRef[TagProps] with RefAttributes[_]] {
  var Group: ForwardRefExoticComponent[PropsWithoutRef[TagGroupProps] with RefAttributes[span]] = js.native
}

@JSImport("react-bulma-components", "Tag")
@js.native
object Tag extends TopLevel[Tag]


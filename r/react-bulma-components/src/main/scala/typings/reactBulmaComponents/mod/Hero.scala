package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hero extends ForwardRefExoticComponent[PropsWithoutRef[HeroProps] with RefAttributes[_]] {
  var Body: ForwardRefExoticComponent[PropsWithoutRef[HeroBodyProps] with RefAttributes[_]] = js.native
  var Footer: ForwardRefExoticComponent[PropsWithoutRef[HeroFooterProps] with RefAttributes[_]] = js.native
  var Head: ForwardRefExoticComponent[PropsWithoutRef[HeroHeadProps] with RefAttributes[_]] = js.native
}

@JSImport("react-bulma-components", "Hero")
@js.native
object Hero extends TopLevel[Hero]


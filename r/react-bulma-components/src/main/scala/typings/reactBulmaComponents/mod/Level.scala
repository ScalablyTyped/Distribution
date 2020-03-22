package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends ForwardRefExoticComponent[PropsWithoutRef[LevelProps] with RefAttributes[_]] {
  var Item: ForwardRefExoticComponent[PropsWithoutRef[LevelItemProps] with RefAttributes[_]] = js.native
  var Side: ForwardRefExoticComponent[PropsWithoutRef[LevelSideProps] with RefAttributes[_]] = js.native
}

@JSImport("react-bulma-components", "Level")
@js.native
object Level extends TopLevel[Level]


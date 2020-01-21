package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.reactNavigationStrings.`react-navigationSlashSTACK`
  - typings.reactNavigation.reactNavigationStrings.`react-navigationSlashTABS`
  - typings.reactNavigation.reactNavigationStrings.`react-navigationSlashDRAWER`
*/
trait NavigatorType extends js.Object

object NavigatorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `react-navigationSlashDRAWER`: typings.reactNavigation.reactNavigationStrings.`react-navigationSlashDRAWER` = this.cast("react-navigation/DRAWER")
  @scala.inline
  def `react-navigationSlashSTACK`: typings.reactNavigation.reactNavigationStrings.`react-navigationSlashSTACK` = this.cast("react-navigation/STACK")
  @scala.inline
  def `react-navigationSlashTABS`: typings.reactNavigation.reactNavigationStrings.`react-navigationSlashTABS` = this.cast("react-navigation/TABS")
}


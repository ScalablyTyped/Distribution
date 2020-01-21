package typings.reactNavigationDrawer.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked
  - typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`
  - typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`
*/
trait DrawerLockMode extends js.Object

object DrawerLockMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `locked-closed`: typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed` = this.cast("locked-closed")
  @scala.inline
  def `locked-open`: typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open` = this.cast("locked-open")
  @scala.inline
  def unlocked: typings.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked = this.cast("unlocked")
}


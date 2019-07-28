package typings.reactDashMosaicDashComponent.libContextTypesMod

import typings.react.reactMod.ReactElement
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicWindowActions extends js.Object {
  /**
    * Enables connecting a different drag source besides the react-mosaic toolbar
    */
  def connectDragSource(connectedElements: ReactElement): ReactElement | Null
  /**
    * Returns the path to this window
    */
  def getPath(): MosaicPath
  /**
    * Fails if no `createNode()` is defined
    * Convenience function to call `createNode()` and replace the current node with it.
    */
  def replaceWithNew(args: js.Any*): js.Promise[Unit]
  /**
    * Sets the open state for the tray that holds additional controls
    */
  def setAdditionalControlsOpen(open: Boolean): Unit
  /**
    * Fails if no `createNode()` is defined
    * Creates a new node and splits the current node.
    * The current node becomes the `first` and the new node the `second` of the result.
    * `direction` is chosen by querying the DOM and splitting along the longer axis
    */
  def split(args: js.Any*): js.Promise[Unit]
}

object MosaicWindowActions {
  @scala.inline
  def apply(
    connectDragSource: ReactElement => ReactElement | Null,
    getPath: () => MosaicPath,
    replaceWithNew: /* repeated */ js.Any => js.Promise[Unit],
    setAdditionalControlsOpen: Boolean => Unit,
    split: /* repeated */ js.Any => js.Promise[Unit]
  ): MosaicWindowActions = {
    val __obj = js.Dynamic.literal(connectDragSource = js.Any.fromFunction1(connectDragSource), getPath = js.Any.fromFunction0(getPath), replaceWithNew = js.Any.fromFunction1(replaceWithNew), setAdditionalControlsOpen = js.Any.fromFunction1(setAdditionalControlsOpen), split = js.Any.fromFunction1(split))
  
    __obj.asInstanceOf[MosaicWindowActions]
  }
}


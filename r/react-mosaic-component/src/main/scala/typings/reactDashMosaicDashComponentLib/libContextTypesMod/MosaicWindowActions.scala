package typings
package reactDashMosaicDashComponentLib.libContextTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicWindowActions extends js.Object {
  /**
    * Enables connecting a different drag source besides the react-mosaic toolbar
    */
  def connectDragSource(connectedElements: reactLib.reactMod.ReactNs.ReactElement[_]): reactLib.reactMod.ReactNs.ReactElement[_]
  /**
    * Returns the path to this window
    */
  def getPath(): reactDashMosaicDashComponentLib.libTypesMod.MosaicPath
  /**
    * Fails if no `createNode()` is defined
    * Convenience function to call `createNode()` and replace the current node with it.
    */
  def replaceWithNew(args: js.Any*): js.Promise[scala.Unit]
  /**
    * Sets the open state for the tray that holds additional controls
    */
  def setAdditionalControlsOpen(open: scala.Boolean): scala.Unit
  /**
    * Fails if no `createNode()` is defined
    * Creates a new node and splits the current node.
    * The current node becomes the `first` and the new node the `second` of the result.
    * `direction` is chosen by querying the DOM and splitting along the longer axis
    */
  def split(args: js.Any*): js.Promise[scala.Unit]
}

object MosaicWindowActions {
  @scala.inline
  def apply(
    connectDragSource: js.Function1[
      reactLib.reactMod.ReactNs.ReactElement[_], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ],
    getPath: js.Function0[reactDashMosaicDashComponentLib.libTypesMod.MosaicPath],
    replaceWithNew: js.Function1[/* repeated */ js.Any, js.Promise[scala.Unit]],
    setAdditionalControlsOpen: js.Function1[scala.Boolean, scala.Unit],
    split: js.Function1[/* repeated */ js.Any, js.Promise[scala.Unit]]
  ): MosaicWindowActions = {
    val __obj = js.Dynamic.literal(connectDragSource = connectDragSource, getPath = getPath, replaceWithNew = replaceWithNew, setAdditionalControlsOpen = setAdditionalControlsOpen, split = split)
  
    __obj.asInstanceOf[MosaicWindowActions]
  }
}


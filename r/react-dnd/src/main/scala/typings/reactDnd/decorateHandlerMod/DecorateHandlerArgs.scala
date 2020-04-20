package typings.reactDnd.decorateHandlerMod

import typings.dndCore.interfacesMod.DragDropManager
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorateHandlerArgs[Props, ItemIdType] extends js.Object {
  var DecoratedComponent: js.Any
  var collect: js.Any
  var containerDisplayName: String
  var createConnector: js.Any
  var options: js.Any
  var registerHandler: js.Any
  def createHandler(monitor: HandlerReceiver, ref: RefObject[_]): Handler[Props]
  def createMonitor(manager: DragDropManager): HandlerReceiver
  def getType(props: Props): ItemIdType
}

object DecorateHandlerArgs {
  @scala.inline
  def apply[Props, ItemIdType](
    DecoratedComponent: js.Any,
    collect: js.Any,
    containerDisplayName: String,
    createConnector: js.Any,
    createHandler: (HandlerReceiver, RefObject[_]) => Handler[Props],
    createMonitor: DragDropManager => HandlerReceiver,
    getType: Props => ItemIdType,
    options: js.Any,
    registerHandler: js.Any
  ): DecorateHandlerArgs[Props, ItemIdType] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any], collect = collect.asInstanceOf[js.Any], containerDisplayName = containerDisplayName.asInstanceOf[js.Any], createConnector = createConnector.asInstanceOf[js.Any], createHandler = js.Any.fromFunction2(createHandler), createMonitor = js.Any.fromFunction1(createMonitor), getType = js.Any.fromFunction1(getType), options = options.asInstanceOf[js.Any], registerHandler = registerHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorateHandlerArgs[Props, ItemIdType]]
  }
}


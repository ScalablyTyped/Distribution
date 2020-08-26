package typings.reactDnd.decorateHandlerMod

import typings.dndCore.interfacesMod.DragDropManager
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorateHandlerArgs[Props, ItemIdType] extends js.Object {
  var DecoratedComponent: js.Any = js.native
  var collect: js.Any = js.native
  var containerDisplayName: String = js.native
  var createConnector: js.Any = js.native
  var options: js.Any = js.native
  var registerHandler: js.Any = js.native
  def createHandler(monitor: HandlerReceiver, ref: RefObject[_]): Handler[Props] = js.native
  def createMonitor(manager: DragDropManager): HandlerReceiver = js.native
  def getType(props: Props): ItemIdType = js.native
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
  @scala.inline
  implicit class DecorateHandlerArgsOps[Self <: DecorateHandlerArgs[_, _], Props, ItemIdType] (val x: Self with (DecorateHandlerArgs[Props, ItemIdType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecoratedComponent(value: js.Any): Self = this.set("DecoratedComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollect(value: js.Any): Self = this.set("collect", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerDisplayName(value: String): Self = this.set("containerDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateConnector(value: js.Any): Self = this.set("createConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateHandler(value: (HandlerReceiver, RefObject[_]) => Handler[Props]): Self = this.set("createHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateMonitor(value: DragDropManager => HandlerReceiver): Self = this.set("createMonitor", js.Any.fromFunction1(value))
    @scala.inline
    def setGetType(value: Props => ItemIdType): Self = this.set("getType", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisterHandler(value: js.Any): Self = this.set("registerHandler", value.asInstanceOf[js.Any])
  }
  
}


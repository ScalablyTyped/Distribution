package typings.pulumiPulumi.serializeClosureMod

import typings.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeFunctionArgs extends js.Object {
  /**
    * The name to export from the module defined by the generated module text.  Defaults to 'handler'.
    */
  var exportName: js.UndefOr[String] = js.native
  /**
    * If this is a function which, when invoked, will produce the actual entrypoint function.
    * Useful for when serializing a function that has high startup cost that only wants to be
    * run once. The signature of this function should be:  () => (provider_handler_args...) => provider_result
    *
    * This will then be emitted as: `exports.[exportName] = serialized_func_name();`
    *
    * In other words, the function will be invoked (once) and the resulting inner function will
    * be what is exported.
    */
  var isFactoryFunction: js.UndefOr[Boolean] = js.native
  /**
    * The resource to log any errors we encounter against.
    */
  var logResource: js.UndefOr[Resource] = js.native
  /**
    * A function to prevent serialization of certain objects captured during the serialization.  Primarily used to
    * prevent potential cycles.
    */
  var serialize: js.UndefOr[js.Function1[/* o */ js.Any, Boolean]] = js.native
}

object SerializeFunctionArgs {
  @scala.inline
  def apply(): SerializeFunctionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeFunctionArgs]
  }
  @scala.inline
  implicit class SerializeFunctionArgsOps[Self <: SerializeFunctionArgs] (val x: Self) extends AnyVal {
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
    def setExportName(value: String): Self = this.set("exportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportName: Self = this.set("exportName", js.undefined)
    @scala.inline
    def setIsFactoryFunction(value: Boolean): Self = this.set("isFactoryFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFactoryFunction: Self = this.set("isFactoryFunction", js.undefined)
    @scala.inline
    def setLogResource(value: Resource): Self = this.set("logResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogResource: Self = this.set("logResource", js.undefined)
    @scala.inline
    def setSerialize(value: /* o */ js.Any => Boolean): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
  }
  
}


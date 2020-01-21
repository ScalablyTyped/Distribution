package typings.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/subscriptions_store", JSImport.Namespace)
@js.native
object subscriptionsStoreMod extends js.Object {
  def createSubscriptionsStore(): AnonClearUnused = js.native
  @js.native
  object default extends js.Object {
    def clearUnused(): Unit = js.native
    def markAllAsUnused(): Unit = js.native
    def register(subscribe: js.Function0[Unit]): Unit = js.native
  }
  
}


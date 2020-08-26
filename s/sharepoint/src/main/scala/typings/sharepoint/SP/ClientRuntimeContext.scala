package typings.sharepoint.SP

import typings.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRuntimeContext extends IDisposable {
  def addQuery(query: ClientAction): Unit = js.native
  def addQueryIdAndResultObject(id: Double, obj: js.Any): Unit = js.native
  def add_beginningRequest(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestEventArgs, Unit]): Unit = js.native
  def add_executingWebRequest(value: js.Function2[/* sender */ js.Any, /* args */ WebRequestEventArgs, Unit]): Unit = js.native
  def add_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit = js.native
  def add_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit = js.native
  def castTo(obj: ClientObject, `type`: js.Any): ClientObject = js.native
  def executeQueryAsync(): Unit = js.native
  def executeQueryAsync(
    succeededCallback: js.UndefOr[scala.Nothing],
    failedCallback: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]
  ): Unit = js.native
  def executeQueryAsync(
    succeededCallback: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]
  ): Unit = js.native
  def executeQueryAsync(
    succeededCallback: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit],
    failedCallback: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]
  ): Unit = js.native
  def get_applicationName(): String = js.native
  def get_clientTag(): String = js.native
  def get_disableReturnValueCache(): Boolean = js.native
  def get_formDigestHandlingEnabled(): Boolean = js.native
  def get_hasPendingRequest(): Boolean = js.native
  def get_pendingRequest(): ClientRequest = js.native
  def get_requestTimeout(): Double = js.native
  def get_serverLibraryVersion(): String = js.native
  def get_serverSchemaVersion(): String = js.native
  def get_staticObjects(): js.Any = js.native
  def get_traceCorrelationId(): String = js.native
  def get_url(): String = js.native
  def get_viaUrl(): String = js.native
  def get_webRequestExecutorFactory(): IWebRequestExecutorFactory = js.native
  def load(clientObject: ClientObject, exps: String*): Unit = js.native
  def loadQuery[T](clientObjectCollection: ClientObjectCollection[T]): js.Any = js.native
  def loadQuery[T](clientObjectCollection: ClientObjectCollection[T], exp: String): js.Any = js.native
  def parseObjectFromJsonString(json: String): js.Any = js.native
  def parseObjectFromJsonString(json: String, skipTypeFixup: Boolean): js.Any = js.native
  def remove_beginningRequest(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestEventArgs, Unit]): Unit = js.native
  def remove_executingWebRequest(value: js.Function2[/* sender */ js.Any, /* args */ WebRequestEventArgs, Unit]): Unit = js.native
  def remove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit = js.native
  def remove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit = js.native
  def set_applicationName(value: String): Unit = js.native
  def set_clientTag(value: String): Unit = js.native
  def set_disableReturnValueCache(value: Boolean): Boolean = js.native
  def set_formDigestHandlingEnabled(value: Boolean): Unit = js.native
  def set_requestTimeout(value: Double): Unit = js.native
  def set_traceCorrelationId(value: String): Unit = js.native
  def set_viaUrl(value: String): Unit = js.native
  def set_webRequestExecutorFactory(value: IWebRequestExecutorFactory): Unit = js.native
}

